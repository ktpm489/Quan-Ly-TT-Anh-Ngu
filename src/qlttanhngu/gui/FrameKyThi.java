/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import qlttanhngu.controller.KyThiController;
import qlttanhngu.dto.KyThiDTO;

/**
 *
 * @author XuanVinh
 */
public class FrameKyThi extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameKyThi
     */
    public FrameKyThi() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableKyThi = new javax.swing.JTable();
        panelThongtin = new javax.swing.JPanel();
        lblMaKyThi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMaKyThi = new javax.swing.JTextField();
        txtTenKyThi = new javax.swing.JTextField();
        lblNgayThi = new javax.swing.JLabel();
        chooerDateNgayThi = new com.toedter.calendar.JDateChooser();
        panelChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        btnCapnhat = new javax.swing.JButton();
        lblTenPhong = new javax.swing.JLabel();
        comboBoxTenPhong = new javax.swing.JComboBox();

        setTitle("Danh Sách Kỳ Thi");
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

        tableKyThi.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKyThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKyThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKyThi);

        panelThongtin.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin"));
        panelThongtin.setToolTipText("");

        lblMaKyThi.setText("Mã kỳ thi");

        jLabel1.setText("Tên kỳ thi");

        txtMaKyThi.setEnabled(false);

        txtTenKyThi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTenKyThiKeyTyped(evt);
            }
        });

        lblNgayThi.setText("Ngày Thi ");

        chooerDateNgayThi.setDateFormatString("dd/MM/YYYY");

        panelChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttonadd.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Button-Refresh-icon.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/update.png"))); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChucNangLayout = new javax.swing.GroupLayout(panelChucNang);
        panelChucNang.setLayout(panelChucNangLayout);
        panelChucNangLayout.setHorizontalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnCapnhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnLamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        panelChucNangLayout.setVerticalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTenPhong.setText("Phòng thi");

        javax.swing.GroupLayout panelThongtinLayout = new javax.swing.GroupLayout(panelThongtin);
        panelThongtin.setLayout(panelThongtinLayout);
        panelThongtinLayout.setHorizontalGroup(
            panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongtinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongtinLayout.createSequentialGroup()
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lblMaKyThi))
                        .addGap(18, 18, 18)
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaKyThi, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKyThi, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelThongtinLayout.createSequentialGroup()
                        .addComponent(lblNgayThi)
                        .addGap(18, 18, 18)
                        .addComponent(chooerDateNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelThongtinLayout.createSequentialGroup()
                        .addComponent(lblTenPhong)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelThongtinLayout.setVerticalGroup(
            panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongtinLayout.createSequentialGroup()
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelThongtinLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(panelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelThongtinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaKyThi)
                            .addComponent(txtMaKyThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTenKyThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenPhong)
                            .addComponent(comboBoxTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayThi)
                            .addComponent(chooerDateNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelThongtin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelThongtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
         Boolean result = false;
        //kiểm tra ngày thi
         Date date = new Date();
         if(date.compareTo(chooerDateNgayThi.getDate()) > 0){
             JOptionPane.showMessageDialog(this, "Ngày không hợp lệ.Vui lòng chọn lại ngày ?");
            return;
         }
         
         
        if ("".equals(txtTenKyThi.getText()) || chooerDateNgayThi.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Thêm lỗi, hãy kiểm tra lại giá trị nhập vào!");
            return;
        }
        try {
            KyThiDTO kyThiDTO = new KyThiDTO();

            kyThiDTO.setMakythi(txtMaKyThi.getText());
            kyThiDTO.setTenkythi(txtTenKyThi.getText());
            kyThiDTO.setMaphong(getKey(comboBoxTenPhong.getSelectedItem().toString()));
            kyThiDTO.setNgaythi(chooerDateNgayThi.getDate());
            //thực hiện cập nhật
            result = (new KyThiController().InsertKyThi(kyThiDTO));
        } catch (Exception ex) {
            Logger.getLogger(FrameKyThi.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (result) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            this.refreshtable();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        //làm mới bảng
        this.refreshtable();
        //tạo lại mã kỳ thi
        try {
            txtMaKyThi.setText(CreateMa());
        } catch (Exception ex) {
            Logger.getLogger(FrameKyThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        // làm mới các textfield
        txtTenKyThi.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        Boolean result = false;
        //kiểm tra ngày thi
        Date date = new Date();
        if(date.compareTo(datex) > 0){
             JOptionPane.showMessageDialog(this, "Lỗi, ky thi này đã được thi rồi không được sửa duoc!!");
            return;
        }
        if ("".equals(txtTenKyThi.getText()) || chooerDateNgayThi.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Cập nhật lỗi, hãy kiểm tra lại giá trị nhập vào!");
            return;
        }
        try {
            KyThiDTO kyThiDTO = new KyThiDTO();

            kyThiDTO.setMakythi(txtMaKyThi.getText());
            kyThiDTO.setTenkythi(txtTenKyThi.getText());
            kyThiDTO.setMaphong(getKey(comboBoxTenPhong.getSelectedItem().toString()));
            kyThiDTO.setNgaythi(chooerDateNgayThi.getDate());
            //thực hiện cập nhật
            result = (new KyThiController().UpdateKyThi(kyThiDTO));
        } catch (Exception ex) {
            Logger.getLogger(FrameKyThi.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (result) {
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            this.refreshtable();
        }

    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //load dữ liệu lên bảng
        this.refreshtable();
        //load dữ liệu comboBox
        try {
            hashMapPhong = (new KyThiController().GetListPhong());
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(hashMapPhong.values().toArray());

            comboBoxTenPhong.setModel(defaultComboBoxModel);
        } catch (Exception ex) {
            Logger.getLogger(FrameKyThi.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // tạo mã mặc định
            txtMaKyThi.setText(CreateMa());
        } catch (Exception ex) {
            Logger.getLogger(FrameKyThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtTenKyThiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKyThiKeyTyped
        int len = txtTenKyThi.getText().length();

        if (len > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTenKyThiKeyTyped

    private void tableKyThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKyThiMouseClicked
        JTable jtable = (JTable) evt.getSource();
        int row = jtable.getSelectedRow();

        txtMaKyThi.setText(jtable.getValueAt(row, 0).toString());
        txtTenKyThi.setText(jtable.getValueAt(row, 1).toString());
        comboBoxTenPhong.setSelectedItem(jtable.getValueAt(row, 2));
        
        //chuyển đổi kiểu String thành kiểu Date
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = jtable.getValueAt(row, 3).toString();
        Date date = null;
        try {
            date = (Date) formatDate.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();

        }
        chooerDateNgayThi.setDate(date);
        datex = date;
    }//GEN-LAST:event_tableKyThiMouseClicked
    //tạo mã tự động 
    public static String CreateMa() throws Exception {
        Integer maKythi = (new KyThiController().GetCountMakyThi());
        maKythi += 1;

        int len = maKythi.toString().length();
        String maMacDinh = "KT00000000";

        maMacDinh = maMacDinh.substring(0, maMacDinh.length() - len) + maKythi.toString();

        return maMacDinh;
    }

    //làm mới bảng
    private void refreshtable() {
        //load dữ liệu lên bảng.
        try {
            tableKyThi.setModel(new KyThiController().LoadListKyThi());
        } catch (Exception ex) {
            Logger.getLogger(FrameKyThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //get key theo value
    private String getKey(String value) {
        for (Object s : hashMapPhong.keySet()) {
            if (hashMapPhong.get(s).equals(value)) {
                return (String) s;
            }
        }
        return null;
    }
    
    //lưu lại ngày để kiểm tra
    private Date datex = new Date();
    private HashMap<String, String> hashMapPhong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private com.toedter.calendar.JDateChooser chooerDateNgayThi;
    private javax.swing.JComboBox comboBoxTenPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaKyThi;
    private javax.swing.JLabel lblNgayThi;
    private javax.swing.JLabel lblTenPhong;
    private javax.swing.JPanel panelChucNang;
    private javax.swing.JPanel panelThongtin;
    private javax.swing.JTable tableKyThi;
    private javax.swing.JTextField txtMaKyThi;
    private javax.swing.JTextField txtTenKyThi;
    // End of variables declaration//GEN-END:variables
}
