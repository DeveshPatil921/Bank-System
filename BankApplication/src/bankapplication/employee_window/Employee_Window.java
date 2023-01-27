package bankapplication.employee_window;

import bankapplication.MainWindow;

/*      * ************************
        * @author : Devesh Patil *
        **************************   */
public class Employee_Window extends javax.swing.JFrame {

    private final bankapplication.employee_window.DepositePanle depositobj = new bankapplication.employee_window.DepositePanle();
    private final bankapplication.employee_window.WithdrawPanle widrawobj = new bankapplication.employee_window.WithdrawPanle();
    private final bankapplication.employee_window.CustomerLists custlistobj = new bankapplication.employee_window.CustomerLists();

    public Employee_Window() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_MW = new javax.swing.JPanel();
        Floater_MW = new javax.swing.JPanel();
        LeftMenu_MW = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JButton();
        WithdrawBtn = new javax.swing.JButton();
        depositeBtn = new javax.swing.JButton();
        CustInfoBtn = new javax.swing.JButton();
        AdduserBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RightMenu_MW = new javax.swing.JPanel();
        MultiWindow_MW = new javax.swing.JDesktopPane();
        depositePanle1 = new bankapplication.employee_window.DepositePanle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee  Workspace");
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        Header_MW.setBackground(new java.awt.Color(181, 230, 29));
        Header_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Header_MW.setPreferredSize(new java.awt.Dimension(120, 37));

        javax.swing.GroupLayout Header_MWLayout = new javax.swing.GroupLayout(Header_MW);
        Header_MW.setLayout(Header_MWLayout);
        Header_MWLayout.setHorizontalGroup(
            Header_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        Header_MWLayout.setVerticalGroup(
            Header_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(Header_MW, java.awt.BorderLayout.PAGE_START);

        Floater_MW.setBackground(new java.awt.Color(181, 230, 29));
        Floater_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Floater_MW.setPreferredSize(new java.awt.Dimension(120, 37));

        javax.swing.GroupLayout Floater_MWLayout = new javax.swing.GroupLayout(Floater_MW);
        Floater_MW.setLayout(Floater_MWLayout);
        Floater_MWLayout.setHorizontalGroup(
            Floater_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        Floater_MWLayout.setVerticalGroup(
            Floater_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(Floater_MW, java.awt.BorderLayout.PAGE_END);

        LeftMenu_MW.setBackground(new java.awt.Color(239, 250, 212));
        LeftMenu_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LeftMenu_MW.setPreferredSize(new java.awt.Dimension(280, 70));
        LeftMenu_MW.setLayout(null);

        HomeBtn.setText("Home Screen");
        HomeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LeftMenu_MW.add(HomeBtn);
        HomeBtn.setBounds(10, 160, 260, 40);

        WithdrawBtn.setText("Withdraw Money");
        WithdrawBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        WithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(WithdrawBtn);
        WithdrawBtn.setBounds(10, 210, 260, 40);

        depositeBtn.setText("Deposite Money");
        depositeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        depositeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(depositeBtn);
        depositeBtn.setBounds(10, 260, 260, 40);

        CustInfoBtn.setText("Customer Infomation");
        CustInfoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CustInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustInfoBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(CustInfoBtn);
        CustInfoBtn.setBounds(10, 310, 260, 40);

        AdduserBtn.setText("Add User");
        AdduserBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AdduserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdduserBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(AdduserBtn);
        AdduserBtn.setBounds(10, 360, 260, 40);

        DeleteBtn.setText("Log out");
        DeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(DeleteBtn);
        DeleteBtn.setBounds(10, 410, 260, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/showlogo.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(99, 51, 0), 3, true));
        LeftMenu_MW.add(jLabel1);
        jLabel1.setBounds(10, 10, 260, 140);

        getContentPane().add(LeftMenu_MW, java.awt.BorderLayout.WEST);

        RightMenu_MW.setBackground(new java.awt.Color(239, 239, 159));
        RightMenu_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RightMenu_MW.setPreferredSize(new java.awt.Dimension(0, 70));

        javax.swing.GroupLayout RightMenu_MWLayout = new javax.swing.GroupLayout(RightMenu_MW);
        RightMenu_MW.setLayout(RightMenu_MWLayout);
        RightMenu_MWLayout.setHorizontalGroup(
            RightMenu_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RightMenu_MWLayout.setVerticalGroup(
            RightMenu_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );

        getContentPane().add(RightMenu_MW, java.awt.BorderLayout.EAST);

        MultiWindow_MW.setBackground(new java.awt.Color(239, 250, 212));
        MultiWindow_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MultiWindow_MW.setLayout(new java.awt.BorderLayout());

        depositePanle1.setVisible(true);
        MultiWindow_MW.add(depositePanle1, java.awt.BorderLayout.CENTER);

        getContentPane().add(MultiWindow_MW, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdduserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdduserBtnActionPerformed
        bankapplication.employee_window.Add_User obj = new bankapplication.employee_window.Add_User();
        obj.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        obj.setVisible(true);
    }//GEN-LAST:event_AdduserBtnActionPerformed

    private void WithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawBtnActionPerformed
        MultiWindow_MW.removeAll();
        widrawobj.setVisible(true);
        MultiWindow_MW.add(widrawobj);
        MultiWindow_MW.updateUI();

    }//GEN-LAST:event_WithdrawBtnActionPerformed

    private void depositeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeBtnActionPerformed
        MultiWindow_MW.removeAll();
        depositobj.setVisible(true);
        MultiWindow_MW.add(depositobj);
        MultiWindow_MW.updateUI();
    }//GEN-LAST:event_depositeBtnActionPerformed

    private void CustInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustInfoBtnActionPerformed
        MultiWindow_MW.removeAll();
        custlistobj.setVisible(true);
        MultiWindow_MW.add(custlistobj);
        MultiWindow_MW.updateUI(); 
    }//GEN-LAST:event_CustInfoBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
       this.dispose();
       new MainWindow().setVisible(true);
    }//GEN-LAST:event_DeleteBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Employee_Window().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdduserBtn;
    private javax.swing.JButton CustInfoBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JPanel Floater_MW;
    private javax.swing.JPanel Header_MW;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JPanel LeftMenu_MW;
    private javax.swing.JDesktopPane MultiWindow_MW;
    private javax.swing.JPanel RightMenu_MW;
    private javax.swing.JButton WithdrawBtn;
    private javax.swing.JButton depositeBtn;
    private bankapplication.employee_window.DepositePanle depositePanle1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
