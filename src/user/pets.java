/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Pets_Information.Pet2;
import Pets_Information.Pet3;
import Pets_Information.Pet4;
import config.dbConnector;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author DERECHO
 */
public class pets extends javax.swing.JFrame {

     private dbConnector connector;
     
     
    public pets() {
        initComponents();
        connector = new dbConnector();
        displayUser();
    }

     private void displayUser() {
        try {
            String query = "SELECT p_id, p_name, p_age, p_breed, p_gender, p_image, Date_Adopted FROM tbl_pet";
            selectpets.setModel(DbUtils.resultSetToTableModel(connector.getData(query)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectpets = new javax.swing.JTable();
        openbutton = new javax.swing.JButton();
        archivebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel40.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-arrow-back-20.png"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel40);
        jLabel40.setBounds(0, 0, 20, 20);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel5.setLayout(null);

        selectpets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(selectpets);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(16, 17, 940, 600);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 60, 970, 630);

        openbutton.setBackground(new java.awt.Color(255, 255, 255));
        openbutton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        openbutton.setText("Open");
        openbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openbuttonMouseClicked(evt);
            }
        });
        openbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(openbutton);
        openbutton.setBounds(770, 30, 100, 30);

        archivebutton.setBackground(new java.awt.Color(255, 255, 255));
        archivebutton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        archivebutton.setText("Adopt");
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

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
       userDashboard up = new userDashboard();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel40MouseClicked

    private void openbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openbuttonMouseClicked

    }//GEN-LAST:event_openbuttonMouseClicked

    private void openbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbuttonActionPerformed
    int selectedRow = selectpets.getSelectedRow();
        if (selectedRow != -1) {
            int selectedrow = (int) selectpets.getValueAt(selectedRow, 0);
                if (selectedrow % 2 == 0) {
        Pet2 petForm = new Pet2();
        petForm.setVisible(true);
        this.dispose();
    } else if (selectedrow % 3 == 0) {
        Pet3 petForm = new Pet3();
        petForm.setVisible(true);
        this.dispose();
    } else {
        Pet4 petForm = new Pet4();
        petForm.setVisible(true);
        this.dispose();
    }
} else {
    JOptionPane.showMessageDialog(this, "Please select a customer to OPEN.", "No Selection", JOptionPane.WARNING_MESSAGE);
}
    }//GEN-LAST:event_openbuttonActionPerformed

    private void archivebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivebuttonMouseClicked

    }//GEN-LAST:event_archivebuttonMouseClicked

    private void archivebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivebuttonActionPerformed
   int selectedRow = selectpets.getSelectedRow();
        if (selectedRow != -1) {
            int petId = (int) selectpets.getValueAt(selectedRow, 0);
            String archiveQuery = "INSERT INTO tbl_adopted SELECT * FROM tbl_pet WHERE p_id = " + petId;
            String deleteQuery = "DELETE FROM tbl_pet WHERE p_id = " + petId;
            try {
                if (connector.archiveData(archiveQuery) && connector.deleteData(deleteQuery)) {
                    JOptionPane.showMessageDialog(this, "Pet Added successfully.");
                    displayUser(); // Refresh the table
                    return;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error Adding Pet: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a pet to add.", "No Selection", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_archivebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton archivebutton;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton openbutton;
    private javax.swing.JTable selectpets;
    // End of variables declaration//GEN-END:variables
}
