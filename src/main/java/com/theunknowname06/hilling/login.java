/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.theunknowname06.hilling;

/**
 *
 * @author anjay
 */
public class login extends javax.swing.JFrame {
    /**
     * Creates new form login
     */
    public login(String n,String p,String e) {
        tPass = p;
        tName = n;
        tEmail = e;
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

        background = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        login_title = new javax.swing.JLabel();
        EMAIL_FORM = new javax.swing.JPanel();
        title_email = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        PASSWORD_FORM = new javax.swing.JPanel();
        pwTitle = new javax.swing.JLabel();
        show_pw = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        forgot_password = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();
        SWITCH_PAGE = new javax.swing.JPanel();
        title_acount = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\anjay\\Downloads\\hilling\\20230610_190048_0000.png")); // NOI18N

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        main.setBackground(new java.awt.Color(102, 255, 102));

        title.setBackground(new java.awt.Color(102, 255, 255));
        title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        login_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_title.setText("LOGIN PAGE");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EMAIL_FORM.setBackground(new java.awt.Color(204, 255, 204));

        title_email.setText("EMAIL:");

        email.setBackground(new java.awt.Color(204, 255, 204));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EMAIL_FORMLayout = new javax.swing.GroupLayout(EMAIL_FORM);
        EMAIL_FORM.setLayout(EMAIL_FORMLayout);
        EMAIL_FORMLayout.setHorizontalGroup(
            EMAIL_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EMAIL_FORMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EMAIL_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EMAIL_FORMLayout.createSequentialGroup()
                        .addComponent(title_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(255, 255, 255))
                    .addComponent(email))
                .addContainerGap())
        );
        EMAIL_FORMLayout.setVerticalGroup(
            EMAIL_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EMAIL_FORMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        PASSWORD_FORM.setBackground(new java.awt.Color(204, 255, 204));

        pwTitle.setText("PASSWORD:");

        show_pw.setText("show password");
        show_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pwActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(204, 255, 204));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PASSWORD_FORMLayout = new javax.swing.GroupLayout(PASSWORD_FORM);
        PASSWORD_FORM.setLayout(PASSWORD_FORMLayout);
        PASSWORD_FORMLayout.setHorizontalGroup(
            PASSWORD_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PASSWORD_FORMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PASSWORD_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password)
                    .addGroup(PASSWORD_FORMLayout.createSequentialGroup()
                        .addGroup(PASSWORD_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwTitle)
                            .addComponent(show_pw))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PASSWORD_FORMLayout.setVerticalGroup(
            PASSWORD_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PASSWORD_FORMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pwTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_pw)
                .addContainerGap())
        );

        login.setBackground(new java.awt.Color(204, 255, 204));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        forgot_password.setBackground(new java.awt.Color(102, 255, 102));
        forgot_password.setText("forgot a password?");

        copyright.setText("<html>&copy; TheUnknownName06 </html>");

        SWITCH_PAGE.setBackground(new java.awt.Color(204, 255, 204));

        title_acount.setText("dont have account?");

        register.setBackground(new java.awt.Color(204, 255, 204));
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 255, 204));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SWITCH_PAGELayout = new javax.swing.GroupLayout(SWITCH_PAGE);
        SWITCH_PAGE.setLayout(SWITCH_PAGELayout);
        SWITCH_PAGELayout.setHorizontalGroup(
            SWITCH_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SWITCH_PAGELayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title_acount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        SWITCH_PAGELayout.setVerticalGroup(
            SWITCH_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SWITCH_PAGELayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(SWITCH_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(SWITCH_PAGELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_acount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(copyright)
                .addGap(91, 91, 91))
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EMAIL_FORM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PASSWORD_FORM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SWITCH_PAGE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forgot_password, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(EMAIL_FORM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PASSWORD_FORM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgot_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addComponent(SWITCH_PAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyright)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        this.dispose();
        register pg_register = new register(tName,tPass,tEmail);
        
        pg_register.show_register();
    }//GEN-LAST:event_registerActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void show_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pwActionPerformed
        // TODO add your handling code here:
        javax.swing.JCheckBox checkBox = (javax.swing.JCheckBox) evt.getSource();
        if (checkBox.isSelected()) {
            password.setEchoChar((char) 0); // Tampilkan karakter asli
        } else {
            password.setEchoChar('\u2022'); // Gunakan karakter bintang (default)
        }
    }//GEN-LAST:event_show_pwActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String e_ram = email.getText(); 
        String p_ram = password.getText(); 
        if(e_ram.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter your email address.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(p_ram.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter your password.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
//        System.out.println(this.tPass + this.tName + this.tEmail);
        if(this.tPass == null || this.tEmail == null || this.tEmail.isEmpty() || this.tPass.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Look like there doesnt a account has been registered in this jar java.please register first.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!e_ram.equals(this.tEmail)){
            javax.swing.JOptionPane.showMessageDialog(this, "your email doesnt match with the registered account.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!p_ram.equals(this.tPass)){
            javax.swing.JOptionPane.showMessageDialog(this, "your password doesnt match with the registered account.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        menuUtama mU = new menuUtama(tName,tPass,tEmail);
        
        mU.show_register();
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public void show_login() {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login(tName,tPass,tEmail).setVisible(true);
            }
        });
    }
        String tPass;
        String tName;
        String tEmail;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EMAIL_FORM;
    private javax.swing.JPanel PASSWORD_FORM;
    private javax.swing.JPanel SWITCH_PAGE;
    private javax.swing.JPanel background;
    private javax.swing.JLabel copyright;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JButton forgot_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel login_title;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel main;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel pwTitle;
    private javax.swing.JButton register;
    private javax.swing.JCheckBox show_pw;
    private javax.swing.JPanel title;
    private javax.swing.JLabel title_acount;
    private javax.swing.JLabel title_email;
    // End of variables declaration//GEN-END:variables
}
