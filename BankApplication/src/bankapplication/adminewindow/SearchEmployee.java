
package bankapplication.adminewindow;

import com.dao.EmpSearchDao;

/*
 * @author patil
*/
public class SearchEmployee extends javax.swing.JInternalFrame {

    private com.bean.addempVar data;
    public SearchEmployee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inputform = new javax.swing.JPanel();
        EmpTitle = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        EntDeLabel = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        SearchList = new javax.swing.JComboBox<>();
        ListLabel = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        WindowTitle = new javax.swing.JLabel();
        ResultPanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        ViewAddress = new javax.swing.JLabel();
        ViewDOB = new javax.swing.JLabel();
        ViewPhone = new javax.swing.JLabel();
        ViewName = new javax.swing.JLabel();
        PositLabel = new javax.swing.JLabel();
        ViewPosit = new javax.swing.JLabel();
        SalaryLable = new javax.swing.JLabel();
        ViewSalary = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();

        Inputform.setBackground(new java.awt.Color(229, 235, 238));
        Inputform.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Inputform.setPreferredSize(new java.awt.Dimension(350, 414));
        Inputform.setLayout(null);

        EmpTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        EmpTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmpTitle.setText("Search Employee");
        Inputform.add(EmpTitle);
        EmpTitle.setBounds(90, 50, 280, 60);

        SearchBtn.setBackground(new java.awt.Color(220, 225, 197));
        SearchBtn.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 17)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        Inputform.add(SearchBtn);
        SearchBtn.setBounds(160, 380, 120, 30);

        EntDeLabel.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 17)); // NOI18N
        EntDeLabel.setText("Enter Details Hear");
        Inputform.add(EntDeLabel);
        EntDeLabel.setBounds(60, 230, 140, 30);

        txtData.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 17)); // NOI18N
        txtData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        Inputform.add(txtData);
        txtData.setBounds(60, 270, 220, 30);

        SearchList.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 17)); // NOI18N
        SearchList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee Name", "UserName" }));
        SearchList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchListActionPerformed(evt);
            }
        });
        Inputform.add(SearchList);
        SearchList.setBounds(220, 170, 170, 30);

        ListLabel.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 17)); // NOI18N
        ListLabel.setText("Search Customer By");
        Inputform.add(ListLabel);
        ListLabel.setBounds(60, 170, 160, 30);

        getContentPane().add(Inputform, java.awt.BorderLayout.CENTER);

        Header.setBackground(new java.awt.Color(229, 235, 238));
        Header.setPreferredSize(new java.awt.Dimension(988, 80));
        Header.setLayout(null);

        WindowTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        WindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WindowTitle.setText("Employee Information ");
        Header.add(WindowTitle);
        WindowTitle.setBounds(346, 17, 410, 40);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        ResultPanel.setBackground(new java.awt.Color(229, 211, 238));
        ResultPanel.setPreferredSize(new java.awt.Dimension(500, 474));
        ResultPanel.setLayout(null);

        NameLabel.setBackground(new java.awt.Color(239, 239, 255));
        NameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NameLabel.setText("  Name of User");
        NameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NameLabel.setOpaque(true);
        ResultPanel.add(NameLabel);
        NameLabel.setBounds(70, 140, 140, 30);

        PhoneLabel.setBackground(new java.awt.Color(239, 239, 255));
        PhoneLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        PhoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PhoneLabel.setText("  Phone Number");
        PhoneLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PhoneLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PhoneLabel.setOpaque(true);
        ResultPanel.add(PhoneLabel);
        PhoneLabel.setBounds(70, 180, 140, 30);

        DOBLabel.setBackground(new java.awt.Color(239, 239, 255));
        DOBLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        DOBLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DOBLabel.setText("  Date Of Birth");
        DOBLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DOBLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DOBLabel.setOpaque(true);
        ResultPanel.add(DOBLabel);
        DOBLabel.setBounds(70, 220, 140, 30);

        AddressLabel.setBackground(new java.awt.Color(239, 239, 255));
        AddressLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        AddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddressLabel.setText("  Address");
        AddressLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AddressLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddressLabel.setOpaque(true);
        ResultPanel.add(AddressLabel);
        AddressLabel.setBounds(70, 260, 140, 30);

        ViewAddress.setBackground(new java.awt.Color(239, 239, 255));
        ViewAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        ViewAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAddress.setText("_");
        ViewAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewAddress.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewAddress.setOpaque(true);
        ResultPanel.add(ViewAddress);
        ViewAddress.setBounds(220, 260, 220, 70);

        ViewDOB.setBackground(new java.awt.Color(239, 239, 255));
        ViewDOB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        ViewDOB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewDOB.setText("_");
        ViewDOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewDOB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewDOB.setOpaque(true);
        ResultPanel.add(ViewDOB);
        ViewDOB.setBounds(220, 220, 220, 30);

        ViewPhone.setBackground(new java.awt.Color(239, 239, 255));
        ViewPhone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        ViewPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewPhone.setText("_");
        ViewPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewPhone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewPhone.setOpaque(true);
        ResultPanel.add(ViewPhone);
        ViewPhone.setBounds(220, 180, 220, 30);

        ViewName.setBackground(new java.awt.Color(239, 239, 255));
        ViewName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        ViewName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewName.setText("_");
        ViewName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewName.setOpaque(true);
        ResultPanel.add(ViewName);
        ViewName.setBounds(220, 140, 220, 30);

        PositLabel.setBackground(new java.awt.Color(239, 239, 255));
        PositLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        PositLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PositLabel.setText("  Position");
        PositLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PositLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PositLabel.setOpaque(true);
        ResultPanel.add(PositLabel);
        PositLabel.setBounds(70, 340, 140, 30);

        ViewPosit.setBackground(new java.awt.Color(239, 239, 255));
        ViewPosit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        ViewPosit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewPosit.setText("_");
        ViewPosit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewPosit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewPosit.setOpaque(true);
        ResultPanel.add(ViewPosit);
        ViewPosit.setBounds(220, 340, 220, 30);

        SalaryLable.setBackground(new java.awt.Color(239, 239, 255));
        SalaryLable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        SalaryLable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalaryLable.setText("  Salary");
        SalaryLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SalaryLable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SalaryLable.setOpaque(true);
        ResultPanel.add(SalaryLable);
        SalaryLable.setBounds(70, 380, 140, 30);

        ViewSalary.setBackground(new java.awt.Color(239, 239, 255));
        ViewSalary.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        ViewSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewSalary.setText("_");
        ViewSalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewSalary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewSalary.setOpaque(true);
        ResultPanel.add(ViewSalary);
        ViewSalary.setBounds(220, 380, 220, 30);

        TitleLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Employee Details ");
        ResultPanel.add(TitleLabel);
        TitleLabel.setBounds(110, 30, 280, 60);

        getContentPane().add(ResultPanel, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchListActionPerformed
        
    }//GEN-LAST:event_SearchListActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        if(txtData.getText().equals(" ")||txtData.getText().equals(" ")){
            javax.swing.JOptionPane.showMessageDialog(null, "Please Insert data to Search !", "Warning", javax.swing.JOptionPane.OK_OPTION);
        }
        else{
            if(SearchList.getSelectedIndex()==0){
                data = EmpSearchDao.SearchName(txtData.getText());
                if(data!=null){
                    ViewAddress.setText(data.getAddress()) ;
                    ViewDOB.setText(data.getDob()) ;
                    ViewName.setText(data.getName()) ;
                    ViewPhone.setText(String.valueOf(data.getPhone())) ;
                    ViewPosit.setText(data.getPosition()) ;
                    ViewSalary.setText(data.getSalary()+"/- Rs") ;
                }
            }
            if(SearchList.getSelectedIndex()==1){
                data = EmpSearchDao.SearchUsername(txtData.getText());
                if(data!=null){
                    ViewAddress.setText(data.getAddress()) ;
                    ViewDOB.setText(data.getDob()) ;
                    ViewName.setText(data.getName()) ;
                    ViewPhone.setText(String.valueOf(data.getPhone())) ;
                    ViewPosit.setText(data.getPosition()) ;
                    ViewSalary.setText(data.getSalary()+"/- Rs") ;
                }

            }
        }
    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel EmpTitle;
    private javax.swing.JLabel EntDeLabel;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Inputform;
    private javax.swing.JLabel ListLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JLabel PositLabel;
    private javax.swing.JPanel ResultPanel;
    private javax.swing.JLabel SalaryLable;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JComboBox<String> SearchList;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel ViewAddress;
    private javax.swing.JLabel ViewDOB;
    private javax.swing.JLabel ViewName;
    private javax.swing.JLabel ViewPhone;
    private javax.swing.JLabel ViewPosit;
    private javax.swing.JLabel ViewSalary;
    private javax.swing.JLabel WindowTitle;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
