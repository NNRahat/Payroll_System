/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps_design;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class insert extends javax.swing.JFrame {

    /**
     * Creates new form insert
     */
    Connection conn=null;
    Statement stmt = null;
    ResultSet rs = null;
    public insert() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        email_l = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        phone_l = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        nametxt = new javax.swing.JTextField();
        Name_l = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        Sector_l = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        Salary_l = new javax.swing.JLabel();
        sectortxt = new javax.swing.JTextField();
        Gender_l = new javax.swing.JLabel();
        salarytxt = new javax.swing.JTextField();
        Address_l = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        genderdropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        paymentBar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert");
        setLocation(new java.awt.Point(600, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        email_l.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email_l.setForeground(new java.awt.Color(255, 255, 255));
        email_l.setText("Email");

        phone_l.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phone_l.setForeground(new java.awt.Color(255, 255, 255));
        phone_l.setText("Phone");

        Save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(51, 0, 102));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(51, 0, 102));
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Name_l.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Name_l.setForeground(new java.awt.Color(255, 255, 255));
        Name_l.setText("Name");

        Sector_l.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Sector_l.setForeground(new java.awt.Color(255, 255, 255));
        Sector_l.setText("Sector");

        Salary_l.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Salary_l.setForeground(new java.awt.Color(255, 255, 255));
        Salary_l.setText("Salary");

        Gender_l.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Gender_l.setForeground(new java.awt.Color(255, 255, 255));
        Gender_l.setText("Gender");

        Address_l.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Address_l.setForeground(new java.awt.Color(255, 255, 255));
        Address_l.setText("Address");

        genderdropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderdropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderdropdownActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payment");

        paymentBar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Not paid" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender_l)
                    .addComponent(phone_l)
                    .addComponent(Name_l)
                    .addComponent(Sector_l)
                    .addComponent(Salary_l)
                    .addComponent(Address_l)
                    .addComponent(email_l)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(phonetxt)
                    .addComponent(emailtxt)
                    .addComponent(genderdropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sectortxt)
                    .addComponent(salarytxt)
                    .addComponent(nametxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addresstxt)
                    .addComponent(idtxt)
                    .addComponent(paymentBar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_l)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sector_l)
                    .addComponent(sectortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salary_l)
                    .addComponent(salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender_l)
                    .addComponent(genderdropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address_l)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_l)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_l)
                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(paymentBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        String id = idtxt.getText();
        String name = nametxt.getText();
        String sector = sectortxt.getText();
        String salary = salarytxt.getText();
        String gender = (String) genderdropdown.getSelectedItem();
        String address = addresstxt.getText();
        String email = emailtxt.getText();
        String phone = phonetxt.getText();
        String payment = (String) paymentBar.getSelectedItem();

        String sql = "INSERT INTO employee(ID,Name, Sector, Salary, Gender, Address, Email,Phone,Payment) VALUES('"+id+"','"+name+"','"+sector+"','"+salary+"','"+gender+"','"+address+"','"+email+"','"+phone+"','"+payment+"')";
        try {

            stmt = conn.createStatement();

            if(stmt.executeUpdate(sql) == 1){

                JOptionPane.showMessageDialog(null,"Inserted successfully!!","INSERT",JOptionPane.INFORMATION_MESSAGE);
                idtxt.setText("");
                nametxt.setText("");
                sectortxt.setText("");
                salarytxt.setText("");
                addresstxt.setText("");
                emailtxt.setText("");
                phonetxt.setText("");

            } else {
                JOptionPane.showMessageDialog(null,"Opps!! Something went wrong","INSERT",JOptionPane.WARNING_MESSAGE);
            }

        } catch(Exception ex) {
            System.out.println("Error: "+ex);
        }

    }//GEN-LAST:event_SaveActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        new List().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void genderdropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderdropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderdropdownActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         conn = DBConnect.DBConnect();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_l;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Gender_l;
    private javax.swing.JLabel Name_l;
    private javax.swing.JLabel Salary_l;
    private javax.swing.JButton Save;
    private javax.swing.JLabel Sector_l;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel email_l;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JComboBox<String> genderdropdown;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JComboBox<String> paymentBar;
    private javax.swing.JLabel phone_l;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JTextField sectortxt;
    // End of variables declaration//GEN-END:variables
}
