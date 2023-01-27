
package bankapplication.employee_window;

public class WithdrawPanle extends javax.swing.JInternalFrame {

    private com.bean.TransactionVar data=null;
    private int totalAmount=0;
    
    public WithdrawPanle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccNameLabel = new javax.swing.JLabel();
        txtAccountNum = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        AvailableLabel = new javax.swing.JLabel();
        txtAvailBal = new javax.swing.JTextField();
        WithdrawLabel = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        ViewName = new javax.swing.JLabel();
        TotalamtLabel = new javax.swing.JLabel();
        WithdrawBtn = new javax.swing.JButton();
        TotalBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        ViewPhone = new javax.swing.JLabel();
        ViewImg = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 224, 255));
        jPanel1.setLayout(null);

        AccNameLabel.setBackground(new java.awt.Color(153, 255, 153));
        AccNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AccNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccNameLabel.setText("Account Number");
        AccNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AccNameLabel.setOpaque(true);
        jPanel1.add(AccNameLabel);
        AccNameLabel.setBounds(70, 270, 190, 40);

        txtAccountNum.setFont(new java.awt.Font("Segoe UI Historic", 0, 17)); // NOI18N
        txtAccountNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountNum.setText("GPAxxxxx");
        txtAccountNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAccountNum.setOpaque(true);
        jPanel1.add(txtAccountNum);
        txtAccountNum.setBounds(270, 270, 250, 40);

        NameLabel.setBackground(new java.awt.Color(153, 255, 153));
        NameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Name");
        NameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NameLabel.setOpaque(true);
        jPanel1.add(NameLabel);
        NameLabel.setBounds(70, 370, 190, 40);

        PhoneLabel.setBackground(new java.awt.Color(153, 255, 153));
        PhoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PhoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneLabel.setText("Phone");
        PhoneLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PhoneLabel.setOpaque(true);
        jPanel1.add(PhoneLabel);
        PhoneLabel.setBounds(70, 420, 190, 40);

        AvailableLabel.setBackground(new java.awt.Color(153, 255, 153));
        AvailableLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AvailableLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvailableLabel.setText("Available Balance");
        AvailableLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AvailableLabel.setOpaque(true);
        jPanel1.add(AvailableLabel);
        AvailableLabel.setBounds(70, 470, 190, 40);

        txtAvailBal.setEditable(false);
        txtAvailBal.setFont(new java.awt.Font("Segoe UI Historic", 0, 17)); // NOI18N
        txtAvailBal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAvailBal.setText("_");
        txtAvailBal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAvailBal.setOpaque(true);
        jPanel1.add(txtAvailBal);
        txtAvailBal.setBounds(270, 470, 250, 40);

        WithdrawLabel.setBackground(new java.awt.Color(153, 255, 153));
        WithdrawLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WithdrawLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WithdrawLabel.setText("Amount Withdraw");
        WithdrawLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        WithdrawLabel.setOpaque(true);
        jPanel1.add(WithdrawLabel);
        WithdrawLabel.setBounds(70, 520, 190, 40);

        txtAmount.setFont(new java.awt.Font("Segoe UI Historic", 0, 17)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setText("_");
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAmount.setOpaque(true);
        jPanel1.add(txtAmount);
        txtAmount.setBounds(270, 520, 250, 40);

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Segoe UI Historic", 0, 17)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("_");
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotal.setOpaque(true);
        jPanel1.add(txtTotal);
        txtTotal.setBounds(620, 460, 170, 30);

        ViewName.setBackground(new java.awt.Color(153, 255, 153));
        ViewName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ViewName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewName.setText("_");
        ViewName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewName.setOpaque(true);
        jPanel1.add(ViewName);
        ViewName.setBounds(270, 370, 250, 40);

        TotalamtLabel.setBackground(new java.awt.Color(153, 255, 153));
        TotalamtLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TotalamtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalamtLabel.setText("Total Amount");
        TotalamtLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TotalamtLabel.setOpaque(true);
        jPanel1.add(TotalamtLabel);
        TotalamtLabel.setBounds(590, 400, 230, 40);

        WithdrawBtn.setBackground(new java.awt.Color(214, 215, 238));
        WithdrawBtn.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        WithdrawBtn.setText("Withdraw Money");
        WithdrawBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 2, true));
        WithdrawBtn.setOpaque(true);
        WithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawBtnActionPerformed(evt);
            }
        });
        jPanel1.add(WithdrawBtn);
        WithdrawBtn.setBounds(330, 590, 180, 30);

        TotalBtn.setBackground(new java.awt.Color(214, 215, 238));
        TotalBtn.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        TotalBtn.setText("Total");
        TotalBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 2, true));
        TotalBtn.setOpaque(true);
        TotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TotalBtn);
        TotalBtn.setBounds(530, 590, 120, 30);

        SearchBtn.setBackground(new java.awt.Color(214, 215, 238));
        SearchBtn.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 2, true));
        SearchBtn.setOpaque(true);
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBtn);
        SearchBtn.setBounds(560, 320, 110, 40);

        ViewPhone.setBackground(new java.awt.Color(153, 255, 153));
        ViewPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ViewPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewPhone.setText("_");
        ViewPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewPhone.setOpaque(true);
        jPanel1.add(ViewPhone);
        ViewPhone.setBounds(270, 420, 250, 40);

        ViewImg.setBackground(new java.awt.Color(204, 255, 204));
        ViewImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/withdrawmoney.jpg"))); // NOI18N
        ViewImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ViewImg.setOpaque(true);
        jPanel1.add(ViewImg);
        ViewImg.setBounds(190, 20, 560, 220);

        PasswordLabel.setBackground(new java.awt.Color(153, 255, 153));
        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Password");
        PasswordLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PasswordLabel.setOpaque(true);
        jPanel1.add(PasswordLabel);
        PasswordLabel.setBounds(70, 320, 190, 40);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPassword);
        txtPassword.setBounds(270, 320, 250, 40);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawBtnActionPerformed

        if(data!=null){
            if(txtAmount.getText().equals("_")||txtAmount.getText().equals("")||txtAmount.getText().equals(" ")){
                javax.swing.JOptionPane.showMessageDialog(this, "Enter Amount First Before Deposite !");

            }
            else{
                try{

                    data.setAccountNum(Integer.parseInt(txtAccountNum.getText().replace("GPA", "")));
                    data.setPassword(txtPassword.getText());
                    totalAmount = data.getAvailabelBal()-Integer.parseInt(txtAmount.getText());
                    data.setAmount(totalAmount);
                    
                    if(totalAmount>500){
                        if(com.dao.tarnsactiondao.AlterAmount(data)){
                            javax.swing.JOptionPane.showMessageDialog(this, "Amount Withdraw Successfully !");

                        }
                        else{
                            javax.swing.JOptionPane.showMessageDialog(this, "Amount Withdraw Fail ! !");

                        }
                        
                    }
                    else{
                        javax.swing.JOptionPane.showMessageDialog(this, "Do Not Sufficient Amount !");
                       }
                    
                    


                }
                catch(NumberFormatException e){
                    javax.swing.JOptionPane.showMessageDialog(this, "Please Enter Numaric Amount !");
                }

            }
            
            
            txtAmount.setText("500");
            txtAvailBal.setText("_");
            txtTotal.setText("_");
            ViewName.setText("_");
            ViewPhone.setText("_");
            txtPassword.setText("");
            txtAccountNum.setText("GPAxxxxx");
            
            
            
        }

    }//GEN-LAST:event_WithdrawBtnActionPerformed

    private void TotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBtnActionPerformed
        if(data!=null){
            try{

                totalAmount = data.getAvailabelBal()-Integer.parseInt(txtAmount.getText());
                txtTotal.setText(totalAmount+"/- Rs");
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(this, "Please enter Valied Number !");
            }
        
        }

    }//GEN-LAST:event_TotalBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed

        data = com.dao.tarnsactiondao.Search( Integer.parseInt(txtAccountNum.getText().replace("GPA", "")),txtPassword.getText());
        if(data!=null){

            ViewName.setText(data.getName());
            ViewPhone.setText(""+data.getPhone());
            txtAvailBal.setText(""+data.getAvailabelBal());
        }

    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNameLabel;
    private javax.swing.JLabel AvailableLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton TotalBtn;
    private javax.swing.JLabel TotalamtLabel;
    private javax.swing.JLabel ViewImg;
    private javax.swing.JLabel ViewName;
    private javax.swing.JLabel ViewPhone;
    private javax.swing.JButton WithdrawBtn;
    private javax.swing.JLabel WithdrawLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAccountNum;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAvailBal;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
