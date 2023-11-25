package com.watchit.watchhub;

import static com.watchit.watchhub.WATCHHUB.loginpage;
import static com.watchit.watchhub.WATCHHUB.signuppage;
import static com.watchit.watchhub.WATCHHUB.watchhubpage;

public class Sign_up_page extends javax.swing.JFrame {

    public Sign_up_page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signup_page = new com.k33ptoo.components.KGradientPanel();
        signupbtn = new javax.swing.JButton();
        lname_signup = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass_signup = new javax.swing.JPasswordField();
        male_signup = new javax.swing.JRadioButton();
        femal_signup = new javax.swing.JRadioButton();
        username_signup = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email_signup = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fname_signup = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        already_have_account_signup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signupbtn.setText("sign up");
        signupbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("lastname");

        jLabel2.setText("password");

        male_signup.setText("male");
        male_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        male_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_signupActionPerformed(evt);
            }
        });

        femal_signup.setText("femal");
        femal_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        femal_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femal_signupActionPerformed(evt);
            }
        });

        jLabel3.setText("username");

        jLabel4.setText("email");

        jLabel5.setText("firstname");

        already_have_account_signup.setText("Already have an account? ");
        already_have_account_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        already_have_account_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                already_have_account_signupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signup_pageLayout = new javax.swing.GroupLayout(signup_page);
        signup_page.setLayout(signup_pageLayout);
        signup_pageLayout.setHorizontalGroup(
            signup_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signup_pageLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(signup_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(already_have_account_signup, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(username_signup)
                    .addComponent(pass_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname_signup)
                    .addComponent(lname_signup)
                    .addComponent(signupbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(signup_pageLayout.createSequentialGroup()
                        .addComponent(male_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(femal_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        signup_pageLayout.setVerticalGroup(
            signup_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signup_pageLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lname_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(username_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signup_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male_signup)
                    .addComponent(femal_signup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(already_have_account_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signup_page, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signup_page, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void already_have_account_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_already_have_account_signupMouseClicked
        // TODO add your handling code here:
        loginpage.show();
        dispose();
    }//GEN-LAST:event_already_have_account_signupMouseClicked

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        // TODO add your handling code here:
        watchhubpage.show();
        dispose();
    }//GEN-LAST:event_signupbtnActionPerformed

    private void male_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_signupActionPerformed
        // TODO add your handling code here:
        signuppage.femal_signup.setSelected(false);
    }//GEN-LAST:event_male_signupActionPerformed

    private void femal_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femal_signupActionPerformed
        // TODO add your handling code here:
        signuppage.male_signup.setSelected(false);

    }//GEN-LAST:event_femal_signupActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel already_have_account_signup;
    private javax.swing.JTextField email_signup;
    private javax.swing.JRadioButton femal_signup;
    private javax.swing.JTextField fname_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lname_signup;
    private javax.swing.JRadioButton male_signup;
    private javax.swing.JPasswordField pass_signup;
    private com.k33ptoo.components.KGradientPanel signup_page;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField username_signup;
    // End of variables declaration//GEN-END:variables

}
