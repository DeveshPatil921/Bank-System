
package bankapplication;


/****************************************
 *       @author : Devesh Patil         *
 ****************************************/
public class MainWindow extends javax.swing.JFrame {
    
    private bankapplication.employee_window.Employee_Window employeewindow ;
    private bankapplication.adminewindow.AdmineWindow adminwindow ;
    private String msg ="                GPA Bank \n"
            + "\tThis Bank Applicating is part of our project of Advance Java."
            + "\nLorem ipsum  dolor  sit amet,  consectetur  adipisicing  elit."
            + "\nExplicabo  veniam  dignissimos  recusandae  laudantium  nulla "
            + "\nincidunt dolorum, cumque  dolores  omnis  voluptates  nostrum "
            + "\ntempore,   sed  reiciendis  architecto  veritatis  asperiores "
            + "\nexcepturi vitae totam quo  mollitia, aliquam  vel  laboriosam "
            + "\nEnim veritatis ipsa  odit, temporibus ullam dolorum? Sapiente "
            + "\nquam nam unde quisquam, reprehenderit minus? Quas consectetur,"
            + "\ndolor natus numquam est laborum!"
            
            + "\n\n           Developer Team\n" 
            + "\n\t Project Manager     : Omkar Shelke"
            + "\n\t System Developer    : Devesh Patil"
            + "\n\t Software Tester     : kishtij Hadke"
            + "\n\t Backend Developer   : Munnawar Miyan"
            + "\n\t UI Designer         : Karan Rathod"
            + "\n\t Co-Ordinater        : Yash Gugae";

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_MW = new javax.swing.JPanel();
        Floater_MW = new javax.swing.JPanel();
        LeftMenu_MW = new javax.swing.JPanel();
        RightMenu_MW = new javax.swing.JPanel();
        MultiWindow_MW = new javax.swing.JDesktopPane();
        TitleLabel = new javax.swing.JLabel();
        ViewImgPanel = new javax.swing.JPanel();
        Banklogo = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        UsernameBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPasswordField();
        PasswordView = new javax.swing.JCheckBox();
        btnLogni = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(1000, 750));

        Header_MW.setBackground(new java.awt.Color(181, 230, 29));
        Header_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Header_MW.setPreferredSize(new java.awt.Dimension(120, 37));

        javax.swing.GroupLayout Header_MWLayout = new javax.swing.GroupLayout(Header_MW);
        Header_MW.setLayout(Header_MWLayout);
        Header_MWLayout.setHorizontalGroup(
            Header_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Header_MWLayout.setVerticalGroup(
            Header_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(Header_MW, java.awt.BorderLayout.PAGE_START);

        Floater_MW.setBackground(new java.awt.Color(181, 230, 29));
        Floater_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Floater_MW.setPreferredSize(new java.awt.Dimension(120, 37));

        javax.swing.GroupLayout Floater_MWLayout = new javax.swing.GroupLayout(Floater_MW);
        Floater_MW.setLayout(Floater_MWLayout);
        Floater_MWLayout.setHorizontalGroup(
            Floater_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Floater_MWLayout.setVerticalGroup(
            Floater_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(Floater_MW, java.awt.BorderLayout.PAGE_END);

        LeftMenu_MW.setBackground(new java.awt.Color(222, 255, 201));
        LeftMenu_MW.setPreferredSize(new java.awt.Dimension(150, 70));

        javax.swing.GroupLayout LeftMenu_MWLayout = new javax.swing.GroupLayout(LeftMenu_MW);
        LeftMenu_MW.setLayout(LeftMenu_MWLayout);
        LeftMenu_MWLayout.setHorizontalGroup(
            LeftMenu_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LeftMenu_MWLayout.setVerticalGroup(
            LeftMenu_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(LeftMenu_MW, java.awt.BorderLayout.WEST);

        RightMenu_MW.setBackground(new java.awt.Color(222, 255, 201));
        RightMenu_MW.setPreferredSize(new java.awt.Dimension(150, 70));

        javax.swing.GroupLayout RightMenu_MWLayout = new javax.swing.GroupLayout(RightMenu_MW);
        RightMenu_MW.setLayout(RightMenu_MWLayout);
        RightMenu_MWLayout.setHorizontalGroup(
            RightMenu_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RightMenu_MWLayout.setVerticalGroup(
            RightMenu_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(RightMenu_MW, java.awt.BorderLayout.EAST);

        MultiWindow_MW.setBackground(new java.awt.Color(222, 255, 174));
        MultiWindow_MW.setName(""); // NOI18N
        MultiWindow_MW.setNextFocusableComponent(MultiWindow_MW);
        MultiWindow_MW.setLayout(new java.awt.BorderLayout());

        TitleLabel.setBackground(new java.awt.Color(222, 255, 201));
        TitleLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("GPA Bank");
        TitleLabel.setOpaque(true);
        TitleLabel.setPreferredSize(new java.awt.Dimension(38, 40));
        MultiWindow_MW.add(TitleLabel, java.awt.BorderLayout.PAGE_START);

        ViewImgPanel.setBackground(new java.awt.Color(222, 255, 201));
        ViewImgPanel.setLayout(new java.awt.GridBagLayout());

        Banklogo.setBackground(new java.awt.Color(255, 204, 153));
        Banklogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Banklogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bankmain.png"))); // NOI18N
        Banklogo.setText("GPA Bank");
        Banklogo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Banklogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Banklogo.setMaximumSize(new java.awt.Dimension(700, 300));
        Banklogo.setMinimumSize(new java.awt.Dimension(700, 300));
        Banklogo.setOpaque(true);
        Banklogo.setPreferredSize(new java.awt.Dimension(710, 300));
        ViewImgPanel.add(Banklogo, new java.awt.GridBagConstraints());

        MultiWindow_MW.add(ViewImgPanel, java.awt.BorderLayout.CENTER);

        ButtonPanel.setBackground(new java.awt.Color(222, 255, 201));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(898, 250));
        ButtonPanel.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel7.setText("User Name : ");
        ButtonPanel.add(jLabel7);
        jLabel7.setBounds(290, 20, 120, 40);

        UsernameBox.setBackground(new java.awt.Color(222, 255, 201));
        UsernameBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsernameBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        UsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBoxActionPerformed(evt);
            }
        });
        ButtonPanel.add(UsernameBox);
        UsernameBox.setBounds(410, 20, 200, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel8.setText("Password :");
        ButtonPanel.add(jLabel8);
        jLabel8.setBounds(290, 70, 120, 40);

        PasswordBox.setBackground(new java.awt.Color(222, 255, 201));
        PasswordBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        ButtonPanel.add(PasswordBox);
        PasswordBox.setBounds(410, 70, 200, 30);

        PasswordView.setBackground(new java.awt.Color(222, 255, 201));
        PasswordView.setText("Visiable Password");
        PasswordView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordViewActionPerformed(evt);
            }
        });
        ButtonPanel.add(PasswordView);
        PasswordView.setBounds(320, 120, 160, 30);

        btnLogni.setBackground(new java.awt.Color(113, 94, 203));
        btnLogni.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        btnLogni.setText("Login");
        btnLogni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(0, 51, 153), new java.awt.Color(153, 255, 204), new java.awt.Color(0, 51, 153)));
        btnLogni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogni.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnLogni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogniActionPerformed(evt);
            }
        });
        ButtonPanel.add(btnLogni);
        btnLogni.setBounds(310, 170, 120, 30);

        btnCancle.setBackground(new java.awt.Color(113, 94, 203));
        btnCancle.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        btnCancle.setText("Cancle");
        btnCancle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(0, 51, 153), new java.awt.Color(153, 255, 204), new java.awt.Color(0, 51, 153)));
        btnCancle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        ButtonPanel.add(btnCancle);
        btnCancle.setBounds(460, 170, 120, 30);

        MultiWindow_MW.add(ButtonPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(MultiWindow_MW, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBoxActionPerformed

    }//GEN-LAST:event_UsernameBoxActionPerformed

    private void PasswordViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordViewActionPerformed
        if(PasswordView.isSelected()){
            PasswordBox.setEchoChar((char)0);
        }
        else{
            PasswordBox.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_PasswordViewActionPerformed

    private void btnLogniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogniActionPerformed
        if (UsernameBox.getText().equals("Admin")&&PasswordBox.getText().equals("Admin")){
            
            this.dispose();
            javax.swing.JOptionPane.showMessageDialog(null, "Login Successfully ");
            try {   Thread.sleep(900);      }
            catch (InterruptedException ex) { ex.printStackTrace();   }
            
            adminwindow = new bankapplication.adminewindow.AdmineWindow();
            adminwindow.setVisible(true);
        }
        else if (com.dao.LoginVarify.VarifyEmp(UsernameBox.getText(), PasswordBox.getText()) ){
            javax.swing.JOptionPane.showMessageDialog(null, "Login Successfully ");
            try {   Thread.sleep(900);  }
            catch (InterruptedException ex) {     ex.printStackTrace();   }
            
            employeewindow = new bankapplication.employee_window.Employee_Window();
            employeewindow.setVisible(true);
            
            this.dispose();
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter Correct UserName and Password");

        }
    }//GEN-LAST:event_btnLogniActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancleActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            
                new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banklogo;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel Floater_MW;
    private javax.swing.JPanel Header_MW;
    private javax.swing.JPanel LeftMenu_MW;
    private javax.swing.JDesktopPane MultiWindow_MW;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JCheckBox PasswordView;
    private javax.swing.JPanel RightMenu_MW;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField UsernameBox;
    private javax.swing.JPanel ViewImgPanel;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnLogni;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
