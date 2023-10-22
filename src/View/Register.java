package View;

import Controllers.UserController;
import Models.User;
import java.util.regex.Pattern;
/**
 *
 * @author 62821
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
        
    }
      
    UserController uc = new UserController();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        Logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        fieldNim = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boxRole = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        fieldNoHp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jOptionPane1.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        Logo.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOST AND FOUND");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon1.png"))); // NOI18N

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        getContentPane().add(Logo);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel3.setText("Register");

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel4.setText("Nama");

        fieldNama.setBackground(new java.awt.Color(204, 255, 255));
        fieldNama.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        fieldNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        fieldNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel5.setText("Kata Sandi");

        fieldPassword.setBackground(new java.awt.Color(204, 255, 255));
        fieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        fieldPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel10.setText("Username/Nim");

        fieldNim.setBackground(new java.awt.Color(204, 255, 255));
        fieldNim.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        fieldNim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        fieldNim.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNimActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel11.setText("E-Mail");

        fieldEmail.setBackground(new java.awt.Color(204, 255, 255));
        fieldEmail.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        fieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        fieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel6.setText("Role");

        boxRole.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        boxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Admin" }));
        boxRole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel12.setText("No-Hp");

        fieldNoHp.setBackground(new java.awt.Color(204, 255, 255));
        fieldNoHp.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        fieldNoHp.setForeground(new java.awt.Color(0, 153, 153));
        fieldNoHp.setText("08xxxxxxxxxx");
        fieldNoHp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        fieldNoHp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldNoHp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldNoHpMouseClicked(evt);
            }
        });
        fieldNoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNoHpActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jButton1.setText("Daftar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel7.setText("Sudah punya akun?");

        jButton2.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jButton2.setText("Login");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(fieldPassword)
                            .addComponent(fieldNama)
                            .addComponent(jLabel10)
                            .addComponent(fieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(fieldNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(boxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordActionPerformed

    private void fieldNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNimActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void fieldNoHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNoHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNoHpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String nama = fieldNama.getText();
          String nim = fieldNim.getText().toUpperCase();
          String password = fieldPassword.getText();
          String email = fieldEmail.getText();
          String noHp = fieldNoHp.getText();
          String role = boxRole.getSelectedItem().toString();
          boolean flag = true;
          
          if(nim.equals("") || 
             nama.equals("") ||
             password.equals("") ||
             email.equals("") ||
             noHp.equals("")){
             jOptionPane1.showMessageDialog(rootPane, "Form Tidak Boleh Kosong");
             flag = false;
          }
          
          if(!(Pattern.compile("@gmail.com$").matcher(email).find() ||
             Pattern.compile("@students.del.ac.id$").matcher(email).find())){
             jOptionPane1.showMessageDialog(rootPane, "Format email anda salah");
             flag = false;
          }
          
          if( (noHp.length() >= 10 && noHp.length() <= 12) && (Pattern.compile("^08").matcher(noHp).find() ||
             Pattern.compile("^628").matcher(noHp).find())){
             for(User u : uc.getAll()){
                if(u.getNoHp().equals(noHp)){
                    jOptionPane1.showMessageDialog(rootPane, "noHp telah digunakan");
                    flag = false;
                    break;
                }
            }
          }
          else{
             jOptionPane1.showMessageDialog(rootPane, "Format no Hp anda salah");
             flag = false;
          }
          
          if(nim.length() == 8 && ( Pattern.compile("^11S").matcher(nim).find() || 
                  Pattern.compile("^12S").matcher(nim).find() ||
                  Pattern.compile("^14S").matcher(nim).find() ||
                  Pattern.compile("^21S").matcher(nim).find() ||
                  Pattern.compile("^31S").matcher(nim).find() ||
                  Pattern.compile("^133").matcher(nim).find() ||
                  Pattern.compile("^113").matcher(nim).find() ||
                  Pattern.compile("^114").matcher(nim).find())){
              for(User u : uc.getAll()){
                if(u.getNim().equals(nim)){
                    jOptionPane1.showMessageDialog(rootPane, "Username/NIM telah terdaftar");
                    flag = false;
                    break;
                }
            }
          }         
          else{
              jOptionPane1.showMessageDialog(rootPane, "Format Nim yang anda masukkan salah");
              flag = false;
          }
          
          if(flag == true){
              User pengguna = new User(nim, nama, password, email, noHp, role);
              uc.insert(pengguna);
              jOptionPane1.showMessageDialog(rootPane, "Berhasil mendaftarkan akun sebagai " + role);
              fieldNama.setText("");
              fieldNim.setText("");
              fieldPassword.setText("");
              fieldEmail.setText("");
              fieldNoHp.setText("");
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fieldNoHpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldNoHpMouseClicked
        // TODO add your handling code here:
        fieldNoHp.setText("");
    }//GEN-LAST:event_fieldNoHpMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Logo;
    private javax.swing.JComboBox<String> boxRole;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNim;
    private javax.swing.JTextField fieldNoHp;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
