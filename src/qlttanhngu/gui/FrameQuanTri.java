/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import java.sql.Array;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.controller.PhanQuyenController;
import qlttanhngu.dto.PhanQuyenDTO;

/**
 *
 * @author XuanVinh
 */
public class FrameQuanTri extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameQuanTri
     */
    public FrameQuanTri() {
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
        txtTenTaiKhoan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuyen = new javax.swing.JTable();
        lblDSQuyen = new javax.swing.JLabel();
        comboBoxDSQuyen = new javax.swing.JComboBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        lblMaNhanVien = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnLuu = new javax.swing.JButton();
        btnDOng = new javax.swing.JButton();

        setTitle("Quản Trị người dùng");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

        lblTenTaiKhoan.setText("Tên tài khoản");

        txtTenTaiKhoan.setEnabled(false);

        tableQuyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},

            },
            new String [] {
                "Quyền"
            }
        ));
        tableQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQuyenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableQuyen);

        lblDSQuyen.setText("Danh sách quyền");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        lblMaNhanVien.setText("Mã nhân viên");

        txtMaNhanVien.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaNhanVien)
                    .addComponent(lblTenTaiKhoan)
                    .addComponent(lblDSQuyen))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenTaiKhoan)
                    .addComponent(comboBoxDSQuyen, 0, 219, Short.MAX_VALUE)
                    .addComponent(txtMaNhanVien))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnThem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnXoa))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboBoxDSQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDSQuyen))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenTaiKhoan))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnDOng.setText("Đóng");
        btnDOng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(btnDOng, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnDOng))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDOngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOngActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDOngActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            //Đổ dữ liệu lên bảng phân quyên
            tableQuyen.setModel(new PhanQuyenController().CheckListAuthorizationOfUser(StoreSave.mahocvien));
            //Lưu lại 1 bảng để kiểm tra
            tableOld = new JTable(new PhanQuyenController().CheckListAuthorizationOfUser(StoreSave.mahocvien));
        } catch (Exception ex) {
            Logger.getLogger(FrameQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        }

        //đổ dữ liệu vào comboBoQuyen
        dsphanquyen = new Vector<PhanQuyenDTO>();
        try {
            dsphanquyen = new PhanQuyenController().GetListAuthorization();
        } catch (Exception ex) {
            Logger.getLogger(FrameQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        }

        //lay tên phân quyền.
        Vector<String> data = new Vector<>();
        for (int i = 0; i < dsphanquyen.size(); i++) {
            data.add(dsphanquyen.get(i).getTenQuyen());
        }
        comboBoxDSQuyen.setModel(new DefaultComboBoxModel(data));

        //load nameAccount and mã nhân viên
        txtMaNhanVien.setText(StoreSave.mahocvien);
        txtTenTaiKhoan.setText(StoreSave.accountNameSave);
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DefaultTableModel defaultTableModel = (DefaultTableModel) tableQuyen.getModel();

        //kiểm tra xem quyền đã được add chưa
        for (int i = 0; i < tableQuyen.getRowCount(); i++) {
            if (comboBoxDSQuyen.getSelectedItem().toString() == null ? tableQuyen.getValueAt(i, 0).toString() == null : comboBoxDSQuyen.getSelectedItem().toString().equals(tableQuyen.getValueAt(i, 0).toString())) {
                JOptionPane.showMessageDialog(this, "Quyền này đã tồn tại !");
                return;
            }
        }

        //add thêm quyền vào tablequyen
        Vector row = new Vector();
        row.add(comboBoxDSQuyen.getSelectedItem().toString());
        defaultTableModel.addRow(row);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed

        boolean result = false;
        //kiểm tra xem bảng quyền hạn có rỗng ko
        if (tableQuyen.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tài khoản phải có ít nhất 1 quyền hạn!");
            return;
        }

        //kiểm tra sự thay đổi quyền hạn để cập nhật hoặc xóa trong database.
        int row1 = tableQuyen.getRowCount();
        int row2 = tableOld.getRowCount();

        Vector<String> lstStr = new Vector<>();

        for (int k = 0; k < row2; k++) {
            lstStr.add(tableOld.getValueAt(k, 0).toString());
        }

        //thêm quyền
        for (int i = 0; i < row1; i++) {
            if (!lstStr.contains(tableQuyen.getValueAt(i, 0))) {
                try {
                    //lấy mã quyền theo tên
                    String maquyen = getMaQuyen(tableQuyen.getValueAt(i, 0).toString());

                    //insert
                    result = (new PhanQuyenController().InsertAuthorization(maquyen, txtMaNhanVien.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(FrameQuanTri.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                }
            }
        }

        
       
        //xóa quyền
         Vector<String> lstStr1 = new Vector<>();
         for (int k = 0; k < row1; k++) {
            lstStr1.add(tableQuyen.getValueAt(k, 0).toString());
        }
        if (row1 < row2) {
            for (int j = 0; j < row2; j++) {
                if (!lstStr1.contains(tableOld.getValueAt(j, 0))) {
                    try {
                        //lấy mã quyền theo tên
                        String maquyen = getMaQuyen(tableOld.getValueAt(j, 0).toString());
                        //delete
                        result = (new PhanQuyenController().DeleteAuthorization(maquyen, txtMaNhanVien.getText()));
                    } catch (Exception ex) {
                        Logger.getLogger(FrameQuanTri.class.getName()).log(Level.SEVERE, null, ex);
                        return;
                    }
                }
            }
        }

        if (result) {
            JOptionPane.showMessageDialog(this, "Câp nhật thành công! \nXin vui lòng đăng xuất để hoàn thành cập nhật!");
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi cập nhật!");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tableQuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQuyenMouseClicked
        JTable table = (JTable) evt.getSource();
        //Lưu lại dòng cần xóa
        rowIndex = table.getSelectedRow();
    }//GEN-LAST:event_tableQuyenMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //Xóa một dòng trong bảng quyền hạn
        if(rowIndex == 0){
         JOptionPane.showMessageDialog(this, "Vui lòng chọn quyền cần xóa!");
         return;
        }
          ((DefaultTableModel) tableQuyen.getModel()).removeRow(rowIndex);
    }//GEN-LAST:event_btnXoaActionPerformed

    //get key theo value
    private String getMaQuyen(String value) {
        for (int i = 0; i < dsphanquyen.size(); i++) {
            if (dsphanquyen.get(i).getTenQuyen().equals(value)) {
                return dsphanquyen.get(i).getMaQuyen();
            }
        }
        return null;
    }
    //Luu lai dòng cần xóa.
    private static int rowIndex = 0;
    //Lưu danh sách phân quyền để lấy mã phân quyền
    private static Vector<PhanQuyenDTO> dsphanquyen;
    private static JTable tableOld;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDOng;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox comboBoxDSQuyen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDSQuyen;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblTenTaiKhoan;
    private javax.swing.JTable tableQuyen;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
