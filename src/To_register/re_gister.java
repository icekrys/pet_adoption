/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package To_register;

import config.dbConnector;
import config.passwordHasher;
import for_log_in.homedashboard;
import for_log_in.logIn;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class re_gister extends javax.swing.JFrame {

    /**
     * Creates new form re_gister
     */
    public re_gister() {
        initComponents();
        addEnterKeyListener();
    }
       private void addEnterKeyListener() {
        KeyListener enterKeyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    registerUser();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        };

        // Add KeyListener to all text fields
        fn.addKeyListener(enterKeyListener);
        ln.addKeyListener(enterKeyListener);
        em.addKeyListener(enterKeyListener);
        us.addKeyListener(enterKeyListener);
        pss.addKeyListener(enterKeyListener);
        cn.addKeyListener(enterKeyListener);
    }

        private void registerUser() {
        String firstName = fn.getText();
        String lastName = ln.getText();
        String email = em.getText();
        String username = us.getText();
        String password = new String(pss.getPassword());
        String contactNumber = cn.getText();

        // Basic validation
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty() || contactNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
            return;
        }

        if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
            pss.setText("");
            return;
        }

        if (contactNumber.length() != 11 || !contactNumber.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Contact number must be 11 digits long and contain only numbers");
            return;
        }

        if (!email.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Email must end with @gmail.com");
            return;
        }

        // Check for duplicate email or username
        if (isEmailExists(email)) {
            JOptionPane.showMessageDialog(null, "Email already exists");
            return;
        }

        if (isUsernameExists(username)) {
            JOptionPane.showMessageDialog(null, "Username already exists");
            return;
        }

        // Hash the password before saving
        try {
            String hashedPassword = passwordHasher.hashPassword(password);
            dbConnector dbc = new dbConnector();
            dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_username, u_password, u_type, u_status, u_contact) VALUES ('" + firstName + "','" + lastName + "','" + email + "','" + username + "','" + hashedPassword + "','" + up.getSelectedItem() + "','Pending', '" + contactNumber + "') ");
            JOptionPane.showMessageDialog(null, "You are now Registered!");
            logIn login = new logIn();
            login.setVisible(true);
            this.dispose();
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, "Error occurred while registering. Please try again later.");
            System.out.println(ex);
        }
    }

    private boolean isEmailExists(String email) {
        dbConnector dbc = new dbConnector();

        try {
            String query = "SELECT * FROM tbl_user WHERE u_email = '" + email + "'";
            ResultSet resultSet = dbc.getData(query);
            return resultSet.next();
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    private boolean isUsernameExists(String username) {
        dbConnector dbc = new dbConnector();

        try {
            String query = "SELECT * FROM tbl_user WHERE u_username = '" + username + "'";
            ResultSet resultSet = dbc.getData(query);
            return resultSet.next();
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
       
     public static String email, usname;

    public boolean duplicateCheck(){
    dbConnector dbc = new dbConnector();

    
    try{
        
        String query = "SELECT * FROM tbl_user WHERE u_username = '" + us.getText() + "' OR u_email = '" + em.getText() + "'";
             ResultSet resultSet = dbc.getData(query);
                if(resultSet.next()){
                
               
                    email = resultSet.getString("u_email");
                    System.out.println(""+email);
                        if(email.equals(em.getText())){
                            JOptionPane.showMessageDialog(null,"Email is Already Used");
                            em.setText("");
                        }
                    
                     usname = resultSet.getString("u_username");
                    System.out.println(""+usname);
                        if(usname.equals(em.getText())){
                            JOptionPane.showMessageDialog(null,"Username is Already Used");
                            us.setText("");
                        }
      
                        return true;
                }else{
                
                    return false;
                
                }
             }catch(SQLException ex){
                 System.out.println(""+ex);
                 return false;
              }
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel38 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fn = new javax.swing.JTextField();
        first_name = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        last_name = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        e_mail = new javax.swing.JLabel();
        contact_number = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        pass_word = new javax.swing.JLabel();
        pss = new javax.swing.JPasswordField();
        registerbutton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        up = new javax.swing.JComboBox<>();
        type = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(118, 199, 234));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Return to Login");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(830, 0, 160, 30);

        jLabel7.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 208, 144));
        jLabel7.setText("Account");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(330, 30, 320, 110);

        jLabel6.setFont(new java.awt.Font("Pristina", 1, 70)); // NOI18N
        jLabel6.setText("FurHome ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 40, 330, 90);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        fn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn);
        fn.setBounds(40, 70, 380, 40);

        first_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        first_name.setForeground(new java.awt.Color(153, 153, 153));
        first_name.setText("First Name:");
        jPanel1.add(first_name);
        first_name.setBounds(40, 50, 100, 17);

        user_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_name.setForeground(new java.awt.Color(153, 153, 153));
        user_name.setText("Username:");
        jPanel1.add(user_name);
        user_name.setBounds(40, 160, 90, 20);

        us.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us);
        us.setBounds(40, 180, 380, 40);

        last_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        last_name.setForeground(new java.awt.Color(153, 153, 153));
        last_name.setText("Last Name:");
        jPanel1.add(last_name);
        last_name.setBounds(40, 270, 80, 20);

        ln.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln);
        ln.setBounds(40, 290, 380, 40);

        em.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em);
        em.setBounds(450, 70, 390, 40);

        e_mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        e_mail.setForeground(new java.awt.Color(153, 153, 153));
        e_mail.setText("Email:");
        jPanel1.add(e_mail);
        e_mail.setBounds(450, 50, 70, 20);

        contact_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contact_number.setForeground(new java.awt.Color(153, 153, 153));
        contact_number.setText("Contact Number:");
        jPanel1.add(contact_number);
        contact_number.setBounds(450, 160, 120, 20);

        cn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel1.add(cn);
        cn.setBounds(450, 180, 390, 40);

        pass_word.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass_word.setForeground(new java.awt.Color(153, 153, 153));
        pass_word.setText("Password:");
        jPanel1.add(pass_word);
        pass_word.setBounds(450, 270, 90, 20);

        pss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pssActionPerformed(evt);
            }
        });
        jPanel1.add(pss);
        pss.setBounds(450, 290, 390, 40);

        registerbutton.setBackground(new java.awt.Color(244, 229, 204));
        registerbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        registerbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerbuttonMouseClicked(evt);
            }
        });
        registerbutton.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");
        registerbutton.add(jLabel2);
        jLabel2.setBounds(40, 0, 130, 30);

        jPanel1.add(registerbutton);
        registerbutton.setBounds(640, 380, 210, 30);

        up.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel1.add(up);
        up.setBounds(110, 390, 80, 20);

        type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(153, 153, 153));
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("User Type");
        jPanel1.add(type);
        type.setBounds(40, 380, 70, 40);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(50, 130, 890, 500);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel23);
        jLabel23.setBounds(90, 10, 24, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel16);
        jLabel16.setBounds(210, 10, 50, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel18);
        jLabel18.setBounds(350, 50, 70, 80);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel25);
        jLabel25.setBounds(610, 30, 24, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(200, 580, 70, 80);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel20);
        jLabel20.setBounds(330, 630, 24, 30);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel21);
        jLabel21.setBounds(470, 0, 50, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(890, 90, 24, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(530, 490, 50, 60);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel22);
        jLabel22.setBounds(440, 520, 24, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(280, 480, 70, 80);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(140, 500, 50, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel17);
        jLabel17.setBounds(0, 510, 50, 60);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel24);
        jLabel24.setBounds(10, 330, 50, 60);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel26);
        jLabel26.setBounds(100, 630, 50, 60);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel19);
        jLabel19.setBounds(0, 60, 70, 80);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel27);
        jLabel27.setBounds(10, 210, 24, 30);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel28);
        jLabel28.setBounds(940, 650, 24, 30);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel29);
        jLabel29.setBounds(900, 530, 70, 80);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel31);
        jLabel31.setBounds(810, 130, 50, 60);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel32);
        jLabel32.setBounds(840, 620, 50, 60);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel33);
        jLabel33.setBounds(750, 650, 24, 30);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel34);
        jLabel34.setBounds(760, 260, 70, 90);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel35);
        jLabel35.setBounds(450, 630, 50, 60);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel36);
        jLabel36.setBounds(630, 70, 50, 60);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel46);
        jLabel46.setBounds(60, 580, 24, 30);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel47);
        jLabel47.setBounds(10, 660, 24, 30);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel49);
        jLabel49.setBounds(700, 160, 50, 60);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel50);
        jLabel50.setBounds(830, 20, 50, 60);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel51);
        jLabel51.setBounds(590, 610, 70, 80);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel52);
        jLabel52.setBounds(700, -20, 70, 80);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel53);
        jLabel53.setBounds(920, 440, 24, 30);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-50.png"))); // NOI18N
        jPanel2.add(jLabel54);
        jLabel54.setBounds(920, 330, 50, 60);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel55);
        jLabel55.setBounds(930, 130, 70, 80);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel56);
        jLabel56.setBounds(970, 270, 24, 30);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel57);
        jLabel57.setBounds(870, 240, 24, 30);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-24.png"))); // NOI18N
        jPanel2.add(jLabel58);
        jLabel58.setBounds(780, 80, 24, 30);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paw-70.png"))); // NOI18N
        jPanel2.add(jLabel59);
        jLabel59.setBounds(950, 20, 70, 80);

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

    private void pssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pssActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void registerbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbuttonMouseClicked
   
  
    }//GEN-LAST:event_registerbuttonMouseClicked

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

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
            java.util.logging.Logger.getLogger(re_gister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(re_gister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(re_gister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(re_gister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new re_gister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cn;
    private javax.swing.JLabel contact_number;
    private javax.swing.JLabel e_mail;
    public javax.swing.JTextField em;
    private javax.swing.JLabel first_name;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel last_name;
    public javax.swing.JTextField ln;
    private javax.swing.JLabel pass_word;
    public javax.swing.JPasswordField pss;
    private javax.swing.JPanel registerbutton;
    private javax.swing.JLabel type;
    public javax.swing.JComboBox<String> up;
    public javax.swing.JTextField us;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
