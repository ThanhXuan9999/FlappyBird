/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class DangNhap extends javax.swing.JFrame {


    public DangNhap() {
        initComponents();
        btnChoiGame.setVisible(false);
        setLocationRelativeTo(null);
        
        ImageIcon icon = new ImageIcon("Assets/iconDangnhap.png");
        setIconImage(icon.getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblThongTinDangNhap = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        btnChoiGame = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        btnLamLai = new javax.swing.JButton();
        lblThongBao = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        jPanel1.setLayout(null);

        lblThongTinDangNhap.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblThongTinDangNhap.setForeground(new java.awt.Color(0, 0, 255));
        lblThongTinDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinDangNhap.setText("THÔNG TIN ĐĂNG NHẬP");
        jPanel1.add(lblThongTinDangNhap);
        lblThongTinDangNhap.setBounds(5, 10, 330, 28);

        txtTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTaiKhoan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTaiKhoan.setBorder(null);
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });
        jPanel1.add(txtTaiKhoan);
        txtTaiKhoan.setBounds(85, 40, 200, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Tài khoản");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 60, 32);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Mật Khẩu");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 80, 60, 20);

        txtMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMatKhau.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatKhau.setBorder(null);
        jPanel1.add(txtMatKhau);
        txtMatKhau.setBounds(85, 80, 200, 30);

        btnChoiGame.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnChoiGame.setForeground(new java.awt.Color(0, 204, 102));
        btnChoiGame.setText("Mở Home Page");
        btnChoiGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoiGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnChoiGame);
        btnChoiGame.setBounds(10, 150, 320, 40);

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(0, 102, 255));
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap);
        btnDangNhap.setBounds(10, 200, 100, 30);

        btnDangKy.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDangKy.setForeground(new java.awt.Color(0, 102, 255));
        btnDangKy.setText("Đăng Ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangKy);
        btnDangKy.setBounds(120, 200, 100, 30);

        btnLamLai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLamLai.setForeground(new java.awt.Color(0, 102, 255));
        btnLamLai.setText("Làm lại");
        btnLamLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamLaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnLamLai);
        btnLamLai.setBounds(230, 200, 100, 30);

        lblThongBao.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        lblThongBao.setForeground(new java.awt.Color(204, 0, 0));
        lblThongBao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblThongBao);
        lblThongBao.setBounds(0, 110, 340, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\TH_Game\\Games\\Assets\\Dangnhap.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 340, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        String taikhoan = txtTaiKhoan.getText();
        String matkhau = String.valueOf(txtMatKhau.getPassword());
        //matkhau = Connect.MD5(matkhau);
        if (taikhoan.equals("") || matkhau.equals("")) {
            lblThongBao.setText("Bạn phải nhập thông tin tài khoản và mật khẩu");
            txtTaiKhoan.requestFocus();
        }
        else{
            lblThongBao.setText(Connect.getConnection());
            if(lblThongBao.getText().equals("")) {
                String sql ="Select *from USERS where UserID=? and Pass=?";
                PreparedStatement pstm;
                try {
                    pstm=Connect.conn.prepareStatement(sql);
                    pstm.setString(1,taikhoan);
                    pstm.setString(2,matkhau);
                    try (ResultSet rs = pstm.executeQuery()) {
                        if(rs.next()) {
                        Connect.userID = txtTaiKhoan.getText();
                        String name = rs.getString("Name");
                        Connect.name=name;
                        Connect.role = rs.getInt("RoleID");
                        
                        if(Connect.role == 1){
                            lblThongBao.setText("Kính Chào Quản Trị Viên: '"+name+"'");
                            lblThongTinDangNhap.setText("QUẢN TRỊ VIÊN '"+name+"'");
                        }
                        else if(Connect.role == 0){
                            lblThongBao.setText("Chào Bạn Người Chơi: '"+name+"'");
                            lblThongTinDangNhap.setText("NGƯỜI CHƠI '"+name+"'");
                            
                        }
                        
                        btnChoiGame.setVisible(true);               
                        }
                        else 
                            lblThongBao.setText("Thông tin đăng nhập không hợp lệ.");
                        rs.close();
                    }
                    pstm.close();
                    Connect.conn.close();
                } catch(SQLException ex) {
                    lblThongBao.setText("Lỗi: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnLamLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamLaiActionPerformed
        txtTaiKhoan.setText("");
        txtMatKhau.setText("");
        lblThongBao.setText("");
        txtTaiKhoan.requestFocus();
        btnChoiGame.setVisible(false);
        lblThongTinDangNhap.setText("THÔNG TIN ĐĂNG NHẬP");
    }//GEN-LAST:event_btnLamLaiActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        DangKy frmDangKy= new DangKy();
        frmDangKy.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnChoiGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoiGameActionPerformed
        JF_HomePage homePage = new JF_HomePage();
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChoiGameActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoiGame;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnLamLai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JLabel lblThongTinDangNhap;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables

    private static class OneTwoThreeGame {

        public OneTwoThreeGame() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
