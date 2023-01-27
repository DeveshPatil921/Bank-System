
package bankapplication.adminewindow;

/*  **************************
    * @author : Devesh Patil *
    **************************     */

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Employee_Info extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model;
    com.bean.addempVar data = new com.bean.addempVar();
    updateEmployee oprt;
    
    public Employee_Info() {
        initComponents();
        EmpTable.setFont(new java.awt.Font("",java.awt.Font.PLAIN,12));
        addData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Panel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ReloadBtn = new javax.swing.JButton();
        tableArea = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();

        Panel1.setLayout(new java.awt.BorderLayout());

        TitleLabel.setBackground(new java.awt.Color(200, 220, 148));
        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Employee Details");
        TitleLabel.setOpaque(true);
        TitleLabel.setPreferredSize(new java.awt.Dimension(37, 46));
        Panel1.add(TitleLabel, java.awt.BorderLayout.PAGE_START);

        Panel2.setPreferredSize(new java.awt.Dimension(297, 60));
        Panel2.setLayout(new java.awt.GridBagLayout());

        UpdateBtn.setBackground(new java.awt.Color(153, 255, 204));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(0, 0, 102));
        UpdateBtn.setText("Update Details");
        UpdateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Panel2.add(UpdateBtn, gridBagConstraints);

        DeleteBtn.setBackground(new java.awt.Color(153, 255, 204));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(0, 0, 102));
        DeleteBtn.setText("Delete");
        DeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Panel2.add(DeleteBtn, gridBagConstraints);

        ReloadBtn.setBackground(new java.awt.Color(153, 255, 204));
        ReloadBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ReloadBtn.setForeground(new java.awt.Color(0, 0, 102));
        ReloadBtn.setText("Reload");
        ReloadBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ReloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Panel2.add(ReloadBtn, gridBagConstraints);

        Panel1.add(Panel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(Panel1, java.awt.BorderLayout.PAGE_START);

        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No", "Name", "Position", "Salary", "Phone", "Date of Birth", "Gender", "Address", "UserName", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableArea.setViewportView(EmpTable);

        getContentPane().add(tableArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
//        model = (DefaultTableModel)EmpTable.getModel();
        
        int r = EmpTable.getSelectedRow();
        if(r!=-1){
        data.setName(EmpTable.getValueAt(r, 1).toString());
        data.setPosition(EmpTable.getValueAt(r, 2).toString());
        data.setSalary(Integer.parseInt(EmpTable.getValueAt(r, 3).toString()));
        data.setPhone(Integer.parseInt(EmpTable.getValueAt(r, 4).toString()));
        data.setDob(EmpTable.getValueAt(r, 5).toString());
        data.setGender(EmpTable.getValueAt(r, 6).toString());
        data.setAddress(EmpTable.getValueAt(r, 7).toString());
        data.setUsername(EmpTable.getValueAt(r, 8).toString());
        data.setPassword(EmpTable.getValueAt(r, 9).toString());
        
        oprt = new updateEmployee(data);
        oprt.setVisible(true);
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "please select the row first !");
        }
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
    int r = EmpTable.getSelectedRow();
    if(r!=-1){
    int rs = javax.swing.JOptionPane.showConfirmDialog(null, "Are you shure you want to delet this Employee!", "Delet The Details",javax.swing.JOptionPane.YES_NO_OPTION);
         if(rs==0){
            try {
            
                Connection con = com.connector.Connetro.getConnectro();
    //            `employee_recorde`
                PreparedStatement ps = con.prepareStatement("delete from `employee_recorde` WHERE  Username = ? && password = ? ");


                ps.setString(1,EmpTable.getValueAt(r, 8).toString());
                ps.setString(2,EmpTable.getValueAt(r, 9).toString());
                r = ps.executeUpdate();
                if(r==1)
                    javax.swing.JOptionPane.showMessageDialog(this, "Employee details Deleted Successfully !");
               
            
            
                } catch (SQLException ex) {     ex.printStackTrace();       }
            }
        }
    else{
            javax.swing.JOptionPane.showMessageDialog(null, "please select the row first !");
        }
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ReloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadBtnActionPerformed
        
        for(int i = EmpTable.getRowCount()-1;i>=0;i--){
            model.removeRow(i);
        }
        addData();
    }//GEN-LAST:event_ReloadBtnActionPerformed

    public void addData(){
        con = com.connector.Connetro.getConnectro();
        model = (DefaultTableModel)EmpTable.getModel();
        
        try {
            
            ps = con.prepareStatement("SELECT * FROM employee_recorde");           
            rs = ps.executeQuery();
            int i=1;
            
            while(rs.next()){
                
                model.addRow(new Object[]{i,rs.getString(2),rs.getString(4),rs.getInt(5),rs.getInt(3),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10) });                               
                i++;
            }
        } 
        catch (SQLException ex) { ex.printStackTrace();       }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTable EmpTable;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton ReloadBtn;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JScrollPane tableArea;
    // End of variables declaration//GEN-END:variables
}
