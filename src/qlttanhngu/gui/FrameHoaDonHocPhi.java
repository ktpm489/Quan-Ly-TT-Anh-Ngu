/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.awt.print.PageFormat;
import java.awt.Graphics;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.controller.BienLaiHocPhiController;
import qlttanhngu.controller.HocVienController;
import qlttanhngu.dto.BienLaiHocPhiDTO;

/**
 *
 * @author XUANVINHTD
 */
public class FrameHoaDonHocPhi extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameHoaDonHocPhi
     *
     */
    public FrameHoaDonHocPhi() {
        initComponents();

        this.txtSoTienDong.setDocument(new DigitsDocument());
        try {
            cbomalop.setModel(new BienLaiHocPhiController().GetListMaLop());
        } catch (Exception e) {
        }
        try {
            cboMaNhanVien.setModel(new BienLaiHocPhiController().GetListMaNhanVien());
        } catch (Exception e) {
        }

        this.btnDongTien.setEnabled(false);
        this.btnInHoaDon.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PannelTThocVien = new javax.swing.JPanel();
        lblMaHV = new javax.swing.JLabel();
        lblMaLop = new javax.swing.JLabel();
        lblNgayLapHoaDon = new javax.swing.JLabel();
        DateChooserNgayLap = new com.toedter.calendar.JDateChooser();
        btnCheck = new javax.swing.JButton();
        cbomalop = new javax.swing.JComboBox();
        txtMaHocVien = new javax.swing.JTextField();
        cboMaNhanVien = new javax.swing.JComboBox();
        lbMaNhanVien = new javax.swing.JLabel();
        panelThanhToan = new javax.swing.JPanel();
        lblSoTienThu = new javax.swing.JLabel();
        lblSoTienTra = new javax.swing.JLabel();
        lblSoTienConLai = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSoTongTien = new javax.swing.JTextField();
        txtSoTienConLai = new javax.swing.JTextField();
        txtSoTienDong = new javax.swing.JTextField();
        panelChucNang = new javax.swing.JPanel();
        btnInHoaDon = new javax.swing.JButton();
        btnDongTien = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();

        setTitle("Hóa Đơn Học Phí");
        setPreferredSize(new java.awt.Dimension(1305, 565));

        PannelTThocVien.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Học Viên"));

        lblMaHV.setText("Mã Học Viên");

        lblMaLop.setText("Mã Lớp");

        lblNgayLapHoaDon.setText("Ngày Lập Hóa Đơn");

        DateChooserNgayLap.setDateFormatString("dd/MM/YYYY");
        DateChooserNgayLap.setEnabled(false);
        DateChooserNgayLap.setDate(new Date());

        btnCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Button-Refresh-icon.png"))); // NOI18N
        btnCheck.setText("Kiểm Tra");
        btnCheck.setToolTipText("Kiểm Tra Thông Tin Học Phí");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        cbomalop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboMaNhanVien.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbMaNhanVien.setText("Mã Nhân Viên");

        javax.swing.GroupLayout PannelTThocVienLayout = new javax.swing.GroupLayout(PannelTThocVien);
        PannelTThocVien.setLayout(PannelTThocVienLayout);
        PannelTThocVienLayout.setHorizontalGroup(
            PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelTThocVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PannelTThocVienLayout.createSequentialGroup()
                        .addComponent(lblNgayLapHoaDon)
                        .addGap(18, 18, 18)
                        .addComponent(DateChooserNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PannelTThocVienLayout.createSequentialGroup()
                        .addComponent(lblMaHV)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaLop, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMaNhanVien, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbomalop, 0, 248, Short.MAX_VALUE)
                    .addComponent(cboMaNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 295, Short.MAX_VALUE))
        );
        PannelTThocVienLayout.setVerticalGroup(
            PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelTThocVienLayout.createSequentialGroup()
                .addGroup(PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PannelTThocVienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbomalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMaLop))
                            .addComponent(lblMaHV))
                        .addGap(12, 12, 12)
                        .addGroup(PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateChooserNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayLapHoaDon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PannelTThocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbMaNhanVien))))
                    .addGroup(PannelTThocVienLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panelThanhToan.setBorder(javax.swing.BorderFactory.createTitledBorder("Thanh Toán"));

        lblSoTienThu.setText("Số tiền Đóng");

        lblSoTienTra.setText("Tổng Tiền");

        lblSoTienConLai.setText("Số Tiền Còn Lại");

        jLabel12.setText("VND");

        jLabel13.setText("VND");

        jLabel14.setText("VND");

        txtSoTongTien.setEditable(false);
        txtSoTongTien.setAutoscrolls(false);
        txtSoTongTien.setFocusable(false);

        txtSoTienConLai.setEditable(false);
        txtSoTienConLai.setAutoscrolls(false);
        txtSoTienConLai.setFocusable(false);

        txtSoTienDong.setAutoscrolls(false);

        javax.swing.GroupLayout panelThanhToanLayout = new javax.swing.GroupLayout(panelThanhToan);
        panelThanhToan.setLayout(panelThanhToanLayout);
        panelThanhToanLayout.setHorizontalGroup(
            panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanhToanLayout.createSequentialGroup()
                .addGroup(panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThanhToanLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblSoTienTra))
                    .addGroup(panelThanhToanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSoTienConLai))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThanhToanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSoTienThu)))
                .addGap(23, 23, 23)
                .addGroup(panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSoTienConLai, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(txtSoTongTien))
                    .addComponent(txtSoTienDong, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        panelThanhToanLayout.setVerticalGroup(
            panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanhToanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoTienTra)
                    .addComponent(jLabel12)
                    .addComponent(txtSoTongTien))
                .addGap(18, 18, 18)
                .addGroup(panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtSoTienConLai)
                    .addComponent(lblSoTienConLai))
                .addGap(18, 18, 18)
                .addGroup(panelThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblSoTienThu)
                    .addComponent(txtSoTienDong))
                .addGap(35, 35, 35))
        );

        panelChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Printer-icon.png"))); // NOI18N
        btnInHoaDon.setText("In Hóa Đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        btnDongTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Accept1.png"))); // NOI18N
        btnDongTien.setText("Đóng Tiền");
        btnDongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongTienActionPerformed(evt);
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
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnInHoaDon)
                .addGap(51, 51, 51)
                .addComponent(btnDongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        panelChucNangLayout.setVerticalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInHoaDon)
                    .addComponent(btnDongTien)
                    .addComponent(btnDong))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PannelTThocVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PannelTThocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        BienLaiHocPhiController controls = null;
        try {
            controls = new BienLaiHocPhiController();
        } catch (Exception ex) {
            Logger.getLogger(FrameHoaDonHocPhi.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (this.txtMaHocVien.getText().contentEquals("") == false) {
            try {
                if (controls.isHocVienExit(this.txtMaHocVien.getText())) {
                    if (controls.isHocVienThuocLop(this.cbomalop.getSelectedItem().toString(), this.txtMaHocVien.getText())) {
                        //thuc thi cong viec
                        Double hocPhi1 = controls.GetHocPhiTheoLop(this.cbomalop.getSelectedItem().toString());

                        //lay thong tin hoc phi

                        DefaultTableModel table = controls.GetThongTinHocPhi(this.txtMaHocVien.getText());
                        int row = table.getRowCount();
                        //Hoc Vien chua dong hoc phi lan nao
                        if (row < 1) {
                            this.txtSoTongTien.setText(hocPhi1.toString());
                            this.txtSoTienConLai.setText(hocPhi1.toString());
                            
                            MessageBoxCustom messageBoxBL = new MessageBoxCustom("Học Viên Chưa Đóng Học Phí!");
                            StoreSave.desktop.add(messageBoxBL);
                            messageBoxBL.setBounds(400, 100, 511, 189);
                            messageBoxBL.show();
                        } 
                        //Hoc Vien Da dong hoc phi it nhat 1 lan
                        else {
                            Object hocPhiConLai = table.getValueAt(row, 2);

                            //load du lieu len form

                            this.txtSoTongTien.setText(hocPhi1.toString());
                            this.txtSoTienConLai.setText(hocPhiConLai.toString());

                            //Cho hien cac nut nop tien -- in bien lai
                            this.btnDongTien.setEnabled(true);
                            this.btnInHoaDon.setEnabled(true);
                            //-------------------------------//
                        
                            MessageBoxCustom messageBoxBL = new MessageBoxCustom("Thành Công!");
                            StoreSave.desktop.add(messageBoxBL);
                            messageBoxBL.setBounds(400, 100, 511, 189);
                            messageBoxBL.show();
                        }

                    } else {
                        //hoc vien khong thuoc lop do
                        MessageBoxCustom messageBoxBL = new MessageBoxCustom("Học Viên Không Thuộc Lớp Đã Chọn!");
                        StoreSave.desktop.add(messageBoxBL);
                        messageBoxBL.setBounds(400, 100, 511, 189);
                        messageBoxBL.show();
                    }

                } else {
                    //hoc vien khong ton tai
                    MessageBoxCustom messageBoxBL = new MessageBoxCustom("Không Có Học Viên Này!");
                    StoreSave.desktop.add(messageBoxBL);
                    messageBoxBL.setBounds(400, 100, 511, 189);
                    messageBoxBL.show();
                }
            } catch (Exception ex) {
                Logger.getLogger(FrameHoaDonHocPhi.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            //Chua nhap ma hoc vien
            MessageBoxCustom messageBoxBL = new MessageBoxCustom(" Chưa Nhập Mã Học Viên!");
            StoreSave.desktop.add(messageBoxBL);
            messageBoxBL.setBounds(400, 100, 511, 189);
            messageBoxBL.show();
        }

    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnDongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongTienActionPerformed
        //Dong tien

        BienLaiHocPhiController controls = null;
        if (this.txtSoTienDong.getText().contentEquals("") == false) {
            if (Double.parseDouble(this.txtSoTienDong.getText()) > Double.parseDouble(this.txtSoTienConLai.getText())) {
                MessageBoxCustom messageBoxBL = new MessageBoxCustom("Đóng Quá Số Tiền Nợ!");
                StoreSave.desktop.add(messageBoxBL);
                messageBoxBL.setBounds(400, 100, 511, 189);
                messageBoxBL.show();
            } else {
                //cap nhat--luu du lieu moi trong Bang Biên lai
                Double tienTong = Double.parseDouble(this.txtSoTongTien.getText());
                Double tienConLai = Double.parseDouble(this.txtSoTienConLai.getText()) - Double.parseDouble(this.txtSoTienDong.getText());
                Double tienDaDong = Double.parseDouble(this.txtSoTongTien.getText()) - tienConLai;

                BienLaiHocPhiDTO bldto = new BienLaiHocPhiDTO();
                bldto.setTongTien(tienTong);
                bldto.setTienThu(tienDaDong);
                bldto.setTienConLai(tienConLai);
                bldto.setMaHocVien(this.txtMaHocVien.getText());
                bldto.setMaLop(this.cbomalop.getSelectedItem().toString());
                bldto.setMaNhanVien(this.cboMaNhanVien.getSelectedItem().toString());
                bldto.setNgayLapBienLai(this.DateChooserNgayLap.getDate());

                
                try {
                    controls = new BienLaiHocPhiController();
                } catch (Exception ex) {
                    Logger.getLogger(FrameHoaDonHocPhi.class.getName()).log(Level.SEVERE, null, ex);
                }

                //them bien lai
                if (controls.AddBienLaiHocPhi(bldto)) {
                    MessageBoxCustom messageBoxBL = new MessageBoxCustom("Đóng Tiền Thành Công!");
                    StoreSave.desktop.add(messageBoxBL);
                    messageBoxBL.setBounds(400, 100, 511, 189);
                    messageBoxBL.show();
                    
                    //Neu da dong du tien
                    if(tienDaDong == tienTong)
                    {
                        try {
                            //cap nhat thong tin chi tiet hoc vien
                            if(new BienLaiHocPhiController().UpdateTinhTrangHocPhi(this.txtMaHocVien.getText()))
                            {
                                //cap nhat tinh trang hoc phi thanh cong
                            }else{
                                MessageBoxCustom messageBoxBLs = new MessageBoxCustom("Không Cập Nhật Được Tình Trạng Học Phí!");
                                StoreSave.desktop.add(messageBoxBLs);
                                messageBoxBLs.setBounds(400, 100, 511, 189);
                                messageBoxBLs.show();
                            }
                        } catch (Exception ex) {
                            Logger.getLogger(FrameHoaDonHocPhi.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {
                    MessageBoxCustom messageBoxBL = new MessageBoxCustom("Đóng Tiền Thất Bại!");
                    StoreSave.desktop.add(messageBoxBL);
                    messageBoxBL.setBounds(400, 100, 511, 189);
                    messageBoxBL.show();
                }

            }
        } else {
            //Chua nhap so tien dong
            MessageBoxCustom messageBoxBL = new MessageBoxCustom("Chưa Nhập Số Tiền Đóng!");
            StoreSave.desktop.add(messageBoxBL);
            messageBoxBL.setBounds(400, 100, 511, 189);
            messageBoxBL.show();
        }

    }//GEN-LAST:event_btnDongTienActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        // in hoa don
        new PrintUIWindow(FrameHoaDonHocPhi.this);
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    //class in bien lai
    class PrintUIWindow implements Printable, ActionListener {

        javax.swing.JInternalFrame frameToPrint;

        @Override
        public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

            if (page > 0) { /* We have only one page, and 'page' is zero-based */
                return NO_SUCH_PAGE;
            }

            /*
             * User (0,0) is typically outside the imageable area, so we must translate
             * by the X and Y values in the PageFormat to avoid clipping
             */
            Graphics2D g2d = (Graphics2D) g;
            g2d.translate(pf.getImageableX(), pf.getImageableY());

            /* Now print the window and its visible contents */
            frameToPrint.printAll(g);

            /* tell the caller that this page is part of the printed document */
            return PAGE_EXISTS;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            boolean ok = job.printDialog();
            if (ok) {
                try {
                    job.print();
                } catch (PrinterException ex) {
                    /* The job did not successfully complete */
                }
            }
        }

        public PrintUIWindow(javax.swing.JInternalFrame f) {
            frameToPrint = f;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserNgayLap;
    private javax.swing.JPanel PannelTThocVien;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnDongTien;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JComboBox cboMaNhanVien;
    private javax.swing.JComboBox cbomalop;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel lbMaNhanVien;
    private javax.swing.JLabel lblMaHV;
    private javax.swing.JLabel lblMaLop;
    private javax.swing.JLabel lblNgayLapHoaDon;
    private javax.swing.JLabel lblSoTienConLai;
    private javax.swing.JLabel lblSoTienThu;
    private javax.swing.JLabel lblSoTienTra;
    private javax.swing.JPanel panelChucNang;
    private javax.swing.JPanel panelThanhToan;
    private javax.swing.JTextField txtMaHocVien;
    private javax.swing.JTextField txtSoTienConLai;
    private javax.swing.JTextField txtSoTienDong;
    private javax.swing.JTextField txtSoTongTien;
    // End of variables declaration//GEN-END:variables
}
