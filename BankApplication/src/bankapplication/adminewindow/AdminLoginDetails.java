
package bankapplication.adminewindow;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/*  **************************
    * @author : Devesh Patil *
    **************************      */

public class AdminLoginDetails extends javax.swing.JInternalFrame {

    Connection con = com.connector.Connetro.getConnectro();
    CallableStatement ps = null;
    public AdminLoginDetails() {
        initComponents();
        this.setDetails();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewPassword = new javax.swing.JLabel();
        totalC = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        ViewUsername = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UpdateRecords = new javax.swing.JButton();
        totalMoneyview = new javax.swing.JLabel();
        NameLabel1 = new javax.swing.JLabel();
        totalE = new javax.swing.JLabel();
        NameLabel2 = new javax.swing.JLabel();
        ViewUsername1 = new javax.swing.JLabel();
        UpdateLogin1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 255, 233));
        setOpaque(true);
        getContentPane().setLayout(null);

        ViewPassword.setBackground(new java.awt.Color(153, 255, 204));
        ViewPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewPassword.setText("Admin");
        ViewPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ViewPassword.setOpaque(true);
        getContentPane().add(ViewPassword);
        ViewPassword.setBounds(450, 90, 210, 40);

        totalC.setBackground(new java.awt.Color(153, 255, 204));
        totalC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalC.setText("-");
        totalC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        totalC.setOpaque(true);
        getContentPane().add(totalC);
        totalC.setBounds(640, 280, 210, 70);

        NameLabel.setBackground(new java.awt.Color(153, 255, 204));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Total Customer");
        NameLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        NameLabel.setOpaque(true);
        getContentPane().add(NameLabel);
        NameLabel.setBounds(640, 360, 210, 30);

        UsernameLabel.setBackground(new java.awt.Color(153, 255, 204));
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("UserName");
        UsernameLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UsernameLabel.setOpaque(true);
        getContentPane().add(UsernameLabel);
        UsernameLabel.setBounds(230, 40, 210, 40);

        ViewUsername.setBackground(new java.awt.Color(153, 255, 204));
        ViewUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewUsername.setText("Admin");
        ViewUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ViewUsername.setOpaque(true);
        getContentPane().add(ViewUsername);
        ViewUsername.setBounds(50, 30, 140, 170);

        PasswordLabel.setBackground(new java.awt.Color(153, 255, 204));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Password");
        PasswordLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PasswordLabel.setOpaque(true);
        getContentPane().add(PasswordLabel);
        PasswordLabel.setBounds(230, 90, 210, 40);

        UpdateRecords.setBackground(new java.awt.Color(222, 204, 255));
        UpdateRecords.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        UpdateRecords.setForeground(new java.awt.Color(102, 0, 102));
        UpdateRecords.setText("Update Records");
        UpdateRecords.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateRecordsActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateRecords);
        UpdateRecords.setBounds(650, 190, 160, 40);

        totalMoneyview.setBackground(new java.awt.Color(153, 255, 204));
        totalMoneyview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalMoneyview.setText("-");
        totalMoneyview.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        totalMoneyview.setOpaque(true);
        getContentPane().add(totalMoneyview);
        totalMoneyview.setBounds(150, 280, 210, 70);

        NameLabel1.setBackground(new java.awt.Color(153, 255, 204));
        NameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel1.setText("Total Money");
        NameLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        NameLabel1.setOpaque(true);
        getContentPane().add(NameLabel1);
        NameLabel1.setBounds(150, 360, 210, 30);

        totalE.setBackground(new java.awt.Color(153, 255, 204));
        totalE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalE.setText("-");
        totalE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        totalE.setOpaque(true);
        getContentPane().add(totalE);
        totalE.setBounds(400, 280, 210, 70);

        NameLabel2.setBackground(new java.awt.Color(153, 255, 204));
        NameLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel2.setText("Total Employee");
        NameLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        NameLabel2.setOpaque(true);
        getContentPane().add(NameLabel2);
        NameLabel2.setBounds(400, 360, 210, 30);

        ViewUsername1.setBackground(new java.awt.Color(153, 255, 204));
        ViewUsername1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewUsername1.setText("Admin");
        ViewUsername1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ViewUsername1.setOpaque(true);
        getContentPane().add(ViewUsername1);
        ViewUsername1.setBounds(450, 40, 210, 40);

        UpdateLogin1.setBackground(new java.awt.Color(222, 204, 255));
        UpdateLogin1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        UpdateLogin1.setForeground(new java.awt.Color(102, 0, 102));
        UpdateLogin1.setText("Update Log");
        UpdateLogin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateLogin1);
        UpdateLogin1.setBounds(470, 190, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRecordsActionPerformed
        this.setDetails();

    }//GEN-LAST:event_UpdateRecordsActionPerformed

    private void UpdateLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateLogin1ActionPerformed
    
    private void setDetails(){       
        try{
           ps = con.prepareCall("call bankdetails(?,?,?);");
           ps.execute();
//           System.out.println("\t"+ps.getInt(1)+"\t"+ps.getInt(2)+"\t"+ps.getInt(3));
           totalMoneyview.setText( ""+ps.getInt(3));
           totalC.setText( ""+ps.getInt(2));
           totalE.setText( ""+ps.getInt(1));
        }
        catch (SQLException e){
        e.printStackTrace();}
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel NameLabel2;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton UpdateLogin1;
    private javax.swing.JButton UpdateRecords;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel ViewPassword;
    private javax.swing.JLabel ViewUsername;
    private javax.swing.JLabel ViewUsername1;
    private javax.swing.JLabel totalC;
    private javax.swing.JLabel totalE;
    private javax.swing.JLabel totalMoneyview;
    // End of variables declaration//GEN-END:variables
}
