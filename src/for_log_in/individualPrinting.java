/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.PanelPrinter;
import javax.swing.JPanel;

/**
 *
 * @author DERECHO
 */
public class individualPrinting extends javax.swing.JFrame {

    /**
     * Creates new form individualPrinting
     */
    public individualPrinting() {
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

        jPanel1 = new javax.swing.JPanel();
        page = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usta = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        up = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        us = new javax.swing.JLabel();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 229, 204));
        jPanel1.setLayout(null);

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        page.setLayout(null);
        page.add(jSeparator1);
        jSeparator1.setBounds(50, 90, 860, 10);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ST.CECILIA'S COLLEGE - CEBU, INC.");
        page.add(jLabel1);
        jLabel1.setBounds(240, 30, 520, 30);

        id.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(id);
        id.setBounds(210, 140, 220, 20);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Poblacion Ward iii, Minglanilla Cebu ");
        page.add(jLabel3);
        jLabel3.setBounds(240, 60, 520, 20);

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("User ID:");
        page.add(jLabel4);
        jLabel4.setBounds(80, 140, 50, 20);

        fn.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(fn);
        fn.setBounds(210, 200, 220, 20);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("First name:");
        page.add(jLabel5);
        jLabel5.setBounds(80, 200, 67, 20);

        ln.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(ln);
        ln.setBounds(210, 250, 220, 20);

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Last name:");
        page.add(jLabel6);
        jLabel6.setBounds(80, 250, 70, 20);

        em.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(em);
        em.setBounds(210, 310, 220, 20);

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setText("Email:");
        page.add(jLabel7);
        jLabel7.setBounds(80, 310, 50, 20);

        usta.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        usta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(usta);
        usta.setBounds(210, 420, 220, 20);

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setText("User name:");
        page.add(jLabel8);
        jLabel8.setBounds(80, 360, 70, 20);

        up.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        up.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(up);
        up.setBounds(210, 470, 220, 20);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Account type:");
        page.add(jLabel9);
        jLabel9.setBounds(80, 470, 90, 20);

        jLabel10.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Account status:");
        page.add(jLabel10);
        jLabel10.setBounds(80, 420, 100, 20);

        us.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(us);
        us.setBounds(210, 360, 220, 20);

        jPanel1.add(page);
        page.setBounds(10, 40, 960, 640);

        print.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(900, 20, 71, 20);

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

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        JPanel myPanel = new JPanel();
        PanelPrinter pPrint = new PanelPrinter(page);
        pPrint.printPanel();
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(individualPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(individualPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(individualPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(individualPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new individualPrinting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel em;
    public javax.swing.JLabel fn;
    public javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel ln;
    private javax.swing.JPanel page;
    private javax.swing.JButton print;
    public javax.swing.JLabel up;
    public javax.swing.JLabel us;
    public javax.swing.JLabel usta;
    // End of variables declaration//GEN-END:variables
}
