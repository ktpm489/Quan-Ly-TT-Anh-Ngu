/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.Excel;
import Assest.StoreSave;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import qlttanhngu.controller.BangDiemController;

/**
 *
 * @author XUANVINHTD
 */
public class FrameChiTietBangDiem extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameChiTietBangDiem
     */
    public FrameChiTietBangDiem() {
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
        jPanel2 = new javax.swing.JPanel();
        btnInDiem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnDOng = new javax.swing.JButton();
        txtDiem = new javax.swing.JTextField();
        comboBoxTenLopHoc = new javax.swing.JComboBox();
        txtTenHocVien = new javax.swing.JTextField();
        lblMaHocVien = new javax.swing.JLabel();
        lblTenHocVien = new javax.swing.JLabel();
        lblTenKyThi = new javax.swing.JLabel();
        lblDiemThi = new javax.swing.JLabel();
        txtMaHocVien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBangDiemCT = new javax.swing.JTable();

        setTitle("Bảng Điểm Chi Tiết");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnInDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Printer-icon.png"))); // NOI18N
        btnInDiem.setText("In Điểm");
        btnInDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInDiemActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/update.png"))); // NOI18N
        btnLuu.setText("Luu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnDOng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDOng.setText("Đóng");
        btnDOng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnInDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnDOng, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnInDiem)
                    .addComponent(btnDOng))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txtDiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiemKeyTyped(evt);
            }
        });

        comboBoxTenLopHoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxTenLopHocItemStateChanged(evt);
            }
        });

        txtTenHocVien.setText(StoreSave.tenhocvien);
        txtTenHocVien.setEnabled(false);

        lblMaHocVien.setText("Mã Học Viên");

        lblTenHocVien.setText("Tên Học Viên");

        lblTenKyThi.setText("Tên Lớp Học");

        lblDiemThi.setText("Điểm Thi");

        txtMaHocVien.setText(StoreSave.mahocvien);
        txtMaHocVien.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaHocVien)
                    .addComponent(lblTenHocVien)
                    .addComponent(lblTenKyThi)
                    .addComponent(lblDiemThi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTenHocVien)
                        .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxTenLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaHocVien)
                    .addComponent(txtMaHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenHocVien)
                    .addComponent(txtTenHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKyThi)
                    .addComponent(comboBoxTenLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiemThi)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        try{
            tableBangDiemCT.setModel(new BangDiemController().GetListBangDiemHocVien(StoreSave.mahocvien));
        }catch(Exception e){

        }
        tableBangDiemCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBangDiemCTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBangDiemCT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInDiemActionPerformed
        if (tableBangDiemCT.getRowCount() >= 1) {
            JFileChooser jFileChooser = new JFileChooser();
            //set loại file cần lưu
            FileNameExtensionFilter xmlFilter = new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx");
            FileNameExtensionFilter xmlFilter1 = new FileNameExtensionFilter("Excel (*.xls)", "xls");
            jFileChooser.addChoosableFileFilter(xmlFilter);
            jFileChooser.addChoosableFileFilter(xmlFilter1);
            jFileChooser.setFileFilter(xmlFilter);

            //hiển thị 1 dialog Lưu
            int savedialog = jFileChooser.showSaveDialog(this);
            //kiểm tra nhấn nút
            if (savedialog == JFileChooser.OPEN_DIALOG) {
                //Tên file
                File selectFile = jFileChooser.getSelectedFile();
                //đường dẫn lưu file đó.
                File directory = jFileChooser.getCurrentDirectory();

                //mặc định lưu file
                selectFile = new File(selectFile.toString() + ".xlsx");
                //in file excel 
                try {
                  //  Excel.WriteListToExcelToListInBangDiem(selectFile.getName(), txtTenHocVien.getText(), directory.toString(), tableBangDiemCT);
                } catch (Exception ex) {
                    Logger.getLogger(FrameChiTietBangDiem.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_btnInDiemActionPerformed

    private void comboBoxTenLopHocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxTenLopHocItemStateChanged
        String mahocvien = txtMaHocVien.getText();
        String malop;

        try {
            malop = new BangDiemController().GetMaLopByTenLop(comboBoxTenLopHoc.getSelectedItem().toString(), mahocvien);
            Double diem = new BangDiemController().GetDiemHocVien(mahocvien, malop);

            txtDiem.setText(diem.toString());
        } catch (Exception ex) {
            Logger.getLogger(FrameBangDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboBoxTenLopHocItemStateChanged

    private void btnDOngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOngActionPerformed
        StoreSave.mahocvien = null;
        StoreSave.tenhocvien = null;
        this.dispose();
    }//GEN-LAST:event_btnDOngActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            comboBoxTenLopHoc.setModel(new BangDiemController().GetListLopOfHocVien(txtMaHocVien.getText()));
        } catch (Exception ex) {
            Logger.getLogger(FrameBangDiem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formInternalFrameActivated

    private void tableBangDiemCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBangDiemCTMouseClicked
        try {
            JTable table = (JTable) evt.getSource();
            int row = table.getSelectedRow();

            comboBoxTenLopHoc.setSelectedItem(table.getValueAt(row, 0));
            txtDiem.setText(table.getValueAt(row, 1).toString());

            malop = new BangDiemController().GetMaLopByTenLop(table.getValueAt(row, 0).toString(), txtMaHocVien.getText());
        } catch (Exception ex) {
            Logger.getLogger(FrameChiTietBangDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableBangDiemCTMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        //Kiểm tra xem có chắc chắn cập nhât không? 
        int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn cập nhật điểm cho học viên này không ?", "Thông báo", JOptionPane.OK_OPTION);
        if (x == 0) {
            try {

                Date date = new Date();

                //kiểm tra xem lớp đó học xong chưa mới cập nhạt điểm.
                if (new BangDiemController().CheckUpdateScore(txtMaHocVien.getText(), malop, date)) {
                    try {
                        String malop = new BangDiemController().GetMaLopByTenLop(comboBoxTenLopHoc.getSelectedItem().toString(), txtMaHocVien.getText());
                        new BangDiemController().UpdateBangDiemHocVien(txtMaHocVien.getText(), malop, Double.parseDouble(txtDiem.getText()));

                        //
                        this.refreshTable();
                    } catch (Exception ex) {
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Lớp học chưa kết thúc, Không thể cập nhật điểm!","Thông báo",JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(FrameChiTietBangDiem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtDiemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiemKeyTyped
        char vChar = evt.getKeyChar();
        int len = txtDiem.getText().length();

        if (!Character.isDigit(vChar)
                || (vChar == KeyEvent.VK_SPACE)
                || len > 5) {
            evt.consume();
        }

    }//GEN-LAST:event_txtDiemKeyTyped

    private void refreshTable() {
        try {
            tableBangDiemCT.setModel(new BangDiemController().GetListBangDiemHocVien(txtMaHocVien.getText()));
        } catch (Exception ex) {
            Logger.getLogger(FrameChiTietBangDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String malop;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDOng;
    private javax.swing.JButton btnInDiem;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox comboBoxTenLopHoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiemThi;
    private javax.swing.JLabel lblMaHocVien;
    private javax.swing.JLabel lblTenHocVien;
    private javax.swing.JLabel lblTenKyThi;
    private javax.swing.JTable tableBangDiemCT;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtMaHocVien;
    private javax.swing.JTextField txtTenHocVien;
    // End of variables declaration//GEN-END:variables
}
