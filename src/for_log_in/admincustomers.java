/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import user.adoptionapplication;

/**
 *
 * @author DERECHO
 */
public class admincustomers extends javax.swing.JFrame {
    
    private dbConnector connector;
 
    public admincustomers() {
        initComponents();
        connector = new dbConnector();
        displayUser();
    }
        public String action;
    

   private void displayUser() {
        try {
            String query = "SELECT c_id, c_name, c_age, c_gender, c_contact, c_address, c_email FROM tbl_customers";
            customersTable.setModel(DbUtils.resultSetToTableModel(connector.getData(query)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
   }
   
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        archivebutton = new javax.swing.JButton();
        customers = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Customers");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 100, 40);

        archivebutton.setBackground(new java.awt.Color(255, 255, 255));
        archivebutton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        archivebutton.setText("Archive");
        archivebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archivebuttonMouseClicked(evt);
            }
        });
        archivebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(archivebutton);
        archivebutton.setBounds(880, 30, 100, 30);

        customers.setBackground(new java.awt.Color(255, 255, 255));
        customers.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        customers.setText("Add");
        customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersMouseClicked(evt);
            }
        });
        customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersActionPerformed(evt);
            }
        });
        jPanel1.add(customers);
        customers.setBounds(780, 30, 90, 30);

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setLayout(null);

        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(customersTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 950, 610);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 60, 970, 630);

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

    private void archivebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivebuttonMouseClicked
  
    }//GEN-LAST:event_archivebuttonMouseClicked

    private void archivebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivebuttonActionPerformed
               int selectedRow = customersTable.getSelectedRow();
        if (selectedRow != -1) {
            int customerId = (int) customersTable.getValueAt(selectedRow, 0);
            String archiveQuery = "INSERT INTO tbl_archived_customers SELECT * FROM tbl_customers WHERE c_id = " + customerId;
            String deleteQuery = "DELETE FROM tbl_customers WHERE c_id = " + customerId;
            try {
                if (connector.archiveData(archiveQuery) && connector.deleteData(deleteQuery)) {
                    JOptionPane.showMessageDialog(this, "Customer archived successfully.");
                    displayUser(); // Refresh the table
                    return;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error archiving customer: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a customer to archive.", "No Selection", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_archivebuttonActionPerformed

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
       
    }//GEN-LAST:event_customersMouseClicked

    private void customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersActionPerformed
        adoptionapplicationforcustomer up = new adoptionapplicationforcustomer();
        up.setVisible(true);
        up.action = "Add";
        this.dispose();
    }//GEN-LAST:event_customersActionPerformed

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
            java.util.logging.Logger.getLogger(admincustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admincustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admincustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admincustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admincustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton archivebutton;
    private javax.swing.JButton customers;
    public javax.swing.JTable customersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
