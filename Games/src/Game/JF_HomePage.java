/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JF_HomePage extends javax.swing.JFrame implements ActionListener{
    
    FlappyBird flappyBird;
    JF_AdminInformation adminInformation;
    JF_UsersInformation usersInformation;
    JF_SettingUserInformation settingUserInformation;
    JF_GameGuide gameGuide;
    JF_PlayerGamingHistory playerGamingHistory;
    JF_HistoricalGameRatings historicalGameRatings;
    
    /**
     * Creates new form HomePage
     */
    public JF_HomePage() {
        initComponents();
        setSize(900, 600);
        setLocationRelativeTo(null);
         
        ImageIcon icon = new ImageIcon("Assets/homePage.png");
        setIconImage(icon.getImage());
        
        
        if(Connect.role == 1){
            jMenu_Admin.setVisible(true);
            jMenu_Admin.setText("Quyền quản trị viên (" +Connect.name+ ")");
            jMenu_User.setText("Thông tin tài khoản (" +Connect.name+ ")");
        }
        else if(Connect.role == 0){
            jMenu_Admin.setVisible(false);
            jMenu_User.setText("Thông tin tài khoản (" +Connect.name+ ")");
        }
        
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Admin = new javax.swing.JMenu();
        jMenuItem_AdminInformation = new javax.swing.JMenuItem();
        jMenuItem_UsersInformation01 = new javax.swing.JMenuItem();
        jMenu_User = new javax.swing.JMenu();
        jMenuItem_SettingUserInformation = new javax.swing.JMenuItem();
        jMenu_Tutorial = new javax.swing.JMenu();
        jMenuItem_GameGuide = new javax.swing.JMenuItem();
        jMenu_History = new javax.swing.JMenu();
        jMenuItem_PlayerGamingHistory = new javax.swing.JMenuItem();
        jMenuItem_HistoricalGameRatings = new javax.swing.JMenuItem();
        jMenu_Exit = new javax.swing.JMenu();
        jMenuItem_LogOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameHomePage"); // NOI18N
        setSize(new java.awt.Dimension(900, 600));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Games\\Assets\\playGame.jpg")); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 330, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Games\\Assets\\gif04.gif")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenu_Admin.setText("Quyền quản trị viên");
        jMenu_Admin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenuItem_AdminInformation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_AdminInformation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem_AdminInformation.setText("Quản lý các tài khoản Quản trị viên");
        jMenuItem_AdminInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AdminInformationActionPerformed(evt);
            }
        });
        jMenu_Admin.add(jMenuItem_AdminInformation);

        jMenuItem_UsersInformation01.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_UsersInformation01.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem_UsersInformation01.setText("Quản lý các tài khoản Người chơi");
        jMenuItem_UsersInformation01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_UsersInformation01ActionPerformed(evt);
            }
        });
        jMenu_Admin.add(jMenuItem_UsersInformation01);

        jMenuBar1.add(jMenu_Admin);

        jMenu_User.setText("Thông tin tài khoản");
        jMenu_User.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenuItem_SettingUserInformation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_SettingUserInformation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem_SettingUserInformation.setText("Thông tin cá nhân");
        jMenuItem_SettingUserInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SettingUserInformationActionPerformed(evt);
            }
        });
        jMenu_User.add(jMenuItem_SettingUserInformation);

        jMenuBar1.add(jMenu_User);

        jMenu_Tutorial.setText("Hướng dẫn");
        jMenu_Tutorial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenuItem_GameGuide.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_GameGuide.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem_GameGuide.setText("Hướng dẫn luật chơi");
        jMenuItem_GameGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_GameGuideActionPerformed(evt);
            }
        });
        jMenu_Tutorial.add(jMenuItem_GameGuide);

        jMenuBar1.add(jMenu_Tutorial);

        jMenu_History.setText("Lịch sử");
        jMenu_History.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenuItem_PlayerGamingHistory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_PlayerGamingHistory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem_PlayerGamingHistory.setText("Lịch sử chơi của bạn");
        jMenuItem_PlayerGamingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PlayerGamingHistoryActionPerformed(evt);
            }
        });
        jMenu_History.add(jMenuItem_PlayerGamingHistory);

        jMenuItem_HistoricalGameRatings.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_HistoricalGameRatings.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem_HistoricalGameRatings.setText("Top các số điểm cao nhất");
        jMenuItem_HistoricalGameRatings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_HistoricalGameRatingsActionPerformed(evt);
            }
        });
        jMenu_History.add(jMenuItem_HistoricalGameRatings);

        jMenuBar1.add(jMenu_History);

        jMenu_Exit.setText("Thoát");
        jMenu_Exit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenuItem_LogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_LogOut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem_LogOut.setText("Đăng xuất");
        jMenuItem_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_LogOutActionPerformed(evt);
            }
        });
        jMenu_Exit.add(jMenuItem_LogOut);

        jMenuBar1.add(jMenu_Exit);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem_UsersInformation01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_UsersInformation01ActionPerformed
        
        usersInformation = new JF_UsersInformation();
        usersInformation.setVisible(true);
        
        
        flappyBird.setVisible(false);
        adminInformation.setVisible(false);
        settingUserInformation.setVisible(false);
        gameGuide.setVisible(false);
        playerGamingHistory.setVisible(false);
        historicalGameRatings.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem_UsersInformation01ActionPerformed

    private void jMenuItem_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_LogOutActionPerformed
        int logOut = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất tài khoản ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(logOut == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem_LogOutActionPerformed

    private void jMenuItem_GameGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_GameGuideActionPerformed
        gameGuide = new JF_GameGuide();
        gameGuide.setVisible(true);
        
        flappyBird.setVisible(false);
        adminInformation.setVisible(false);
        usersInformation.setVisible(false);
        settingUserInformation.setVisible(false);
        playerGamingHistory.setVisible(false);
        historicalGameRatings.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem_GameGuideActionPerformed

    private void jMenuItem_AdminInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AdminInformationActionPerformed
        
        adminInformation = new JF_AdminInformation();
        adminInformation.setVisible(true);
        
        flappyBird.setVisible(false);
        usersInformation.setVisible(false);
        settingUserInformation.setVisible(false);
        gameGuide.setVisible(false);
        playerGamingHistory.setVisible(false);
        historicalGameRatings.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem_AdminInformationActionPerformed

    private void jMenuItem_SettingUserInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SettingUserInformationActionPerformed
        settingUserInformation = new JF_SettingUserInformation();
        settingUserInformation.setVisible(true);
        
        flappyBird.setVisible(false);
        adminInformation.setVisible(false);
        usersInformation.setVisible(false);
        gameGuide.setVisible(false);
        playerGamingHistory.setVisible(false);
        historicalGameRatings.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem_SettingUserInformationActionPerformed

    private void jMenuItem_PlayerGamingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PlayerGamingHistoryActionPerformed
        playerGamingHistory = new JF_PlayerGamingHistory();
        playerGamingHistory.setVisible(true);
        
        flappyBird.setVisible(false);
        adminInformation.setVisible(false);
        usersInformation.setVisible(false);
        settingUserInformation.setVisible(false);
        gameGuide.setVisible(false);
        historicalGameRatings.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem_PlayerGamingHistoryActionPerformed

    private void jMenuItem_HistoricalGameRatingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_HistoricalGameRatingsActionPerformed
        historicalGameRatings = new JF_HistoricalGameRatings();
        historicalGameRatings.setVisible(true);
       
        flappyBird.setVisible(false);
        adminInformation.setVisible(false);
        usersInformation.setVisible(false);
        settingUserInformation.setVisible(false);
        gameGuide.setVisible(false);
        playerGamingHistory.setVisible(false);
       
    }//GEN-LAST:event_jMenuItem_HistoricalGameRatingsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        flappyBird = new FlappyBird();
        flappyBird.setVisible(true);
        
        flappyBird.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        adminInformation.setVisible(false);
        usersInformation.setVisible(false);
        settingUserInformation.setVisible(false);
        gameGuide.setVisible(false);
        playerGamingHistory.setVisible(false);
        historicalGameRatings.setVisible(false);
        
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
            java.util.logging.Logger.getLogger(JF_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_AdminInformation;
    private javax.swing.JMenuItem jMenuItem_GameGuide;
    private javax.swing.JMenuItem jMenuItem_HistoricalGameRatings;
    private javax.swing.JMenuItem jMenuItem_LogOut;
    private javax.swing.JMenuItem jMenuItem_PlayerGamingHistory;
    private javax.swing.JMenuItem jMenuItem_SettingUserInformation;
    private javax.swing.JMenuItem jMenuItem_UsersInformation01;
    private javax.swing.JMenu jMenu_Admin;
    private javax.swing.JMenu jMenu_Exit;
    private javax.swing.JMenu jMenu_History;
    private javax.swing.JMenu jMenu_Tutorial;
    private javax.swing.JMenu jMenu_User;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
