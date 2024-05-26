/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;
import To_register.*;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import user.userDashboard;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;





public class logIn extends javax.swing.JFrame {
    
    public logIn() {
        initComponents();
        
    }
    
    Color navColor = new Color(255,255,255);
    Color clickColor = new Color(244,229,204);
    static String status;
    static String type;
    
     
    public static boolean loginAcc(String username, String password){
    dbConnector connector = new dbConnector();
    
    try{
   
         String query = "SELECT * FROM tbl_user WHERE u_username = '" + username + "'";
         ResultSet resultSet = connector.getData(query);
        if(resultSet.next()){
            
             String hashedPass = resultSet.getString("u_password");
             String rehashedPass = passwordHasher.hashPassword(password); 
             
    
        if(hashedPass.equals(rehashedPass)){
        status = resultSet.getString("u_status");
        type = resultSet.getString("u_type");
        Session sess = Session.getinstance();
        sess.setUid(resultSet.getInt("u_id"));
         sess.setFname(resultSet.getString("u_fname"));
          sess.setLname(resultSet.getString("u_lname"));
           sess.setEmail(resultSet.getString("u_email"));
            sess.setUsername(resultSet.getString("u_username"));
             sess.setType(resultSet.getString("u_type"));
             sess.setStatus(resultSet.getString("u_status"));
         return true;
              }else{
         return false;
        }
                 }else{
            return false;
        }
    }catch (SQLException | NoSuchAlgorithmException ex) {
        System.out.println(""+ex);
        return false;
    }

}


     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        FurHome = new javax.swing.JLabel();
        FurHome1 = new javax.swing.JLabel();
        SecondPanel = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        LoginButton = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        FurHome2 = new javax.swing.JLabel();
        FurHome3 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        SecondPanel1 = new javax.swing.JPanel();
        user1 = new javax.swing.JTextField();
        LoginButton1 = new javax.swing.JPanel();
        login1 = new javax.swing.JLabel();
        forgotPassword1 = new javax.swing.JLabel();
        Register1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        FurHome.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        FurHome.setForeground(new java.awt.Color(255, 208, 144));
        FurHome.setText("Home");
        jPanel2.add(FurHome);
        FurHome.setBounds(150, 40, 200, 110);

        FurHome1.setBackground(new java.awt.Color(255, 255, 255));
        FurHome1.setFont(new java.awt.Font("Pristina", 1, 80)); // NOI18N
        FurHome1.setText("Fur  ");
        jPanel2.add(FurHome1);
        FurHome1.setBounds(40, 50, 160, 90);

        SecondPanel.setBackground(new java.awt.Color(255, 255, 255));
        SecondPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SecondPanel.setForeground(new java.awt.Color(164, 87, 14));
        SecondPanel.setLayout(null);

        user.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        user.setDragEnabled(true);
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        SecondPanel.add(user);
        user.setBounds(80, 130, 750, 60);
        user.getAccessibleContext().setAccessibleName("");

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.setLayout(null);

        login.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Log In");
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
        LoginButton.add(login);
        login.setBounds(20, 0, 130, 30);

        SecondPanel.add(LoginButton);
        LoginButton.setBounds(370, 390, 170, 30);

        forgotPassword.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(118, 199, 234));
        forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPassword.setText("Forgot Password");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });
        SecondPanel.add(forgotPassword);
        forgotPassword.setBounds(20, 510, 140, 20);

        Register.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        Register.setForeground(new java.awt.Color(118, 199, 234));
        Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register.setText("Register");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        SecondPanel.add(Register);
        Register.setBounds(800, 510, 80, 20);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setText("username");
        SecondPanel.add(jLabel1);
        jLabel1.setBounds(80, 110, 60, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setText("password");
        SecondPanel.add(jLabel2);
        jLabel2.setBounds(80, 240, 70, 20);

        pass.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        SecondPanel.add(pass);
        pass.setBounds(80, 260, 750, 60);

        jPanel2.add(SecondPanel);
        SecondPanel.setBounds(40, 120, 900, 540);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(650, 560, 24, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(280, 470, 70, 80);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(530, 480, 50, 60);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel16);
        jLabel16.setBounds(210, 20, 50, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel17);
        jLabel17.setBounds(0, 500, 50, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel18);
        jLabel18.setBounds(350, 50, 70, 80);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(140, 470, 50, 60);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 200, 24, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel22);
        jLabel22.setBounds(440, 510, 24, 30);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel23);
        jLabel23.setBounds(100, 30, 24, 30);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel24);
        jLabel24.setBounds(520, 60, 50, 60);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel25);
        jLabel25.setBounds(610, 30, 24, 30);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel21);
        jLabel21.setBounds(610, 200, 50, 60);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel26);
        jLabel26.setBounds(1300, 520, 24, 30);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel27);
        jLabel27.setBounds(1200, 490, 50, 60);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel28);
        jLabel28.setBounds(1110, 520, 24, 30);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel29);
        jLabel29.setBounds(950, 450, 70, 80);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel30);
        jLabel30.setBounds(840, 510, 50, 60);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel31);
        jLabel31.setBounds(690, 440, 50, 60);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel32);
        jLabel32.setBounds(680, 210, 24, 30);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel33);
        jLabel33.setBounds(680, 70, 70, 80);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel34);
        jLabel34.setBounds(770, 40, 24, 30);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel35);
        jLabel35.setBounds(810, 160, 50, 60);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel36);
        jLabel36.setBounds(1020, 60, 70, 80);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel37);
        jLabel37.setBounds(1190, 70, 50, 60);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel38);
        jLabel38.setBounds(1280, 40, 24, 30);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel39);
        jLabel39.setBounds(1280, 210, 50, 60);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel40);
        jLabel40.setBounds(670, 1060, 24, 30);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel41);
        jLabel41.setBounds(570, 1030, 50, 60);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel42);
        jLabel42.setBounds(480, 1060, 24, 30);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel43);
        jLabel43.setBounds(320, 1020, 70, 80);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel44);
        jLabel44.setBounds(180, 1020, 50, 60);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel45);
        jLabel45.setBounds(40, 1050, 50, 60);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel46);
        jLabel46.setBounds(50, 750, 24, 30);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel47);
        jLabel47.setBounds(50, 610, 70, 80);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel48);
        jLabel48.setBounds(140, 580, 24, 30);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel49);
        jLabel49.setBounds(250, 570, 50, 60);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel50);
        jLabel50.setBounds(390, 600, 70, 80);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel51);
        jLabel51.setBounds(560, 610, 50, 60);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel53);
        jLabel53.setBounds(650, 750, 50, 60);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel54);
        jLabel54.setBounds(1340, 1070, 24, 30);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel55);
        jLabel55.setBounds(1240, 1040, 50, 60);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel56);
        jLabel56.setBounds(1150, 1070, 24, 30);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel57);
        jLabel57.setBounds(990, 1030, 70, 80);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel58);
        jLabel58.setBounds(850, 1030, 50, 60);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel59);
        jLabel59.setBounds(710, 1060, 50, 60);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel60);
        jLabel60.setBounds(720, 760, 24, 30);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel61);
        jLabel61.setBounds(720, 620, 70, 80);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel62);
        jLabel62.setBounds(810, 590, 24, 30);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel63);
        jLabel63.setBounds(920, 620, 50, 60);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel64);
        jLabel64.setBounds(1060, 610, 70, 80);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel65);
        jLabel65.setBounds(1230, 620, 50, 60);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel66);
        jLabel66.setBounds(1320, 590, 24, 30);

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel67);
        jLabel67.setBounds(1320, 760, 50, 60);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel52);
        jLabel52.setBounds(650, 560, 24, 30);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel68);
        jLabel68.setBounds(530, 480, 50, 60);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel69);
        jLabel69.setBounds(440, 510, 24, 30);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel70);
        jLabel70.setBounds(280, 470, 70, 80);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel71);
        jLabel71.setBounds(140, 470, 50, 60);

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel72);
        jLabel72.setBounds(0, 500, 50, 60);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel73);
        jLabel73.setBounds(10, 200, 24, 30);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel74);
        jLabel74.setBounds(10, 60, 70, 80);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel75);
        jLabel75.setBounds(100, 30, 24, 30);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel76);
        jLabel76.setBounds(210, 20, 50, 60);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel77);
        jLabel77.setBounds(350, 50, 70, 80);

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel78);
        jLabel78.setBounds(520, 60, 50, 60);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel79);
        jLabel79.setBounds(610, 30, 24, 30);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel80);
        jLabel80.setBounds(610, 200, 50, 60);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel81);
        jLabel81.setBounds(1510, 760, 24, 30);

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel82);
        jLabel82.setBounds(1390, 680, 50, 60);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel83);
        jLabel83.setBounds(1300, 710, 24, 30);

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel84);
        jLabel84.setBounds(1140, 670, 70, 80);

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel85);
        jLabel85.setBounds(1000, 670, 50, 60);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel86);
        jLabel86.setBounds(860, 700, 50, 60);

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel87);
        jLabel87.setBounds(960, 350, 24, 30);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel88);
        jLabel88.setBounds(730, 280, 70, 80);

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel89);
        jLabel89.setBounds(960, 0, 24, 30);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel90);
        jLabel90.setBounds(1070, 220, 50, 60);

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel91);
        jLabel91.setBounds(1210, 250, 70, 80);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel92);
        jLabel92.setBounds(1380, 260, 50, 60);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel93);
        jLabel93.setBounds(1470, 230, 24, 30);

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel94);
        jLabel94.setBounds(1470, 400, 50, 60);

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel95);
        jLabel95.setBounds(940, 110, 50, 60);

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel96);
        jLabel96.setBounds(870, 260, 70, 80);

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel97);
        jLabel97.setBounds(960, 230, 24, 30);

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel98);
        jLabel98.setBounds(880, 30, 50, 60);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        FurHome2.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        FurHome2.setForeground(new java.awt.Color(255, 208, 144));
        FurHome2.setText("Home");
        jPanel3.add(FurHome2);
        FurHome2.setBounds(150, 40, 200, 110);

        FurHome3.setBackground(new java.awt.Color(255, 255, 255));
        FurHome3.setFont(new java.awt.Font("Pristina", 1, 80)); // NOI18N
        FurHome3.setText("Fur  ");
        jPanel3.add(FurHome3);
        FurHome3.setBounds(40, 50, 160, 90);

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel99);
        jLabel99.setBounds(10, 60, 70, 80);

        SecondPanel1.setBackground(new java.awt.Color(255, 255, 255));
        SecondPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SecondPanel1.setForeground(new java.awt.Color(164, 87, 14));
        SecondPanel1.setLayout(null);

        user1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        user1.setDragEnabled(true);
        user1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                user1FocusLost(evt);
            }
        });
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
        });
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });
        SecondPanel1.add(user1);
        user1.setBounds(60, 80, 450, 50);

        LoginButton1.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        LoginButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButton1MouseExited(evt);
            }
        });
        LoginButton1.setLayout(null);

        login1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        login1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login1.setText("Log In");
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login1MouseExited(evt);
            }
        });
        LoginButton1.add(login1);
        login1.setBounds(20, 0, 130, 30);

        SecondPanel1.add(LoginButton1);
        LoginButton1.setBounds(210, 250, 170, 30);

        forgotPassword1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        forgotPassword1.setForeground(new java.awt.Color(118, 199, 234));
        forgotPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPassword1.setText("Forgot Password");
        forgotPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassword1MouseClicked(evt);
            }
        });
        SecondPanel1.add(forgotPassword1);
        forgotPassword1.setBounds(60, 320, 120, 20);

        Register1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Register1.setForeground(new java.awt.Color(118, 199, 234));
        Register1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register1.setText("Register");
        Register1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Register1MouseClicked(evt);
            }
        });
        SecondPanel1.add(Register1);
        Register1.setBounds(440, 320, 70, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setText("username");
        SecondPanel1.add(jLabel3);
        jLabel3.setBounds(60, 60, 60, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setText("password");
        SecondPanel1.add(jLabel4);
        jLabel4.setBounds(60, 160, 70, 20);

        pass1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        SecondPanel1.add(pass1);
        pass1.setBounds(60, 180, 450, 50);

        jPanel3.add(SecondPanel1);
        SecondPanel1.setBounds(40, 140, 580, 360);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel100.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-arrow-back-20.png"))); // NOI18N
        jLabel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel100MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel100);
        jLabel100.setBounds(0, 0, 20, 20);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 650, 20);

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel101);
        jLabel101.setBounds(650, 560, 24, 30);

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel102);
        jLabel102.setBounds(280, 470, 70, 80);

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel103);
        jLabel103.setBounds(530, 480, 50, 60);

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel104);
        jLabel104.setBounds(210, 20, 50, 60);

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel105);
        jLabel105.setBounds(0, 500, 50, 60);

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel106);
        jLabel106.setBounds(350, 50, 70, 80);

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel107);
        jLabel107.setBounds(140, 470, 50, 60);

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel108);
        jLabel108.setBounds(10, 200, 24, 30);

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel109);
        jLabel109.setBounds(440, 510, 24, 30);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel110);
        jLabel110.setBounds(100, 30, 24, 30);

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel111);
        jLabel111.setBounds(520, 60, 50, 60);

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel112);
        jLabel112.setBounds(610, 30, 24, 30);

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel113);
        jLabel113.setBounds(610, 200, 50, 60);

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel114);
        jLabel114.setBounds(1300, 520, 24, 30);

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel115);
        jLabel115.setBounds(1200, 490, 50, 60);

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel116);
        jLabel116.setBounds(1110, 520, 24, 30);

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel117);
        jLabel117.setBounds(950, 480, 70, 80);

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel118);
        jLabel118.setBounds(810, 480, 50, 60);

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel119);
        jLabel119.setBounds(690, 440, 50, 60);

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel120);
        jLabel120.setBounds(680, 210, 24, 30);

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel121);
        jLabel121.setBounds(680, 70, 70, 80);

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel122);
        jLabel122.setBounds(770, 40, 24, 30);

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel123);
        jLabel123.setBounds(810, 160, 50, 60);

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel124);
        jLabel124.setBounds(1020, 60, 70, 80);

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel125);
        jLabel125.setBounds(1190, 70, 50, 60);

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel126);
        jLabel126.setBounds(1280, 40, 24, 30);

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel127);
        jLabel127.setBounds(1280, 210, 50, 60);

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel128);
        jLabel128.setBounds(670, 1060, 24, 30);

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel129);
        jLabel129.setBounds(570, 1030, 50, 60);

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel130);
        jLabel130.setBounds(480, 1060, 24, 30);

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel131);
        jLabel131.setBounds(320, 1020, 70, 80);

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel132);
        jLabel132.setBounds(180, 1020, 50, 60);

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel133);
        jLabel133.setBounds(40, 1050, 50, 60);

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel134);
        jLabel134.setBounds(50, 750, 24, 30);

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel135);
        jLabel135.setBounds(50, 610, 70, 80);

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel136);
        jLabel136.setBounds(140, 580, 24, 30);

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel137);
        jLabel137.setBounds(250, 570, 50, 60);

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel138);
        jLabel138.setBounds(390, 600, 70, 80);

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel139);
        jLabel139.setBounds(560, 610, 50, 60);

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel140);
        jLabel140.setBounds(650, 750, 50, 60);

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel141);
        jLabel141.setBounds(1340, 1070, 24, 30);

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel142);
        jLabel142.setBounds(1240, 1040, 50, 60);

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel143);
        jLabel143.setBounds(1150, 1070, 24, 30);

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel144);
        jLabel144.setBounds(990, 1030, 70, 80);

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel145);
        jLabel145.setBounds(850, 1030, 50, 60);

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel146);
        jLabel146.setBounds(710, 1060, 50, 60);

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel147);
        jLabel147.setBounds(720, 760, 24, 30);

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel148);
        jLabel148.setBounds(720, 620, 70, 80);

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel149);
        jLabel149.setBounds(810, 590, 24, 30);

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel150);
        jLabel150.setBounds(920, 580, 50, 60);

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel151);
        jLabel151.setBounds(1060, 610, 70, 80);

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel152);
        jLabel152.setBounds(1230, 620, 50, 60);

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel153);
        jLabel153.setBounds(1320, 590, 24, 30);

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel154);
        jLabel154.setBounds(1320, 760, 50, 60);

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel155);
        jLabel155.setBounds(650, 560, 24, 30);

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel156);
        jLabel156.setBounds(530, 480, 50, 60);

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel157);
        jLabel157.setBounds(440, 510, 24, 30);

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel158);
        jLabel158.setBounds(280, 470, 70, 80);

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel159);
        jLabel159.setBounds(140, 470, 50, 60);

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel160);
        jLabel160.setBounds(0, 500, 50, 60);

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel161);
        jLabel161.setBounds(10, 200, 24, 30);

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel162);
        jLabel162.setBounds(10, 60, 70, 80);

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel163);
        jLabel163.setBounds(100, 30, 24, 30);

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel164);
        jLabel164.setBounds(210, 20, 50, 60);

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel165);
        jLabel165.setBounds(350, 50, 70, 80);

        jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel166);
        jLabel166.setBounds(520, 60, 50, 60);

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel167);
        jLabel167.setBounds(610, 30, 24, 30);

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel168);
        jLabel168.setBounds(610, 200, 50, 60);

        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel169);
        jLabel169.setBounds(1510, 760, 24, 30);

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel170);
        jLabel170.setBounds(1390, 680, 50, 60);

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel171);
        jLabel171.setBounds(1300, 710, 24, 30);

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel172);
        jLabel172.setBounds(1140, 670, 70, 80);

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel173);
        jLabel173.setBounds(1000, 670, 50, 60);

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel174);
        jLabel174.setBounds(860, 700, 50, 60);

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel175);
        jLabel175.setBounds(870, 400, 24, 30);

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel176);
        jLabel176.setBounds(730, 280, 70, 80);

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel177);
        jLabel177.setBounds(960, 0, 24, 30);

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel178);
        jLabel178.setBounds(1070, 220, 50, 60);

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel179);
        jLabel179.setBounds(1210, 250, 70, 80);

        jLabel180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel180);
        jLabel180.setBounds(1380, 260, 50, 60);

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel181);
        jLabel181.setBounds(1470, 230, 24, 30);

        jLabel182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel182);
        jLabel182.setBounds(1470, 400, 50, 60);

        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel183);
        jLabel183.setBounds(940, 110, 50, 60);

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel3.add(jLabel184);
        jLabel184.setBounds(870, 260, 70, 80);

        jLabel185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel3.add(jLabel185);
        jLabel185.setBounds(960, 230, 24, 30);

        jLabel186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel3.add(jLabel186);
        jLabel186.setBounds(880, 30, 50, 60);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel187);
        jLabel187.setBounds(870, 400, 24, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(430, -40, 70, 80);

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-arrow-back-20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);
        jLabel19.setBounds(0, 0, 20, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
       
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        re_gister up = new re_gister();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userMouseClicked

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
      
    }//GEN-LAST:event_userFocusGained

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
      
    }//GEN-LAST:event_userFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
      if(loginAcc(user.getText(),pass.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "Not Active! Contact the Admin!");
            }else{
                if(type.equals("Admin"))
                {
                JOptionPane.showMessageDialog(null, "Login Success!");
                JOptionPane.showMessageDialog(null, "Welcome Back Admin!!!");
                admindashboard up = new admindashboard();
                up.setVisible(true);
                this.dispose();
                }else if(type.equals("User")){
                JOptionPane.showMessageDialog(null, "Login Success!");
                userDashboard up = new userDashboard();
                up.setVisible(true);
                this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No Account Type Found!");
                }
            }
                }else{
                    JOptionPane.showMessageDialog(null, "Login Failed. Invalid Account!");
          }
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        LoginButton.setBackground(clickColor);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        LoginButton.setBackground(navColor);
    }//GEN-LAST:event_loginMouseExited

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
       homedashboard up = new homedashboard();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void user1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_user1FocusGained

    private void user1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_user1FocusLost

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user1MouseClicked

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user1ActionPerformed

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_login1MouseClicked

    private void login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_login1MouseEntered

    private void login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_login1MouseExited

    private void LoginButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButton1MouseClicked

    private void LoginButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButton1MouseEntered

    private void LoginButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButton1MouseExited

    private void forgotPassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassword1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPassword1MouseClicked

    private void Register1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Register1MouseClicked

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void jLabel100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel100MouseClicked

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        LoginButton.setBackground(navColor);
    }//GEN-LAST:event_LoginButtonMouseExited

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        LoginButton.setBackground(clickColor);
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        if(loginAcc(user.getText(),pass.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "Not Active! Contact the Admin!");
            }else{
                if(type.equals("Admin"))
                {
                    JOptionPane.showMessageDialog(null, "Login Success!");
                    JOptionPane.showMessageDialog(null, "Welcome Back Admin!!!");
                    admindashboard up = new admindashboard();
                    up.setVisible(true);
                    this.dispose();
                }else if(type.equals("User")){
                    JOptionPane.showMessageDialog(null, "Login Success!");
                    userDashboard up = new userDashboard();
                    up.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No Account Type Found!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Login Failed. Invalid Account!");
        }
    }//GEN-LAST:event_LoginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FurHome;
    private javax.swing.JLabel FurHome1;
    private javax.swing.JLabel FurHome2;
    private javax.swing.JLabel FurHome3;
    private javax.swing.JPanel LoginButton;
    private javax.swing.JPanel LoginButton1;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel Register1;
    private javax.swing.JPanel SecondPanel;
    private javax.swing.JPanel SecondPanel1;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel forgotPassword1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel login;
    private javax.swing.JLabel login1;
    public javax.swing.JPasswordField pass;
    public javax.swing.JPasswordField pass1;
    public javax.swing.JTextField user;
    public javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables

    private void addplaceholderStyle(JPasswordField pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
