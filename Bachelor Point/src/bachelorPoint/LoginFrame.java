package bachelorPoint;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

    private static String userName;
    private static String userPass;

    public LoginFrame() {
        initComponents();

        Toolkit t = Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("meal_icon.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LuserText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LpassText = new javax.swing.JPasswordField();
        loginBut = new javax.swing.JButton();
        LforgotBut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        createNewBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setText("Bachelor Point Soft.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(203, 14, 480, 46);

        jLabel5.setBackground(new java.awt.Color(204, 204, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("----------------------------------------------");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(203, 71, 469, 10);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bachelorPoint/meal_icon.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(101, 14, 73, 78);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("i have to wrete something here");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(377, 87, 318, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 70, 740, 150);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("User Login");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(229, 21, 114, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("User Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(229, 76, 75, 17);

        LuserText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LuserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuserTextActionPerformed(evt);
            }
        });
        jPanel2.add(LuserText);
        LuserText.setBounds(229, 99, 260, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(229, 142, 67, 17);

        LpassText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(LpassText);
        LpassText.setBounds(229, 165, 260, 32);

        loginBut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        loginBut.setForeground(new java.awt.Color(51, 51, 51));
        loginBut.setText("Login");
        loginBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButActionPerformed(evt);
            }
        });
        jPanel2.add(loginBut);
        loginBut.setBounds(229, 215, 71, 29);

        LforgotBut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        LforgotBut.setForeground(new java.awt.Color(51, 51, 51));
        LforgotBut.setText("Forgot Password");
        LforgotBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LforgotBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LforgotButActionPerformed(evt);
            }
        });
        jPanel2.add(LforgotBut);
        LforgotBut.setBounds(338, 215, 151, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 220, 740, 280);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setLayout(null);

        createNewBut.setBackground(new java.awt.Color(102, 102, 255));
        createNewBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createNewBut.setForeground(new java.awt.Color(255, 255, 255));
        createNewBut.setText("Create New Account");
        createNewBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createNewBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewButActionPerformed(evt);
            }
        });
        jPanel3.add(createNewBut);
        createNewBut.setBounds(0, 19, 740, 31);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(100, 500, 740, 50);

        setSize(new java.awt.Dimension(949, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LuserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuserTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LuserTextActionPerformed

    private void LforgotButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LforgotButActionPerformed

        ForgotPasswordFrame Fpass = new ForgotPasswordFrame();
        this.setVisible(false);
        Fpass.setVisible(true);


    }//GEN-LAST:event_LforgotButActionPerformed

    private void loginButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButActionPerformed
        try {
            String name = LuserText.getText();
            String pass = LpassText.getText();
            String sql = "Select Name,Password From user_information Where Name=? And Password=?;";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bachelor_point", "root", "");
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "User name is emplty");
                LuserText.requestFocus();
            } else if (pass.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Password is empty");
                LpassText.requestFocus();
            } else if (rs.next()) {
                setUserName(LuserText.getText());
                setUserPass(LpassText.getText());
                HomePageFrame homPage = new HomePageFrame();
                this.setVisible(false);
                homPage.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Incorrect Name or Password!");
                LuserText.setText("");
                LpassText.setText("");
                LuserText.requestFocus();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_loginButActionPerformed

    private void createNewButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewButActionPerformed

        CreateAccFrame cAcc = new CreateAccFrame();
        this.setVisible(false);
        cAcc.setVisible(true);

    }//GEN-LAST:event_createNewButActionPerformed

    public static void setUserName(String name) {
        userName = name;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserPass(String pass) {
        userPass = pass;
    }

    public static String getUserPass() {
        return userPass;
    }

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LforgotBut;
    private javax.swing.JPasswordField LpassText;
    private javax.swing.JTextField LuserText;
    private javax.swing.JButton createNewBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginBut;
    // End of variables declaration//GEN-END:variables
}
