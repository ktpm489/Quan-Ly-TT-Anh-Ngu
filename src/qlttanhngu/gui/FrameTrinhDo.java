/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.gui;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlttanhngu.bo.TrinhDoBO;
import qlttanhngu.controller.TrinhDoController;
import qlttanhngu.dto.TrinhDoDTO;

/**
 *
 * @author EvilZ
 */
public class FrameTrinhDo extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameTrinhDo
     */
    public FrameTrinhDo() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbTrinhDoTienQuyet = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtDiemSo = new javax.swing.JTextField();
        cbbLoaiChuongTrinh = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrinhDo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setTitle("Trình độ");
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

        jLabel1.setText("Loại chương trình học");

        jLabel2.setText("Trình độ tiên quyết");

        jLabel3.setText("Điểm số");

        txtDiemSo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiemSoKeyTyped(evt);
            }
        });

        cbbLoaiChuongTrinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TOIEC", "TOEFL iBT", "IELTS" }));

        tblTrinhDo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTrinhDo);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttonadd.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Button-Refresh-icon.png"))); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnDong))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbLoaiChuongTrinh, 0, 440, Short.MAX_VALUE)
                            .addComponent(txtDiemSo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbTrinhDoTienQuyet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbbLoaiChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiemSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbbTrinhDoTienQuyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            TrinhDoBO trinhdobo1 = new TrinhDoBO();
            List<String> tentrinhdo = trinhdobo1.layTenTrinhDo();
            boolean check =false;
            for(String ten:tentrinhdo){
                if(ten.equals(cbbLoaiChuongTrinh.getSelectedItem().toString() + " "+txtDiemSo.getText())){
                    check = true;
                    break;
                }
            }
            if(!check){
            switch(cbbLoaiChuongTrinh.getSelectedItem().toString()){
                case "TOIEC":{
                    try{
                        int diem = Integer.parseInt(txtDiemSo.getText());
                        if(diem > 990 || diem < 0){
                            txtDiemSo.setText("");
                            txtDiemSo.grabFocus();
                            JOptionPane.showMessageDialog(this, "Điểm của chương trình TOIEC phải từ 0 đến 990");
                        }
                        else{
                            try {
                                String trinhdo = cbbLoaiChuongTrinh.getSelectedItem().toString() +" "+ txtDiemSo.getText();
                                TrinhDoBO trinhdobo = new TrinhDoBO();
                                TrinhDoDTO trinhdodto = new TrinhDoDTO();
                                trinhdodto.setTenTrinhDo(trinhdo);
                                trinhdodto.setTenTrinhDoTienQuyet(cbbTrinhDoTienQuyet.getSelectedItem().toString());
                                trinhdobo.themTrinhDo(trinhdodto);
                                tblTrinhDo.setModel((new TrinhDoController()).LoadListTrinhDo());
                                List<String> trinhdolst = trinhdobo.layTenTrinhDo();
                                cbbTrinhDoTienQuyet.removeAllItems();
                                for(String trinhdo1:trinhdolst){
                                    cbbTrinhDoTienQuyet.addItem(trinhdo);
                                }
                                cbbTrinhDoTienQuyet.addItem("");
                            }
                            catch (Exception ex) {
                                Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    catch(NumberFormatException ex){
                        Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case "TOEFL iBT":{
                    try{
                        int diem = Integer.parseInt(txtDiemSo.getText());
                        if(diem > 120 || diem < 0){
                            txtDiemSo.setText("");
                            txtDiemSo.grabFocus();
                            JOptionPane.showMessageDialog(this, "Điểm của chương trình TOEFL iBT phải từ 0 đến 120");
                        }
                        else{
                            try {
                                String trinhdo = cbbLoaiChuongTrinh.getSelectedItem().toString() +" "+ txtDiemSo.getText();
                                TrinhDoBO trinhdobo = new TrinhDoBO();
                                TrinhDoDTO trinhdodto = new TrinhDoDTO();
                                trinhdodto.setTenTrinhDo(trinhdo);
                                trinhdodto.setTenTrinhDoTienQuyet(cbbTrinhDoTienQuyet.getSelectedItem().toString());
                                trinhdobo.themTrinhDo(trinhdodto);
                                tblTrinhDo.setModel((new TrinhDoController()).LoadListTrinhDo());
                                List<String> trinhdolst = trinhdobo.layTenTrinhDo();
                                cbbTrinhDoTienQuyet.removeAllItems();
                                for(String trinhdo1:trinhdolst){
                                    cbbTrinhDoTienQuyet.addItem(trinhdo);
                                }
                                cbbTrinhDoTienQuyet.addItem("");
                            }
                            catch (Exception ex) {
                                Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    catch(NumberFormatException ex){
                        Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case "IELTS":{
                    try{
                        float diem = Float.parseFloat(txtDiemSo.getText());
                        if(diem > 9 || diem < 1){
                            txtDiemSo.setText("");
                            txtDiemSo.grabFocus();
                            JOptionPane.showMessageDialog(this, "Điểm của chương trình IELTS phải từ 1 đến 9");
                        }
                        else{
                            try {
                                String trinhdo = cbbLoaiChuongTrinh.getSelectedItem().toString() +" "+ txtDiemSo.getText();
                                TrinhDoBO trinhdobo = new TrinhDoBO();
                                TrinhDoDTO trinhdodto = new TrinhDoDTO();
                                trinhdodto.setTenTrinhDo(trinhdo);
                                trinhdodto.setTenTrinhDoTienQuyet(cbbTrinhDoTienQuyet.getSelectedItem().toString());
                                trinhdobo.themTrinhDo(trinhdodto);
                                tblTrinhDo.setModel((new TrinhDoController()).LoadListTrinhDo());
                                List<String> trinhdolst = trinhdobo.layTenTrinhDo();
                                cbbTrinhDoTienQuyet.removeAllItems();
                                for(String trinhdo1:trinhdolst){
                                    cbbTrinhDoTienQuyet.addItem(trinhdo);
                                }
                                cbbTrinhDoTienQuyet.addItem("");
                            }
                            catch (Exception ex) {
                                Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    catch(NumberFormatException ex){
                        Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
            TrinhDoBO trinhdobo = new TrinhDoBO();
            List<String> trinhdolst = trinhdobo.layTenTrinhDo();
            cbbTrinhDoTienQuyet.removeAllItems();
            for(String trinhdo:trinhdolst){
                cbbTrinhDoTienQuyet.addItem(trinhdo);
            }
            cbbTrinhDoTienQuyet.addItem("");
            tblTrinhDo.setModel((new TrinhDoController()).LoadListTrinhDo());
            }
            else{
                txtDiemSo.setText("");
                JOptionPane.showMessageDialog(this, "Trình độ đã tồn tại");
            }
        } catch (Exception ex) {
            Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            TrinhDoBO trinhdobo = new TrinhDoBO();
            TrinhDoDTO trinhdodto = new TrinhDoDTO();
            trinhdodto.setMaTrinhDo(tblTrinhDo.getValueAt(tblTrinhDo.getSelectedRow(), 0).toString());
            trinhdobo.xoaTrinhDo(trinhdodto);
            tblTrinhDo.setModel((new TrinhDoController()).LoadListTrinhDo());
            List<String> trinhdolst = trinhdobo.layTenTrinhDo();
            cbbTrinhDoTienQuyet.removeAllItems();
            for(String trinhdo:trinhdolst){
                cbbTrinhDoTienQuyet.addItem(trinhdo);
            }
            cbbTrinhDoTienQuyet.addItem("");
            tblTrinhDo.setModel((new TrinhDoController()).LoadListTrinhDo());
                    } catch (Exception ex) {
            Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        try {
            tblTrinhDo.setModel((new TrinhDoController()).LoadListTrinhDo());
        } catch (Exception ex) {
            Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            TrinhDoBO trinhdobo = new TrinhDoBO();
            List<String> trinhdolst = trinhdobo.layTenTrinhDo();
            cbbTrinhDoTienQuyet.removeAllItems();
            for(String trinhdo:trinhdolst){
                cbbTrinhDoTienQuyet.addItem(trinhdo);
            }
            cbbTrinhDoTienQuyet.addItem("");
            tblTrinhDo.setModel((new TrinhDoController()).LoadListTrinhDo());
        } catch (Exception ex) {
            Logger.getLogger(FrameTrinhDo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtDiemSoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiemSoKeyTyped
        // TODO add your handling code here:
        char vChar = evt.getKeyChar();
        int len = txtDiemSo.getText().length();
        if (!(Character.isDigit(vChar)) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE) || (vChar == KeyEvent.VK_ENTER) || (vChar == KeyEvent.VK_TAB) || (len > 11)) {
            evt.consume(); 
        } 
    }//GEN-LAST:event_txtDiemSoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cbbLoaiChuongTrinh;
    private javax.swing.JComboBox cbbTrinhDoTienQuyet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTable tblTrinhDo;
    private javax.swing.JTextField txtDiemSo;
    // End of variables declaration//GEN-END:variables
}
