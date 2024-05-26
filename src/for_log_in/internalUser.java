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
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Rustiza
 */
public class internalUser extends javax.swing.JFrame {

  
    
    public internalUser() {
        initComponents();
       
        displayUser();
    }

         public void displayUser(){
        dbConnector connector = new dbConnector();
        try{            
            try (ResultSet resultSet = connector.getData("SELECT u_id, u_fname, u_lname, u_email, u_username,u_contact, u_type, u_status, u_password FROM tbl_user")) {
                usersTable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        useraccount_name = new javax.swing.JLabel();
        update1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        archive = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        useraccount_name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        useraccount_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        useraccount_name.setText("Add");
        useraccount_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        useraccount_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useraccount_nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                useraccount_nameMouseEntered(evt);
            }
        });
        jPanel1.add(useraccount_name);
        useraccount_name.setBounds(250, 30, 50, 20);

        update1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        update1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update1.setText("Edit");
        update1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update1MouseEntered(evt);
            }
        });
        jPanel1.add(update1);
        update1.setBounds(320, 30, 60, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Delete");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 30, 60, 20);

        archive.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        archive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        archive.setText("Archive");
        archive.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        archive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archiveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                archiveMouseEntered(evt);
            }
        });
        jPanel1.add(archive);
        archive.setBounds(480, 30, 70, 20);

        print.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("Print");
        print.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(570, 30, 60, 20);

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setLayout(null);

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 620, 500);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 640, 520);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Manage Account");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 160, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void useraccount_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraccount_nameMouseClicked
        add_userform up = new add_userform();
        up.setVisible(true);
        up.action = "Add";
        up.st_label.setText("SAVE");
        up.remove.setEnabled(false);
        up.select.setEnabled(true);
        this.dispose();

    }//GEN-LAST:event_useraccount_nameMouseClicked

    private void useraccount_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraccount_nameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_useraccount_nameMouseEntered

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
        int rowindex = usersTable.getSelectedRow();
        if(rowindex < 0)
        {
            JOptionPane.showMessageDialog(null,"Please Select An Item");
        }else{
            TableModel model = usersTable.getModel();
            add_userform kr = new add_userform();
            kr .id.setText(""+model.getValueAt(rowindex, 0));
            kr .fn.setText(""+model.getValueAt(rowindex, 1));
            kr .ln.setText(""+model.getValueAt(rowindex, 2));
            kr .em.setText(model.getValueAt(rowindex, 3).toString());
            kr .us.setText(""+model.getValueAt(rowindex, 4));
            kr .cn.setText(model.getValueAt(rowindex, 5).toString());
            kr .up.setSelectedItem(""+model.getValueAt(rowindex, 6));
            kr .usta.setSelectedItem(model.getValueAt(rowindex, 7).toString());
            kr .pss.setText(""+model.getValueAt(rowindex, 8));
            kr .setVisible(true);
            kr .action = "Update";
            kr .st_label.setText("UPDATE");
            this.dispose();
        }
    }//GEN-LAST:event_update1MouseClicked

    private void update1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update1MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int rowindex = usersTable.getSelectedRow();
        if (rowindex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item.");
        } else {
            int id = (int) usersTable.getValueAt(rowindex, 0);
            dbConnector connector = new dbConnector();
            boolean deleted = connector.deleteData("DELETE FROM tbl_user WHERE u_id = '" + id + "' ");
            if (deleted) {
                System.out.println("Admin clicked Delete Account!");
                JOptionPane.showMessageDialog(null, "Deleted Account Successfully!");
                internalUser up = new internalUser();
                up.setVisible(true);
                this.dispose();
            } else {
                System.out.println("Information Rejected!");
                JOptionPane.showMessageDialog(null, "Failed Successfully!");
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void archiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseClicked

    }//GEN-LAST:event_archiveMouseClicked

    private void archiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_archiveMouseEntered

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        int rowindex = usersTable.getSelectedRow();
        if(rowindex < 0)
        {
            JOptionPane.showMessageDialog(null,"Please Select An Item");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel model = usersTable.getModel();
                ResultSet rs = dbc.getData("Select * FROM tbl_user WHERE u_id = '"+model.getValueAt(rowindex, 0)+"'");
                if(rs.next()){
                    individualPrinting pf = new individualPrinting();
                    pf .id.setText(""+model.getValueAt(rowindex, 0));
                    pf .fn.setText(""+model.getValueAt(rowindex, 1));
                    pf .ln.setText(""+model.getValueAt(rowindex, 2));
                    pf .em.setText(model.getValueAt(rowindex, 3).toString());
                    pf .us.setText(""+model.getValueAt(rowindex, 4));
                    pf .up.setText(""+model.getValueAt(rowindex, 5));
                    pf .usta.setText(model.getValueAt(rowindex, 6).toString());
                    pf.setVisible(true);
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_printMouseClicked

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
            java.util.logging.Logger.getLogger(internalUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(internalUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(internalUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(internalUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new internalUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel archive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel print;
    public javax.swing.JLabel update1;
    public javax.swing.JLabel useraccount_name;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
