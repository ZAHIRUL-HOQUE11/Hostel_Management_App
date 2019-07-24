package bachelorPoint;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberInformation extends javax.swing.JFrame implements ActionListener, KeyListener {

    private JLabel infoLabel, nameLabel, roomNoLabel, sitNoLabel;
    private Font f, ff, fff;
    private JTextField nameTf, roomNoTf, sitNoTf;
    private JButton submitButn, resetButn, backButn;
    private Cursor cursor;
    private String userName, password;
    private String memberInfoTF[] = new String[1500];
    private static String name, roomNo, sitNo, taka = "0", totalMeal = "0",userTotalMeal="0";

    public MemberInformation() {
        initComponents();

        int totalMem = CreateAccFrame.getMemberNo();
        userName = CreateAccFrame.getUserName();
        password = CreateAccFrame.getPassword();

        f = new Font("sFont", Font.BOLD, 18);
        ff = new Font("sFont", Font.BOLD + Font.ITALIC, 16);
        fff = new Font("sFont", Font.BOLD, 21);
        cursor = new Cursor(Cursor.HAND_CURSOR);

        int i, j;
        for (i = 0, j = 20; i < totalMem; i++, j += 130) {
            infoLabel = new JLabel();
            infoLabel.setText("Member " + (i + 1) + " Information");
            infoLabel.setBounds(30, j, 250, 40);
            infoLabel.setFont(f);//add font
            infoLabel.setForeground(Color.DARK_GRAY);
            jPanel2.add(infoLabel);

            nameLabel = new JLabel();
            nameLabel.setText("Name");
            nameLabel.setBounds(30, j + 40, 150, 40);
            nameLabel.setFont(ff);//add font
            nameLabel.setForeground(Color.BLUE);
            jPanel2.add(nameLabel);

            nameTf = new JTextField();
            nameTf.setBounds(30, j + 70, 150, 40);
            nameTf.setFont(f);
            nameTf.setHorizontalAlignment(JTextField.CENTER);
            jPanel2.add(nameTf);

            roomNoLabel = new JLabel();
            roomNoLabel.setText("Room No.");
            roomNoLabel.setBounds(230, j + 40, 200, 40);
            roomNoLabel.setFont(ff);//add font
            roomNoLabel.setForeground(Color.BLUE);
            jPanel2.add(roomNoLabel);

            roomNoTf = new JTextField();
            roomNoTf.setBounds(230, j + 70, 150, 40);
            roomNoTf.setFont(f);
            roomNoTf.setHorizontalAlignment(JTextField.CENTER);
            roomNoTf.addKeyListener(this);
            jPanel2.add(roomNoTf);

            sitNoLabel = new JLabel();
            sitNoLabel.setText("Sit No.");
            sitNoLabel.setBounds(440, j + 40, 200, 40);
            sitNoLabel.setFont(ff);//add font
            sitNoLabel.setForeground(Color.BLUE);
            jPanel2.add(sitNoLabel);

            sitNoTf = new JTextField();
            sitNoTf.setBounds(440, j + 70, 150, 40);
            sitNoTf.setFont(f);
            sitNoTf.setHorizontalAlignment(JTextField.CENTER);
            sitNoTf.addKeyListener(this);
            jPanel2.add(sitNoTf);

        }
        submitButn = new JButton("Submit");
        submitButn.setBounds(100, j + 50, 100, 40);
        submitButn.setFont(fff);
        submitButn.setForeground(Color.BLUE);
        submitButn.setCursor(cursor);
        jPanel2.add(submitButn);
        submitButn.addActionListener(this);

        resetButn = new JButton("Reset");
        resetButn.setBounds(250, j + 50, 100, 40);
        resetButn.setFont(fff);
        resetButn.setForeground(Color.BLUE);
        resetButn.setCursor(cursor);
        jPanel2.add(resetButn);
        resetButn.addActionListener(this);

        backButn = new JButton("Back");
        backButn.setBounds(400, j + 50, 100, 40);
        backButn.setFont(fff);
        backButn.setForeground(Color.BLUE);
        backButn.setCursor(cursor);
        jPanel2.add(backButn);
        backButn.addActionListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
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

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(70, 630, 740, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(738, 50800));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50800, 50800)
        );

        jScrollPane2.setViewportView(jPanel2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 110, 740, 520);

        setSize(new java.awt.Dimension(899, 761));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MemberInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButn) {

            try {
                int j, k, m = 0, n = 0;
                Component[] memInfo = jPanel2.getComponents();
                for (Component c : memInfo) {
                    if (c instanceof JTextField) {
                        JTextField textfield = (JTextField) c;
                        memberInfoTF[m++] = textfield.getText();
                    }
                }
                for (j = 0; j < m; j = j + 3) {
                    name = memberInfoTF[n++];
                    roomNo = memberInfoTF[n++];
                    sitNo = memberInfoTF[n++];

                    String sql = "insert into member_information values('" + userName + "','" + password + "','" + name + "','" + roomNo + "','" + sitNo + "');";
                    String sql2 = "insert into deposit_chart values('" + userName + "','" + password + "','" + name + "','" + roomNo + "','" + sitNo + "','" + taka + "');";
                    String sql3 = "insert into per_parson_total_meal values('" + userName + "','" + password + "','" + name + "','" + roomNo + "','" + sitNo + "','" + totalMeal + "');";
                    ConnectionJDB cont = new ConnectionJDB();
                    cont.createConnection();
                    cont.dataInsert(sql);
                    cont.dataInsert(sql2);
                    cont.dataInsert(sql3);
                    cont.con.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(MemberInformation.class.getName()).log(Level.SEVERE, null, ex);
            }

            LoginFrame login = new LoginFrame();

            this.setVisible(false);
            login.setVisible(true);
        } else if (e.getSource()
                == resetButn) {
            Component[] allTextfields = jPanel2.getComponents();

            for (Component c : allTextfields) {
                if (c instanceof JTextField) {
                    ((JTextField) c).setText("");
                }

            }
        } else if (e.getSource()
                == backButn) {
            CreateAccFrame creAcc = new CreateAccFrame();
            this.setVisible(false);
            creAcc.setVisible(true);
        }
    }

    @Override
    public void keyTyped(KeyEvent evt) {

         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
