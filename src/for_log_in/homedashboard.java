/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import To_register.re_gister;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author DERECHO
 */
public class homedashboard extends javax.swing.JFrame {

    /**
     * Creates new form homedashboard
     */
    public homedashboard() {
        initComponents();
      customizeScrollPane();
        }
       
  private void customizeScrollPane() {
        JScrollPane scrollPane = new JScrollPane(); // Replace this with your actual JScrollPane

        // Remove the default border
        scrollPane.setBorder(null);

        // Set the background color of the viewport
        scrollPane.getViewport().setBackground(new Color(240, 240, 240)); // Example color

        // Add scrollPane to your layout where it is needed
        // Example: add(scrollPane);

        // Alternatively, add the scrollPane to a JPanel without borders for a cleaner look
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder()); // Remove borders from the panel
        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel); // Add the panel to your layout
    }


    Color navColor = new Color(255,255,255);
    Color clickColor = new Color(244,229,204);
    
     class ModernScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            this.thumbColor = new Color(150, 150, 150); // Set thumb color
            this.trackColor = new Color(200, 200, 200); // Set track color
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createZeroButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createZeroButton();
        }

        private JButton createZeroButton() {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(0, 0));
            button.setMinimumSize(new Dimension(0, 0));
            button.setMaximumSize(new Dimension(0, 0));
            return button;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        login = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(244, 229, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 80)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Friend");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Find ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("your ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/25-wall.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 540, 230));

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 660, 230);

        scrollPane.setBorder(null);
        scrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPane.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                scrollPaneMouseWheelMoved(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel5MouseWheelMoved(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel23.setText("Feedback");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, 20));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel7.setLayout(null);

        jLabel26.setText("write a feedback");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(20, 10, 90, 20);

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 450, 120));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconforcats/images (2) (2).jpg"))); // NOI18N
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 110, 110));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 110, 90));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3c12985fa7345871ea3e7d44bdad069f.jpg"))); // NOI18N
        jLabel29.setText("jLabel5");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eedcf4ff189d37226b0dae8353a1357e_1.jpg"))); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 120));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 110, 90));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/face6.jpg"))); // NOI18N
        jLabel27.setText(" ");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 170, 200));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 110, 90));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/face8.jpg"))); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 90));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconforcats/https___tf-cmsv2-smithsonianmag-media.s3.amazonaws.com_filer_public_55_95_55958815-3a8a-4032-ac7a-ff8c8ec8898a_gettyimages-1067956982.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel15.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, -1, -1));

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 110, 90));

        jPanel6.setBackground(new java.awt.Color(255, 208, 144));
        jPanel6.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Know our Numbers");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(170, 0, 130, 18);

        jLabel15.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("14");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(350, 40, 100, 60);

        jLabel17.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("years of service");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(350, 100, 100, 20);

        jLabel20.setFont(new java.awt.Font("Candara", 0, 100)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("|");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(300, 30, 30, 100);

        jLabel21.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("50+");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(30, 40, 100, 50);

        jLabel48.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("serving");
        jPanel6.add(jLabel48);
        jLabel48.setBounds(190, 100, 100, 20);

        jLabel49.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("100+");
        jPanel6.add(jLabel49);
        jLabel49.setBounds(180, 40, 120, 50);

        jLabel50.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("staff");
        jPanel6.add(jLabel50);
        jLabel50.setBounds(30, 100, 100, 20);

        jLabel51.setFont(new java.awt.Font("Candara", 0, 100)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("|");
        jPanel6.add(jLabel51);
        jLabel51.setBounds(140, 30, 30, 100);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 480, 140));

        jLabel57.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Lost and Found");
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -140, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 70, 20));

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel9.setText("See more");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 70, 20));

        jLabel18.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel18.setText("See more");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 70, 20));

        jLabel19.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel19.setText("See more");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 20));

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel24.setText("See more");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 70, 20));

        jLabel25.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel25.setText("See more");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 70, 20));

        jLabel33.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel33.setText("See more");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 10));

        scrollPane.setViewportView(jPanel5);

        jPanel3.add(scrollPane);
        scrollPane.setBounds(0, 330, 670, 250);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(0, 240, 640, 10);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        login.setText("Log In");
        login.setBorder(null);
        login.setFocusPainted(false);
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
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel3.add(login);
        login.setBounds(490, 250, 70, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel10);
        jLabel10.setBounds(610, 280, 24, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel11);
        jLabel11.setBounds(200, 260, 24, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(300, 300, 24, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel14);
        jLabel14.setBounds(480, 260, 24, 30);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Find Here");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 300, 100, 20);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(70, 310, 30, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel22);
        jLabel22.setBounds(10, 260, 24, 30);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel28);
        jLabel28.setBounds(140, 290, 30, 30);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel30);
        jLabel30.setBounds(540, 300, 24, 30);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel31);
        jLabel31.setBounds(400, 290, 24, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton1.setText("Home");
        jPanel3.add(jButton1);
        jButton1.setBounds(80, 250, 65, 20);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton7.setText("About us");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(350, 250, 83, 20);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton8.setText("Services");
        jPanel3.add(jButton8);
        jButton8.setBounds(210, 250, 79, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(navColor);
    }//GEN-LAST:event_loginMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(clickColor);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel5MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseWheelMoved

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void scrollPaneMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_scrollPaneMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollPaneMouseWheelMoved

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
            java.util.logging.Logger.getLogger(homedashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homedashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homedashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homedashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homedashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton login;
    public javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
