/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui.EmployeePanels;

import ControlClasses.Apparel;
import ControlClasses.Bill;
import DatabaseManager.DatabaseManager;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omar waheed
 */
public class NewBill extends javax.swing.JPanel {

   DatabaseManager d;
   Bill b;
   DefaultTableModel model ;
    public NewBill() {
        initComponents();
        d=new DatabaseManager();
        b=new Bill();
       model = (DefaultTableModel) jTable1.getModel();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CustomernameTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        DateTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ApparelStockIdTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ApparelQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddApparelll = new javax.swing.JButton();
        Removeapparel = new javax.swing.JButton();
        PrintBill = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TotalTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Customer Name");

        jLabel2.setText("Phone Number");

        jLabel3.setText("Email");

        jLabel4.setText("Date");

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Stock Id");

        jLabel6.setText("Qunatity");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apparel Name", "Price Per Item", "Quantity", "Stock ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        AddApparelll.setText("Add Apparel");
        AddApparelll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddApparelllActionPerformed(evt);
            }
        });

        Removeapparel.setText("Remove Apparel");
        Removeapparel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveapparelActionPerformed(evt);
            }
        });

        PrintBill.setText("Print");
        PrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBillActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/images/icons8_Cash_in_Hand_96px.png"))); // NOI18N

        jLabel7.setText("Total");

        TotalTextField.setEditable(false);
        TotalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Collect Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(PrintBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Removeapparel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TotalTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(ApparelStockIdTextField))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(AddApparelll, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(0, 93, Short.MAX_VALUE))
                                    .addComponent(ApparelQuantity))))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CustomernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(phoneNumberTextField)
                                    .addComponent(EmailTextField)
                                    .addComponent(DateTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CustomernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ApparelStockIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ApparelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Removeapparel)
                    .addComponent(AddApparelll))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(21, 21, 21)
                .addComponent(PrintBill)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveapparelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveapparelActionPerformed
                        if(((int)jTable1.getValueAt(jTable1.getSelectedRow(),jTable1.getSelectedColumn())-Integer.parseInt(ApparelQuantity.getText()))>0)
                        {  UpdateTable();
                            b.RemoveApparelFromBill(d.getApparelPrice(Integer.parseInt(ApparelStockIdTextField.getText())), Integer.parseInt(ApparelQuantity.getText()), Integer.parseInt(ApparelStockIdTextField.getText()));
                        }
                        else
                        {  
                            b.RemoveApparelFromBill(d.getApparelPrice(Integer.parseInt(ApparelStockIdTextField.getText())), Integer.parseInt(ApparelQuantity.getText()), Integer.parseInt(ApparelStockIdTextField.getText()));
                            RemoveRowsFromjTable();
                        }
    }//GEN-LAST:event_RemoveapparelActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void AddApparelllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddApparelllActionPerformed
        AddRowsTojTable();
        b.AddapparelToBill(d.getApparelPrice(Integer.parseInt(ApparelStockIdTextField.getText())),Integer.parseInt(ApparelQuantity.getText()),Integer.parseInt(ApparelStockIdTextField.getText()));
    }//GEN-LAST:event_AddApparelllActionPerformed

    private void TotalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      TotalTextField.setText(""+b.getTotal());
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBillActionPerformed
      b.BillEdit(CustomernameTextField.getText(),EmailTextField.getText(),Integer.parseInt(phoneNumberTextField.getText()),DateTextField.getText());
      int i=jTable1.getRowCount();
      String [] Array=new String[i];
        for (int j = 0; j <i; j++) {
        Array [j]=" ";
        }
      
        for (int j = 0; j <i; j++) {
            for (int k = 0; k <4; k++) {
                Array[j]+="   "+jTable1.getValueAt(j, k)+"           ";
            }
        }
      b.AddNewBill(Array);
    }//GEN-LAST:event_PrintBillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddApparelll;
    private javax.swing.JTextField ApparelQuantity;
    private javax.swing.JTextField ApparelStockIdTextField;
    private javax.swing.JTextField CustomernameTextField;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton PrintBill;
    private javax.swing.JButton Removeapparel;
    private javax.swing.JTextField TotalTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phoneNumberTextField;
    // End of variables declaration//GEN-END:variables
public void AddRowsTojTable() {
        
              
               model.addRow(d.getApparelData(Integer.parseInt(ApparelStockIdTextField.getText()),Integer.parseInt(ApparelQuantity.getText())));
                       
            
        
}
public void RemoveRowsFromjTable() {
    
    model.removeRow(jTable1.getSelectedRow());
        
    }
public void UpdateTable(){

    jTable1.setValueAt(((int)jTable1.getValueAt(jTable1.getSelectedRow(),jTable1.getSelectedColumn())-Integer.parseInt(ApparelQuantity.getText())),jTable1.getSelectedRow(),jTable1.getSelectedColumn());


}
    
           
                       
            
        

 public void ResetTable()
 {
       
       while (model.getRowCount()>0)
       {
           for(int r=0;r<model.getRowCount();r++)
            {
                   model.removeRow(r);
            }
       }
     
       
 
 }
}
