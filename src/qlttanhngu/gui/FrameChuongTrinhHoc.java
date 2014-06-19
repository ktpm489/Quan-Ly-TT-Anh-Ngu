/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

import Assest.StoreSave;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.controller.ChuongTrinhHocController;
import qlttanhngu.controller.PhongHocController;
import qlttanhngu.dto.ChuongTrinhHocDTO;

/**
 *
 * @author MinhVu020
 */
public class FrameChuongTrinhHoc extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameChuongTrinhHoc
     */
    public FrameChuongTrinhHoc() {
        initComponents();
        this.txtHocPhi.setDocument(new DigitsDocument());
        this.btnSuaChuongTrinh.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelThongTinChuongTrinhHoc = new javax.swing.JPanel();
        lblMaTrinhDo = new javax.swing.JLabel();
        lblHocPhi = new javax.swing.JLabel();
        cboMaTrinhDo = new javax.swing.JComboBox();
        txtHocPhi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChuongTrinhHoc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnThemChuongTrinhHoc = new javax.swing.JButton();
        btnSuaChuongTrinh = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        PanelThongTinChuongTrinhHoc.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Chương Trình Học"));

        lblMaTrinhDo.setText("Trình Độ");

        lblHocPhi.setText("Học Phí");

        cboMaTrinhDo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("VND");

        javax.swing.GroupLayout PanelThongTinChuongTrinhHocLayout = new javax.swing.GroupLayout(PanelThongTinChuongTrinhHoc);
        PanelThongTinChuongTrinhHoc.setLayout(PanelThongTinChuongTrinhHocLayout);
        PanelThongTinChuongTrinhHocLayout.setHorizontalGroup(
            PanelThongTinChuongTrinhHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongTinChuongTrinhHocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelThongTinChuongTrinhHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaTrinhDo)
                    .addComponent(lblHocPhi))
                .addGap(18, 18, 18)
                .addGroup(PanelThongTinChuongTrinhHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelThongTinChuongTrinhHocLayout.createSequentialGroup()
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(cboMaTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        PanelThongTinChuongTrinhHocLayout.setVerticalGroup(
            PanelThongTinChuongTrinhHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongTinChuongTrinhHocLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelThongTinChuongTrinhHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaTrinhDo)
                    .addComponent(cboMaTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelThongTinChuongTrinhHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHocPhi)
                    .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableChuongTrinhHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Chương Trình", "Mã Trình Độ", "Học Phí"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChuongTrinhHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChuongTrinhHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableChuongTrinhHoc);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tính Năng"));

        btnThemChuongTrinhHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/table-add-icon.png"))); // NOI18N
        btnThemChuongTrinhHoc.setText("Thêm");
        btnThemChuongTrinhHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemChuongTrinhHocActionPerformed(evt);
            }
        });

        btnSuaChuongTrinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/rules.png"))); // NOI18N
        btnSuaChuongTrinh.setText("Chỉnh Sửa");
        btnSuaChuongTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaChuongTrinhActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnThemChuongTrinhHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(btnSuaChuongTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemChuongTrinhHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaChuongTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(PanelThongTinChuongTrinhHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelThongTinChuongTrinhHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelThongTinChuongTrinhHoc.getAccessibleContext().setAccessibleName("Chương Trình Học");
        PanelThongTinChuongTrinhHoc.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaChuongTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaChuongTrinhActionPerformed
        // Sua thong tin chuong trinh hoc

        ChuongTrinhHocController control = null;
        int numSelect = this.tableChuongTrinhHoc.getSelectedRowCount();
        if (numSelect < 1) {
            MessageBoxCustom messageBoxHocVien = new MessageBoxCustom("Chưa Chọn Chương Trình Học!");
            StoreSave.desktop.add(messageBoxHocVien);
            messageBoxHocVien.setBounds(400, 100, 511, 189);
            messageBoxHocVien.show();
        } else {
            int select = this.tableChuongTrinhHoc.getSelectedRow();
            Object macth = this.tableChuongTrinhHoc.getValueAt(select, 0);
            String tentd = this.cboMaTrinhDo.getSelectedItem().toString();
            Double hocPhi = Double.parseDouble(this.txtHocPhi.getText());

            try {

                control = new ChuongTrinhHocController();
            } catch (Exception ex) {
                Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
            }

            String matdo = null;
            try {
                matdo = control.GetMaTrinhDOTheoTen(tentd);
            } catch (Exception ex) {
                Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                //Ham Update
                if (new ChuongTrinhHocController().UpdateChuongTrinhHoc(macth.toString(), matdo, hocPhi)) {
                    MessageBoxCustom messageBoxHocVien = new MessageBoxCustom("Update Thành Công!");
                    StoreSave.desktop.add(messageBoxHocVien);
                    messageBoxHocVien.setBounds(400, 100, 511, 189);
                    messageBoxHocVien.show();
                    
                     try {      
                       this.tableChuongTrinhHoc.setModel(new ChuongTrinhHocController().GetChuongTrinhHoc());
                    } catch (Exception ex) {
                        Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    MessageBoxCustom messageBoxHocVien = new MessageBoxCustom("Update Thất Bại!");
                    StoreSave.desktop.add(messageBoxHocVien);
                    messageBoxHocVien.setBounds(400, 100, 511, 189);
                    messageBoxHocVien.show();
                }
            } catch (Exception ex) {
                Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaChuongTrinhActionPerformed

    private void btnThemChuongTrinhHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemChuongTrinhHocActionPerformed
        // TODO add your handling code here:
        ChuongTrinhHocController control = null;
        if (this.txtHocPhi.getText().contentEquals("") == false) {
            Double hocPhi = Double.parseDouble(this.txtHocPhi.getText());
            String trinhDo = this.cboMaTrinhDo.getSelectedItem().toString();
            String maTrinhDo = null;
            try {

                control = new ChuongTrinhHocController();
            } catch (Exception ex) {
                Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                maTrinhDo = control.GetMaTrinhDOTheoTen(trinhDo);
            } catch (Exception ex) {
                Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
            }

            ChuongTrinhHocDTO ctdto = new ChuongTrinhHocDTO();
            ctdto.setHocPhi(hocPhi);
            ctdto.setMaTrinhDo(maTrinhDo);
            try {
                //Them chyuong trinh moi
                if (new ChuongTrinhHocController().AddChuongTrinhHoc(ctdto)) {
                    //them thanh cong
                    MessageBoxCustom messageBoxHocVien = new MessageBoxCustom("Thêm Thành Công!");
                    StoreSave.desktop.add(messageBoxHocVien);
                    messageBoxHocVien.setBounds(400, 100, 511, 189);
                    messageBoxHocVien.show();
                    
                     try {      
                       this.tableChuongTrinhHoc.setModel(new ChuongTrinhHocController().GetChuongTrinhHoc());
                    } catch (Exception ex) {
                        Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    //khong them dc
                    MessageBoxCustom messageBoxHocVien = new MessageBoxCustom("Thêm Thất Bại!");
                    StoreSave.desktop.add(messageBoxHocVien);
                    messageBoxHocVien.setBounds(400, 100, 511, 189);
                    messageBoxHocVien.show();
                }
            } catch (Exception ex) {
                Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
            }



        } else {
            MessageBoxCustom messageBoxHocVien = new MessageBoxCustom("Chưa Nhập Học Phí!");
            StoreSave.desktop.add(messageBoxHocVien);
            messageBoxHocVien.setBounds(400, 100, 511, 189);
            messageBoxHocVien.show();
        }
    }//GEN-LAST:event_btnThemChuongTrinhHocActionPerformed

    private void tableChuongTrinhHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChuongTrinhHocMouseClicked
        //Khi bang Click
        int select = this.tableChuongTrinhHoc.getSelectedRow();
        
        Object maTrinhDo = this.tableChuongTrinhHoc.getValueAt(select, 1);
        //Object hocPhi =  Integer.parseInt(this.tableChuongTrinhHoc.getValueAt(select, 2).toString());
         Object hocPhi =  this.tableChuongTrinhHoc.getValueAt(select, 2).toString();
         String hp = hocPhi.toString();
         String tenTrinhDo = null;
        //set cho txt
       
        try {
            tenTrinhDo = new ChuongTrinhHocController().GetTenTrinhDoTheoMa(maTrinhDo.toString());
        } catch (Exception ex) {
            Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.txtHocPhi.setText(hp.substring(0, hp.length()-1));
        this.cboMaTrinhDo.setSelectedItem(tenTrinhDo);
        
        this.btnSuaChuongTrinh.setEnabled(true);
    }//GEN-LAST:event_tableChuongTrinhHocMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
         try {
            this.cboMaTrinhDo.setModel(new ChuongTrinhHocController().GetListTrinhDo());
        } catch (Exception ex) {
            Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
         //load bang len
         try {      
                   this.tableChuongTrinhHoc.setModel(new ChuongTrinhHocController().GetChuongTrinhHoc());
                } catch (Exception ex) {
                    Logger.getLogger(FrameChuongTrinhHoc.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_formInternalFrameOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelThongTinChuongTrinhHoc;
    private javax.swing.JButton btnSuaChuongTrinh;
    private javax.swing.JButton btnThemChuongTrinhHoc;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox cboMaTrinhDo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblMaTrinhDo;
    private javax.swing.JTable tableChuongTrinhHoc;
    private javax.swing.JTextField txtHocPhi;
    // End of variables declaration//GEN-END:variables
}
