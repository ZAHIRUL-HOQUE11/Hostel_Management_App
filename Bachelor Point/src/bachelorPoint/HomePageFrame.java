package bachelorPoint;

import static bachelorPoint.About_Designer.resizeDesignerImage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class HomePageFrame extends javax.swing.JFrame implements MenuListener, MouseListener, ActionListener {

    private final JMenu homeMenu, addMenu, updateMenu, deleteMenu, showMenu, aboutMenu;
    private final JMenuItem aMeal, aTaka, aCost, aECost, aMember, uMeal, uTaka, uCost, uExtraCost, dTaka, dCost, dECost, sChart, sMealRate, sCost, sECost, sDeposit, aUser, aDesigner;
    private ImageIcon icon;

    public HomePageFrame() {
        initComponents();

        Toolkit t = Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("meal_icon.png")));
        int h = (int) t.getScreenSize().getHeight();
        int w = (int) t.getScreenSize().getWidth();
        this.setSize(w, h);
        this.setTitle("Home");
        this.setResizable(false);

        Container c = this.getContentPane();
        c.setLayout(null);

        Font f = new Font("semple", Font.BOLD, 20);
        Font itemFont = new Font("semple", Font.PLAIN, 15);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        //For menu Bar panel
        JPanel p = new JPanel();
        p.setBounds(0, 150, w, 50);
        p.setBackground(Color.BLUE);

        JMenuBar b = new JMenuBar();
        b.setForeground(Color.red);

        homeMenu = new JMenu("    Home    ");
        homeMenu.setFont(f);
        homeMenu.setCursor(cursor);
        homeMenu.setForeground(Color.BLUE);
        b.add(homeMenu);
        homeMenu.addMouseListener(this);
        homeMenu.addMenuListener(this);

        addMenu = new JMenu("    Add    ");
        addMenu.setFont(f);
        addMenu.setCursor(cursor);
        addMenu.setForeground(Color.BLUE);
        b.add(addMenu);
        addMenu.addMenuListener(this);

        aMeal = new JMenuItem("Add Meal");
        aMeal.setCursor(cursor);
        aMeal.setFont(itemFont);
        aMeal.addActionListener(this);

        aTaka = new JMenuItem("Add Deposit Taka");
        aTaka.setCursor(cursor);
        aTaka.setFont(itemFont);
        aTaka.addActionListener(this);

        aCost = new JMenuItem("Add Cost");
        aCost.setCursor(cursor);
        aCost.setFont(itemFont);
        aCost.addActionListener(this);

        aECost = new JMenuItem("Add Extra Cost");
        aECost.setCursor(cursor);
        aECost.setFont(itemFont);
        aECost.addActionListener(this);

        aMember = new JMenuItem("Add Member");
        aMember.setCursor(cursor);
        aMember.setFont(itemFont);
        aMember.addActionListener(this);

        addMenu.add(aMeal);
        addMenu.addSeparator();
        addMenu.add(aTaka);
        addMenu.addSeparator();
        addMenu.add(aCost);
        addMenu.addSeparator();
        addMenu.add(aECost);
        addMenu.addSeparator();
        addMenu.add(aMember);

        updateMenu = new JMenu("    Update    ");
        updateMenu.setFont(f);
        updateMenu.setCursor(cursor);
        updateMenu.setForeground(Color.BLUE);
        b.add(updateMenu);
        updateMenu.addMenuListener(this);

        uMeal = new JMenuItem("Update Meal");
        uMeal.setCursor(cursor);
        uMeal.setFont(itemFont);
        uMeal.addActionListener(this);

        uTaka = new JMenuItem("Update Deposit Taka");
        uTaka.setCursor(cursor);
        uTaka.setFont(itemFont);
        uTaka.addActionListener(this);

        uCost = new JMenuItem("Update Cost");
        uCost.setCursor(cursor);
        uCost.setFont(itemFont);
        uCost.addActionListener(this);

        uExtraCost = new JMenuItem("Update Extra Cost");
        uExtraCost.setCursor(cursor);
        uExtraCost.setFont(itemFont);
        uExtraCost.addActionListener(this);

        updateMenu.add(uMeal);
        updateMenu.addSeparator();
        updateMenu.add(uTaka);
        updateMenu.addSeparator();
        updateMenu.add(uCost);
        updateMenu.addSeparator();
        updateMenu.add(uExtraCost);

        deleteMenu = new JMenu("    Delete    ");
        deleteMenu.setFont(f);
        deleteMenu.setCursor(cursor);
        deleteMenu.setForeground(Color.BLUE);
        b.add(deleteMenu);
        deleteMenu.addMenuListener(this);

        dTaka = new JMenuItem("Delete Deposit Taka");
        dTaka.setCursor(cursor);
        dTaka.setFont(itemFont);
        dTaka.addActionListener(this);

        dECost = new JMenuItem("Delete Extra Cost");
        dECost.setCursor(cursor);
        dECost.setFont(itemFont);
        dECost.addActionListener(this);

        dCost = new JMenuItem("Delete Cost");
        dCost.setCursor(cursor);
        dCost.setFont(itemFont);
        dCost.addActionListener(this);

        deleteMenu.add(dTaka);
        deleteMenu.addSeparator();
        deleteMenu.add(dECost);
        deleteMenu.addSeparator();
        deleteMenu.add(dCost);

        showMenu = new JMenu("    Show    ");
        showMenu.setFont(f);
        showMenu.setCursor(cursor);
        showMenu.setForeground(Color.BLUE);
        b.add(showMenu);
        showMenu.addMenuListener(this);

        sChart = new JMenuItem("Show Meal Chart");
        sChart.setCursor(cursor);
        sChart.setFont(itemFont);
        sChart.addActionListener(this);

        sMealRate = new JMenuItem("Show Meal Rate");
        sMealRate.setCursor(cursor);
        sMealRate.setFont(itemFont);
        sMealRate.addActionListener(this);

        sCost = new JMenuItem("Show Cost Chart");
        sCost.setCursor(cursor);
        sCost.setFont(itemFont);
        sCost.addActionListener(this);

        sECost = new JMenuItem("Show Extra Cost");
        sECost.setCursor(cursor);
        sECost.setFont(itemFont);
        sECost.addActionListener(this);

        sDeposit = new JMenuItem("Show Deposit Chart");
        sDeposit.setCursor(cursor);
        sDeposit.setFont(itemFont);
        sDeposit.addActionListener(this);

        showMenu.add(sChart);
        showMenu.addSeparator();
        showMenu.add(sMealRate);
        showMenu.addSeparator();
        showMenu.add(sCost);
        showMenu.addSeparator();
        showMenu.add(sECost);
        showMenu.addSeparator();
        showMenu.add(sDeposit);

        aboutMenu = new JMenu("    About    ");
        aboutMenu.setFont(f);
        aboutMenu.setCursor(cursor);
        aboutMenu.setForeground(Color.BLUE);
        b.add(aboutMenu);
        aboutMenu.addMenuListener(this);

        aUser = new JMenuItem("About User");
        aUser.setCursor(cursor);
        aUser.setFont(itemFont);
        aUser.addActionListener(this);

        aDesigner = new JMenuItem("About Designer");
        aDesigner.setCursor(cursor);
        aDesigner.setFont(itemFont);
        aDesigner.addActionListener(this);

        aboutMenu.addSeparator();
        aboutMenu.add(aUser);
        aboutMenu.addSeparator();
        aboutMenu.add(aDesigner);

        p.setLayout(new BorderLayout());
        p.add(b, BorderLayout.CENTER);

        c.add(p);

        //For All Panel Bounds set
        jPanel1.setBounds(0, 0, w, 150);
        jPanel5.setBounds(0, 200, w, 470);
        jPanel6.setBounds(0, 670, w, 80);

        //For add home image file
        icon = new ImageIcon("src/bachelorPoint/home.jpg");
        Image inputImage = icon.getImage();
        icon = new ImageIcon(About_Designer.resizeDesignerImage(inputImage, jLabel3.getWidth(), jLabel3.getHeight()));
        jLabel3.setIcon(icon);

        //call some method
        Show_Meal_Chart meal = new Show_Meal_Chart();
        Show_Cost_Chart cost = new Show_Cost_Chart();
        Show_Extra_Cost_Chart ECost = new Show_Extra_Cost_Chart();
        Show_Deposit_Chart deposit = new Show_Deposit_Chart();
        Add_Member member = new Add_Member();

        meal.selectMeal();
        cost.selectCost();
        ECost.selectExtraCost();
        deposit.selectDepositTaka();
        member.selectTotalMember();

        jLabel1.setText("Current Meal Rate : " + (float) (Show_Cost_Chart.getTotalCost() / Show_Meal_Chart.getMeal()));
        jLabel2.setText("Extra Cost Per Person : " + (float)Show_Extra_Cost_Chart.getExtraCost()/Add_Member.getTMemberNo());

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
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        logOutBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setText("Bachelor Point Soft.");

        jLabel5.setBackground(new java.awt.Color(204, 204, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("----------------------------------------------");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bachelorPoint/meal_icon.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("i have to wrete something here");

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Current Meal Rate : ");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(1070, 70, 193, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Extra Cost Per Person : ");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(1070, 130, 193, 15);
        jPanel5.add(jLabel3);
        jLabel3.setBounds(20, 21, 1020, 430);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        logOutBut.setBackground(new java.awt.Color(102, 102, 102));
        logOutBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logOutBut.setForeground(new java.awt.Color(255, 255, 255));
        logOutBut.setText("Log Out");
        logOutBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutBut)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setBounds(0, 0, 847, 774);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButActionPerformed

        LoginFrame login = new LoginFrame();
        this.setVisible(false);
        login.setVisible(true);

    }//GEN-LAST:event_logOutButActionPerformed

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
            java.util.logging.Logger.getLogger(HomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logOutBut;
    // End of variables declaration//GEN-END:variables

    @Override
    public void menuSelected(MenuEvent e) {

        if (e.getSource() == homeMenu) {
            homeMenu.setForeground(Color.white);
        } else if (e.getSource() == addMenu) {
            addMenu.setForeground(Color.white);
        } else if (e.getSource() == updateMenu) {
            updateMenu.setForeground(Color.white);
        } else if (e.getSource() == deleteMenu) {
            deleteMenu.setForeground(Color.white);
        } else if (e.getSource() == showMenu) {
            showMenu.setForeground(Color.white);
        } else if (e.getSource() == aboutMenu) {
            aboutMenu.setForeground(Color.white);
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

        if (e.getSource() == homeMenu) {
            homeMenu.setForeground(Color.BLUE);
        } else if (e.getSource() == addMenu) {
            addMenu.setForeground(Color.BLUE);
        } else if (e.getSource() == updateMenu) {
            updateMenu.setForeground(Color.BLUE);
        } else if (e.getSource() == deleteMenu) {
            deleteMenu.setForeground(Color.BLUE);
        } else if (e.getSource() == showMenu) {
            showMenu.setForeground(Color.BLUE);
        } else if (e.getSource() == aboutMenu) {
            aboutMenu.setForeground(Color.BLUE);
        }
    }

    @Override
    public void menuCanceled(MenuEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == homeMenu) {
            HomePageFrame home = new HomePageFrame();
            this.setVisible(false);
            home.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    //Action Listener Abstruct Method
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == aMeal) {
            Add_Meal addMeal = new Add_Meal();
            this.setVisible(false);
            addMeal.setVisible(true);
        } else if (e.getSource() == aTaka) {
            Add_Deposit_Taka addTaka = new Add_Deposit_Taka();
            this.setVisible(false);
            addTaka.setVisible(true);
        } else if (e.getSource() == aCost) {
            Add_Cost addCost = new Add_Cost();
            this.setVisible(false);
            addCost.setVisible(true);
        } else if (e.getSource() == aECost) {
            Add_Extra_Cost addCost = new Add_Extra_Cost();
            this.setVisible(false);
            addCost.setVisible(true);
        } else if (e.getSource() == aMember) {
            Add_Member addMember = new Add_Member();
            this.setVisible(false);
            addMember.setVisible(true);
        } else if (e.getSource() == uMeal) {
            Update_Meal updateMeal = new Update_Meal();
            this.setVisible(false);
            updateMeal.setVisible(true);
        } else if (e.getSource() == uTaka) {
            Update_Deposit_Taka updateTaka = new Update_Deposit_Taka();
            this.setVisible(false);
            updateTaka.setVisible(true);
        } else if (e.getSource() == uCost) {
            Update_Cost updateCost = new Update_Cost();
            this.setVisible(false);
            updateCost.setVisible(true);
        } else if (e.getSource() == uExtraCost) {
            Update_Extra_Cost updateExtraCost = new Update_Extra_Cost();
            this.setVisible(false);
            updateExtraCost.setVisible(true);
        } else if (e.getSource() == dCost) {
            Delete_Cost deleteCost = new Delete_Cost();
            this.setVisible(false);
            deleteCost.setVisible(true);
        } else if (e.getSource() == dTaka) {
            Delete_Deposit_Taka deleteTaka = new Delete_Deposit_Taka();
            this.setVisible(false);
            deleteTaka.setVisible(true);
        } else if (e.getSource() == dECost) {
            Delete_Extra_Cost deleteCost = new Delete_Extra_Cost();
            this.setVisible(false);
            deleteCost.setVisible(true);
        } else if (e.getSource() == sChart) {
            Show_Meal_Chart showChart = new Show_Meal_Chart();
            this.setVisible(false);
            showChart.setVisible(true);
        } else if (e.getSource() == sMealRate) {
            Show_Meal_Rate showMealRate = new Show_Meal_Rate();
            this.setVisible(false);
            showMealRate.setVisible(true);
        } else if (e.getSource() == sCost) {
            Show_Cost_Chart showCost = new Show_Cost_Chart();
            this.setVisible(false);
            showCost.setVisible(true);
        } else if (e.getSource() == sECost) {
            Show_Extra_Cost_Chart showExtraCost = new Show_Extra_Cost_Chart();
            this.setVisible(false);
            showExtraCost.setVisible(true);
        } else if (e.getSource() == sDeposit) {
            Show_Deposit_Chart showDepositChart = new Show_Deposit_Chart();
            this.setVisible(false);
            showDepositChart.setVisible(true);
        } else if (e.getSource() == aUser) {
            About_User aboutUser = new About_User();
            this.setVisible(false);
            aboutUser.setVisible(true);
        } else if (e.getSource() == aDesigner) {
            About_Designer aboutDesigner = new About_Designer();
            this.setVisible(false);
            aboutDesigner.setVisible(true);
        }

    }
}
