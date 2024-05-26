/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import config.Session;
import for_log_in.logIn;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class accountDetails extends javax.swing.JFrame {

    /**
     * Creates new form userDashboard
     */
    public accountDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        maindesktopuser = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        acc_ln = new javax.swing.JLabel();
        acc_fn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        up = new javax.swing.JComboBox<>();
        us = new javax.swing.JTextField();
        user_name = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        first_name = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        last_name = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        e_mail = new javax.swing.JLabel();
        iddisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        changepass = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-100_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 110));

        acc_ln.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        acc_ln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_ln.setText("User");
        acc_ln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acc_lnMouseClicked(evt);
            }
        });
        jPanel2.add(acc_ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 70, -1));

        acc_fn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        acc_fn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_fn.setText("acc_fn");
        acc_fn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acc_fnMouseClicked(evt);
            }
        });
        jPanel2.add(acc_fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(null);

        type.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(153, 153, 153));
        type.setText("Account Type");
        jPanel4.add(type);
        type.setBounds(470, 50, 90, 18);

        up.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel4.add(up);
        up.setBounds(470, 70, 80, 20);

        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel4.add(us);
        us.setBounds(90, 310, 340, 40);

        user_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        user_name.setForeground(new java.awt.Color(153, 153, 153));
        user_name.setText("Username:");
        jPanel4.add(user_name);
        user_name.setBounds(90, 290, 65, 18);

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel4.add(fn);
        fn.setBounds(90, 70, 340, 40);

        first_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name.setForeground(new java.awt.Color(153, 153, 153));
        first_name.setText("First Name:");
        jPanel4.add(first_name);
        first_name.setBounds(90, 50, 67, 18);
        jPanel4.add(ln);
        ln.setBounds(90, 190, 340, 40);

        last_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        last_name.setForeground(new java.awt.Color(153, 153, 153));
        last_name.setText("Last Name:");
        jPanel4.add(last_name);
        last_name.setBounds(90, 170, 66, 18);

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel4.add(em);
        em.setBounds(90, 440, 340, 40);

        e_mail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        e_mail.setForeground(new java.awt.Color(153, 153, 153));
        e_mail.setText("Email:");
        jPanel4.add(e_mail);
        e_mail.setBounds(90, 420, 35, 20);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 760, 530));

        iddisplay.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        iddisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iddisplay.setText("UID");
        jPanel2.add(iddisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 20));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACCOUNT INFORMATION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 310, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Log Out");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, 68, -1));

        changepass.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        changepass.setForeground(new java.awt.Color(0, 0, 255));
        changepass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-change-25.png"))); // NOI18N
        changepass.setText("Change Password");
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
        });
        jPanel2.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, 20));

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-arrow-back-20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        maindesktopuser.add(jPanel2);
        jPanel2.setBounds(0, 0, 990, 700);

        jPanel1.add(maindesktopuser);
        maindesktopuser.setBounds(0, 0, 990, 700);

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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited

    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         
    }//GEN-LAST:event_jLabel1MouseClicked

    private void acc_lnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc_lnMouseClicked
        
      
    }//GEN-LAST:event_acc_lnMouseClicked

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void acc_fnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc_fnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_acc_fnMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getinstance();
       
       iddisplay.setText("USER ID: "+sess.getUid());
       acc_fn.setText(""+sess.getFname());
       acc_ln.setText(""+sess.getLname());
       em.setText(""+sess.getEmail());
       us.setText(""+sess.getUsername());
       fn.setText(""+sess.getFname());
       ln.setText(""+sess.getUsername());
    }//GEN-LAST:event_formWindowActivated

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
       changepass ig = new changepass();
       ig.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_changepassMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
      userDashboard up = new userDashboard();
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
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel acc_fn;
    public javax.swing.JLabel acc_ln;
    private javax.swing.JLabel changepass;
    private javax.swing.JLabel e_mail;
    public javax.swing.JTextField em;
    private javax.swing.JLabel first_name;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel iddisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel last_name;
    public javax.swing.JTextField ln;
    private javax.swing.JDesktopPane maindesktopuser;
    private javax.swing.JLabel type;
    public javax.swing.JComboBox<String> up;
    public javax.swing.JTextField us;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
