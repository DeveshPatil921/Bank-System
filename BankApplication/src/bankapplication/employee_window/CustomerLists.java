
package bankapplication.employee_window;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


/*
 * @author patil
 */
public class CustomerLists extends javax.swing.JInternalFrame {

    private com.bean.AddCustVar data;
    private Update_User updatewindo;
    private DefaultTableModel model;
    
    
    public CustomerLists() {
        initComponents();
        setDatatoTable();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLable = new javax.swing.JLabel();
        ButtonPanle = new javax.swing.JPanel();
        UpdateCustBtn = new javax.swing.JButton();
        DeleteCustBtn = new javax.swing.JButton();
        Reload = new javax.swing.JButton();
        TableScrollPane = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();

        TitlePanel.setLayout(new java.awt.BorderLayout());

        TitleLable.setBackground(new java.awt.Color(204, 255, 204));
        TitleLable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLable.setText("All Customers");
        TitleLable.setOpaque(true);
        TitleLable.setPreferredSize(new java.awt.Dimension(37, 46));
        TitlePanel.add(TitleLable, java.awt.BorderLayout.PAGE_START);

        ButtonPanle.setBackground(new java.awt.Color(204, 255, 204));
        ButtonPanle.setPreferredSize(new java.awt.Dimension(297, 60));

        UpdateCustBtn.setBackground(new java.awt.Color(153, 255, 204));
        UpdateCustBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UpdateCustBtn.setForeground(new java.awt.Color(0, 0, 153));
        UpdateCustBtn.setText("Update Details");
        UpdateCustBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UpdateCustBtn.setInheritsPopupMenu(true);
        UpdateCustBtn.setPreferredSize(new java.awt.Dimension(120, 25));
        UpdateCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(UpdateCustBtn);

        DeleteCustBtn.setBackground(new java.awt.Color(153, 255, 204));
        DeleteCustBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeleteCustBtn.setForeground(new java.awt.Color(0, 0, 153));
        DeleteCustBtn.setText("Delete");
        DeleteCustBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        DeleteCustBtn.setInheritsPopupMenu(true);
        DeleteCustBtn.setPreferredSize(new java.awt.Dimension(120, 25));
        DeleteCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(DeleteCustBtn);

        Reload.setBackground(new java.awt.Color(153, 255, 204));
        Reload.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Reload.setForeground(new java.awt.Color(0, 0, 153));
        Reload.setText("Reload");
        Reload.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Reload.setInheritsPopupMenu(true);
        Reload.setPreferredSize(new java.awt.Dimension(120, 25));
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });
        ButtonPanle.add(Reload);

        TitlePanel.add(ButtonPanle, java.awt.BorderLayout.CENTER);

        getContentPane().add(TitlePanel, java.awt.BorderLayout.PAGE_START);

        CustTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CustTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "Account Number", "Amount", "Name", "Phone", "Date of Birth", "Gender", "Address", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableScrollPane.setViewportView(CustTable);
        if (CustTable.getColumnModel().getColumnCount() > 0) {
            CustTable.getColumnModel().getColumn(1).setResizable(false);
            CustTable.getColumnModel().getColumn(3).setResizable(false);
            CustTable.getColumnModel().getColumn(8).setResizable(false);
        }

        getContentPane().add(TableScrollPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setDatatoTable(){
            Connection con = com.connector.Connetro.getConnectro();
            model = (DefaultTableModel)CustTable.getModel();
        try {
            
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM customer_recorde");           
            ResultSet rs = ps.executeQuery();
            int i=1;
            
            while(rs.next()){
                model.addRow(new Object[]{i,"GPA"+rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(6),rs.getString(7),rs.getString(5),rs.getString(8) });                               
                i=i+1;
            }
                    
        rs.close();
        ps.close();
        con.close();
        } 
        catch (SQLException ex) { ex.printStackTrace();       }
    
    }
    
    private void UpdateCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustBtnActionPerformed
        if(CustTable.getSelectedRow()==-1){
            javax.swing.JOptionPane.showMessageDialog(this, "Please Select The Row First !");
        }
        else{
            data = new com.bean.AddCustVar();

            int r = CustTable.getSelectedRow();

            data.setUsername(Integer.parseInt(CustTable.getValueAt(r, 1).toString().replace("GPA", "")));
            data.setAmount(Integer.parseInt(CustTable.getValueAt(r, 2).toString()));
            data.setName(CustTable.getValueAt(r, 3).toString());
            data.setPhone(Integer.parseInt(CustTable.getValueAt(r, 4).toString()));
            data.setDOB(CustTable.getValueAt(r, 5).toString());
            data.setGender(CustTable.getValueAt(r, 6).toString());
            data.setAddress(CustTable.getValueAt(r, 7).toString());
            data.setPassword(CustTable.getValueAt(r, 8).toString());

            updatewindo = new Update_User(data);
            updatewindo.setVisible(true);
        
        }
    }//GEN-LAST:event_UpdateCustBtnActionPerformed

    private void DeleteCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustBtnActionPerformed
        if(CustTable.getSelectedRow()==-1){
            javax.swing.JOptionPane.showMessageDialog(this, "Please Select The Row First !");
        }
        else{
            int rs = javax.swing.JOptionPane.showConfirmDialog(null, "Are you shure you want to delet this user!", "Delet The Details",javax.swing.JOptionPane.YES_NO_OPTION);
                if(rs==0){

                    try {
                        Connection con = com.connector.Connetro.getConnectro();

                        PreparedStatement ps = con.prepareStatement("delete from customer_recorde WHERE   AccountNumber = ? && password = ? ");

                        int r = CustTable.getSelectedRow();

                        ps.setInt(1,Integer.parseInt(CustTable.getValueAt(r, 1).toString().replace("GPA", "")));
                        ps.setString(2,CustTable.getValueAt(r, 8).toString());
                        r = ps.executeUpdate();

                        if(r==1)
                            javax.swing.JOptionPane.showMessageDialog(this, "Employee deleted Successfully !");

                        ps.close();
                        con.close();

                    } catch (SQLException ex) {     ex.printStackTrace();       }
                }
        }
        
    }//GEN-LAST:event_DeleteCustBtnActionPerformed

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
        for(int i = CustTable.getRowCount()-1;i>=0;i--){
            model.removeRow(i);
        }
        this.setDatatoTable();

    }//GEN-LAST:event_ReloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanle;
    private javax.swing.JTable CustTable;
    private javax.swing.JButton DeleteCustBtn;
    private javax.swing.JButton Reload;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel TitleLable;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton UpdateCustBtn;
    // End of variables declaration//GEN-END:variables
}
