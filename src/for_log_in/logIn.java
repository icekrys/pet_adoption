/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;
import To_register.*;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import user.userDashboard;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;





public class logIn extends javax.swing.JFrame {
    
    public logIn() {
        initComponents();
        
    }
    
    Color navColor = new Color(255,255,255);
    Color clickColor = new Color(244,229,204);
    static String status;
    static String type;
    
     
    public static boolean loginAcc(String username, String password){
    dbConnector connector = new dbConnector();
    
    try{
   
         String query = "SELECT * FROM tbl_user WHERE u_username = '" + username + "'";
         ResultSet resultSet = connector.getData(query);
        if(resultSet.next()){
            
             String hashedPass = resultSet.getString("u_password");
             String rehashedPass = passwordHasher.hashPassword(password); 
             
    
        if(hashedPass.equals(rehashedPass)){
        status = resultSet.getString("u_status");
        type = resultSet.getString("u_type");
        Session sess = Session.getinstance();
        sess.setUid(resultSet.getInt("u_id"));
         sess.setFname(resultSet.getString("u_fname"));
          sess.setLname(resultSet.getString("u_lname"));
           sess.setEmail(resultSet.getString("u_email"));
            sess.setUsername(resultSet.getString("u_username"));
             sess.setType(resultSet.getString("u_type"));
             sess.setStatus(resultSet.getString("u_status"));
         return true;
              }else{
         return false;
        }
                 }else{
            return false;
        }
    }catch (SQLException | NoSuchAlgorithmException ex) {
        System.out.println(""+ex);
        return false;
    }

}


     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        FurHome = new javax.swing.JLabel();
        FurHome1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SecondPanel = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        LoginButton = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        FurHome.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        FurHome.setForeground(new java.awt.Color(255, 208, 144));
        FurHome.setText("Home");
        jPanel2.add(FurHome);
        FurHome.setBounds(150, 40, 200, 110);

        FurHome1.setBackground(new java.awt.Color(255, 255, 255));
        FurHome1.setFont(new java.awt.Font("Pristina", 1, 80)); // NOI18N
        FurHome1.setText("Fur  ");
        jPanel2.add(FurHome1);
        FurHome1.setBounds(40, 50, 160, 90);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 60, 70, 80);

        SecondPanel.setBackground(new java.awt.Color(255, 255, 255));
        SecondPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SecondPanel.setForeground(new java.awt.Color(164, 87, 14));
        SecondPanel.setLayout(null);

        user.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        user.setDragEnabled(true);
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        SecondPanel.add(user);
        user.setBounds(60, 80, 450, 50);
        user.getAccessibleContext().setAccessibleName("");

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.setLayout(null);

        login.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Log In");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        LoginButton.add(login);
        login.setBounds(20, 0, 130, 30);

        SecondPanel.add(LoginButton);
        LoginButton.setBounds(210, 250, 170, 30);

        forgotPassword.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(118, 199, 234));
        forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPassword.setText("Forgot Password");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });
        SecondPanel.add(forgotPassword);
        forgotPassword.setBounds(60, 320, 120, 20);

        Register.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Register.setForeground(new java.awt.Color(118, 199, 234));
        Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register.setText("Register");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        SecondPanel.add(Register);
        Register.setBounds(440, 320, 70, 20);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setText("username");
        SecondPanel.add(jLabel1);
        jLabel1.setBounds(60, 60, 60, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setText("password");
        SecondPanel.add(jLabel2);
        jLabel2.setBounds(60, 160, 70, 20);

        pass.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        SecondPanel.add(pass);
        pass.setBounds(60, 180, 450, 50);

        jPanel2.add(SecondPanel);
        SecondPanel.setBounds(40, 140, 580, 360);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(630, 510, 24, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(280, 470, 70, 80);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(530, 480, 50, 60);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel16);
        jLabel16.setBounds(210, 20, 50, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel17);
        jLabel17.setBounds(0, 500, 50, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel18);
        jLabel18.setBounds(350, 50, 70, 80);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(140, 470, 50, 60);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 200, 24, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel22);
        jLabel22.setBounds(440, 510, 24, 30);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel23);
        jLabel23.setBounds(100, 30, 24, 30);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel24);
        jLabel24.setBounds(520, 60, 50, 60);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel25);
        jLabel25.setBounds(610, 30, 24, 30);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel21);
        jLabel21.setBounds(610, 200, 50, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
       
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
          if(loginAcc(user.getText(),pass.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "Not Active! Contact the Admin!");
            }else{
                if(type.equals("Admin"))
                {
                JOptionPane.showMessageDialog(null, "Login Success!");
                JOptionPane.showMessageDialog(null, "Welcome Back Admin!!!");
                admindashboard up = new admindashboard();
                up.setVisible(true);
                this.dispose();
                }else if(type.equals("User")){
                JOptionPane.showMessageDialog(null, "Login Success!");
                userDashboard up = new userDashboard();
                up.setVisible(true);
                this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No Account Type Found!");
                }
            }
                }else{
                    JOptionPane.showMessageDialog(null, "Login Failed. Invalid Account!");
          }
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        re_gister up = new re_gister();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userMouseClicked

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
      
    }//GEN-LAST:event_userFocusGained

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
      
    }//GEN-LAST:event_userFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        LoginButton.setBackground(clickColor);
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        LoginButton.setBackground(navColor);
    }//GEN-LAST:event_LoginButtonMouseExited

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
      if(loginAcc(user.getText(),pass.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "Not Active! Contact the Admin!");
            }else{
                if(type.equals("Admin"))
                {
                JOptionPane.showMessageDialog(null, "Login Success!");
                JOptionPane.showMessageDialog(null, "Welcome Back Admin!!!");
                admindashboard up = new admindashboard();
                up.setVisible(true);
                this.dispose();
                }else if(type.equals("User")){
                JOptionPane.showMessageDialog(null, "Login Success!");
                userDashboard up = new userDashboard();
                up.setVisible(true);
                this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No Account Type Found!");
                }
            }
                }else{
                    JOptionPane.showMessageDialog(null, "Login Failed. Invalid Account!");
          }
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        LoginButton.setBackground(clickColor);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        LoginButton.setBackground(navColor);
    }//GEN-LAST:event_loginMouseExited

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
       homedashboard up = new homedashboard();
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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FurHome;
    private javax.swing.JLabel FurHome1;
    private javax.swing.JPanel LoginButton;
    private javax.swing.JLabel Register;
    private javax.swing.JPanel SecondPanel;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login;
    public javax.swing.JPasswordField pass;
    public javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    private void addplaceholderStyle(JPasswordField pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
