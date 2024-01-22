/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package authentication;

//imports here
import static authentication.Dashboard.dp;
import javax.swing.JOptionPane;
//personal added imports here
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.security.MessageDigest;

/**
 *
 * @author franz
 */


public class Login extends javax.swing.JFrame {
    

    //for role based authentication admin or doctor. called in patient reg if kinsa nag control
    public static String Accountid = null;
    public static String Accname = null;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
      //Connection Db - DATABASE CONNECTION
    Connection con = (Connection)connectionDB.getConnectionDB();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginAccEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        loginAccPass = new javax.swing.JPasswordField();
        loginAccSubmit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        loginAccReg = new javax.swing.JButton();
        showPLogin = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Login");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Welcome back !");

        jLabel2.setText("Enter your username and password to access system.");

        jLabel5.setText("Email:");

        loginAccEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAccEmailActionPerformed(evt);
            }
        });

        jLabel6.setText("Password:");

        loginAccPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAccPassActionPerformed(evt);
            }
        });

        loginAccSubmit.setBackground(new java.awt.Color(0, 102, 255));
        loginAccSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginAccSubmit.setForeground(new java.awt.Color(255, 255, 255));
        loginAccSubmit.setText("SIGNIN");
        loginAccSubmit.setBorder(null);
        loginAccSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAccSubmitActionPerformed(evt);
            }
        });

        jLabel8.setText("Don't have an account yet?");

        loginAccReg.setText("Signup");
        loginAccReg.setBorder(null);
        loginAccReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginAccReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAccRegActionPerformed(evt);
            }
        });

        showPLogin.setText("Show");
        showPLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(loginAccEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(loginAccPass)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(showPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginAccSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginAccReg)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginAccEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginAccPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPLogin))
                .addGap(30, 30, 30)
                .addComponent(loginAccSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(loginAccReg))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 410));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image gamay.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 330, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  public static String doHashing(String Pass1) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(Pass1.getBytes());
            byte[] resultByteArray = md.digest();
            StringBuilder sb = new StringBuilder();

            for (byte b : resultByteArray) {
                sb.append(String.format("%02x", b));

            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    
    //SUBMIT LOGIN
    private void loginAccSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAccSubmitActionPerformed
        // ACCESS AND MATCH DATA FROM DATABASE
        try {
            String query = "SELECT * FROM Account WHERE Acc_Email = '" + loginAccEmail.getText() + "'"
                    + " AND Acc_Password = '" + doHashing(loginAccPass.getText()) + "'";
            
            
            //STATEMENT AND RESULT SETS
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if (rs.next()) {
                Accountid = rs.getString("Acc_id");
                Accname = rs.getString("Acc_Name");
//                restricts access to patient regs and account page if doctor type
//               String Usertype = rs.getString("Acc_Type");
//                if (Usertype.equals("Doctor")){
//                    Dashboard.patreg.setEnabled(false);
//                    Dashboard.account.setEnabled(false);
//                      Dashboard.jButton1.setText("go");
//                }
////                else{
//////                    Dashboard.patreg.setEnabled(true);
//////                    Dashboard.account.setEnabled(true);
//                }

                //closes login, proceed to dashboard
                dispose();
                //home dashboard pag open login
                Dashboard dashB = new Dashboard();
                dashB.setVisible(true);
                home hm = new home();
                dp.add(hm);
                hm.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Email or Password.");
            }     
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginAccSubmitActionPerformed

    private void loginAccEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAccEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAccEmailActionPerformed

    private void showPLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPLoginActionPerformed
        // show OR HIDE PASSWORD
        if (showPLogin.isSelected()){
            loginAccPass.setEchoChar((char)0);
        }else{
            loginAccPass.setEchoChar('*');
        }
    }//GEN-LAST:event_showPLoginActionPerformed

    private void loginAccPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAccPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAccPassActionPerformed

    private void loginAccRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAccRegActionPerformed
        // TRANSFER TO REGISTER PAGE
        dispose();
        Register R = new Register();
        R.setVisible(true);
    }//GEN-LAST:event_loginAccRegActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginAccEmail;
    private javax.swing.JPasswordField loginAccPass;
    private javax.swing.JButton loginAccReg;
    private javax.swing.JButton loginAccSubmit;
    private javax.swing.JCheckBox showPLogin;
    // End of variables declaration//GEN-END:variables
}
