
package bankapplication.adminewindow;

import bankapplication.MainWindow;

/**         **************************************
            *       @author : Devesh Patil       *
            **************************************         **/
public class AdmineWindow extends javax.swing.JFrame {

    private bankapplication.adminewindow.Employee_Info EmpList = new bankapplication.adminewindow.Employee_Info();
    private bankapplication.employee_window.CustomerLists CustList = new bankapplication.employee_window.CustomerLists();
    private bankapplication.adminewindow.AdminLoginDetails admininfo = new bankapplication.adminewindow.AdminLoginDetails();
    private bankapplication.adminewindow.AddEmployee addemp;
    private bankapplication.adminewindow.SearchEmployee SearchEmp = new bankapplication.adminewindow.SearchEmployee();
    
    
    public AdmineWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_AW = new javax.swing.JPanel();
        Floater_AW = new javax.swing.JPanel();
        Menu_AW = new javax.swing.JPanel();
        Logoutbtn = new javax.swing.JButton();
        SercEmpBtn = new javax.swing.JButton();
        logingDetailsBtn = new javax.swing.JButton();
        CustBtn = new javax.swing.JButton();
        EmpBtn = new javax.swing.JButton();
        AddEmpBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MultiWindowPanel_AW = new javax.swing.JDesktopPane();
        adminLoginDetails1 = new bankapplication.adminewindow.AdminLoginDetails();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admine Window");
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));

        Header_AW.setBackground(new java.awt.Color(13, 237, 189));
        Header_AW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Header_AW.setPreferredSize(new java.awt.Dimension(120, 35));

        javax.swing.GroupLayout Header_AWLayout = new javax.swing.GroupLayout(Header_AW);
        Header_AW.setLayout(Header_AWLayout);
        Header_AWLayout.setHorizontalGroup(
            Header_AWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1298, Short.MAX_VALUE)
        );
        Header_AWLayout.setVerticalGroup(
            Header_AWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        getContentPane().add(Header_AW, java.awt.BorderLayout.PAGE_START);

        Floater_AW.setBackground(new java.awt.Color(13, 237, 189));
        Floater_AW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Floater_AW.setPreferredSize(new java.awt.Dimension(120, 35));

        javax.swing.GroupLayout Floater_AWLayout = new javax.swing.GroupLayout(Floater_AW);
        Floater_AW.setLayout(Floater_AWLayout);
        Floater_AWLayout.setHorizontalGroup(
            Floater_AWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1298, Short.MAX_VALUE)
        );
        Floater_AWLayout.setVerticalGroup(
            Floater_AWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        getContentPane().add(Floater_AW, java.awt.BorderLayout.PAGE_END);

        Menu_AW.setBackground(new java.awt.Color(237, 255, 233));
        Menu_AW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Menu_AW.setPreferredSize(new java.awt.Dimension(280, 70));
        Menu_AW.setLayout(null);

        Logoutbtn.setText("Log out");
        Logoutbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });
        Menu_AW.add(Logoutbtn);
        Logoutbtn.setBounds(10, 420, 260, 40);

        SercEmpBtn.setText("Search Emplyee");
        SercEmpBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SercEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SercEmpBtnActionPerformed(evt);
            }
        });
        Menu_AW.add(SercEmpBtn);
        SercEmpBtn.setBounds(10, 220, 260, 40);

        logingDetailsBtn.setText("Update Login Details");
        logingDetailsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        logingDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logingDetailsBtnActionPerformed(evt);
            }
        });
        Menu_AW.add(logingDetailsBtn);
        logingDetailsBtn.setBounds(10, 170, 260, 40);

        CustBtn.setText("View Customers List");
        CustBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustBtnActionPerformed(evt);
            }
        });
        Menu_AW.add(CustBtn);
        CustBtn.setBounds(10, 270, 260, 40);

        EmpBtn.setText("View Employeee List");
        EmpBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        EmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpBtnActionPerformed(evt);
            }
        });
        Menu_AW.add(EmpBtn);
        EmpBtn.setBounds(10, 320, 260, 40);

        AddEmpBtn.setText("Add Employee");
        AddEmpBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AddEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpBtnActionPerformed(evt);
            }
        });
        Menu_AW.add(AddEmpBtn);
        AddEmpBtn.setBounds(10, 370, 260, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/showlogo.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 39, 131), 3));
        Menu_AW.add(jLabel1);
        jLabel1.setBounds(10, 16, 260, 140);

        getContentPane().add(Menu_AW, java.awt.BorderLayout.WEST);

        MultiWindowPanel_AW.setBackground(new java.awt.Color(237, 255, 233));
        MultiWindowPanel_AW.setNextFocusableComponent(MultiWindowPanel_AW);
        MultiWindowPanel_AW.setLayout(new java.awt.BorderLayout());

        adminLoginDetails1.setVisible(true);
        MultiWindowPanel_AW.add(adminLoginDetails1, java.awt.BorderLayout.CENTER);

        getContentPane().add(MultiWindowPanel_AW, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpBtnActionPerformed
       MultiWindowPanel_AW.removeAll(); // this method removes all the component from the jInternalPanel
       EmpList.setVisible(true);    // here visibling the employee info 
       MultiWindowPanel_AW.add(EmpList); // Setting the object and multiWindowPanel.
       
    }//GEN-LAST:event_EmpBtnActionPerformed

    private void CustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustBtnActionPerformed
       MultiWindowPanel_AW.removeAll();
       CustList.setVisible(true);
       MultiWindowPanel_AW.add(CustList);
    }//GEN-LAST:event_CustBtnActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        new MainWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutbtnActionPerformed

    private void logingDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logingDetailsBtnActionPerformed
        
        MultiWindowPanel_AW.removeAll();
        admininfo.setVisible(true);
        MultiWindowPanel_AW.add(admininfo);
    }//GEN-LAST:event_logingDetailsBtnActionPerformed

    private void AddEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpBtnActionPerformed
        addemp = new bankapplication.adminewindow.AddEmployee();
        addemp.setVisible(true);
    }//GEN-LAST:event_AddEmpBtnActionPerformed

    private void SercEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SercEmpBtnActionPerformed
        MultiWindowPanel_AW.removeAll();
        SearchEmp.setVisible(true);
        MultiWindowPanel_AW.add(SearchEmp);
        
    }//GEN-LAST:event_SercEmpBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AdmineWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmpBtn;
    private javax.swing.JButton CustBtn;
    private javax.swing.JButton EmpBtn;
    private javax.swing.JPanel Floater_AW;
    private javax.swing.JPanel Header_AW;
    private javax.swing.JButton Logoutbtn;
    private javax.swing.JPanel Menu_AW;
    private javax.swing.JDesktopPane MultiWindowPanel_AW;
    private javax.swing.JButton SercEmpBtn;
    private bankapplication.adminewindow.AdminLoginDetails adminLoginDetails1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logingDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
