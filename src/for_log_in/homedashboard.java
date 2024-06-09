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
        jTextArea4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
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
        jPanel11 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
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
        jLabel47 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();

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

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setTabSize(10);
        jTextArea4.setText("\"Animals are such agreeable friends—they ask \n         no questions; they pass no criticisms.\" \n                          — George Eliot");
        jTextArea4.setBorder(null);
        jTextArea4.setDoubleBuffered(true);
        jPanel4.add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 290, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/25-wall.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 540, 230));

        jLabel4.setFont(new java.awt.Font("Pristina", 0, 100)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("riend");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 240, 130));

        jLabel2.setFont(new java.awt.Font("Pristina", 1, 300)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("F");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 270, 320));

        jLabel3.setFont(new java.awt.Font("Pristina", 0, 70)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ind your");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 230, 100));

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 990, 230);

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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel7.setLayout(null);

        jLabel26.setText("write a feedback");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(20, 10, 90, 20);

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 880, 120));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconforcats/images (2) (2).jpg"))); // NOI18N
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 110, 110));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 110, 90));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3c12985fa7345871ea3e7d44bdad069f.jpg"))); // NOI18N
        jLabel29.setText("jLabel5");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eedcf4ff189d37226b0dae8353a1357e_1.jpg"))); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 120));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, 90));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/face6.jpg"))); // NOI18N
        jLabel27.setText(" ");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 170, 200));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 110, 90));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/face8.jpg"))); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 90));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconforcats/https___tf-cmsv2-smithsonianmag-media.s3.amazonaws.com_filer_public_55_95_55958815-3a8a-4032-ac7a-ff8c8ec8898a_gettyimages-1067956982.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel15.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, -1, -1));

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, 90));

        jPanel6.setBackground(new java.awt.Color(255, 208, 144));
        jPanel6.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Know our Numbers");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(340, 0, 130, 30);

        jLabel15.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("14");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(520, 40, 100, 60);

        jLabel17.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("years of service");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(520, 100, 100, 20);

        jLabel20.setFont(new java.awt.Font("Candara", 0, 100)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("|");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(470, 30, 30, 100);

        jLabel21.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("50+");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(200, 40, 100, 50);

        jLabel48.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("serving");
        jPanel6.add(jLabel48);
        jLabel48.setBounds(360, 100, 100, 20);

        jLabel49.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("100+");
        jPanel6.add(jLabel49);
        jLabel49.setBounds(350, 40, 120, 50);

        jLabel50.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("staff");
        jPanel6.add(jLabel50);
        jLabel50.setBounds(200, 100, 100, 20);

        jLabel51.setFont(new java.awt.Font("Candara", 0, 100)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("|");
        jPanel6.add(jLabel51);
        jLabel51.setBounds(310, 30, 30, 100);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 880, 140));

        jLabel57.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Lost and Found");
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel9.setText("See more");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 70, 20));

        jLabel18.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel18.setText("See more");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 70, 20));

        jLabel19.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel19.setText("See more");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 70, 20));

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel24.setText("See more");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 70, 20));

        jLabel25.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel25.setText("See more");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 70, 20));

        jLabel33.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel33.setText("See more");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, 10));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconforcats/images (2) (2).jpg"))); // NOI18N
        jPanel11.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 110, 110));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 110, 90));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3c12985fa7345871ea3e7d44bdad069f.jpg"))); // NOI18N
        jLabel36.setText("jLabel5");
        jLabel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jPanel5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 110, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eedcf4ff189d37226b0dae8353a1357e_1.jpg"))); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 120));

        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 110, 90));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/face6.jpg"))); // NOI18N
        jLabel38.setText(" ");
        jLabel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 170, 200));

        jPanel5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 110, 90));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/face8.jpg"))); // NOI18N
        jLabel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

        jPanel5.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 110, 90));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconforcats/https___tf-cmsv2-smithsonianmag-media.s3.amazonaws.com_filer_public_55_95_55958815-3a8a-4032-ac7a-ff8c8ec8898a_gettyimages-1067956982.png"))); // NOI18N
        jLabel40.setText("jLabel8");
        jPanel20.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, -1, -1));

        jPanel5.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 110, 90));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 70, 20));

        jLabel41.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel41.setText("See more");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 70, 20));

        jLabel42.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel42.setText("See more");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, 10));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 70, 20));

        jLabel43.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel43.setText("See more");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, -1, 10));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 70, 20));

        jLabel44.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel44.setText("See more");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, 10));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 70, 20));

        jLabel45.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel45.setText("See more");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, 10));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 70, 20));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 70, 20));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 70, 20));

        jLabel60.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel60.setText("See more");
        jPanel5.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, -1, 10));

        jLabel61.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel61.setText("See more");
        jPanel5.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, 10));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 70, 20));

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 70, 20));

        jLabel62.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel62.setText("See more");
        jPanel5.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, 10));

        jLabel63.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel63.setText("See more");
        jPanel5.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, 10));

        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 70, 20));

        jLabel64.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel64.setText("See more");
        jPanel5.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, 10));

        jLabel65.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel65.setText("See more");
        jPanel5.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 10));

        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 70, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.setLayout(null);
        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 920, 290));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel8.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel23.setText("Feedback");
        jPanel8.add(jLabel23);
        jLabel23.setBounds(20, 170, 73, 30);

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 920, 330));

        scrollPane.setViewportView(jPanel5);

        jPanel3.add(scrollPane);
        scrollPane.setBounds(0, 340, 990, 360);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(10, 240, 970, 10);

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
        login.setBounds(790, 250, 70, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel10);
        jLabel10.setBounds(960, 240, 24, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel11);
        jLabel11.setBounds(180, 290, 24, 30);

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
        jLabel6.setBounds(0, 310, 100, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(70, 310, 30, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel22);
        jLabel22.setBounds(10, 260, 24, 30);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel28);
        jLabel28.setBounds(90, 240, 30, 30);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel30);
        jLabel30.setBounds(540, 310, 24, 30);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel31);
        jLabel31.setBounds(400, 290, 24, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton1.setText("Home");
        jPanel3.add(jButton1);
        jButton1.setBounds(170, 250, 65, 20);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton7.setText("About us");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(580, 250, 83, 20);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton8.setText("Services");
        jPanel3.add(jButton8);
        jButton8.setBounds(380, 250, 79, 20);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel47);
        jLabel47.setBounds(610, 280, 24, 30);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel52);
        jLabel52.setBounds(670, 250, 24, 30);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel53);
        jLabel53.setBounds(720, 300, 24, 30);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel54);
        jLabel54.setBounds(780, 260, 24, 30);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel55);
        jLabel55.setBounds(840, 310, 24, 30);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel56);
        jLabel56.setBounds(920, 290, 24, 30);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel58);
        jLabel58.setBounds(870, 240, 24, 30);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel59);
        jLabel59.setBounds(250, 240, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void scrollPaneMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_scrollPaneMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollPaneMouseWheelMoved

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel5MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseWheelMoved

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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JButton login;
    public javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
