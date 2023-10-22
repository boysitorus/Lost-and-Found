
package View;

import Controllers.UserController;
import Models.User;
import Utils.ConstUtil;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.text.PasswordView;

import java.sql.*;
import java.sql.Connection;
public class EditData extends javax.swing.JFrame {

    
    public EditData() {
        initComponents();
    }

    PreparedStatement ps;
    Connection con = null;
    UserController uc = new UserController();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        fieldNoHp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel1.setText("EDIT AKUN");

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel2.setText("Nama");

        fieldNama.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        fieldNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldNamaMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        fieldEmail.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        fieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldEmailMouseClicked(evt);
            }
        });

        fieldNoHp.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        fieldNoHp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldNoHpMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel4.setText("NoHp");

        jButton1.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel5.setText("Konfirmasi Password");

        fieldPassword.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(fieldNama)
                    .addComponent(jLabel3)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(fieldNoHp, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(fieldPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fieldNama.setText(ConstUtil.auth.getNama());
        fieldEmail.setText(ConstUtil.auth.getEmail());
        fieldNoHp.setText(ConstUtil.auth.getNoHp());
    }//GEN-LAST:event_formWindowOpened

    private void fieldNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldNamaMouseClicked
        // TODO add your handling code here:
        if(fieldNama.getText().equals(ConstUtil.auth.getNama())){
            fieldNama.setText("");
        }
    }//GEN-LAST:event_fieldNamaMouseClicked

    private void fieldEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldEmailMouseClicked
        // TODO add your handling code here:
        if(fieldEmail.getText().equals(ConstUtil.auth.getEmail())){
            fieldEmail.setText("");
        }
    }//GEN-LAST:event_fieldEmailMouseClicked

    private void fieldNoHpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldNoHpMouseClicked
        // TODO add your handling code here:
        if(fieldNoHp.getText().equals(ConstUtil.auth.getNoHp())){
            fieldNoHp.setText("");
        }
    }//GEN-LAST:event_fieldNoHpMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nama = fieldNama.getText();
        String email = fieldEmail.getText();
        String noHp = fieldNoHp.getText();
        String password = fieldPassword.getText();
        boolean flag = true;
        
        if(nama.equals("") || email.equals("") || noHp.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Nama atau Email atau NoHP atau Password tidak boleh kosong");
            flag = false;
        }
        else{
            if(!(Pattern.compile("@gmail.com$").matcher(email).find() ||
                Pattern.compile("@students.del.ac.id$").matcher(email).find())){
                JOptionPane.showMessageDialog(rootPane, "Format email anda salah");
                flag = false;
            }
            else if( (noHp.length() >= 10 && noHp.length() <= 12) && (Pattern.compile("^08").matcher(noHp).find() ||
             Pattern.compile("^628").matcher(noHp).find())){
             for(User u : uc.getAll()){
                if(u.getNoHp().equals(noHp)){
                    if(u.getNoHp().equals(ConstUtil.auth.getNoHp())){
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "noHp telah digunakan");
                        flag = false;
                        break;
                    } 
                }
              }
            }
            else if(!password.equals(ConstUtil.auth.getPassword().toLowerCase())){
                JOptionPane.showMessageDialog(rootPane, "Password Salah");
                flag = false;
            }
        }
       
        if(flag == true){
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/k05?user=root&password=root");
                ps = con.prepareStatement("UPDATE users SET nama = ?, email = ?, no_hp = ? WHERE nim = ?");
                ps.setString(1, nama);
                ps.setString(2, email);
                ps.setString(3, noHp);
                ps.setString(4, ConstUtil.auth.getNim());
                ps.executeUpdate();
                con.close();
                JOptionPane.showMessageDialog(rootPane, "Berhasil meng-edit data akun, silahkan login kembali");
                new Login().setVisible(true);
                this.dispose();              
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNoHp;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
