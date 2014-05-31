/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import java.awt.Frame;
import java.awt.Rectangle;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author XUANVINHTD
 */
public class FrameMain extends javax.swing.JFrame {

    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
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

        jButton1 = new javax.swing.JButton();
        TabTrangChinh = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        btnThongTin = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnQuyDinh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnDangKyHoc = new javax.swing.JButton();
        btnHoaDonHocPhi = new javax.swing.JButton();
        btnLichHoc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDSHocVien = new javax.swing.JButton();
        btnLopHoc = new javax.swing.JButton();
        btnThoiKhoaBieu = new javax.swing.JButton();
        btnLichThi = new javax.swing.JButton();
        btnDSGiangVien = new javax.swing.JButton();
        btnBangDiem = new javax.swing.JButton();
        btnXepLop = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBCNo = new javax.swing.JButton();
        btnBCDangKy = new javax.swing.JButton();
        btnBCHocVu = new javax.swing.JButton();
        desktopPanel = new javax.swing.JDesktopPane();
        lblImageBackground = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần Mềm Quản Lý Trung Tâm Anh Ngữ");
        setForeground(new java.awt.Color(102, 204, 255));
        setIconImages(null);
        setName("FrameMain"); // NOI18N

        TabTrangChinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 255)));

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Login.png"))); // NOI18N
        btnDangNhap.setToolTipText("Đăng Nhập Vào Tài Khoản Để Sử Dụng Phần Mềm");
        btnDangNhap.setLabel("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logout.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/help.png"))); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setToolTipText("Hướng Dẫn  Sử Dụng Phần Mềm");
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });

        btnThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/information (1).png"))); // NOI18N
        btnThongTin.setText("Thông Tin");

        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ChangePass.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi Mật Khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        btnQuyDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/rules-icon.png"))); // NOI18N
        btnQuyDinh.setText("Quy Định");
        btnQuyDinh.setToolTipText("Quy Định và Một Số Yêu Cầu Của Trung Tâm Anh Ngữ");
        btnQuyDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuyDinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDoiMatKhau)
                .addGap(94, 94, 94)
                .addComponent(btnQuyDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuyDinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuongDan, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        TabTrangChinh.addTab("Trang Chính", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        btnDangKyHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/signup-icon.png"))); // NOI18N
        btnDangKyHoc.setText("Đăng Ký");
        btnDangKyHoc.setToolTipText("Đăng Ký Lớp Học Cho Học Viên");
        btnDangKyHoc.setMaximumSize(new java.awt.Dimension(143, 57));
        btnDangKyHoc.setMinimumSize(new java.awt.Dimension(143, 57));
        btnDangKyHoc.setPreferredSize(new java.awt.Dimension(143, 57));
        btnDangKyHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyHocActionPerformed(evt);
            }
        });

        btnHoaDonHocPhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bill.png"))); // NOI18N
        btnHoaDonHocPhi.setText(" Học Phí");
        btnHoaDonHocPhi.setToolTipText(" Tạo Hóa Đơn Học Phí Cho Mỗi Học Viên");
        btnHoaDonHocPhi.setMaximumSize(new java.awt.Dimension(143, 57));
        btnHoaDonHocPhi.setMinimumSize(new java.awt.Dimension(143, 57));
        btnHoaDonHocPhi.setPreferredSize(new java.awt.Dimension(143, 57));
        btnHoaDonHocPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonHocPhiActionPerformed(evt);
            }
        });

        btnLichHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/table-add-icon.png"))); // NOI18N
        btnLichHoc.setText("Lịch Học");
        btnLichHoc.setToolTipText("Danh Sách Lịch Học Của Các Lớp Mới Mở");
        btnLichHoc.setMaximumSize(new java.awt.Dimension(143, 57));
        btnLichHoc.setMinimumSize(new java.awt.Dimension(143, 57));
        btnLichHoc.setPreferredSize(new java.awt.Dimension(143, 57));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDangKyHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLichHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHoaDonHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLichHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHoaDonHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangKyHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnDangKyHoc.getAccessibleContext().setAccessibleName("");
        btnHoaDonHocPhi.getAccessibleContext().setAccessibleName("Hóa Đơn\nHọc Phí"); // NOI18N

        TabTrangChinh.addTab("Quản Lý Đăng Ký -  Hóa Đơn", jPanel4);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));
        jPanel2.setForeground(new java.awt.Color(51, 255, 255));

        btnDSHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ListStudent.png"))); // NOI18N
        btnDSHocVien.setText("Học Viên");
        btnDSHocVien.setToolTipText("Danh Sách Học Viên Chính Thức Tại Trung Tâm");
        btnDSHocVien.setMaximumSize(new java.awt.Dimension(143, 57));
        btnDSHocVien.setMinimumSize(new java.awt.Dimension(143, 57));
        btnDSHocVien.setPreferredSize(new java.awt.Dimension(143, 57));
        btnDSHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSHocVienActionPerformed(evt);
            }
        });

        btnLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Class.png"))); // NOI18N
        btnLopHoc.setText("Lớp Học");
        btnLopHoc.setToolTipText(" Danh Sách Lớp Học Tại Trung Tâm");
        btnLopHoc.setMaximumSize(new java.awt.Dimension(143, 57));
        btnLopHoc.setMinimumSize(new java.awt.Dimension(143, 57));
        btnLopHoc.setPreferredSize(new java.awt.Dimension(143, 57));
        btnLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLopHocActionPerformed(evt);
            }
        });

        btnThoiKhoaBieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/table-add-icon.png"))); // NOI18N
        btnThoiKhoaBieu.setText("Lịch Học");
        btnThoiKhoaBieu.setToolTipText("Thời Gian Học Chi Tiết Cho Từng Lớp Học");
        btnThoiKhoaBieu.setMaximumSize(new java.awt.Dimension(143, 57));
        btnThoiKhoaBieu.setMinimumSize(new java.awt.Dimension(143, 57));
        btnThoiKhoaBieu.setPreferredSize(new java.awt.Dimension(143, 57));
        btnThoiKhoaBieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoiKhoaBieuActionPerformed(evt);
            }
        });

        btnLichThi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/table-colums-icon.png"))); // NOI18N
        btnLichThi.setText("Lịch Thi");
        btnLichThi.setToolTipText("Lịch Thi Chi tiết Cho Từng Lớp Học");
        btnLichThi.setMaximumSize(new java.awt.Dimension(143, 57));
        btnLichThi.setMinimumSize(new java.awt.Dimension(143, 57));
        btnLichThi.setPreferredSize(new java.awt.Dimension(143, 57));

        btnDSGiangVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Teachers-icon.png"))); // NOI18N
        btnDSGiangVien.setText("Nhân Viên");
        btnDSGiangVien.setToolTipText("Danh Sách Giảng Viên Tại Trung Tâm");
        btnDSGiangVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSGiangVienActionPerformed(evt);
            }
        });

        btnBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/scoreList.png"))); // NOI18N
        btnBangDiem.setText("Bảng Điểm");
        btnBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangDiemActionPerformed(evt);
            }
        });

        btnXepLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/repost.png"))); // NOI18N
        btnXepLop.setText("Xếp Lớp");
        btnXepLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXepLopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDSHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBangDiem)
                .addGap(124, 124, 124)
                .addComponent(btnDSGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXepLop, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThoiKhoaBieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLichThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDSHocVien, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(btnBangDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDSGiangVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXepLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoiKhoaBieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLichThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TabTrangChinh.addTab("Quản Lý Học Vụ", jPanel2);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        btnBCNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/chart-icon.png"))); // NOI18N
        btnBCNo.setText("Báo Cáo Công Nợ");
        btnBCNo.setToolTipText("Danh Sách Các Học Viên Còn Nợ Học Phí");
        btnBCNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCNoActionPerformed(evt);
            }
        });

        btnBCDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/custom-reports-icon.png"))); // NOI18N
        btnBCDangKy.setText("Báo Cáo Đăng Ký");
        btnBCDangKy.setToolTipText("Báo Cáo Danh Sách Học Viên Đăng Ký Trong Ngày");
        btnBCDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCDangKyActionPerformed(evt);
            }
        });

        btnBCHocVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/repost.png"))); // NOI18N
        btnBCHocVu.setText("Báo Cáo Học vụ");
        btnBCHocVu.setToolTipText("Báo Cáo Danh Sách Học Viên Chính Thức");
        btnBCHocVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCHocVuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBCNo)
                .addGap(18, 18, 18)
                .addComponent(btnBCDangKy)
                .addGap(18, 18, 18)
                .addComponent(btnBCHocVu)
                .addContainerGap(828, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBCNo)
                    .addComponent(btnBCDangKy)
                    .addComponent(btnBCHocVu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        TabTrangChinh.addTab("Quản Lý Báo Cáo", jPanel1);

        StoreSave.desktop = desktopPanel; // Lưu lại destopanel để sử dụng toàn cục chương trình.

        lblImageBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\XUANVINHTD\\Desktop\\wallpaper.png")); // NOI18N
        lblImageBackground.setBounds(0, -220, 1380, 990);
        desktopPanel.add(lblImageBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desktopPanel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabTrangChinh))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabTrangChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
         if(frameDoiMatKhau == null || frameDoiMatKhau.isClosed())
           {
                frameDoiMatKhau = new FrameDoiMatKhau();
                this.desktopPanel.add(frameDoiMatKhau);
                frameDoiMatKhau.show();
           }
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnDangKyHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyHocActionPerformed
         if(frDangKy == null || frDangKy.isClosed())
         {
            InitFrameInternal(new FrameDangKy());
         }
    }//GEN-LAST:event_btnDangKyHocActionPerformed

    private void btnHoaDonHocPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonHocPhiActionPerformed
        if(frHoaDonHocPhi == null || frHoaDonHocPhi.isClosed())
         {
            InitFrameInternal(new FrameHoaDonHocPhi());
         } 
       
    }//GEN-LAST:event_btnHoaDonHocPhiActionPerformed

    private void btnThoiKhoaBieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoiKhoaBieuActionPerformed
        
    }//GEN-LAST:event_btnThoiKhoaBieuActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
       if(frDangNhap == null || frDangNhap.isClosed())
       {
        frDangNhap = new FrameDangNhap();
        this.desktopPanel.add(frDangNhap);
        frDangNhap.show();
       }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnQuyDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuyDinhActionPerformed
        if(frQuyDinh == null || frQuyDinh.isClosed())
       {
        frQuyDinh = new FrameQuyDinh();
        this.desktopPanel.add(frQuyDinh);
        frQuyDinh.show();
       }
    }//GEN-LAST:event_btnQuyDinhActionPerformed

    private void btnDSHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSHocVienActionPerformed
         if(frameDSHocVien == null || frameDSHocVien.isClosed())
         {
             FrameDSHocVien temp = new FrameDSHocVien();
             StoreSave.frameDSHocVien = temp;
            InitFrameInternal(temp);
         } 
    }//GEN-LAST:event_btnDSHocVienActionPerformed

    private void btnDSGiangVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSGiangVienActionPerformed
         if(frameNhanVien == null || frameNhanVien.isClosed())
         {
            InitFrameInternal(new FrameNhanVien());
         } 
    }//GEN-LAST:event_btnDSGiangVienActionPerformed

    private void btnBCNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCNoActionPerformed
         if(frameBaoCaoNo == null || frameBaoCaoNo.isClosed())
         {
            InitFrameInternal(new FrameBaoCaoNo());
         } 
    }//GEN-LAST:event_btnBCNoActionPerformed

    private void btnBCDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCDangKyActionPerformed
        if(frameBaoCaoDangKy == null || frameBaoCaoDangKy.isClosed())
         {
            InitFrameInternal(new FrameBaoCaoDangKy());
         } 
    }//GEN-LAST:event_btnBCDangKyActionPerformed

    private void btnBCHocVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCHocVuActionPerformed
         if(frameBaoCaoHocVu == null || frameBaoCaoHocVu.isClosed())
         {
           InitFrameInternal(new FrameBaoCaoHocVu());
         } 
    }//GEN-LAST:event_btnBCHocVuActionPerformed

    private void btnBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangDiemActionPerformed
         if(frameBangDiem == null || frameBangDiem.isClosed())
         {
           InitFrameInternal(new FrameBangDiem());
         } 
    }//GEN-LAST:event_btnBangDiemActionPerformed

    private void btnLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLopHocActionPerformed
        if(frameLopHoc == null || frameLopHoc.isClosed())
         {
           InitFrameInternal(new FrameLopHoc());
         } 
    }//GEN-LAST:event_btnLopHocActionPerformed

    private void btnXepLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXepLopActionPerformed
         if(frameXepLop == null || frameXepLop.isClosed())
         {
           InitFrameInternal(new FrameXepLop());
         } 
    }//GEN-LAST:event_btnXepLopActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //Assets.jDesktopPanel = jDesktopPane1;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameMain frMain = new FrameMain();
                frMain.setVisible(true);
                frMain.setExtendedState(Frame.MAXIMIZED_BOTH);
               
            }
        });
    }
    
    //Khởi Tạo các frameInternal
    private void InitFrameInternal(JInternalFrame jInternalFrame)
    {         
          this.desktopPanel.add(jInternalFrame);
              try {
                     jInternalFrame.setMaximum(true);
                 } catch (PropertyVetoException ex) {
                     Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
                 }
               jInternalFrame.show();              
    }
    

    private  FrameDangNhap frDangNhap;
    private  FrameDoiMatKhau frameDoiMatKhau;
    private  FrameQuyDinh frQuyDinh;
    private  FrameDangKy frDangKy;
    private  FrameHoaDonHocPhi frHoaDonHocPhi;
    private  FrameDSHocVien frameDSHocVien;
    private  FrameNhanVien frameNhanVien;
    private  FrameXepLop frameXepLop;
    private  FrameBaoCaoNo frameBaoCaoNo;
    private  FrameBaoCaoDangKy frameBaoCaoDangKy;
    private  FrameBaoCaoHocVu frameBaoCaoHocVu;
    private  FrameBangDiem frameBangDiem;
    private  FrameLopHoc  frameLopHoc;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabTrangChinh;
    private javax.swing.JButton btnBCDangKy;
    private javax.swing.JButton btnBCHocVu;
    private javax.swing.JButton btnBCNo;
    private javax.swing.JButton btnBangDiem;
    private javax.swing.JButton btnDSGiangVien;
    private javax.swing.JButton btnDSHocVien;
    private javax.swing.JButton btnDangKyHoc;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnHoaDonHocPhi;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnLichHoc;
    private javax.swing.JButton btnLichThi;
    private javax.swing.JButton btnLopHoc;
    private javax.swing.JButton btnQuyDinh;
    private javax.swing.JButton btnThoiKhoaBieu;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JButton btnXepLop;
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblImageBackground;
    // End of variables declaration//GEN-END:variables
}
