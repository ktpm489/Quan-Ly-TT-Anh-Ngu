/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import com.sun.org.apache.xml.internal.utils.StopParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.controller.HocVienController;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XUANVINHTD
 */
public class FrameCapNhatHocVien extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameCapNhatHocVien
     */
    public FrameCapNhatHocVien() {
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

        panelTTCaNhan = new javax.swing.JPanel();
        lblHoTen = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblCMND = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        dateChooserNgaySinh = new com.toedter.calendar.JDateChooser();
        comboxTinhTrangHoc = new javax.swing.JComboBox();
        txtEmail = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        panelChuCNang = new javax.swing.JPanel();
        btnLuu = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        comboxGioiTinh = new javax.swing.JComboBox();
        lblMaHocVien = new javax.swing.JLabel();
        txtMaHocVien = new javax.swing.JTextField();
        lblMaChungChi = new javax.swing.JLabel();
        lblNgheNghiep = new javax.swing.JLabel();
        txtNgheNghiep = new javax.swing.JTextField();
        lblSoLuongCuocHen = new javax.swing.JLabel();
        txtSoLuongCuocHen = new javax.swing.JTextField();
        comboBoxTenChungChi = new javax.swing.JComboBox();

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

        panelTTCaNhan.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Cá Nhân"));

        lblHoTen.setText("Họ Tên");

        lblNgaySinh.setText("Ngày Sinh");

        lblCMND.setText("CMND");

        lblSoDT.setText("Số Điện thoại");

        lblEmail.setText("Email");

        lblDiaChi.setText("Địa Chỉ");

        jLabel7.setText("Giới Tính");

        jLabel8.setText("Tình Trạng Học");

        dateChooserNgaySinh.setDateFormatString("dd/MM/yyyy");

        comboxTinhTrangHoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiềm Năng", "Chính Thức" }));

        panelChuCNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChuCNangLayout = new javax.swing.GroupLayout(panelChuCNang);
        panelChuCNang.setLayout(panelChuCNangLayout);
        panelChuCNangLayout.setHorizontalGroup(
            panelChuCNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuCNangLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelChuCNangLayout.setVerticalGroup(
            panelChuCNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuCNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChuCNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnDong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        lblMaHocVien.setText("Mã Học VIên");

        txtMaHocVien.setEnabled(false);

        lblMaChungChi.setText("Tên Chứng Chỉ");

        lblNgheNghiep.setText("Nghề nghiệp");

        lblSoLuongCuocHen.setText("Số lượng cuộc hẹn");

        try{
            comboBoxTenChungChi.setModel(new HocVienController().GetListTenChungChi());
        }catch(Exception e){

        }

        javax.swing.GroupLayout panelTTCaNhanLayout = new javax.swing.GroupLayout(panelTTCaNhan);
        panelTTCaNhan.setLayout(panelTTCaNhanLayout);
        panelTTCaNhanLayout.setHorizontalGroup(
            panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTCaNhanLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSoDT)
                        .addComponent(lblCMND, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblNgaySinh)
                    .addComponent(lblHoTen)
                    .addComponent(lblMaHocVien)
                    .addComponent(lblMaChungChi))
                .addGap(18, 18, 18)
                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxTenChungChi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSoDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                        .addComponent(txtCMND, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(lblDiaChi, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNgheNghiep, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblSoLuongCuocHen))
                .addGap(30, 30, 30)
                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSoLuongCuocHen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboxTinhTrangHoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(panelChuCNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTTCaNhanLayout.setVerticalGroup(
            panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTCaNhanLayout.createSequentialGroup()
                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTTCaNhanLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(panelChuCNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTTCaNhanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaHocVien)
                            .addComponent(txtMaHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgheNghiep)
                            .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTTCaNhanLayout.createSequentialGroup()
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHoTen)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNgaySinh)
                                    .addComponent(dateChooserNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCMND)
                                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSoDT)
                                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelTTCaNhanLayout.createSequentialGroup()
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(comboxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDiaChi)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(comboxTinhTrangHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTTCaNhanLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoLuongCuocHen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSoLuongCuocHen)))
                            .addGroup(panelTTCaNhanLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBoxTenChungChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMaChungChi))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTTCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTTCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        HocVienDTO hocviendto = new HocVienDTO();
        //Kiểm tra mã không dc null
        if("".equals(txtMaHocVien.getText())){
            MessageBoxHocVien messageBoxHocVien = new MessageBoxHocVien();
            StoreSave.desktop.add(messageBoxHocVien);
            messageBoxHocVien.setBounds(400, 300, 511, 189);
            messageBoxHocVien.show();
            return;
        }
        try {
            HocVienController hocvienController = new HocVienController();

            hocviendto.setMaHocVien(txtMaHocVien.getText());
            hocviendto.setCmnd(txtCMND.getText());
            hocviendto.setDiaChi(txtDiaChi.getText());
            hocviendto.setEmail(txtEmail.getText());
            hocviendto.setGioiTinh(comboxGioiTinh.getSelectedItem()== "Nam" ? true : false);
            hocviendto.setMaChungChi(new HocVienController().GetMaChungChiTheoTen(comboBoxTenChungChi.getSelectedItem().toString()));
            hocviendto.setNamSinh(dateChooserNgaySinh.getDate());
            hocviendto.setNgheNghiep(txtNgheNghiep.getText());
            hocviendto.setSoDienThoai(Integer.parseInt("".equals(txtSoDT.getText()) ? "0" : txtSoDT.getText()));
            hocviendto.setSoLuongLienLac(Integer.parseInt("".equals(txtSoLuongCuocHen.getText()) ? "0" : txtSoLuongCuocHen.getText()));
            hocviendto.setTenHocVien(txtHoTen.getText());
            hocviendto.setTinhTrangHoc(comboxTinhTrangHoc.getSelectedIndex()== 1 ? true : false);
            //Kiểm tra xem cập nhật thành công không?
            if(hocvienController.UpdateHocVien(hocviendto)){
                MessageBoxHocVien messageBoxHocVien = new MessageBoxHocVien();
                StoreSave.desktop.add(messageBoxHocVien);
                messageBoxHocVien.show();
            }
        } catch (Exception ex) {
            Logger.getLogger(FrameDSHocVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           // tableDSHocVien.setModel(new HocVienController().LoadListHocVien());
        } catch (Exception ex) {
            Logger.getLogger(FrameDSHocVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    //Load dữ liệu vào các compoment của frame
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        if(StoreSave.hocvien != null){
            txtMaHocVien.setText(StoreSave.hocvien.getMaHocVien());
            txtHoTen.setText(StoreSave.hocvien.getTenHocVien());
            txtCMND.setText(StoreSave.hocvien.getCmnd());
            dateChooserNgaySinh.setDate(StoreSave.hocvien.getNamSinhUpdate());        
            comboxGioiTinh.setSelectedIndex(StoreSave.hocvien.getGioiTinh() == "Nam" ? 0 : 1);
            comboBoxTenChungChi.setSelectedItem(StoreSave.hocvien.getTenChungChi());
            txtNgheNghiep.setText(StoreSave.hocvien.getNgheNghiep());
            txtSoDT.setText(StoreSave.hocvien.getSoDienThoai().toString());
            txtDiaChi.setText(StoreSave.hocvien.getDiaChi());
            txtEmail.setText(StoreSave.hocvien.getEmail());
            txtSoLuongCuocHen.setText(StoreSave.hocvien.getSoLuongLienLac().toString());
            comboxTinhTrangHoc.setSelectedIndex(StoreSave.hocvien.getTinhTrangHoc() == "Chính Thức" ? 0 : 1);         
            
            //reset hoc vien
            StoreSave.hocvien = null; 
        }
    }//GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox comboBoxTenChungChi;
    private javax.swing.JComboBox comboxGioiTinh;
    private javax.swing.JComboBox comboxTinhTrangHoc;
    private com.toedter.calendar.JDateChooser dateChooserNgaySinh;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaChungChi;
    private javax.swing.JLabel lblMaHocVien;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNgheNghiep;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblSoLuongCuocHen;
    private javax.swing.JPanel panelChuCNang;
    private javax.swing.JPanel panelTTCaNhan;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaHocVien;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtSoLuongCuocHen;
    // End of variables declaration//GEN-END:variables
}
