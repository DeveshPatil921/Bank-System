
package bankapplication.employee_window;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import javax.swing.ButtonGroup;

/*
    **************************
    * @author : Devesh Patil *
    **************************  */

public class Add_User extends javax.swing.JFrame {
    
    private com.bean.AddCustVar data;
    private com.dao.AddCustdao oprt;
    private Random randm = new Random();
    private int Accnum;
    private ButtonGroup bg;
            
    public Add_User() {
        initComponents();
        
        try {

            RandomAccessFile numbr = new RandomAccessFile("C:/Users/patil/AccountNumber.txt","r");
            Accnum = Integer.parseInt(numbr.readLine());
            numbr.close();
            String str = "GPA"+Accnum;
            viewUserN.setText( str);    
            
            
        }
        catch (FileNotFoundException ex) {    ex.printStackTrace();     } 
        catch (IOException ex) {      ex.printStackTrace();     }
        bg = new ButtonGroup();
        bg.add(genM);
        bg.add(genF);
        bg.add(genO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLab = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        MobLab = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        AddrLab = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        PassBtn = new javax.swing.JButton();
        CancleBtn = new javax.swing.JButton();
        viewPassd = new javax.swing.JLabel();
        AccountNumLabel = new javax.swing.JLabel();
        viewUserN = new javax.swing.JLabel();
        PassLable = new javax.swing.JLabel();
        DOBLab = new javax.swing.JLabel();
        GenLab = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        selmonth = new javax.swing.JComboBox<>();
        selday = new javax.swing.JComboBox<>( odd);
        selyear = new javax.swing.JComboBox<>();
        genM = new javax.swing.JCheckBox();
        genF = new javax.swing.JCheckBox();
        genO = new javax.swing.JCheckBox();
        txtAmount = new javax.swing.JTextField();
        InitAmt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add User Window");
        setBackground(new java.awt.Color(198, 255, 204));
        setMinimumSize(new java.awt.Dimension(863, 547));
        setPreferredSize(new java.awt.Dimension(870, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        NameLab.setBackground(new java.awt.Color(204, 204, 255));
        NameLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        NameLab.setText("  Name");
        NameLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NameLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NameLab.setOpaque(true);
        getContentPane().add(NameLab);
        NameLab.setBounds(80, 110, 140, 30);

        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtname);
        txtname.setBounds(240, 110, 220, 30);

        MobLab.setBackground(new java.awt.Color(204, 204, 255));
        MobLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        MobLab.setText("  Mobile-Number");
        MobLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        MobLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MobLab.setOpaque(true);
        getContentPane().add(MobLab);
        MobLab.setBounds(80, 190, 140, 30);

        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtPhone);
        txtPhone.setBounds(240, 190, 220, 30);

        AddrLab.setBackground(new java.awt.Color(204, 204, 255));
        AddrLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        AddrLab.setText("  Full Address");
        AddrLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AddrLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddrLab.setOpaque(true);
        getContentPane().add(AddrLab);
        AddrLab.setBounds(80, 270, 140, 30);

        Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Fill All the Essential Details of the User");
        getContentPane().add(Title);
        Title.setBounds(110, 10, 630, 80);

        txtAddress.setColumns(20);
        txtAddress.setLineWrap(true);
        txtAddress.setRows(3);
        txtAddress.setTabSize(1);
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(txtAddress);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(240, 270, 220, 70);

        PassBtn.setBackground(new java.awt.Color(255, 153, 153));
        PassBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        PassBtn.setText("Get Password");
        PassBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        PassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(PassBtn);
        PassBtn.setBounds(590, 290, 120, 30);

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
        CancleBtn.setBounds(480, 460, 130, 30);

        viewPassd.setBackground(new java.awt.Color(227, 227, 253));
        viewPassd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        viewPassd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPassd.setText("_");
        viewPassd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        viewPassd.setOpaque(true);
        getContentPane().add(viewPassd);
        viewPassd.setBounds(540, 230, 230, 30);

        AccountNumLabel.setBackground(new java.awt.Color(204, 204, 255));
        AccountNumLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        AccountNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountNumLabel.setText("Account Number");
        AccountNumLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AccountNumLabel.setOpaque(true);
        getContentPane().add(AccountNumLabel);
        AccountNumLabel.setBounds(540, 110, 230, 30);

        viewUserN.setBackground(new java.awt.Color(227, 227, 253));
        viewUserN.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        viewUserN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewUserN.setText("This is your Account Number");
        viewUserN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        viewUserN.setOpaque(true);
        getContentPane().add(viewUserN);
        viewUserN.setBounds(540, 150, 230, 30);

        PassLable.setBackground(new java.awt.Color(204, 204, 255));
        PassLable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        PassLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassLable.setText("Password");
        PassLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PassLable.setOpaque(true);
        getContentPane().add(PassLable);
        PassLable.setBounds(540, 190, 230, 30);

        DOBLab.setBackground(new java.awt.Color(204, 204, 255));
        DOBLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        DOBLab.setText("  Date of Birth");
        DOBLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DOBLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DOBLab.setOpaque(true);
        getContentPane().add(DOBLab);
        DOBLab.setBounds(80, 150, 140, 30);

        GenLab.setBackground(new java.awt.Color(204, 204, 255));
        GenLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        GenLab.setText("  Gender");
        GenLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        GenLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GenLab.setOpaque(true);
        getContentPane().add(GenLab);
        GenLab.setBounds(80, 230, 140, 30);

        AddBtn.setBackground(new java.awt.Color(255, 153, 153));
        AddBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddBtn);
        AddBtn.setBounds(320, 460, 130, 30);

        selmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        selmonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        selmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selmonthActionPerformed(evt);
            }
        });
        getContentPane().add(selmonth);
        selmonth.setBounds(310, 150, 90, 30);

        selday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(selday);
        selday.setBounds(400, 150, 60, 30);

        selyear.setModel(new javax.swing.DefaultComboBoxModel<>(year));
        selyear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(selyear);
        selyear.setBounds(240, 150, 72, 30);

        genM.setBackground(new java.awt.Color(204, 255, 153));
        genM.setText("Male");
        genM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 41, 41)));
        genM.setSelected(true);
        getContentPane().add(genM);
        genM.setBounds(240, 230, 70, 30);

        genF.setBackground(new java.awt.Color(204, 255, 153));
        genF.setText("Female");
        genF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 41, 41)));
        getContentPane().add(genF);
        genF.setBounds(310, 230, 70, 30);

        genO.setBackground(new java.awt.Color(204, 255, 153));
        genO.setText("other");
        genO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 41, 41)));
        getContentPane().add(genO);
        genO.setBounds(380, 230, 80, 30);

        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setText("500");
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtAmount);
        txtAmount.setBounds(240, 380, 220, 30);

        InitAmt.setBackground(new java.awt.Color(204, 204, 255));
        InitAmt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        InitAmt.setText("  Initial Amount");
        InitAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        InitAmt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InitAmt.setOpaque(true);
        getContentPane().add(InitAmt);
        InitAmt.setBounds(80, 380, 140, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selmonthActionPerformed
        
        if(((selmonth.getSelectedIndex()+1)%2)==1){
            selday.setModel(new javax.swing.DefaultComboBoxModel<>(odd));
        }
        else{
            selday.setModel(new javax.swing.DefaultComboBoxModel<>(even));
        }
    }//GEN-LAST:event_selmonthActionPerformed

    private void CancleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleBtnActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_CancleBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
        if(txtname.getText().equals("")&&txtPhone.getText().length()>8||txtPhone.getText().length()<10&&Integer.parseInt(txtAmount.getText())>500)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all information !");
        }
        else{
            
            if(viewPassd.getText().equals("_"))
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Please Check you generate the Password !");
            }
            else{
                try{
                    
                        data = new com.bean.AddCustVar();       
                        
                        data.setName(txtname.getText());
                        data.setPhone(Integer.parseInt(txtPhone.getText()));
                        data.setDOB(selyear.getSelectedItem()+"-0"+(selmonth.getSelectedIndex()+1)+"-"+selday.getSelectedItem());
                        data.setAddress(txtAddress.getText());
                        data.setUsername(Accnum);
                        data.setPassword(viewPassd.getText());
                        data.setAmount(Integer.parseInt(txtAmount.getText()));

                        if(genM.isSelected()){  data.setGender("Male");    }

                        else if(genF.isSelected()){   data.setGender("Female");    }

                        else {  data.setGender("Other");    }
                        
                       oprt = new com.dao.AddCustdao();
                       boolean result = oprt.addCust(data);
                        
                       if(result){
                            javax.swing.JOptionPane.showMessageDialog(this, "Employee details inserted Successfully !");            
                            Accnum= Accnum+1;
                            try (FileWriter numbw = new FileWriter("C:/Users/patil/AccountNumber.txt")) {
                                numbw.write(String.valueOf(Accnum));
                            }
                               
                       }
                       else {
                           javax.swing.JOptionPane.showMessageDialog(this, "Employee details inserted Fail !");            
                           
                       }
                        
                        txtname.setText("");
                        txtPhone.setText("");
                        selyear.setSelectedItem(0);
                        selmonth.setSelectedItem(0);
                        selday.setSelectedItem(0);
                        txtAddress.setText("");
                        viewUserN.setText("GPA"+Accnum);
                        viewPassd.setText("_"); 
                
                }
               catch(NumberFormatException e){
                   javax.swing.JOptionPane.showMessageDialog(this, "Please enter Valied Number !");
               }
               catch (Exception e){ e.printStackTrace();}
               
            }
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void PassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassBtnActionPerformed
        if(txtname.getText().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all information Before Generating the Password !");
        }
        else{
            String Pass = selyear.getSelectedItem()+"#"+ randm.nextInt(10, 100) + txtname.getText().substring(0, 3) ;
            viewPassd.setText(Pass);
        }
    }//GEN-LAST:event_PassBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_User().setVisible(true);
            }
        });
    }

    private String[] even = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
    private String[] odd = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    private String[] year = { "2000","2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNumLabel;
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AddrLab;
    private javax.swing.JButton CancleBtn;
    private javax.swing.JLabel DOBLab;
    private javax.swing.JLabel GenLab;
    private javax.swing.JLabel InitAmt;
    private javax.swing.JLabel MobLab;
    private javax.swing.JLabel NameLab;
    private javax.swing.JButton PassBtn;
    private javax.swing.JLabel PassLable;
    private javax.swing.JLabel Title;
    private javax.swing.JCheckBox genF;
    private javax.swing.JCheckBox genM;
    private javax.swing.JCheckBox genO;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selday;
    private javax.swing.JComboBox<String> selmonth;
    private javax.swing.JComboBox<String> selyear;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtname;
    private javax.swing.JLabel viewPassd;
    private javax.swing.JLabel viewUserN;
    // End of variables declaration//GEN-END:variables
}
