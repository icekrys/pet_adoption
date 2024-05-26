/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class add_userform extends javax.swing.JFrame {

    /**
     * Creates new form add_userform
     */
    public add_userform() {
        initComponents();
    }
   
        public String destination = "";
        File selectedFile;
        public String oldpath;
        public String path;
       public String action;
       public static String email, usname;
       
       public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
       
       public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
       
       public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}




    public boolean duplicateCheck(){
    dbConnector dbc = new dbConnector();

    
    try{
        
        String query = "SELECT * FROM tbl_user WHERE u_username = '" + us.getText() + "' OR u_email = '" + em.getText() + "'";
             ResultSet resultSet = dbc.getData(query);
                if(resultSet.next()){
                
               
                    email = resultSet.getString("u_email");
                    System.out.println(""+email);
                        if(email.equals(em.getText())){
                            JOptionPane.showMessageDialog(null,"Email is Already Used");
                            em.setText("");
                        }
                    
                     usname = resultSet.getString("u_username");
                    System.out.println(""+usname);
                        if(usname.equals(em.getText())){
                            JOptionPane.showMessageDialog(null,"Username is Already Used");
                            us.setText("");
                        }
      
                        return true;
                }else{
                
                    return false;
                
                }
             }catch(SQLException ex){
                 System.out.println(""+ex);
                 return false;
              }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sform = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        st_label = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        up = new javax.swing.JComboBox<>();
        type1 = new javax.swing.JLabel();
        usta = new javax.swing.JComboBox<>();
        pss = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_label.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        st_label.setText("Save");
        st_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                st_labelMouseEntered(evt);
            }
        });
        st_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_labelActionPerformed(evt);
            }
        });
        jPanel4.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 90, 30));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Password:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 80, 20));

        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel4.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 130, 30));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Username:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 80, 20));
        jPanel4.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, 30));

        jLabel9.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Last Name:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 70, 30));

        jLabel11.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Email:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 40, 20));

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel4.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, 30));

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel4.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, 30));

        jLabel14.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Contact Number:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 20));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel4.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 30));

        jLabel15.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("First Name:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 20));

        type.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(153, 153, 153));
        type.setText("Account Type");
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 90, -1));

        up.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel4.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 80, -1));

        type1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        type1.setForeground(new java.awt.Color(153, 153, 153));
        type1.setText("Account Status");
        jPanel4.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 100, -1));

        usta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        usta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ustaActionPerformed(evt);
            }
        });
        jPanel4.add(usta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 90, -1));
        jPanel4.add(pss, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 130, 30));

        id.setEditable(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 30));

        jLabel16.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("User ID:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        jPanel2.add(jPanel4);
        jPanel4.setBounds(200, 50, 440, 460);

        select.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        select.setText("SELECT");
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel2.add(select);
        select.setBounds(110, 270, 70, 20);

        remove.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove);
        remove.setBounds(20, 270, 77, 20);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setLayout(null);
        jPanel3.add(image);
        image.setBounds(10, 10, 140, 190);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 50, 160, 210);

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-arrow-back-20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);
        jLabel19.setBounds(0, 0, 20, 20);

        sform.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout sformLayout = new javax.swing.GroupLayout(sform);
        sform.setLayout(sformLayout);
        sformLayout.setHorizontalGroup(
            sformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        sformLayout.setVerticalGroup(
            sformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        jPanel1.add(sform);
        sform.setBounds(0, 0, 670, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void ustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ustaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ustaActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void st_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_labelActionPerformed
   dbConnector dbc = new dbConnector();

if (action.equals("Add")) {
    if (fn.getText().isEmpty() || em.getText().isEmpty() || us.getText().isEmpty() || pss.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required");
    } else if (pss.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Maximum 8 characters");
        pss.setText("");
    } else {
        try {
            String password = pss.getText();
            String hashedPassword = passwordHasher.hashPassword(password);

            String sql = "INSERT INTO tbl_user(u_fname, u_lname, u_email, u_username, u_password, u_type, u_status,u_contact, u_image) VALUES ('" +
                         fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + us.getText() + "','" +
                         hashedPassword + "','" + up.getSelectedItem() + "','" + usta.getSelectedItem() + "','" + destination + "','" + cn.getText() + "')";
            dbc.insertData(sql);
            JOptionPane.showMessageDialog(null, "Successfully Save");
            internalUser up = new internalUser();
             up.setVisible(true);
             this.dispose();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("" + ex);
        }
    }
} else if (action.equals("Update")) {
    if (fn.getText().isEmpty() || em.getText().isEmpty() || us.getText().isEmpty() || pss.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required");
    } else if (pss.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Maximum 8 characters");
        pss.setText("");
    } else {
        try {
            String password = pss.getText();
            String hashedPassword = passwordHasher.hashPassword(password);

            dbc.updateData("UPDATE tbl_user SET u_fname = '"+fn.getText()+"',u_lname = '"+ln.getText()+"'"
                + ",u_email = '"+em.getText()+"',u_username = '"+us.getText()+"', u_password = '"
                + hashedPassword + "',u_type = '"+up.getSelectedItem()+"',u_status = '"
                + usta.getSelectedItem()+"',u_contact = '"+cn.getText()+"'"
                +"WHERE u_id = '"+id.getText()+"'");
             internalUser up = new internalUser();
             up.setVisible(true);
             this.dispose();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("" + ex);
        }
    }
}

if (fn.getText().isEmpty() || em.getText().isEmpty() || us.getText().isEmpty() || pss.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required");
} else if (pss.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Maximum 8 characters");
    pss.setText("");
}
    }//GEN-LAST:event_st_labelActionPerformed

    private void st_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseClicked
      
    }//GEN-LAST:event_st_labelMouseClicked

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
         JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                           remove.setEnabled(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
    }//GEN-LAST:event_selectActionPerformed

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
      
    }//GEN-LAST:event_selectMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(false);
        select.setEnabled(true);
        image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

    private void st_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_st_labelMouseEntered

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        internalUser up = new internalUser();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    /**
     * @param args the command line arguments 
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(add_userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_userform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cn;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField pss;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    private javax.swing.JDesktopPane sform;
    public javax.swing.JButton st_label;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type1;
    public javax.swing.JComboBox<String> up;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> usta;
    // End of variables declaration//GEN-END:variables
}
