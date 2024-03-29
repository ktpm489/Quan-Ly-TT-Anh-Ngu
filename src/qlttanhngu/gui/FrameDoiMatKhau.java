/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;
import qlttanhngu.controller.UserAccountController;
import qlttanhngu.dto.UserAccountDTO;

/**
 *
 * @author XUANVINHTD
 */
public class FrameDoiMatKhau extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameDoiMatKhau
     */
    public FrameDoiMatKhau() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTenTaiKhoan = new javax.swing.JLabel();
        lblTenNguoiSuDung = new javax.swing.JLabel();
        lblMKCu = new javax.swing.JLabel();
        lblMKMoi = new javax.swing.JLabel();
        lblNapLaiMK = new javax.swing.JLabel();
        txtTenTaiKhoan = new javax.swing.JTextField();
        txtTenNguoiDung = new javax.swing.JTextField();
        txtMKCu = new javax.swing.JPasswordField();
        txtMKMoi = new javax.swing.JPasswordField();
        txtNhapLaiMK = new javax.swing.JPasswordField();
        panelChucNang = new javax.swing.JPanel();
        btnThayDoi = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        lblThanhCong = new javax.swing.JLabel();
        lblLoi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Đổi Mật Khẩu");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin"));

        lblTenTaiKhoan.setText("Tên Tài Khoản");

        lblTenNguoiSuDung.setText("Tên Người Sử Dụng");

        lblMKCu.setText("Mật Khẩu cũ");

        lblMKMoi.setText("Mật Khẩu Mới");

        lblNapLaiMK.setText("Nhập Lại Mật Khẩu");

        txtTenTaiKhoan.setText(StoreSave.accountNameSave);
        txtTenTaiKhoan.setEnabled(false);
        txtTenTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenTaiKhoanKeyPressed(evt);
            }
        });

        txtTenNguoiDung.setText(StoreSave.userNamSave);
        txtTenNguoiDung.setEnabled(false);
        txtTenNguoiDung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenNguoiDungKeyPressed(evt);
            }
        });

        txtMKCu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMKCuKeyPressed(evt);
            }
        });

        txtMKMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMKMoiKeyPressed(evt);
            }
        });

        txtNhapLaiMK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNhapLaiMKKeyPressed(evt);
            }
        });

        panelChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnThayDoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Accept1.png"))); // NOI18N
        btnThayDoi.setText("Thay Đổi");
        btnThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChucNangLayout = new javax.swing.GroupLayout(panelChucNang);
        panelChucNang.setLayout(panelChucNangLayout);
        panelChucNangLayout.setHorizontalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChucNangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThayDoi)
                .addGap(32, 32, 32)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelChucNangLayout.setVerticalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThayDoi)
                    .addComponent(btnDong))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lblThanhCong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblThanhCong.setForeground(new java.awt.Color(0, 204, 51));
        lblThanhCong.setText("Thay đổi thành công !");
        lblThanhCong.setVisible(false);

        lblLoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLoi.setForeground(new java.awt.Color(255, 51, 51));
        lblLoi.setText("Thay đổi thất bại !");
        lblLoi.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panelChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblMKMoi)
                                            .addComponent(lblNapLaiMK))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblTenTaiKhoan)
                                .addGap(26, 26, 26)
                                .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMKCu)
                                    .addComponent(lblTenNguoiSuDung))
                                .addGap(26, 26, 26)
                                .addComponent(txtTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblThanhCong)
                        .addGap(32, 32, 32)
                        .addComponent(lblLoi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenTaiKhoan)
                            .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNguoiSuDung)
                            .addComponent(txtTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMKCu)
                            .addComponent(txtMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMKMoi)
                            .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNapLaiMK)
                            .addComponent(txtNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(panelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThanhCong)
                    .addComponent(lblLoi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiActionPerformed
        UserAccountDTO userDTO = new UserAccountDTO();
        UserAccountController userController = new UserAccountController();
        userDTO.setUsername(txtTenTaiKhoan.getText());
        userDTO.setPasswordNew(DigestUtils.md5Hex(txtNhapLaiMK.getText()));
        userDTO.setPassword(DigestUtils.md5Hex(txtMKCu.getText()));
        try {
            if(!txtMKCu.getText().equals(txtMKMoi.getText()) && txtMKMoi.getText().equals(txtNhapLaiMK.getText()) && userController.isChangePassword(userDTO)){
               lblThanhCong.setVisible(true);
               lblLoi.setVisible(false);
            }
            else{
                lblThanhCong.setVisible(false);
                lblLoi.setVisible(true);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(FrameDoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThayDoiActionPerformed

    private void txtTenTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenTaiKhoanKeyPressed
        if(txtTenTaiKhoan.getText().length() > 10)
            txtTenTaiKhoan.setText(txtTenTaiKhoan.getText().substring(0, 10));
    }//GEN-LAST:event_txtTenTaiKhoanKeyPressed

    private void txtTenNguoiDungKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenNguoiDungKeyPressed
       if(txtTenNguoiDung.getText().length() > 50)
           txtTenNguoiDung.setText(txtTenNguoiDung.getText().substring(0, 50));
    }//GEN-LAST:event_txtTenNguoiDungKeyPressed

    private void txtMKCuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKCuKeyPressed
        if(txtMKCu.getText().length() > 15)
            txtMKCu.setText(txtMKCu.getText().substring(0, 15));
    }//GEN-LAST:event_txtMKCuKeyPressed

    private void txtMKMoiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKMoiKeyPressed
        if(txtMKMoi.getText().length() > 15)
            txtMKMoi.setText(txtMKMoi.getText().substring(0, 15));
    }//GEN-LAST:event_txtMKMoiKeyPressed

    private void txtNhapLaiMKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhapLaiMKKeyPressed
        if(txtNhapLaiMK.getText().length() > 15)
            txtNhapLaiMK.setText(txtNhapLaiMK.getText().substring(0, 15));
    }//GEN-LAST:event_txtNhapLaiMKKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnThayDoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLoi;
    private javax.swing.JLabel lblMKCu;
    private javax.swing.JLabel lblMKMoi;
    private javax.swing.JLabel lblNapLaiMK;
    private javax.swing.JLabel lblTenNguoiSuDung;
    private javax.swing.JLabel lblTenTaiKhoan;
    private javax.swing.JLabel lblThanhCong;
    private javax.swing.JPanel panelChucNang;
    private javax.swing.JPasswordField txtMKCu;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JPasswordField txtNhapLaiMK;
    private javax.swing.JTextField txtTenNguoiDung;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
