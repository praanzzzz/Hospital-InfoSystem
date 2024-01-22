/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package authentication;

//imports here
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.security.MessageDigest;

/**
 *
 * @author franz
 */
public class Register extends javax.swing.JFrame {

  
    public Register() {
        initComponents();
    }

    //Connection Db - DATABASE CONNECTION
    Connection con =(Connection) connectionDB.getConnectionDB();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        regAccName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        regAccEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        regAccPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        regAccConPass = new javax.swing.JPasswordField();
        regAccSubmit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        regAccLogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        regAcctype = new javax.swing.JComboBox<>();
        showReg = new javax.swing.JCheckBox();
        showRegConfirm = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Signup");

        regAccName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAccNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Full Name");

        jLabel5.setText("Email:");

        jLabel6.setText("Password:");

        regAccPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAccPassActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirm Password:");

        regAccConPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAccConPassActionPerformed(evt);
            }
        });

        regAccSubmit.setBackground(new java.awt.Color(0, 102, 255));
        regAccSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        regAccSubmit.setForeground(new java.awt.Color(255, 255, 255));
        regAccSubmit.setText("CREATE ACCOUNT");
        regAccSubmit.setBorder(null);
        regAccSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAccSubmitActionPerformed(evt);
            }
        });

        jLabel8.setText("Already have an account?");

        regAccLogin.setText("Signin");
        regAccLogin.setBorder(null);
        regAccLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAccLoginActionPerformed(evt);
            }
        });

        jLabel10.setText("Account Type:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Join the team!");

        jLabel1.setText("Enter fields to create account.");

        regAcctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor" }));
        regAcctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAcctypeActionPerformed(evt);
            }
        });

        showReg.setText("Show");
        showReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRegActionPerformed(evt);
            }
        });

        showRegConfirm.setText("Show");
        showRegConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRegConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regAccSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regAccLogin))))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel6)
                                            .addGap(22, 22, 22))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(regAcctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(regAccConPass)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(showRegConfirm))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(28, 28, 28)
                                            .addComponent(regAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(regAccEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                    .addComponent(regAccPass)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(showReg))))))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regAccEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regAccPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(showReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regAccConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(showRegConfirm))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(regAcctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(regAccSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(regAccLogin))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 480));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dako.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 360, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   //HASHING
   public static String doHashing(String Pass1) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(Pass1.getBytes());
            byte[] resultByteArray = md.digest();
            StringBuilder sb = new StringBuilder();

            for (byte b : resultByteArray) {
                sb.append(String.format("%02x", b));

            }
            return  sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    
    
    
    
    //UPON SUBMIT BUTTON, THIS WILL PERFORM
    private void regAccSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAccSubmitActionPerformed

        //instantiate
        String name = regAccName.getText();
        String email = regAccEmail.getText();
        String pass1 = regAccPass.getText();
        String pass2 = regAccConPass.getText();
        String acctype = (String) regAcctype.getSelectedItem();

        
        //check if not empty
        if (name.isEmpty() || email.isEmpty() || pass1.isEmpty() || pass2.isEmpty() || acctype.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill-up the empty space!");
        } else {
            //confirmation of password
            if (pass1.equals(pass2)) {
                

                String insertinfo = "INSERT INTO Account(Acc_name, Acc_Email,Acc_Password, Acc_Type)VALUE(?,?,?,?)";
                String doc_info = "INSERT INTO Doctor(Doctor_Fullname)VALUE(?)";
                try {
                    PreparedStatement pst = (PreparedStatement) con.prepareStatement(insertinfo);
                    pst.setString(1, name);
                    pst.setString(2, email);
//                    pst.setString(3, pass1);
                    pst.setString(3, doHashing(pass1));
                    pst.setString(4, acctype);

                    //for submit
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registered!");
                    //proceed to login page
                    dispose();
                    Login l = new Login();
                    l.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(regAcctype.getSelectedItem().equals("Doctor")){
                    try {
                    PreparedStatement pst = (PreparedStatement) con.prepareStatement(doc_info);
                    pst.setString(1, name);
                    pst.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Password mismatch!");
                regAccConPass.setText("");

            }

        }
    }//GEN-LAST:event_regAccSubmitActionPerformed

    private void regAccNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAccNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regAccNameActionPerformed

    private void regAccLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAccLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        Login L = new Login();
        L.setVisible(true);

    }//GEN-LAST:event_regAccLoginActionPerformed

    private void regAcctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAcctypeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_regAcctypeActionPerformed

    private void regAccConPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAccConPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regAccConPassActionPerformed

    private void regAccPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAccPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regAccPassActionPerformed

    private void showRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRegActionPerformed
        // TODO add your handling code here:
        if (showReg.isSelected()) {
            regAccPass.setEchoChar((char) 0);
        } else {
            regAccPass.setEchoChar('*');
        }
    }//GEN-LAST:event_showRegActionPerformed

    private void showRegConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRegConfirmActionPerformed
        // TODO add your handling code here:
        if (showRegConfirm.isSelected()) {
            regAccConPass.setEchoChar((char) 0);
        } else {
            regAccConPass.setEchoChar('*');
        }
    }//GEN-LAST:event_showRegConfirmActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField regAccConPass;
    private javax.swing.JTextField regAccEmail;
    private javax.swing.JButton regAccLogin;
    private javax.swing.JTextField regAccName;
    private javax.swing.JPasswordField regAccPass;
    private javax.swing.JButton regAccSubmit;
    private javax.swing.JComboBox<String> regAcctype;
    private javax.swing.JCheckBox showReg;
    private javax.swing.JCheckBox showRegConfirm;
    // End of variables declaration//GEN-END:variables
}
