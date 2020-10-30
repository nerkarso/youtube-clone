package common;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hassen
 */
public class LaunchFrame extends javax.swing.JFrame {

  /**
   * Creates new form LoginScreen
   */
  public LaunchFrame() {
    initComponents();
    this.setTitle("Launch Screen");
  }

  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Main = new javax.swing.JPanel();
    Logo = new javax.swing.JPanel();
    lblLaunchKiosk = new javax.swing.JLabel();
    imgLogo = new javax.swing.JLabel();
    lblLogin = new javax.swing.JLabel();
    txtUsername = new javax.swing.JTextField();
    txtPassword = new javax.swing.JPasswordField();
    btnLogin = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    Main.setBackground(new java.awt.Color(255, 255, 255));
    Main.setBorder(javax.swing.BorderFactory.createCompoundBorder());

    Logo.setBackground(new java.awt.Color(255, 255, 255));
    Logo.setForeground(new java.awt.Color(0, 51, 51));
    Logo.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        LogoMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        LogoMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        LogoMousePressed(evt);
      }
    });

    lblLaunchKiosk.setBackground(new java.awt.Color(12, 154, 119));
    lblLaunchKiosk.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
    lblLaunchKiosk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblLaunchKiosk.setText("Launch Kiosk");

    imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-1x.png"))); // NOI18N

    javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
    Logo.setLayout(LogoLayout);
    LogoLayout.setHorizontalGroup(
      LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(LogoLayout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(lblLaunchKiosk, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 21, Short.MAX_VALUE)))
        .addContainerGap())
    );
    LogoLayout.setVerticalGroup(
      LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblLaunchKiosk, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
    lblLogin.setForeground(new java.awt.Color(52, 67, 58));
    lblLogin.setText("Login");

    txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    txtUsername.setText("admin");
    txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(17, 166, 117)));
    txtUsername.setCaretColor(new java.awt.Color(255, 153, 153));

    txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    txtPassword.setText("123");
    txtPassword.setToolTipText("");
    txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(17, 166, 117)));
    txtPassword.setCaretColor(new java.awt.Color(255, 102, 102));

    btnLogin.setBackground(new java.awt.Color(12, 154, 119));
    btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnLogin.setForeground(new java.awt.Color(255, 255, 255));
    btnLogin.setText("Log in");
    btnLogin.setBorder(null);
    btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnLoginMousePressed(evt);
      }
    });
    btnLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoginActionPerformed(evt);
      }
    });

    jLabel1.setText("Username");

    jLabel2.setText("Password");

    javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
    Main.setLayout(MainLayout);
    MainLayout.setHorizontalGroup(
      MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(MainLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(40, 40, 40)
        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(jLabel2)
          .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)))
        .addContainerGap(65, Short.MAX_VALUE))
    );
    MainLayout.setVerticalGroup(
      MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(MainLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(MainLayout.createSequentialGroup()
            .addGap(13, 13, 13)
            .addComponent(lblLogin)
            .addGap(28, 28, 28)
            .addComponent(jLabel1)
            .addGap(1, 1, 1)
            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel2)
            .addGap(3, 3, 3)
            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(32, 32, 32)
            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(41, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    String name = txtUsername.getText();
    String pass = txtPassword.getText();

    if ("admin".equals(name) && "123".equals(pass)) {
      txtUsername.setText(null);
      txtPassword.setText(null);
      admin.AdminFrame orders = new admin.AdminFrame();
      orders.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(null, "Incorrect Login Details.", "Login Error", JOptionPane.ERROR_MESSAGE);
      txtUsername.setText(null);
      txtPassword.setText(null);
    }
  }//GEN-LAST:event_btnLoginActionPerformed

  private void LogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseEntered
    setcolor(Logo);
  }//GEN-LAST:event_LogoMouseEntered

  private void LogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseExited
    resetcolor(Logo);

  }//GEN-LAST:event_LogoMouseExited

  private void LogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMousePressed
    new kiosk.StartFrame().setVisible(true);
  }//GEN-LAST:event_LogoMousePressed

  private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
    setcolor(btnLogin);
  }//GEN-LAST:event_btnLoginMousePressed

  void setcolor(JPanel p) {
    p.setBackground(new Color(206, 251, 209));
  }

  void setcolor(JButton b) {
    b.setBackground(new Color(17, 166, 117));
  }

  void resetcolor(JPanel p) {
    p.setBackground(Color.white);
  }

  void resetcolor(JButton b) {
    b.setBackground(new Color(12, 154, 119));
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /*
     * Set the Nimbus look and feel
     */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(LaunchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LaunchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LaunchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LaunchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /*
     * Create and display the form
     */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LaunchFrame().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel Logo;
  private javax.swing.JPanel Main;
  private javax.swing.JButton btnLogin;
  private javax.swing.JLabel imgLogo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel lblLaunchKiosk;
  private javax.swing.JLabel lblLogin;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
}