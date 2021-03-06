/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author spsither
 */
public class Edit extends javax.swing.JFrame {
    long id;
    HashMap invalidMessage = new HashMap();
    Home home;
    /**
     * Creates new form Insert
     * @param id
     */
    
    /**
     * Creates new form Insert
     * @param id
     * @param home
     */
    public Edit(long id,Home home) {
        initComponents();
        this.id = id;
        this.home = home;
        fillValues();
        invalidMessage.put(0, "Enter name");
        invalidMessage.put(1, "Enter address line 1");
        invalidMessage.put(2, "Enter City");
        invalidMessage.put(3, "Enter State");
        invalidMessage.put(4, "Enter valid pin, pin value must be numaric");
        invalidMessage.put(5, "Select a Country");
        invalidMessage.put(6, "Enter a Expiry Date");
        invalidMessage.put(7, "Enter a valid number of copy");
    }
    
    public Edit(){
    initComponents();
    //
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        address1TF = new javax.swing.JTextField();
        address2TF = new javax.swing.JTextField();
        address3TF = new javax.swing.JTextField();
        address4TF = new javax.swing.JTextField();
        cityTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        stateTF = new javax.swing.JTextField();
        billRB = new javax.swing.JRadioButton();
        compRB = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        countriesCB = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        noOfCopyTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        expDateDC = new com.toedter.calendar.JDateChooser();
        editBT = new javax.swing.JButton();
        pinTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        errorLB = new javax.swing.JLabel();
        cancelBT = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("name");

        jLabel2.setText("address line 1");

        jLabel3.setText("address line 2");

        jLabel4.setText("address line 3");

        jLabel5.setText("address line 4");

        jLabel6.setText("city");

        nameTF.setNextFocusableComponent(address1TF);

        address1TF.setNextFocusableComponent(address2TF);

        address2TF.setNextFocusableComponent(address3TF);

        address3TF.setNextFocusableComponent(address4TF);

        address4TF.setNextFocusableComponent(cityTF);

        cityTF.setNextFocusableComponent(stateTF);

        jLabel7.setText("state");

        stateTF.setNextFocusableComponent(pinTF);

        buttonGroup1.add(billRB);
        billRB.setSelected(true);
        billRB.setText("BILL");
        billRB.setNextFocusableComponent(noOfCopyTF);
        billRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(compRB);
        compRB.setText("COMP");
        compRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compRBActionPerformed(evt);
            }
        });

        jLabel8.setText("country");

        countriesCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select-", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Republic of the", "Congo, Democratic Republic of the", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "St. Kitts and Nevis", "St. Lucia", "St. Vincent and The Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Tibet", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom (UK)", "United States of America (USA)", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City (Holy See)", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        countriesCB.setNextFocusableComponent(billRB);

        jLabel9.setText("number of copy");

        noOfCopyTF.setText("1");
        noOfCopyTF.setNextFocusableComponent(expDateDC);

        jLabel10.setText("expiry date");

        expDateDC.setNextFocusableComponent(editBT);

        editBT.setText("EDIT");
        editBT.setNextFocusableComponent(cancelBT);
        editBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTActionPerformed(evt);
            }
        });

        pinTF.setNextFocusableComponent(countriesCB);

        jLabel11.setText("pin");

        errorLB.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        errorLB.setForeground(new java.awt.Color(255, 51, 51));

        cancelBT.setText("cancel");
        cancelBT.setNextFocusableComponent(nameTF);
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("* Required fields");

        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*");

        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(address2TF, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                            .addComponent(address1TF)
                                            .addComponent(address3TF)
                                            .addComponent(address4TF)
                                            .addComponent(cityTF))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(stateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel17)))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(billRB)
                                                .addGap(18, 18, 18)
                                                .addComponent(compRB))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel10))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(noOfCopyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel19))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(expDateDC, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel20))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(editBT)
                                                .addGap(18, 18, 18)
                                                .addComponent(cancelBT)))
                                        .addGap(46, 46, 46))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(pinTF, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(countriesCB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(340, 340, 340)))
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(address1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(address2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(address3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(noOfCopyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(billRB)
                                    .addComponent(compRB))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(expDateDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editBT)
                            .addComponent(cancelBT))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(stateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addComponent(errorLB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(countriesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    private void editBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTActionPerformed
    
        
       /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        if(expDateDC.getDate() != null){
        String dt = sdf.format(expDateDC.getDate());
        JOptionPane.showMessageDialog(rootPane, dt);
        }
        */
        
     Customer cus = new Customer();
    Boolean [] valid;
        valid = new Boolean[8];
    valid[0] = cus.setName(nameTF.getText().trim());
    valid[1] = cus.setAddressLine1(address1TF.getText().trim());
    cus.setAddressLine2(address2TF.getText().trim());
    cus.setAddressLine3(address3TF.getText().trim());
    cus.setAddressLine4(address4TF.getText().trim());
    valid[2] = cus.setCity(cityTF.getText().trim());
    valid[3] = cus.setState(stateTF.getText().trim());
    valid[4] = cus.setPin(pinTF.getText().trim());
    valid[5] = cus.setCountry((String)countriesCB.getSelectedItem());
    if(billRB.isSelected()){
        cus.setBillOrComp("BILL");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        if(expDateDC.getDate() != null){
            String dt = sdf.format(expDateDC.getDate());
            valid[6] =  cus.setExpDate(dt);
         
        }
        else{
            valid[6] = false;
        }
    }
    else{
        cus.setBillOrComp("COMP");
        
        valid[6] = true;
    }
    
    valid[7] = cus.setNoOfCopy(noOfCopyTF.getText().trim());
        
       
       if(validate(valid)){
            DBConnector con = new DBConnector();
            if(con.edit(cus,id)){
                JOptionPane.showMessageDialog(rootPane, "EDITED\n"+cus);
                home.load();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Edit failed", "Error", JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
            con.close();
       }
       
           
        
        
        
    }//GEN-LAST:event_editBTActionPerformed

    private void compRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compRBActionPerformed
    expDateDC.setEnabled(false);    
    jLabel20.setVisible(false);
    }//GEN-LAST:event_compRBActionPerformed

    private void billRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billRBActionPerformed
    expDateDC.setEnabled(true);
    jLabel20.setVisible(true);
    }//GEN-LAST:event_billRBActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
    this.dispose();
    }//GEN-LAST:event_cancelBTActionPerformed

     void clear(){
        nameTF.setText("");
        address1TF.setText("");
        address2TF.setText("");
        address3TF.setText("");
        address4TF.setText("");
        cityTF.setText("");
        stateTF.setText("");
        pinTF.setText("");
        countriesCB.setSelectedIndex(0);
        billRB.setSelected(true);
        noOfCopyTF.setText("1");
        expDateDC.setCalendar(null);
                
    }
     
      Boolean validate(Boolean [] val){
        
        for(int i = 0 ; i < val.length; i++){
            if(!val[i]){
                errorLB.setText((String) invalidMessage.get(i));
                return false;
            }
        }
        
        errorLB.setText("");
        return true;
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address1TF;
    private javax.swing.JTextField address2TF;
    private javax.swing.JTextField address3TF;
    private javax.swing.JTextField address4TF;
    private javax.swing.JRadioButton billRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBT;
    private javax.swing.JTextField cityTF;
    private javax.swing.JRadioButton compRB;
    private javax.swing.JComboBox countriesCB;
    private javax.swing.JButton editBT;
    private javax.swing.JLabel errorLB;
    private com.toedter.calendar.JDateChooser expDateDC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField noOfCopyTF;
    private javax.swing.JTextField pinTF;
    private javax.swing.JTextField stateTF;
    // End of variables declaration//GEN-END:variables

    private void fillValues() {
        try {
            DBConnector con = new DBConnector();
            con.selectQuery(id);
            if(con.rs.next()){
//select Name, AddressLine1, AddressLine2, AddressLine3, AddressLine4, City,State ,Pin, Country, ExpDate, NoOfCopy, BillOrComp from customer where id =?;");
            nameTF.setText(con.rs.getString("Name"));
            address1TF.setText(con.rs.getString("AddressLine1"));
            address2TF.setText(con.rs.getString("AddressLine2"));
            address3TF.setText(con.rs.getString("AddressLine3"));
            address4TF.setText(con.rs.getString("AddressLine4"));
            cityTF.setText(con.rs.getString("City"));
            stateTF.setText(con.rs.getString("State"));
            pinTF.setText(""+con.rs.getInt("Pin"));
            countriesCB.setSelectedItem(con.rs.getString("Country"));
            noOfCopyTF.setText(""+con.rs.getInt("NoOfCopy"));
            if(con.rs.getString("BillOrComp").equals("COMP")){
                compRB.setSelected(true);
            }
            if( con.rs.getString("ExpDate") != null && !con.rs.getString("ExpDate").isEmpty() ){
            expDateDC.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(con.rs.getString("ExpDate")));
            }
            }
            else {
                throw new SQLException();
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
