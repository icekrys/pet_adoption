/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.dbConnector;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DERECHO
 */
public class adminarchivepets extends javax.swing.JFrame {

       private dbConnector connector;
 
    public adminarchivepets() {
        initComponents();
         connector = new dbConnector();
        displayUser();
            
    }
    
    public void displayUser() {
        try {
            String query = "SELECT p_id, p_name, p_age, p_breed, p_gender, p_image, Date_Added FROM tbl_pet WHERE p_status = 'Archive'";
            archivestablepets.setModel(DbUtils.resultSetToTableModel(connector.getData(query)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void unarchivePet() {
        int selectedRow = archivestablepets.getSelectedRow();
        if (selectedRow != -1) {
            int petId = (int) archivestablepets.getValueAt(selectedRow, 0);
            String updateQuery = "UPDATE tbl_pet SET p_status = 'Available' WHERE p_id = " + petId;
            try {
                if (connector.updateData(updateQuery)) {
                    JOptionPane.showMessageDialog(this, "Pet unarchived successfully.");
                    displayUser(); // Refresh the table
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error unarchiving pet: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a pet to unarchive.", "No Selection", JOptionPane.WARNING_MESSAGE);
        }
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        archive = new javax.swing.JScrollPane();
        archivestablepets = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        retrunButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel4.setLayout(null);

        archivestablepets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        archive.setViewportView(archivestablepets);

        jPanel4.add(archive);
        archive.setBounds(16, 17, 940, 570);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 80, 970, 600);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Archive Pets");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 170, 20);

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

        retrunButton.setBackground(new java.awt.Color(255, 255, 255));
        retrunButton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        retrunButton.setText("Return");
        retrunButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retrunButtonMouseClicked(evt);
            }
        });
        retrunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrunButtonActionPerformed(evt);
            }
        });
        jPanel1.add(retrunButton);
        retrunButton.setBounds(880, 50, 100, 30);

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

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
     admindashboard up = new admindashboard();
     up.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void retrunButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrunButtonMouseClicked

    }//GEN-LAST:event_retrunButtonMouseClicked

    private void retrunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrunButtonActionPerformed
       unarchivePet();
    }//GEN-LAST:event_retrunButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminarchivepets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminarchivepets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminarchivepets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminarchivepets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminarchivepets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane archive;
    private javax.swing.JTable archivestablepets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JButton retrunButton;
    // End of variables declaration//GEN-END:variables
}