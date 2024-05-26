/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.dbConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class addpet extends javax.swing.JFrame {

    /**
     * Creates new form addpet
     */
    public addpet() {
        initComponents();
    }
    
        public String destination = "";
        File selectedFile;
        public String oldpath;
        public String path;
       public String action;
     
     
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


     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        petnm = new javax.swing.JTextField();
        first_name1 = new javax.swing.JLabel();
        e_mail4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        image2 = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        petbd1 = new javax.swing.JTextField();
        first_name3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        petage = new javax.swing.JTextField();
        first_name2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        s_petlabel = new javax.swing.JButton();
        sex = new javax.swing.JComboBox<>();
        e_mail5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        petnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petnmActionPerformed(evt);
            }
        });
        jPanel5.add(petnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 460, 30));

        first_name1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name1.setText("Name:");
        jPanel5.add(first_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 80, 530, 90);

        e_mail4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        e_mail4.setText("Date of Birth:");
        jPanel1.add(e_mail4);
        e_mail4.setBounds(30, 500, 110, 20);

        jComboBox5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(30, 530, 50, 20);

        jComboBox6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May ", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jComboBox6);
        jComboBox6.setBounds(100, 530, 116, 20);

        jComboBox7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", " " }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox7);
        jComboBox7.setBounds(230, 530, 71, 20);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel9.setLayout(null);

        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel10.setLayout(null);
        jPanel10.add(image2);
        image2.setBounds(0, 0, 310, 440);

        jPanel9.add(jPanel10);
        jPanel10.setBounds(10, 10, 310, 440);

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, 460));

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
        jPanel3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, 20));

        remove.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, 20));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(600, 50, 370, 550);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        petbd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petbd1ActionPerformed(evt);
            }
        });
        jPanel7.add(petbd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 460, 30));

        first_name3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name3.setText("Breed:");
        jPanel7.add(first_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jPanel1.add(jPanel7);
        jPanel7.setBounds(30, 340, 530, 90);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        petage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petageActionPerformed(evt);
            }
        });
        jPanel6.add(petage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 460, 30));

        first_name2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name2.setText("Age:");
        jPanel6.add(first_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jPanel1.add(jPanel6);
        jPanel6.setBounds(30, 210, 530, 90);

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-arrow-back-20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19);
        jLabel19.setBounds(0, 0, 20, 20);

        s_petlabel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        s_petlabel.setText(" Save");
        s_petlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_petlabelActionPerformed(evt);
            }
        });
        jPanel1.add(s_petlabel);
        s_petlabel.setBounds(910, 670, 70, 20);

        sex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(sex);
        sex.setBounds(340, 530, 70, 28);

        e_mail5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        e_mail5.setText("Gender:");
        jPanel1.add(e_mail5);
        e_mail5.setBounds(340, 510, 60, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void petnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petnmActionPerformed

    private void petageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petageActionPerformed

    private void petbd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petbd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petbd1ActionPerformed

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked

    }//GEN-LAST:event_selectMouseClicked

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
                    image2.setIcon(ResizeImage(path, null, image2));
                    select.setEnabled(false);
                    remove.setEnabled(true);
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_selectActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(false);
        select.setEnabled(true);
        image2.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

    private void s_petlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_petlabelActionPerformed
       dbConnector dbc = new dbConnector();

        if (petnm.getText().isEmpty() || petage.getText().isEmpty() || petbd1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
            return;
        }

        String sql = "INSERT INTO tbl_pet(p_name, p_age, p_breed, p_gender, p_image) " +
                     "VALUES ('" + petnm.getText() + "', '" + petage.getText() + "', '" + petbd1.getText() + "', '" + sex.getSelectedItem().toString() + "','"+destination+"')";

        try {
            dbc.insertData(sql);
            JOptionPane.showMessageDialog(null, "Successfully Saved");
            adminpets ig = new adminpets();
            ig.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while saving data: " + ex.getMessage());
        }
    
    }//GEN-LAST:event_s_petlabelActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        admindashboard up = new admindashboard();
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
            java.util.logging.Logger.getLogger(addpet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addpet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addpet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addpet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addpet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel e_mail4;
    private javax.swing.JLabel e_mail5;
    private javax.swing.JLabel first_name1;
    private javax.swing.JLabel first_name2;
    private javax.swing.JLabel first_name3;
    public javax.swing.JLabel image2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JTextField petage;
    public javax.swing.JTextField petbd1;
    public javax.swing.JTextField petnm;
    public javax.swing.JButton remove;
    private javax.swing.JButton s_petlabel;
    public javax.swing.JButton select;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}
