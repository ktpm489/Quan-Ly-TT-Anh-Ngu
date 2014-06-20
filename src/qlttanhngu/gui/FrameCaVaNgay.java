/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import qlttanhngu.controller.CaVaNgayController;
import qlttanhngu.controller.NhanVienController;
import qlttanhngu.dto.CaVaNgayDTO;

/**
 *
 * @author DuyLuu
 */
public class FrameCaVaNgay extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameCaVaNgay
     */
    public FrameCaVaNgay() {
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

        jPanel4 = new javax.swing.JPanel();
        lblBuoi = new javax.swing.JLabel();
        comboBoxBuoi = new javax.swing.JComboBox();
        lblNgay = new javax.swing.JLabel();
        lblCaHoc = new javax.swing.JLabel();
        comboBoxCa = new javax.swing.JComboBox();
        checkBoxThu2 = new javax.swing.JCheckBox();
        checkBoxThu3 = new javax.swing.JCheckBox();
        checkBoxThu4 = new javax.swing.JCheckBox();
        checkBoxThu5 = new javax.swing.JCheckBox();
        checkBoxThu6 = new javax.swing.JCheckBox();
        checkBoxThu7 = new javax.swing.JCheckBox();
        panelChucNang = new javax.swing.JPanel();
        btnDong = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        lblCaHoc1 = new javax.swing.JLabel();
        lblCaHoc2 = new javax.swing.JLabel();
        txtGioBatDau = new javax.swing.JTextField();
        txtGioKetThuc = new javax.swing.JTextField();
        DanhSachCaVaNgay = new javax.swing.JScrollPane();
        tableDSCa = new javax.swing.JTable();
        DanhSachCaVaNgay1 = new javax.swing.JScrollPane();
        tableDSNgay = new javax.swing.JTable();

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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

        lblBuoi.setText("Buổi");

        comboBoxBuoi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sáng", "Chiều", "Tối" }));
        comboBoxBuoi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxBuoiItemStateChanged(evt);
            }
        });

        lblNgay.setText("Ngày");

        lblCaHoc.setText("Ca học");

        comboBoxCa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCaItemStateChanged(evt);
            }
        });

        checkBoxThu2.setText("Thứ 2");

        checkBoxThu3.setText("Thứ 3");

        checkBoxThu4.setText("Thứ 4");

        checkBoxThu5.setText("Thứ 5");

        checkBoxThu6.setText("Thứ 7");

        checkBoxThu7.setText("Thứ 6");

        panelChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDong.setText("Dóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/update.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChucNangLayout = new javax.swing.GroupLayout(panelChucNang);
        panelChucNang.setLayout(panelChucNangLayout);
        panelChucNangLayout.setHorizontalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        panelChucNangLayout.setVerticalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnThem))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        lblCaHoc1.setText("Giờ bắt đầu");

        lblCaHoc2.setText("Giờ kết thúc");

        txtGioBatDau.setEnabled(false);

        txtGioKetThuc.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblNgay)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(checkBoxThu2)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxThu3)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxThu4)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxThu5)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxThu7)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxThu6))
                    .addComponent(panelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCaHoc)
                    .addComponent(lblBuoi)
                    .addComponent(lblCaHoc1)
                    .addComponent(lblCaHoc2))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxBuoi, 0, 140, Short.MAX_VALUE)
                    .addComponent(comboBoxCa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGioBatDau)
                    .addComponent(txtGioKetThuc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgay)
                    .addComponent(comboBoxBuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxThu2)
                    .addComponent(checkBoxThu3)
                    .addComponent(checkBoxThu4)
                    .addComponent(checkBoxThu5)
                    .addComponent(checkBoxThu7)
                    .addComponent(checkBoxThu6)
                    .addComponent(lblBuoi))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCaHoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaHoc1)
                            .addComponent(txtGioBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaHoc2)
                            .addComponent(txtGioKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        tableDSCa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDSCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDSCaMouseClicked(evt);
            }
        });
        DanhSachCaVaNgay.setViewportView(tableDSCa);

        tableDSNgay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDSNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDSNgayMouseClicked(evt);
            }
        });
        DanhSachCaVaNgay1.setViewportView(tableDSNgay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(DanhSachCaVaNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(DanhSachCaVaNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DanhSachCaVaNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DanhSachCaVaNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("Thông tin");

        getAccessibleContext().setAccessibleName("CaVaNgay");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxBuoiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxBuoiItemStateChanged
        DefaultComboBoxModel ca = new DefaultComboBoxModel();
        
        if(comboBoxBuoi.getSelectedItem()=="Sáng"){
            ca.addElement(1);
            ca.addElement(2);
        }
        if(comboBoxBuoi.getSelectedItem()=="Chiều"){
            ca.addElement(3);
            ca.addElement(4);
        }
        if(comboBoxBuoi.getSelectedItem()=="Tối"){
            ca.addElement(5);
            ca.addElement(6);
        }
        
        comboBoxCa.setModel(ca);
    }//GEN-LAST:event_comboBoxBuoiItemStateChanged

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        
        this.refreshTable();
    }//GEN-LAST:event_formInternalFrameActivated

    private void comboBoxCaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCaItemStateChanged
        int ichon = Integer.parseInt(comboBoxCa.getSelectedItem().toString());
        switch(ichon){
            case 1:
                txtGioBatDau.setText("7");
                txtGioKetThuc.setText("9");
                break;
            case 2:
                txtGioBatDau.setText("9");
                txtGioKetThuc.setText("11");
                break;
            case 3:
                txtGioBatDau.setText("13");
                txtGioKetThuc.setText("15");
                break;
            case 4:
                txtGioBatDau.setText("15");
                txtGioKetThuc.setText("17");
                break;
            case 5:
                txtGioBatDau.setText("17");
                txtGioKetThuc.setText("19");
                break;
            case 6:
                txtGioBatDau.setText("19");
                txtGioKetThuc.setText("21");
                break;
        }
    }//GEN-LAST:event_comboBoxCaItemStateChanged

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        CaVaNgayDTO cavangaydto = new CaVaNgayDTO();
        //Kiểm tra mã, họ tên không dc null, kiểm tra kiễu dữ số dt, ......

        try {
            cavangaydto.setMaNgay(this.CreateMa());
            cavangaydto.setDanhSachNgay(checkBoxThu2.getSelectedObjects().toString()+checkBoxThu3.getSelectedObjects().toString()+checkBoxThu4.getSelectedObjects().toString()+checkBoxThu5.getSelectedObjects().toString()+checkBoxThu6.getSelectedObjects().toString()+checkBoxThu7.getSelectedObjects().toString());
            cavangaydto.setMaCa(comboBoxCa.getSelectedItem().toString());
            cavangaydto.setMaCa(comboBoxBuoi.getSelectedItem().toString());
            cavangaydto.setGioBatDau(Integer.parseInt(txtGioBatDau.getText().toString()));
            cavangaydto.setGioKetThuc(Integer.parseInt(txtGioKetThuc.getText().toString()));
            
            //Kiểm tra xem có chắc chắn cập nhât không?
            int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn cập nhật học viên này không ?", "Thông báo", JOptionPane.OK_CANCEL_OPTION);
            if (x == 0) {
                try {
                    new CaVaNgayController().ThemNgay(cavangaydto);
                    new CaVaNgayController().ThemCa(cavangaydto);
                } catch (Exception ex) {
                    Logger.getLogger(FrameCaVaNgay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //refresh lại table ds hoc vien
            //StoreSave.frameCaVaNgay.refreshTable();
        } catch (Exception ex) {
            Logger.getLogger(FrameThemVaCapNhatNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tableDSCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDSCaMouseClicked
//        try{
//            JTable table = (JTable) evt.getSource();
//            int row = table.getSelectedRow();
//
//            DTO nhanviendto = new NhanVienDTO();
//
//            nhanviendto.setMaNhanVien(table.getValueAt(row, 0).toString());
//            nhanviendto.setMaChucVu(table.getValueAt(row, 1).toString());
//            nhanviendto.setHoTen(table.getValueAt(row, 2).toString());
//            nhanviendto.setGioiTinh("Nam".equals(table.getValueAt(row, 3).toString()) ? true : false);
//            nhanviendto.setQuocTich(table.getValueAt(row, 4).toString());
//            nhanviendto.setTrinhDo(table.getValueAt(row, 5).toString());
//            nhanviendto.setSoDienThoai(table.getValueAt(row, 6).toString());
//            nhanviendto.setDiaChi(table.getValueAt(row, 7).toString());
//            nhanviendto.setTaiKhoan(table.getValueAt(row, 8).toString());
//            //nhanviendto.setMatKhau(table.getValueAt(row, 9).toString());
//
//            StoreSave.nhanvien = nhanviendto;
//        }catch(Exception e){
//            Logger.getLogger(FrameNhanVien.class.getName()).log(Level.SEVERE, null, e);
//        }
    }//GEN-LAST:event_tableDSCaMouseClicked

    private void tableDSNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDSNgayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDSNgayMouseClicked
// Hàm load lại toàn bộ table
    public void refreshTable() {
        try {
            tableDSCa.setModel(new CaVaNgayController().LoadListCa());
            tableDSNgay.setModel(new CaVaNgayController().LoadListNgay());
        } catch (Exception ex) {
            Logger.getLogger(FrameCaVaNgay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String CreateMa() throws Exception {
        Integer maNgay = (new CaVaNgayController().MaNgay());
        maNgay += 1;

        int len = maNgay.toString().length();
        String maMacDinh = "N000000000";

        maMacDinh = maMacDinh.substring(0, maMacDinh.length() - len) + maNgay.toString();

        return maMacDinh;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DanhSachCaVaNgay;
    private javax.swing.JScrollPane DanhSachCaVaNgay1;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnDong1;
    private javax.swing.JButton btnDong2;
    private javax.swing.JButton btnThem;
    private javax.swing.JCheckBox checkBoxThu2;
    private javax.swing.JCheckBox checkBoxThu3;
    private javax.swing.JCheckBox checkBoxThu4;
    private javax.swing.JCheckBox checkBoxThu5;
    private javax.swing.JCheckBox checkBoxThu6;
    private javax.swing.JCheckBox checkBoxThu7;
    private javax.swing.JComboBox comboBoxBuoi;
    private javax.swing.JComboBox comboBoxCa;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBuoi;
    private javax.swing.JLabel lblCaHoc;
    private javax.swing.JLabel lblCaHoc1;
    private javax.swing.JLabel lblCaHoc2;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JPanel panelChucNang;
    private javax.swing.JTable tableDSCa;
    private javax.swing.JTable tableDSNgay;
    private javax.swing.JTextField txtGioBatDau;
    private javax.swing.JTextField txtGioKetThuc;
    // End of variables declaration//GEN-END:variables
}
