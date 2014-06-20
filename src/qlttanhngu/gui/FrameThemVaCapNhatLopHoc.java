/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import qlttanhngu.controller.LopHocController;
import qlttanhngu.dto.LopHocDTO;

/**
 *
 * @author DuyLuu
 */
public class FrameThemVaCapNhatLopHoc extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameThemVaCapNhatLopHoc
     */
    public FrameThemVaCapNhatLopHoc() {
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

        lblThu = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        txtMaLop = new javax.swing.JTextField();
        comboBoxThu = new javax.swing.JComboBox();
        lblBuoi = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        lblNgayBatDau = new javax.swing.JLabel();
        lblHocPhi = new javax.swing.JLabel();
        comboBoxBuoi = new javax.swing.JComboBox();
        lblNgayKetThuc = new javax.swing.JLabel();
        lblTenLop = new javax.swing.JLabel();
        lblMaLop = new javax.swing.JLabel();
        lblTenGiangVien = new javax.swing.JLabel();
        lblChuongTrinhHoc = new javax.swing.JLabel();
        dateChooserNgayKetThuc = new com.toedter.calendar.JDateChooser();
        dateChooserNgayBatDau = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnDong = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        comboBoxGVien = new javax.swing.JComboBox();
        comboBoxChuongTrinhHoc = new javax.swing.JComboBox();
        lblTenPhong = new javax.swing.JLabel();
        comboBoxTenPhong = new javax.swing.JComboBox();
        comboBoxKhoaHoc = new javax.swing.JComboBox();
        lblKhoaHoc = new javax.swing.JLabel();

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

        lblThu.setText("Thứ ");

        comboBoxThu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hai", "Ba", "Tư", "Năm", "Sáu", "Bảy", "CN" }));

        lblBuoi.setText("Buổi");

        lblNgayBatDau.setText("Ngày Bắt Đầu");

        lblHocPhi.setText("Học Phí");

        comboBoxBuoi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sáng", "Chiều", "Tối" }));

        lblNgayKetThuc.setText("Ngày Kết Thúc");

        lblTenLop.setText("Tên Lớp");

        lblMaLop.setText("Mã Lớp");

        lblTenGiangVien.setText("Tên Giảng Viên");

        lblChuongTrinhHoc.setText("Chương trình học");

        dateChooserNgayKetThuc.setDateFormatString("dd/MM/YYYY");

        dateChooserNgayBatDau.setDateFormatString("dd/MM/YYYY");

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
                .addGap(93, 93, 93)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
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

        lblTenPhong.setText("Phòng học");

        lblKhoaHoc.setText("Khóa học");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNgayKetThuc)
                            .addComponent(lblNgayBatDau)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKhoaHoc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblChuongTrinhHoc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTenLop, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMaLop, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTenGiangVien, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTenPhong, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxGVien, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxChuongTrinhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHocPhi)
                                    .addComponent(lblThu)
                                    .addComponent(lblBuoi))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateChooserNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateChooserNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxBuoi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxThu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayBatDau)
                            .addComponent(dateChooserNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateChooserNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHocPhi)
                            .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblThu)
                            .addComponent(comboBoxThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaLop)
                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenLop)
                            .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxChuongTrinhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChuongTrinhHoc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKhoaHoc)
                            .addComponent(comboBoxKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenGiangVien)
                            .addComponent(comboBoxGVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenPhong)
                            .addComponent(comboBoxTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxBuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBuoi)))
                .addGap(68, 68, 68)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        LopHocDTO lophocdto = new LopHocDTO();
        //Kiểm tra mã, họ tên không dc null, kiểm tra kiễu dữ số dt, ......
        if ("".equals(txtMaLop.getText()) || "".equals(txtTenLop.getText())) {
            JOptionPane.showMessageDialog(this, "Lỗi .Xin vui lòng kiểm tra lại kiểu dữ liệu đã nhập vào !");
            return;
        }

        try {
            lophocdto.setMaLop(txtMaLop.getText());
            lophocdto.setMaNhanVien(getKey(new LopHocController().GetListGiangVien(),comboBoxGVien.getSelectedItem().toString()));
            lophocdto.setMaPhong(getKey(new LopHocController().GetListPhongHoc(), comboBoxTenPhong.getSelectedItem().toString()));
            lophocdto.setMaChuongTrinhHoc(getKey(new LopHocController().GetListChuongTrinhHoc(), comboBoxChuongTrinhHoc.getSelectedItem().toString()));
            lophocdto.setMaKhoaHoc(getKey(new LopHocController().GetListKhoaHoc(), comboBoxKhoaHoc.getSelectedItem().toString()));
            lophocdto.setTenLop(txtTenLop.getText());
            

            lophocdto.setNgayBatDau(this.dateChooserNgayBatDau.getDate());
            lophocdto.setNgayKetThuc(this.dateChooserNgayKetThuc.getDate());
            lophocdto.setHocPhi(Double.parseDouble(("".equals(txtHocPhi.getText()))? "0" : txtHocPhi.getText()));
            
            //Lay thong tin de cap nhat
            StoreSave.lophoc = lophocdto;
            //Kiểm tra xem có chắc chắn cập nhât không?
            int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn cập nhật học viên này không ?", "Thông báo", JOptionPane.OK_CANCEL_OPTION);
            if (x == 0) {
                try {
                    new LopHocController().CapNhatThemLopHoc(StoreSave.lophoc);//ien(StoreSave.hocvien);
                } catch (Exception ex) {
                    Logger.getLogger(FrameThemVaCapNhatLopHoc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //refresh lại table ds hoc vien
            StoreSave.frameLopHoc.refreshTable();
        } catch (Exception ex) {
            Logger.getLogger(FrameLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //Đổ danh sách trình độ vào combobox
        try{       
            Vector<String> vectorChuongTrinhHoc = new Vector<>();
            hashMapChuongTrinhHoc = new LopHocController().GetListChuongTrinhHoc();
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(hashMapChuongTrinhHoc.values().toArray());
                //set model cho comboBoxTrinhDo
            comboBoxChuongTrinhHoc.setModel(defaultComboBoxModel);

                //Đổ danh sách Khóa học vào ComboBox
            Vector<String> vectorKhoaHoc = new Vector<>();
            hashMapKhoahoc = new LopHocController().GetListKhoaHoc();
            DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel(hashMapKhoahoc.values().toArray());
                //Set model cho comboBox
            comboBoxKhoaHoc.setModel(defaultComboBoxModel1);

                //Đổ danh sách Giảng viên vào comboBox
            Vector<String> vectorGiangVien = new Vector<>();
            hashMapGiangVien = new LopHocController().GetListGiangVien();
            DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel(hashMapGiangVien.values().toArray());
            comboBoxGVien.setModel(defaultComboBoxModel2);

                //Đổ dánh sách Phòng học vào comboBox
            Vector<String> vectorPhongHoc = new Vector<>();
            hashMapPhongHoc = new LopHocController().GetListPhongHoc();
            DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel(hashMapPhongHoc.values().toArray());
            comboBoxTenPhong.setModel(defaultComboBoxModel3);
        }catch(Exception ex){
            Logger.getLogger(FrameThemVaCapNhatLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(StoreSave.lophoc != null)
        {
            
            try {
                txtMaLop.setText(StoreSave.lophoc.getMaLop());
                txtTenLop.setText(StoreSave.lophoc.getTenLop());
                txtHocPhi.setText(StoreSave.lophoc.getHocPhi().toString());
                dateChooserNgayBatDau.setDate(StoreSave.lophoc.getNgayBatDauUpdate());
                dateChooserNgayKetThuc.setDate(StoreSave.lophoc.getNgayKetThucUpdate());
                comboBoxGVien.setSelectedItem(new LopHocController().GetListGiangVien().get(StoreSave.lophoc.getMaNhanVien()));
                comboBoxChuongTrinhHoc.setSelectedItem(new LopHocController().GetListChuongTrinhHoc().get(StoreSave.lophoc.getMaChuongTrinhHoc()) );
                comboBoxKhoaHoc.setSelectedItem(new LopHocController().GetListKhoaHoc().get(StoreSave.lophoc.getMaKhoaHoc()));
                comboBoxTenPhong.setSelectedItem(new LopHocController().GetListPhongHoc().get(StoreSave.lophoc.getMaPhong()));
            } catch (Exception ex) {
                Logger.getLogger(FrameThemVaCapNhatLopHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
    }//GEN-LAST:event_formInternalFrameActivated
    
    private String getKey(HashMap<String, String> hashMap ,String value) {
        try {
            for (Object s : hashMap.keySet()) {
                if (hashMap.get(s).equals(value)) {
                    return (String) s;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(FrameLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
}
    
    private static HashMap hashMapChuongTrinhHoc;
    private static HashMap hashMapKhoahoc;
    private static HashMap hashMapGiangVien;
    private static HashMap hashMapPhongHoc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox comboBoxBuoi;
    private javax.swing.JComboBox comboBoxChuongTrinhHoc;
    private javax.swing.JComboBox comboBoxGVien;
    private javax.swing.JComboBox comboBoxKhoaHoc;
    private javax.swing.JComboBox comboBoxTenPhong;
    private javax.swing.JComboBox comboBoxThu;
    private com.toedter.calendar.JDateChooser dateChooserNgayBatDau;
    private com.toedter.calendar.JDateChooser dateChooserNgayKetThuc;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBuoi;
    private javax.swing.JLabel lblChuongTrinhHoc;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblMaLop;
    private javax.swing.JLabel lblNgayBatDau;
    private javax.swing.JLabel lblNgayKetThuc;
    private javax.swing.JLabel lblTenGiangVien;
    private javax.swing.JLabel lblTenLop;
    private javax.swing.JLabel lblTenPhong;
    private javax.swing.JLabel lblThu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}