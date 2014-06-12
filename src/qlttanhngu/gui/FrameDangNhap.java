/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.controller.PhanQuyenController;
import qlttanhngu.controller.UserAccountController;
import qlttanhngu.dto.UserAccountDTO;

/**
 *
 * @author XUANVINHTD
 */
public class FrameDangNhap extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameDangNhap
     */
    public FrameDangNhap() {
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
        btnDangNHap = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        lblDangNhap = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        lblLoi = new javax.swing.JLabel();

        setTitle("Đăng Nhập");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnDangNHap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Accept1.png"))); // NOI18N
        btnDangNHap.setText("Đăng Nhập");
        btnDangNHap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNHapActionPerformed(evt);
            }
        });
        btnDangNHap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNHapKeyPressed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        lblDangNhap.setText("Tên Đăng Nhập :");

        lblMatKhau.setText("Mật Khẩu :");

        txtDangNhap.setMaximumSize(new java.awt.Dimension(10, 10));
        txtDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDangNhapKeyPressed(evt);
            }
        });

        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

        lblLoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLoi.setForeground(new java.awt.Color(255, 0, 0));
        lblLoi.setText("Thông tin nhập sai hoặc chưa đầy đủ !");
        lblLoi.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMatKhau)
                    .addComponent(lblDangNhap))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDangNHap)
                        .addGap(41, 41, 41)
                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau)
                            .addComponent(txtDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLoi)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDangNhap)
                    .addComponent(txtDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMatKhau)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNHap)
                    .addComponent(btnDong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoi)
                .addContainerGap(42, Short.MAX_VALUE))
        );

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

    private void txtDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDangNhapKeyPressed
        if (txtDangNhap.getText().length() > 15) {
            txtDangNhap.setText(txtDangNhap.getText().substring(0, 15));
        }
    }//GEN-LAST:event_txtDangNhapKeyPressed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        if (txtMatKhau.getText().length() > 15) {
            txtMatKhau.setText(txtMatKhau.getText().substring(0, 15));
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void btnDangNHapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNHapActionPerformed
        try {
            UserAccountDTO user = new UserAccountDTO();
            user.setUsername(txtDangNhap.getText());
            user.setPassword(txtMatKhau.getText());
            String x = txtMatKhau.getText();

            try {
                UserAccountController UserController = new UserAccountController();

                //kiểm tra đang nhâp
                if (UserController.isUserExit(user)) {
                    StoreSave.frameMain.ChangeNameUser(StoreSave.userNamSave);
                    StoreSave.frameMain.KiemTraPhanQuyen();
                    this.dispose();
                } else {
                    lblLoi.setVisible(true);
                }
            } catch (Exception ex) {
                Logger.getLogger(FrameDangNhap.class.getName()).log(Level.SEVERE, null, ex);
            }

            //lấy danh sách quyền của user để kiêm tra.
            DefaultTableModel defaultTableModel = (new PhanQuyenController().CheckListAuthorizationOfUser(StoreSave.mahocvien));
            List<String> lstQuyen = new ArrayList<String>();
            
            for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
                lstQuyen.add(defaultTableModel.getValueAt(i, 0).toString());
            }
            StoreSave.phanquyen.setQuyen(lstQuyen);
        } catch (Exception ex) {
            Logger.getLogger(FrameDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangNHapActionPerformed
    //bắt sự kiện nhấn Enter
    private void btnDangNHapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNHapKeyPressed

        int id = evt.getID();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDangNHapActionPerformed(null);
        }
    }//GEN-LAST:event_btnDangNHapKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNHap;
    private javax.swing.JButton btnDong;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblLoi;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JTextField txtDangNhap;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables
}
