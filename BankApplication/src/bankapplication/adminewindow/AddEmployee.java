
package bankapplication.adminewindow;

/*  ***************************
    * @author : Devesh Patil  *
    ***************************       */
public class AddEmployee extends javax.swing.JFrame {
    
    private com.bean.addempVar data;
    private com.dao.addempdao oprt;
    
    public AddEmployee() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenGroupbox = new javax.swing.ButtonGroup();
        NameLabel = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        intSalary = new javax.swing.JTextField();
        SalaryLabel = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JLabel();
        GenLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddr = new javax.swing.JTextArea();
        contButton = new javax.swing.JButton();
        CancleBtn = new javax.swing.JButton();
        UserLabel = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        genM = new javax.swing.JCheckBox();
        genO = new javax.swing.JCheckBox();
        AddrLabel = new javax.swing.JLabel();
        selyear = new javax.swing.JComboBox<>();
        selmonth = new javax.swing.JComboBox<>();
        selday = new javax.swing.JComboBox<>( odd);
        PositLabel = new javax.swing.JLabel();
        selPosition = new javax.swing.JComboBox<>();
        genF = new javax.swing.JCheckBox();
        AddButton = new javax.swing.JButton();
        viewpassLabel = new javax.swing.JTextField();
        viewUserLabel = new javax.swing.JTextField();

        GenGroupbox.add(genM);
        GenGroupbox.add(genF);
        GenGroupbox.add(genO);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        NameLabel.setBackground(new java.awt.Color(204, 204, 255));
        NameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NameLabel.setText(" Name");
        NameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        NameLabel.setOpaque(true);
        getContentPane().add(NameLabel);
        NameLabel.setBounds(70, 120, 150, 30);

        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtname);
        txtname.setBounds(230, 120, 210, 30);

        intSalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(intSalary);
        intSalary.setBounds(240, 410, 180, 30);

        SalaryLabel.setBackground(new java.awt.Color(204, 204, 255));
        SalaryLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        SalaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalaryLabel.setText("Salary");
        SalaryLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SalaryLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SalaryLabel.setOpaque(true);
        getContentPane().add(SalaryLabel);
        SalaryLabel.setBounds(70, 410, 160, 30);

        txtphone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtphone);
        txtphone.setBounds(230, 160, 210, 30);

        PhoneLabel.setBackground(new java.awt.Color(204, 204, 255));
        PhoneLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        PhoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PhoneLabel.setText(" Phone number");
        PhoneLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PhoneLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PhoneLabel.setOpaque(true);
        getContentPane().add(PhoneLabel);
        PhoneLabel.setBounds(70, 160, 150, 30);

        GenLabel.setBackground(new java.awt.Color(204, 204, 255));
        GenLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        GenLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GenLabel.setText(" Gender");
        GenLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GenLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        GenLabel.setOpaque(true);
        getContentPane().add(GenLabel);
        GenLabel.setBounds(70, 240, 150, 30);

        DOBLabel.setBackground(new java.awt.Color(204, 204, 255));
        DOBLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        DOBLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DOBLabel.setText(" Seletc Date of Birth");
        DOBLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DOBLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DOBLabel.setOpaque(true);
        getContentPane().add(DOBLabel);
        DOBLabel.setBounds(70, 200, 150, 30);

        TitleLabel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Enter The Details of Emplyoee");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(70, 20, 630, 50);

        txtAddr.setColumns(20);
        txtAddr.setLineWrap(true);
        txtAddr.setRows(3);
        txtAddr.setTabSize(1);
        txtAddr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtAddr);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 280, 210, 60);

        contButton.setBackground(new java.awt.Color(255, 153, 153));
        contButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        contButton.setText("continue");
        contButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        contButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contButtonActionPerformed(evt);
            }
        });
        getContentPane().add(contButton);
        contButton.setBounds(560, 300, 100, 30);

        CancleBtn.setBackground(new java.awt.Color(255, 153, 153));
        CancleBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CancleBtn.setText("Cancle");
        CancleBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        CancleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancleBtn);
        CancleBtn.setBounds(430, 510, 130, 30);

        UserLabel.setBackground(new java.awt.Color(204, 204, 255));
        UserLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        UserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLabel.setText("UserName");
        UserLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserLabel.setOpaque(true);
        getContentPane().add(UserLabel);
        UserLabel.setBounds(500, 120, 230, 30);

        PassLabel.setBackground(new java.awt.Color(204, 204, 255));
        PassLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        PassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassLabel.setText("Password");
        PassLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PassLabel.setOpaque(true);
        getContentPane().add(PassLabel);
        PassLabel.setBounds(500, 200, 230, 30);

        genM.setBackground(new java.awt.Color(204, 255, 153));
        genM.setText("Male");
        genM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 41, 41)));
        genM.setSelected(true);
        getContentPane().add(genM);
        genM.setBounds(230, 240, 70, 30);

        genO.setBackground(new java.awt.Color(204, 255, 153));
        genO.setText("other");
        genO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 41, 41)));
        getContentPane().add(genO);
        genO.setBounds(370, 240, 70, 30);

        AddrLabel.setBackground(new java.awt.Color(204, 204, 255));
        AddrLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        AddrLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddrLabel.setText(" Full Address");
        AddrLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AddrLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        AddrLabel.setOpaque(true);
        getContentPane().add(AddrLabel);
        AddrLabel.setBounds(70, 280, 150, 30);

        selyear.setModel(new javax.swing.DefaultComboBoxModel<>(year));
        selyear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(selyear);
        selyear.setBounds(230, 200, 72, 30);

        selmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        selmonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        selmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selmonthActionPerformed(evt);
            }
        });
        getContentPane().add(selmonth);
        selmonth.setBounds(300, 200, 90, 30);

        selday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(selday);
        selday.setBounds(390, 200, 50, 30);

        PositLabel.setBackground(new java.awt.Color(204, 204, 255));
        PositLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        PositLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositLabel.setText("Position");
        PositLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PositLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PositLabel.setOpaque(true);
        getContentPane().add(PositLabel);
        PositLabel.setBounds(70, 370, 160, 30);

        selPosition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEO", "Manager", "Maintance", "Tregery manager ", "Casher", "Worker", "Security Gurd" }));
        selPosition.setSelectedIndex(5);
        selPosition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(selPosition);
        selPosition.setBounds(240, 370, 180, 30);

        genF.setBackground(new java.awt.Color(204, 255, 153));
        genF.setText("Female");
        genF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 41, 41)));
        getContentPane().add(genF);
        genF.setBounds(300, 240, 70, 30);

        AddButton.setBackground(new java.awt.Color(255, 153, 153));
        AddButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        AddButton.setText("Add");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(270, 510, 130, 30);

        viewpassLabel.setEditable(false);
        viewpassLabel.setBackground(new java.awt.Color(255, 255, 255));
        viewpassLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        viewpassLabel.setText("_");
        viewpassLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(viewpassLabel);
        viewpassLabel.setBounds(500, 240, 230, 30);

        viewUserLabel.setEditable(false);
        viewUserLabel.setBackground(new java.awt.Color(255, 255, 255));
        viewUserLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        viewUserLabel.setText("_");
        viewUserLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(viewUserLabel);
        viewUserLabel.setBounds(500, 160, 230, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selmonthActionPerformed
//        System.out.println(((selmonth.getSelectedIndex()+1)%2)==1?"if":"else");
        if(((selmonth.getSelectedIndex()+1)%2)==1){
            selday.setModel(new javax.swing.DefaultComboBoxModel<>(odd));
        }        
        else{ 
            selday.setModel(new javax.swing.DefaultComboBoxModel<>(even));
        }
    }//GEN-LAST:event_selmonthActionPerformed

    private void contButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contButtonActionPerformed
        java.util.Random randm = new java.util.Random();
        if(txtname.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all information before the genetatin log details");
        
        }
        else{
            String user,pass;
            user = "Emp$"+txtname.getText().substring(0,3).toUpperCase()+selyear.getSelectedItem();
            pass = randm.nextInt(100, 999)+txtname.getText().substring(0,3).toUpperCase()+"@"+selyear.getSelectedItem();
            viewUserLabel.setText(user );
            viewpassLabel.setText(pass );
        }
              
        
    }//GEN-LAST:event_contButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
        if(txtname.getText().equals("")&&intSalary.getText().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all information !");
        }
        else{
            
            if(viewUserLabel.getText().equals("_")&&viewpassLabel.getText().equals("_"))
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Please Check Username and Password !");
            }
            else{
                try{

                        data = new com.bean.addempVar();

                        data.setName(txtname.getText());
                        data.setPhone(Integer.parseInt(txtphone.getText()));
                        data.setDob(selyear.getSelectedItem()+"-0"+(selmonth.getSelectedIndex()+1)+"-"+selday.getSelectedItem());
                        data.setAddress(txtAddr.getText());
                        data.setposition(selPosition.getSelectedItem().toString());
                        data.setSalary(Integer.parseInt(intSalary.getText()));
                        data.setUsername(viewUserLabel.getText());
                        data.setPassword(viewpassLabel.getText());

                        if(genM.isSelected()){  data.setGender("Male");    }

                        else if(genF.isSelected()){   data.setGender("Female");    }

                        else {  data.setGender("Other");    }
                        
                        oprt = new com.dao.addempdao();
                        boolean result = oprt.addindb(data); 
                        if(result){
                                javax.swing.JOptionPane.showMessageDialog(this, "Employee details inserted Successfully !");            
                       }
                        else {
                              javax.swing.JOptionPane.showMessageDialog(this, "Employee details inserted Fail !");            
                        }
                        txtname.setText("");
                        txtphone.setText("");
                        selyear.setSelectedItem(0);
                        selmonth.setSelectedItem(0);
                        selday.setSelectedItem(0);
                        txtAddr.setText("");
                        selPosition.setSelectedItem(5);
                        intSalary.setText("");
                        viewUserLabel.setText("_");
                        viewpassLabel.setText("_"); 
                }
               catch(NumberFormatException e){
                   javax.swing.JOptionPane.showMessageDialog(this, "Please enter Valied Number !");
               }
               catch (Exception e){ e.printStackTrace();}
               
            }
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void CancleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancleBtnActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

//    Essentail varibales
    private String[] even = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
    private String[] odd = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    private String[] year = { "2000","2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
         
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AddrLabel;
    private javax.swing.JButton CancleBtn;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.ButtonGroup GenGroupbox;
    private javax.swing.JLabel GenLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JLabel PositLabel;
    private javax.swing.JLabel SalaryLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton contButton;
    private javax.swing.JCheckBox genF;
    private javax.swing.JCheckBox genM;
    private javax.swing.JCheckBox genO;
    private javax.swing.JTextField intSalary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selPosition;
    private javax.swing.JComboBox<String> selday;
    private javax.swing.JComboBox<String> selmonth;
    private javax.swing.JComboBox<String> selyear;
    private javax.swing.JTextArea txtAddr;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField viewUserLabel;
    private javax.swing.JTextField viewpassLabel;
    // End of variables declaration//GEN-END:variables
}
