/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.dbConnector;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Rustiza
 */
public class adminpets extends javax.swing.JFrame {

    private dbConnector connector;
 
    public adminpets() {
        initComponents();
          connector = new dbConnector();
        displayUser();
    }
 
    private void displayUser() {
        try {
            String query = "SELECT p_id, p_name, p_age, p_breed, p_gender, p_image, Date_Added FROM tbl_pet WHERE p_status NOT IN ('Archive')";
            pettable.setModel(DbUtils.resultSetToTableModel(connector.getData(query)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   private void archivePet() {
        int selectedRow = pettable.getSelectedRow();
        if (selectedRow != -1) {
            int petId = (int) pettable.getValueAt(selectedRow, 0);

        
            String checkQuery = "SELECT COUNT(*) FROM tbl_pet WHERE p_id = " + petId;
            int adoptionCount = 0;
            try {
                ResultSet rs = connector.getData(checkQuery);
                if (rs.next()) {
                    adoptionCount = rs.getInt(1);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error checking adoption status: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("(dd-MM-yyyy) - (HH:mm)");
            String formattedDateTime = currentDateTime.format(formatter);

            if (adoptionCount > 0) {
                String updateQuery = "UPDATE tbl_pet SET Date_Added = '" + formattedDateTime + "', p_status = 'Archive' WHERE p_id = " + petId;
                try {
                    if (connector.updateData(updateQuery)) {
                        JOptionPane.showMessageDialog(this, "Pet updated successfully. Current date and time: " + formattedDateTime);
                        displayUser(); // Refresh the table
                        return;
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error updating adoption status: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                String archiveQuery = "INSERT INTO tbl_pet (p_id, p_name, p_age, p_breed, p_gender, p_image, Date_Added, p_status) "
                        + "SELECT p_id, p_name, p_age, p_breed, p_gender, '', '" + formattedDateTime + "', 'Archive' "
                        + "FROM tbl_pet WHERE p_id = " + petId;
                String deleteQuery = "DELETE FROM tbl_pet WHERE p_id = " + petId;

                try {
                    if (connector.archiveData(archiveQuery) && connector.deleteData(deleteQuery)) {
                        JOptionPane.showMessageDialog(this, "Pet archived successfully. Current date and time copied to clipboard: " + formattedDateTime);
                        displayUser(); // Refresh the table
                        return;
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error archiving pet: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a pet to archive.", "No Selection", JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pettable = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        addbutton = new javax.swing.JButton();
        archivebutton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setLayout(null);

        pettable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(pettable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(16, 17, 940, 600);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 970, 630);

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

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Pets");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 100, 40);

        addbutton.setBackground(new java.awt.Color(255, 255, 255));
        addbutton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        addbutton.setText("Add");
        addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttonMouseClicked(evt);
            }
        });
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(addbutton);
        addbutton.setBounds(810, 30, 80, 30);

        archivebutton1.setBackground(new java.awt.Color(255, 255, 255));
        archivebutton1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        archivebutton1.setText("Archive");
        archivebutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archivebutton1MouseClicked(evt);
            }
        });
        archivebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivebutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(archivebutton1);
        archivebutton1.setBounds(900, 30, 80, 30);

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

    private void addbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseClicked

    }//GEN-LAST:event_addbuttonMouseClicked

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
       addpet up = new addpet();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_addbuttonActionPerformed

    private void archivebutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivebutton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_archivebutton1MouseClicked

    private void archivebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivebutton1ActionPerformed
       archivePet();
    }//GEN-LAST:event_archivebutton1ActionPerformed

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
            java.util.logging.Logger.getLogger(adminpets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addbutton;
    public javax.swing.JButton archivebutton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pettable;
    // End of variables declaration//GEN-END:variables
}
