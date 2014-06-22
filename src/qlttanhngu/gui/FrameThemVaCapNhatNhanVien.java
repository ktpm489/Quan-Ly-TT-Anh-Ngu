/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import com.mysql.jdbc.CallableStatement;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlttanhngu.controller.NhanVienController;
import qlttanhngu.dao.NhanVienDAO;
import qlttanhngu.dto.NhanVienDTO;

/**
 *
 * @author DuyLuu
 */
public class FrameThemVaCapNhatNhanVien extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameThemVaCapNhatNhanVien
     */
    NhanVienController nhanviencontroller;
    public FrameThemVaCapNhatNhanVien() {
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

        jPanel2 = new javax.swing.JPanel();
        btnDong = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        txtHoTen = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtTaiKhoan = new javax.swing.JTextField();
        lblTrinhDo = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblQuocTich = new javax.swing.JLabel();
        comboxGioiTinh = new javax.swing.JComboBox();
        lblGioiTinh = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        txtQuocTich = new javax.swing.JTextField();
        lbChucVu = new javax.swing.JLabel();
        comboxChucVu = new javax.swing.JComboBox();
        txtTrinhDo = new javax.swing.JTextField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnLuu))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtHoTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoTenKeyTyped(evt);
            }
        });

        txtSoDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoDTKeyTyped(evt);
            }
        });

        lblDiaChi.setText("Địa Chỉ");

        txtMaNhanVien.setEnabled(false);

        txtTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTaiKhoanKeyTyped(evt);
            }
        });

        lblTrinhDo.setText("Trình độ");

        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyTyped(evt);
            }
        });

        lblHoTen.setText("Họ Tên");

        lblTaiKhoan.setText("Tài khoản");

        lblSoDT.setText("Số Điện thoại");

        txtDiaChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaChiKeyTyped(evt);
            }
        });

        lblQuocTich.setText("Quốc tịch");

        comboxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
        comboxGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxGioiTinhActionPerformed(evt);
            }
        });

        lblGioiTinh.setText("Giới Tính");

        lblMatKhau.setText("Mật khẩu");

        lblMaNhanVien.setText("Mã Nhân Viên");

        txtQuocTich.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuocTichKeyTyped(evt);
            }
        });

        lbChucVu.setText("Chức vụ");

        comboxChucVu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Giảng Viên", "Kế Toán" }));
        comboxChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxChucVuActionPerformed(evt);
            }
        });

        txtTrinhDo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrinhDoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQuocTich)
                            .addComponent(lblHoTen)
                            .addComponent(lblMaNhanVien)
                            .addComponent(lblSoDT)
                            .addComponent(lblTaiKhoan)
                            .addComponent(lblMatKhau))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSoDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtMaNhanVien)
                                        .addComponent(txtQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblGioiTinh)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDiaChi)
                                            .addComponent(lblTrinhDo)))
                                    .addComponent(lbChucVu, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTrinhDo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboxChucVu, javax.swing.GroupLayout.Alignment.LEADING, 0, 197, Short.MAX_VALUE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaNhanVien)
                    .addComponent(lbChucVu)
                    .addComponent(comboxChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoTen)
                    .addComponent(lblGioiTinh)
                    .addComponent(comboxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuocTich)
                    .addComponent(lblTrinhDo)
                    .addComponent(txtTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoDT)
                    .addComponent(lblDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaiKhoan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        NhanVienDTO nhanviendto = new NhanVienDTO();
        //Kiểm tra mã, họ tên không dc null, kiểm tra kiễu dữ số dt, ......
        if ("".equals(txtMaNhanVien.getText()) || "".equals(txtHoTen.getText())) {
            JOptionPane.showMessageDialog(this, "Lỗi .Xin vui lòng kiểm tra lại kiểu dữ liệu đã nhập vào !");
            return;
        }
        if(StoreSave.nhanvien != null){
            try {
                nhanviendto.setMaNhanVien(txtMaNhanVien.getText());
                nhanviendto.setQuocTich(txtQuocTich.getText());
                nhanviendto.setDiaChi(txtDiaChi.getText());
                nhanviendto.setTrinhDo(txtTrinhDo.getText());
                nhanviendto.setGioiTinh(comboxGioiTinh.getSelectedItem() == "Nam" ? true : false);
                nhanviendto.setMaChucVu(new NhanVienController().GetMaChucVuTheoTen(comboxChucVu.getSelectedItem().toString()));
                nhanviendto.setSoDienThoai(("".equals(txtSoDT.getText()) ? "0" : txtSoDT.getText()));
                nhanviendto.setTaiKhoan(txtTaiKhoan.getText());
                nhanviendto.setHoTen(txtHoTen.getText());

                //Kiểm tra xem có chắc chắn cập nhât không?
                int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn cập nhật học viên này không ?", "Thông báo", JOptionPane.OK_CANCEL_OPTION);
                if (x == 0) {
                    try {
                        new NhanVienController().UpdateNhanVien(nhanviendto);//ien(StoreSave.hocvien);
                    } catch (Exception ex) {
                        Logger.getLogger(FrameThemVaCapNhatNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //refresh lại table ds hoc vien
                StoreSave.frameNhanVien.refreshTable();
            } catch (Exception ex) {
                Logger.getLogger(FrameThemVaCapNhatNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                nhanviendto.setMaNhanVien(txtMaNhanVien.getText());
                nhanviendto.setQuocTich(txtQuocTich.getText());
                nhanviendto.setDiaChi(txtDiaChi.getText());
                nhanviendto.setTrinhDo(txtTrinhDo.getText());
                nhanviendto.setGioiTinh(comboxGioiTinh.getSelectedItem() == "Nam" ? true : false);
                nhanviendto.setMaChucVu(new NhanVienController().GetMaChucVuTheoTen(comboxChucVu.getSelectedItem().toString()));
                nhanviendto.setSoDienThoai(("".equals(txtSoDT.getText()) ? "0" : txtSoDT.getText()));
                nhanviendto.setTaiKhoan(txtTaiKhoan.getText());
                nhanviendto.setHoTen(txtHoTen.getText());

                //Kiểm tra xem có chắc chắn thêm không?
                int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn thêm học viên này không ?", "Thông báo", JOptionPane.OK_CANCEL_OPTION);
                if (x == 0) {
                    try {
                        new NhanVienController().ThemNhanVien(nhanviendto);//ien(StoreSave.hocvien);
                    } catch (Exception ex) {
                        Logger.getLogger(FrameThemVaCapNhatNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //refresh lại table ds hoc vien
                StoreSave.frameNhanVien.refreshTable();
            } catch (Exception ex) {
                Logger.getLogger(FrameThemVaCapNhatNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtHoTenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoTenKeyTyped

        char vChar = evt.getKeyChar();
        int len = txtHoTen.getText().length();

        if ((Character.isDigit(vChar))
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE)
            || (vChar == KeyEvent.VK_ENTER)
            || (vChar == KeyEvent.VK_TAB) || (len > 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHoTenKeyTyped

    private void txtSoDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoDTKeyTyped
        char vChar = evt.getKeyChar();
        int len = txtSoDT.getText().length();

        if (!(Character.isDigit(vChar))
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE)
            || (vChar == KeyEvent.VK_ENTER)
            || (vChar == KeyEvent.VK_TAB) || (len > 11)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSoDTKeyTyped

    private void txtTaiKhoanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaiKhoanKeyTyped
        int len = txtTaiKhoan.getText().length();

        if (len > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTaiKhoanKeyTyped

    private void txtMatKhauKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyTyped
        int len = txtMatKhau.getText().length();

        if (len > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMatKhauKeyTyped

    private void txtDiaChiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaChiKeyTyped
        int len = txtDiaChi.getText().length();

        if (len > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDiaChiKeyTyped

    private void comboxGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxGioiTinhActionPerformed

    private void txtQuocTichKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuocTichKeyTyped
        char vChar = evt.getKeyChar();
        int len = txtQuocTich.getText().length();

        if ((Character.isDigit(vChar))
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE)
            || (vChar == KeyEvent.VK_ENTER)
            || (vChar == KeyEvent.VK_TAB) || (len > 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuocTichKeyTyped

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        if(StoreSave.nhanvien != null){
            
            try {
                txtMaNhanVien.setText(StoreSave.nhanvien.getMaNhanVien());
                comboxChucVu.setSelectedItem(new NhanVienController().GetTenChucVuTheoMa(StoreSave.nhanvien.getMaChucVu().toString()));
                txtHoTen.setText(StoreSave.nhanvien.getHoTen());
                txtTrinhDo.setText(StoreSave.nhanvien.getTrinhDo());
                txtQuocTich.setText(StoreSave.nhanvien.getQuocTich());
                comboxGioiTinh.setSelectedItem(StoreSave.nhanvien.getGioiTinh() == true ? "Nam" : "Nữ");
                txtDiaChi.setText(StoreSave.nhanvien.getDiaChi());
                txtTaiKhoan.setText(StoreSave.nhanvien.getTaiKhoan());
                txtSoDT.setText(StoreSave.nhanvien.getSoDienThoai());
            } catch (Exception ex) {
                Logger.getLogger(FrameThemVaCapNhatNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            //txtMaNhanVien.setText(StoreSave.nhanvien.getMaNhanVien());
            
            //txtMatKhau.setText(StoreSave.nhanvien.getMatKhau());
        }
        else if(StoreSave.nhanvien == null){
            try {      
                txtMaNhanVien.setText(this.CreateMa());
                txtHoTen.setText("");
                comboxChucVu.setSelectedIndex(1);
                //txtMaNhanVien.setText("");
                txtTrinhDo.setText("");
                txtQuocTich.setText("");
                comboxGioiTinh.setSelectedIndex(1);
                txtDiaChi.setText("");
                txtTaiKhoan.setText("");
                txtSoDT.setText("");
            } catch (Exception ex) {
                Logger.getLogger(FrameThemVaCapNhatNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void comboxChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxChucVuActionPerformed

    private void txtTrinhDoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrinhDoKeyTyped

        int len = txtTrinhDo.getText().length();

        if (len > 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTrinhDoKeyTyped
    
    //tạo mã tự động 
    public String CreateMa() throws Exception {
        Integer maNhanVien = (new NhanVienController().MaNhanVien());
        maNhanVien += 1;

        int len = maNhanVien.toString().length();
        String maMacDinh = "NV00000000";

        maMacDinh = maMacDinh.substring(0, maMacDinh.length() - len) + maNhanVien.toString();

        return maMacDinh;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox comboxChucVu;
    private javax.swing.JComboBox comboxGioiTinh;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbChucVu;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblQuocTich;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTrinhDo;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTrinhDo;
    // End of variables declaration//GEN-END:variables
}
