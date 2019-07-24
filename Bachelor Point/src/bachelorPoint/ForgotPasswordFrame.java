package bachelorPoint;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ForgotPasswordFrame extends javax.swing.JFrame {

    public ForgotPasswordFrame() {
        initComponents();

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
        FsubmitBut = new javax.swing.JButton();
        FbackBut = new javax.swing.JButton();
        FmobNumText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FnewPassText = new javax.swing.JPasswordField();
        FuserText = new javax.swing.JTextField();
        FconfpassText = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
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
        jPanel1.setBounds(70, 50, 740, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        FsubmitBut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FsubmitBut.setForeground(new java.awt.Color(51, 51, 51));
        FsubmitBut.setText("Submit");
        FsubmitBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FsubmitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FsubmitButActionPerformed(evt);
            }
        });
        jPanel3.add(FsubmitBut);
        FsubmitBut.setBounds(228, 347, 83, 29);

        FbackBut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FbackBut.setForeground(new java.awt.Color(51, 51, 51));
        FbackBut.setText("Back");
        FbackBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FbackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FbackButActionPerformed(evt);
            }
        });
        jPanel3.add(FbackBut);
        FbackBut.setBounds(357, 347, 83, 29);

        FmobNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FmobNumTextActionPerformed(evt);
            }
        });
        FmobNumText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FmobNumTextKeyTyped(evt);
            }
        });
        jPanel3.add(FmobNumText);
        FmobNumText.setBounds(228, 165, 258, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("New Password");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(228, 208, 102, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("Forgot Password");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(228, 23, 160, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Confirm Password");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(228, 274, 126, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("User Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(228, 78, 75, 17);

        FnewPassText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnewPassTextActionPerformed(evt);
            }
        });
        jPanel3.add(FnewPassText);
        FnewPassText.setBounds(228, 231, 258, 32);

        FuserText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FuserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuserTextActionPerformed(evt);
            }
        });
        jPanel3.add(FuserText);
        FuserText.setBounds(228, 99, 258, 32);
        jPanel3.add(FconfpassText);
        FconfpassText.setBounds(228, 297, 258, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Mobile Number");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(228, 142, 104, 17);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(70, 130, 740, 430);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 560, 740, 50);

        setSize(new java.awt.Dimension(917, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FuserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuserTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FuserTextActionPerformed

    private void FmobNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FmobNumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FmobNumTextActionPerformed

    private void FnewPassTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnewPassTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnewPassTextActionPerformed

    private void FbackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FbackButActionPerformed

        LoginFrame logFrame = new LoginFrame();
        this.setVisible(false);
        logFrame.setVisible(true);

    }//GEN-LAST:event_FbackButActionPerformed

    private void FsubmitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FsubmitButActionPerformed
        try {
            String name = FuserText.getText();
            String mob = FmobNumText.getText();
            String pass = FnewPassText.getText();
            String cPass = FconfpassText.getText();
            String sql = "UPDATE user_information SET `Password`=? WHERE Name=? and Mobile_Number=?;";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bachelor_point", "root", "");
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, pass);
            st.setString(2, name);
            st.setString(3, mob);
            int rs = st.executeUpdate();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "User name is emplty");
                FuserText.requestFocus();
            } else if (mob.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Mobile number is empty");
                FmobNumText.requestFocus();
            } else if (pass.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "New password is empty");
                FnewPassText.requestFocus();
            } else if (cPass.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Confirm password is empty");
                FconfpassText.requestFocus();
            } else if (rs > 0) {
                if (FnewPassText.getText().equals(FconfpassText.getText())) {
                    HomePageFrame homPage = new HomePageFrame();
                    this.setVisible(false);
                    homPage.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "New password and confirm password will be equal");
                    FnewPassText.setText("");
                    FconfpassText.setText("");
                    FnewPassText.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Incorrect Name or Mobile number!");
                FuserText.setText("");
                FmobNumText.setText("");
                FnewPassText.setText("");
                FconfpassText.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_FsubmitButActionPerformed

    private void FmobNumTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FmobNumTextKeyTyped

         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_FmobNumTextKeyTyped

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
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FbackBut;
    private javax.swing.JPasswordField FconfpassText;
    private javax.swing.JTextField FmobNumText;
    private javax.swing.JPasswordField FnewPassText;
    private javax.swing.JButton FsubmitBut;
    private javax.swing.JTextField FuserText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
