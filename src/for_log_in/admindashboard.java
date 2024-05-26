/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.Session;
import java.awt.Color;
import javax.swing.JOptionPane;



/**
 *
 * @author DERECHO
 */
public class admindashboard extends javax.swing.JFrame {

    /**
     * Creates new form admindashboard
     */
    public admindashboard() {
        initComponents();
    }
    Color navColor = new Color(255,255,255);
    Color clickColor = new Color(164,87,14);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maindesktop = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        manageaccount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        report = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        petbutton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        account_fname = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(244, 229, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 80)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Friend");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Find ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("your ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/25-wall.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 540, 290));

        maindesktop.add(jPanel4);
        jPanel4.setBounds(0, 20, 670, 230);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Home");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Pets");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 20));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Services");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, 20));

        jLabel11.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Archive");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, 20));

        manageaccount.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        manageaccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageaccount.setText("Manage Account");
        manageaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageaccountMouseClicked(evt);
            }
        });
        jPanel5.add(manageaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, 20));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Log Out");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, 20));

        jLabel12.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("About Us");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 20));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Our Services");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 640, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setLayout(null);

        report.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        report.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-report-25.png"))); // NOI18N
        report.setText("Report");
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });
        jPanel2.add(report);
        report.setBounds(40, 130, 65, 25);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-customer-25.png"))); // NOI18N
        jLabel28.setText("Customers");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel28);
        jLabel28.setBounds(380, 130, 84, 25);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setEnabled(false);
        jScrollPane3.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jScrollPane3.setRequestFocusEnabled(false);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setTabSize(10);
        jTextArea3.setText("Through every adoption report,\n we celebrate the heartwarming stories\n of pets finding their forever homes.\n Each statistic is a testament to the love\n and compassion that transforms lives,\n one furry friend at a time.");
        jTextArea3.setBorder(null);
        jTextArea3.setDoubleBuffered(true);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(380, 160, 180, 80);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jScrollPane2.setRequestFocusEnabled(false);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setTabSize(10);
        jTextArea2.setText("Paws and whiskers, wagging tails and joyful barks – pets bring \nboundless love and happiness into our lives, \nreminding us daily of the purest forms of \ncompanionship and joy.");
        jTextArea2.setBorder(null);
        jTextArea2.setDoubleBuffered(true);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(40, 160, 160, 60);

        jLabel14.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-note-25.png"))); // NOI18N
        jLabel14.setText("Record Of Adopted Pets");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14);
        jLabel14.setBounds(380, 20, 160, 25);

        petbutton.setBackground(new java.awt.Color(255, 255, 255));
        petbutton.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        petbutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        petbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-pets-25.png"))); // NOI18N
        petbutton.setText("Pets");
        petbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                petbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                petbuttonMouseExited(evt);
            }
        });
        jPanel2.add(petbutton);
        petbutton.setBounds(40, 20, 63, 25);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jScrollPane1.setRequestFocusEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(10);
        jTextArea1.setText("Our customers aren't just patrons; they're\n paw-some companions on a journey of\n pet parenthood. With every interaction,\n we strive to wag more tails and purr \nmore contentedly, ensuring that each\n furry friend and their human gets the\n care and attention they deserve.");
        jTextArea1.setBorder(null);
        jTextArea1.setDoubleBuffered(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 160, 65);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setEnabled(false);
        jScrollPane4.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jScrollPane4.setRequestFocusEnabled(false);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setTabSize(10);
        jTextArea4.setText("Every record of adopted pets tells a story\n of hope and a new beginning. \nThese records are a testament to the\n countless lives changed by love, \nshowcasing the journey from shelter.");
        jTextArea4.setBorder(null);
        jTextArea4.setDoubleBuffered(true);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(380, 50, 180, 70);

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 600, 250));

        account_fname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        account_fname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        account_fname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-customer-25.png"))); // NOI18N
        account_fname.setText("ADMIN!");
        account_fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                account_fnameMouseClicked(evt);
            }
        });
        jPanel5.add(account_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 150, 40));

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-arrow-back-20.png"))); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        maindesktop.add(jPanel5);
        jPanel5.setBounds(0, 0, 660, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maindesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maindesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getinstance();
        
        if(sess.getUid() == 0)
        {
            JOptionPane.showMessageDialog(null, "No account, Please Login!");
            logIn up = new logIn();
            up.setVisible(true);
            this.dispose();
        }else{
            account_fname.setText(""+sess.getFname());
        }
    }//GEN-LAST:event_formWindowActivated

    private void account_fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account_fnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_account_fnameMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       foradoptedpet up = new foradoptedpet();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        admincustomers up = new admincustomers();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        adminreport up = new adminreport();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        homedashboard up = new homedashboard();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void manageaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageaccountMouseClicked
        internalUser up = new internalUser();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageaccountMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        adminarchive up = new adminarchive();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        addpet up = new addpet();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void petbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petbuttonMouseExited

    }//GEN-LAST:event_petbuttonMouseExited

    private void petbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petbuttonMouseEntered

    }//GEN-LAST:event_petbuttonMouseEntered

    private void petbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petbuttonMouseClicked
        adminpets up = new adminpets();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_petbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel account_fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel manageaccount;
    private javax.swing.JLabel petbutton;
    private javax.swing.JLabel report;
    // End of variables declaration//GEN-END:variables
}
