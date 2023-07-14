/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import com.g8lbd.sisfactarrocan_lbd.ConexionOracle;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gblan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    ConexionOracle orcl = new ConexionOracle();
    int xPos, yPos;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMainLogo = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        bgFormLogin = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        userIcon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        bgSignIn = new javax.swing.JPanel();
        signInLabel = new javax.swing.JLabel();
        controlBar = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        exitText = new javax.swing.JLabel();
        bgIcon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        bgMainLogo.setBackground(new java.awt.Color(211, 86, 80));

        javax.swing.GroupLayout bgMainLogoLayout = new javax.swing.GroupLayout(bgMainLogo);
        bgMainLogo.setLayout(bgMainLogoLayout);
        bgMainLogoLayout.setHorizontalGroup(
            bgMainLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        bgMainLogoLayout.setVerticalGroup(
            bgMainLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgFormLogin.setBackground(new java.awt.Color(16, 36, 61));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("USERNAME");

        usernameField.setBackground(new java.awt.Color(16, 36, 61));
        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(104, 122, 150));
        usernameField.setText("Ingrese su usuario");
        usernameField.setBorder(null);
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameFieldMousePressed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("PASSWORD");

        passwordField.setBackground(new java.awt.Color(16, 36, 61));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(104, 122, 150));
        passwordField.setText("**********");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });

        userIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjGZtYygEcUqgXvcNTeJyYzzVj2ba-3iUJY1m_N_9OsEt_sceoS69yee8uACOVgnjbeUm4IxSw2fY8ClufyLsXkAmaIl4UdJOBBTwbyCFq_4MSyUQEP0j7_nUKaMextqPXY3d7o1U9LaNz6AAgrpvLaQRGFmlMBl6O1n0_99BiW6soZaLK_2ezMQuNZ_kp6/w145-h145/persona%20(1).png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        userIcon.setToolTipText("");

        jSeparator1.setBackground(new java.awt.Color(104, 122, 150));

        jSeparator2.setBackground(new java.awt.Color(104, 122, 150));

        bgSignIn.setBackground(new java.awt.Color(217, 90, 83));

        signInLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 255, 255));
        signInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInLabel.setText("Sign In");
        signInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgSignInLayout = new javax.swing.GroupLayout(bgSignIn);
        bgSignIn.setLayout(bgSignInLayout);
        bgSignInLayout.setHorizontalGroup(
            bgSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        bgSignInLayout.setVerticalGroup(
            bgSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgFormLoginLayout = new javax.swing.GroupLayout(bgFormLogin);
        bgFormLogin.setLayout(bgFormLoginLayout);
        bgFormLoginLayout.setHorizontalGroup(
            bgFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFormLoginLayout.createSequentialGroup()
                .addGroup(bgFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgFormLoginLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(userIcon))
                    .addGroup(bgFormLoginLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(bgFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bgSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordLabel)
                                .addComponent(usernameLabel)
                                .addComponent(usernameField)
                                .addComponent(passwordField)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        bgFormLoginLayout.setVerticalGroup(
            bgFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFormLoginLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(bgSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        bg.add(bgFormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 520, 720));

        controlBar.setBackground(new java.awt.Color(217, 90, 83));
        controlBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                controlBarMouseDragged(evt);
            }
        });
        controlBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                controlBarMousePressed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(217, 90, 83));

        exitText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitText.setForeground(new java.awt.Color(255, 255, 255));
        exitText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitText.setText("X");
        exitText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout controlBarLayout = new javax.swing.GroupLayout(controlBar);
        controlBar.setLayout(controlBarLayout);
        controlBarLayout.setHorizontalGroup(
            controlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlBarLayout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1242, Short.MAX_VALUE))
        );
        controlBarLayout.setVerticalGroup(
            controlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(controlBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        bgIcon.setBackground(new java.awt.Color(217, 90, 83));

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjnYVqVYpDIyLgebiylVvKrU4iIvy0k8UWV2wcNwe3rDAr87oLasgNtlzQTHCIy3rSd6Hkl_suTSQHQsdgwRsv975fpAOxU70ykTT5VNoqoKG7n0cdgQg2Mmb3Y9fObJqcu3F2O7-YT3kypzWRADu2QfohgWU1k6i6JbVJ6g-hEbWo3gbkaJduJOugTpL3D/w613-h253/2%20LFS.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout bgIconLayout = new javax.swing.GroupLayout(bgIcon);
        bgIcon.setLayout(bgIconLayout);
        bgIconLayout.setHorizontalGroup(
            bgIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgIconLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        bgIconLayout.setVerticalGroup(
            bgIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgIconLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        bg.add(bgIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void controlBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlBarMousePressed
        // TODO add your handling code here:
        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_controlBarMousePressed

    private void controlBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xPos, y - yPos);
    }//GEN-LAST:event_controlBarMouseDragged

    private void exitTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_exitTextMouseClicked

    private void exitTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseEntered
        // TODO add your handling code here:
        exitButton.setBackground(Color.red);
        exitText.setForeground(Color.white);
    }//GEN-LAST:event_exitTextMouseEntered

    private void exitTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseExited
        // TODO add your handling code here:
        exitButton.setBackground(Color.decode("#D95A53"));
        exitText.setForeground(Color.white);
    }//GEN-LAST:event_exitTextMouseExited

    private void usernameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMousePressed
        // TODO add your handling code here:
        if (usernameField.getText().equals("Ingrese su usuario")) {
            usernameField.setText("");
            usernameField.setForeground(Color.white);
        }

        if (String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setText("**********");
            passwordField.setForeground(Color.decode("#687A96"));
        }
    }//GEN-LAST:event_usernameFieldMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        // TODO add your handling code here:
        if (usernameField.getText().isEmpty()) {
            usernameField.setText("Ingrese su usuario");
            usernameField.setForeground(Color.decode("#687A96"));
        }

        if (String.valueOf(passwordField.getPassword()).equals("**********")) {
            passwordField.setText("");
            passwordField.setForeground(Color.white);
        }
    }//GEN-LAST:event_passwordFieldMousePressed

    private void signInLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseEntered
        // TODO add your handling code here:
        bgSignIn.setBackground(Color.decode("#B84C46"));
    }//GEN-LAST:event_signInLabelMouseEntered

    private void signInLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseExited
        // TODO add your handling code here:
        bgSignIn.setBackground(Color.decode("#D95A53"));

    }//GEN-LAST:event_signInLabelMouseExited

    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked

        Connection conn = orcl.linkBD();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String nombreUsuario = usernameField.getText();
            String contraseñaUsuario = String.valueOf(passwordField.getPassword());

            // Preparar la consulta
            String query = "SELECT COUNT(*) FROM Colaboradores WHERE Nombre = ? AND Cedula = ?";
            statement = conn.prepareStatement(query);
            statement.setString(1, nombreUsuario);
            statement.setString(2, contraseñaUsuario);

            // Ejecutar la consulta
            resultSet = statement.executeQuery();

            // Verificar el resultado
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count == 1) {
                    Menu  menu = new Menu();
                    menu.nombreCuenta(nombreUsuario);
                    menu.setVisible(true);
                    dispose();
                    System.out.println("Credenciales válidas");
                } else {
                    System.out.println("Credenciales inválidas");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_signInLabelMouseClicked

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
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgFormLogin;
    private javax.swing.JPanel bgIcon;
    private javax.swing.JPanel bgMainLogo;
    private javax.swing.JPanel bgSignIn;
    private javax.swing.JPanel controlBar;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
