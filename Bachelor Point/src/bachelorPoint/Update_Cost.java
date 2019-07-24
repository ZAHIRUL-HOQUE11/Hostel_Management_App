package bachelorPoint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Update_Cost extends javax.swing.JFrame implements MenuListener, MouseListener, ActionListener {

    private final JMenu homeMenu, addMenu, updateMenu, deleteMenu, showMenu, aboutMenu;
    private final JMenuItem aMeal, aTaka, aCost, aECost, aMember, uMeal, uTaka, uCost, uExtraCost, dTaka, dCost, dECost, sChart, sMealRate, sCost, sECost, sDeposit, aUser, aDesigner;

    ResultSet rs;
    PreparedStatement st;

    int oldCost, newCost;

    public Update_Cost() {
        initComponents();

        Toolkit t = Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("meal_icon.png")));
        int h = (int) t.getScreenSize().getHeight();
        int w = (int) t.getScreenSize().getWidth();
        this.setSize(w, h);
        this.setTitle("Update Extra Cost");
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        logOutBut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        updateCostUpdateButn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        sitNoText = new javax.swing.JTextField();
        updateCostSearchButn = new javax.swing.JButton();
        updateCostClearButn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        roomNoText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        costText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Update Cost");

        updateCostUpdateButn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateCostUpdateButn.setForeground(new java.awt.Color(102, 0, 102));
        updateCostUpdateButn.setText("Update");
        updateCostUpdateButn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateCostUpdateButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCostUpdateButnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("DD-MM-YYYY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Room No");

        sitNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sitNoTextActionPerformed(evt);
            }
        });
        sitNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sitNoTextKeyTyped(evt);
            }
        });

        updateCostSearchButn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateCostSearchButn.setForeground(new java.awt.Color(102, 0, 102));
        updateCostSearchButn.setText("Search");
        updateCostSearchButn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateCostSearchButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCostSearchButnActionPerformed(evt);
            }
        });

        updateCostClearButn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateCostClearButn.setForeground(new java.awt.Color(102, 0, 102));
        updateCostClearButn.setText("Clear");
        updateCostClearButn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateCostClearButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCostClearButnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Sit No");

        roomNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNoTextActionPerformed(evt);
            }
        });
        roomNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                roomNoTextKeyTyped(evt);
            }
        });

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Name");

        costText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costTextActionPerformed(evt);
            }
        });
        costText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costTextKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("Cost");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(updateCostClearButn)
                                .addGap(33, 33, 33)
                                .addComponent(updateCostUpdateButn))
                            .addComponent(jLabel2)
                            .addComponent(sitNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(roomNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateCostSearchButn))
                            .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCostSearchButn))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sitNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateCostClearButn)
                    .addComponent(updateCostUpdateButn))
                .addContainerGap(107, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButActionPerformed

        LoginFrame login = new LoginFrame();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_logOutButActionPerformed

    private void updateCostUpdateButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCostUpdateButnActionPerformed

        try {
            String userName = LoginFrame.getUserName();

            String password = LoginFrame.getUserPass();

            String date = dateText.getText();
            String roomNo = roomNoText.getText();
            String sitNo = sitNoText.getText();
            String name = nameText.getText();
            String cost = costText.getText();
            newCost = Integer.parseInt(costText.getText());
            int userCost = newCost + Show_Cost_Chart.getTotalCost() - oldCost;
            Show_Cost_Chart.setTotalCost(userCost);
            String sql2 = "UPDATE add_cost_chart set Member_Name='" + name + "' Where User_Name='" + userName + "' And User_Password='" + password + "' And Date='" + date + "';";
            String sql3 = "UPDATE add_cost_chart set Room_No='" + roomNo + "' Where User_Name='" + userName + "' And User_Password='" + password + "' And Date='" + date + "';";
            String sql4 = "UPDATE add_cost_chart set Sit_No='" + sitNo + "' Where User_Name='" + userName + "' And User_Password='" + password + "' And Date='" + date + "';";
            String sql5 = "UPDATE add_cost_chart set Taka='" + cost + "' Where User_Name='" + userName + "' And User_Password='" + password + "' And Date='" + date + "';";
            ConnectionJDB cont = new ConnectionJDB();
            cont.createConnection();
            cont.dataInsert(sql2);
            cont.dataInsert(sql3);
            cont.dataInsert(sql4);
            cont.dataInsert(sql5);
            cont.con.close();
            JOptionPane.showMessageDialog(rootPane, "Cost update successful");
            clearText();
        } catch (SQLException ex) {
            clearText();
            JOptionPane.showMessageDialog(rootPane, "This day had not any cost");
            System.out.println(ex);
        }
    }//GEN-LAST:event_updateCostUpdateButnActionPerformed

    private void sitNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sitNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sitNoTextActionPerformed

    private void updateCostSearchButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCostSearchButnActionPerformed

        String sql = "Select Room_No,Sit_No,Member_Name,Taka From add_cost_chart Where User_Name=? And User_Password=? And Date=?;";

        String name = LoginFrame.getUserName();
        String pass = LoginFrame.getUserPass();

        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bachelor_point", "root", "");

            st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, pass);
            st.setString(3, dateText.getText());

            rs = st.executeQuery();

            rs.first();
            roomNoText.setText(rs.getString(1));
            sitNoText.setText(rs.getString(2));
            nameText.setText(rs.getString(3));
            costText.setText(rs.getString(4));
            oldCost = Integer.parseInt(rs.getString(4));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_updateCostSearchButnActionPerformed

    private void updateCostClearButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCostClearButnActionPerformed

        clearText();
    }//GEN-LAST:event_updateCostClearButnActionPerformed

    void clearText() {
        dateText.setText("");
        roomNoText.setText("");
        sitNoText.setText("");
        nameText.setText("");
        costText.setText("");

    }

    private void roomNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNoTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void costTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costTextActionPerformed

    private void roomNoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomNoTextKeyTyped

         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_roomNoTextKeyTyped

    private void sitNoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sitNoTextKeyTyped

         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_sitNoTextKeyTyped

    private void costTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costTextKeyTyped

         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_costTextKeyTyped

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
            java.util.logging.Logger.getLogger(Update_Cost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Cost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Cost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Cost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Cost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costText;
    private javax.swing.JTextField dateText;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logOutBut;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField roomNoText;
    private javax.swing.JTextField sitNoText;
    private javax.swing.JButton updateCostClearButn;
    private javax.swing.JButton updateCostSearchButn;
    private javax.swing.JButton updateCostUpdateButn;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
