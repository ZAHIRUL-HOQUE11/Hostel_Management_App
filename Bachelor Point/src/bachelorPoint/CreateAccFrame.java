package bachelorPoint;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CreateAccFrame extends javax.swing.JFrame {

    private static int memberNo;
    private static String userName, password;

    public CreateAccFrame() {
        initComponents();

        ConnectionJDB cont = new ConnectionJDB();
        cont.createConnection();

        Toolkit t = Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("meal_icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AccRegBut = new javax.swing.JButton();
        AccBackBut = new javax.swing.JButton();
        AccMobNumText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AccPassText = new javax.swing.JPasswordField();
        AccUserText = new javax.swing.JTextField();
        AccConfpassText = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        monthComBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        newAccMemText = new javax.swing.JTextField();
        AccResetBut = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        yearComBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setText("Bachelor Point Soft.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(147, 11, 361, 46);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bachelorPoint/meal_icon.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(56, 0, 73, 78);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 30, 740, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        AccRegBut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AccRegBut.setForeground(new java.awt.Color(51, 51, 51));
        AccRegBut.setText("Register");
        AccRegBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccRegBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccRegButActionPerformed(evt);
            }
        });

        AccBackBut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AccBackBut.setForeground(new java.awt.Color(51, 51, 51));
        AccBackBut.setText("Back");
        AccBackBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccBackButActionPerformed(evt);
            }
        });

        AccMobNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccMobNumTextActionPerformed(evt);
            }
        });
        AccMobNumText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AccMobNumTextKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Password");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("Create New Account");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Confirm Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("User Name");

        AccPassText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccPassTextActionPerformed(evt);
            }
        });

        AccUserText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccUserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccUserTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Mobile Number");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Month");

        monthComBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        monthComBox.setForeground(new java.awt.Color(102, 0, 102));
        monthComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthComBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        monthComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Total Member");

        newAccMemText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newAccMemTextKeyTyped(evt);
            }
        });

        AccResetBut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AccResetBut.setForeground(new java.awt.Color(51, 51, 51));
        AccResetBut.setText("Reset");
        AccResetBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccResetBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccResetButActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Year");

        yearComBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearComBox.setForeground(new java.awt.Color(102, 0, 102));
        yearComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AccMobNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(monthComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yearComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(AccUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(newAccMemText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(AccPassText, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(AccConfpassText, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AccRegBut)
                        .addGap(31, 31, 31)
                        .addComponent(AccResetBut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(AccBackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccMobNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newAccMemText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccPassText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccConfpassText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccRegBut)
                    .addComponent(AccResetBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccBackBut))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(70, 110, 740, 530);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 640, 740, 40);

        setSize(new java.awt.Dimension(916, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AccMobNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccMobNumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccMobNumTextActionPerformed

    private void AccPassTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccPassTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccPassTextActionPerformed

    private void AccUserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccUserTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccUserTextActionPerformed

    private void monthComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComBoxActionPerformed

    private void AccBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccBackButActionPerformed

        LoginFrame logFrame = new LoginFrame();
        this.setVisible(false);
        logFrame.setVisible(true);

    }//GEN-LAST:event_AccBackButActionPerformed

    private void AccRegButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccRegButActionPerformed

        if (AccUserText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "User name is empty");
            AccUserText.requestFocus();
        } else if (AccMobNumText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mobile number is empty");
            AccMobNumText.requestFocus();
        } else if (newAccMemText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Member is empty");
            newAccMemText.requestFocus();
        } else if (AccPassText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Password is empty");
            AccPassText.requestFocus();
        } else if (AccConfpassText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Confirm password is empty");
            AccConfpassText.requestFocus();
        } else if (AccPassText.getText().equals(AccConfpassText.getText())) {
            try {
                String name, mob, month, year, member, pass;

                name = AccUserText.getText();
                mob = AccMobNumText.getText();
                month = monthComBox.getSelectedItem().toString();
                year = yearComBox.getSelectedItem().toString();
                member = newAccMemText.getText();
                pass = AccPassText.getText();

                int memNo = Integer.parseInt(newAccMemText.getText());
                setMemberNo(memNo);
                setUserName(name);
                setPassword(pass);

                String sql = "insert into user_information values('" + name + "','" + mob + "','" + month + "','" + year + "','" + member + "','" + pass + "');";

                ConnectionJDB cont = new ConnectionJDB();
                cont.createConnection();
                cont.dataInsert(sql);
                cont.con.close();

                clearText();
                JOptionPane.showMessageDialog(rootPane, "Create Account Successfull");
                MemberInformation memInfo = new MemberInformation();
                this.setVisible(false);
                memInfo.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(CreateAccFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "Password and confirm password will be equal");
            AccPassText.setText("");
            AccConfpassText.setText("");
            AccPassText.requestFocus();

        }

    }//GEN-LAST:event_AccRegButActionPerformed

    private void AccResetButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccResetButActionPerformed

        clearText();

    }//GEN-LAST:event_AccResetButActionPerformed

    private void AccMobNumTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccMobNumTextKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_AccMobNumTextKeyTyped

    private void newAccMemTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newAccMemTextKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_newAccMemTextKeyTyped

    void clearText() {
        AccUserText.setText("");
        AccMobNumText.setText("");
        newAccMemText.setText("");
        AccPassText.setText("");
        AccConfpassText.setText("");
    }

    static int getMemberNo() {
        return memberNo;
    }

    void setMemberNo(int memNo) {
        memberNo = memNo;
    }

    void setUserName(String name) {
        userName = name;
    }

    public static String getUserName() {
        return userName;
    }

    void setPassword(String pass) {
        password = pass;
    }

    static String getPassword() {
        return password;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccBackBut;
    private javax.swing.JPasswordField AccConfpassText;
    private javax.swing.JTextField AccMobNumText;
    private javax.swing.JPasswordField AccPassText;
    private javax.swing.JButton AccRegBut;
    private javax.swing.JButton AccResetBut;
    private javax.swing.JTextField AccUserText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> monthComBox;
    private javax.swing.JTextField newAccMemText;
    private javax.swing.JComboBox<String> yearComBox;
    // End of variables declaration//GEN-END:variables
}
