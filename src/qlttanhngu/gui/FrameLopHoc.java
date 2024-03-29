/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.gui;

/**
 *
 * @author XUANVINHTD
 */
public class FrameLopHoc extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameLopHoc
     */
    public FrameLopHoc() {
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

        panelThongTin = new javax.swing.JPanel();
        lblMaLop = new javax.swing.JLabel();
        lblTenLop = new javax.swing.JLabel();
        lblTrinhDo = new javax.swing.JLabel();
        lblTenGiangVien = new javax.swing.JLabel();
        lblThoiGianHoc = new javax.swing.JLabel();
        lblNgayBatDau = new javax.swing.JLabel();
        lblNgayKetThuc = new javax.swing.JLabel();
        lblHocPhi = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        txtTenLop = new javax.swing.JTextField();
        txtTrinhDo = new javax.swing.JTextField();
        txtTebGiangVien = new javax.swing.JTextField();
        txtThoiGianHoc = new javax.swing.JTextField();
        dateChooserNgayBatDau = new com.toedter.calendar.JDateChooser();
        dateChooserNgayKetThuc = new com.toedter.calendar.JDateChooser();
        txtHocPhi = new javax.swing.JTextField();
        panelTraCuu = new javax.swing.JPanel();
        lblTraCuuTheo = new javax.swing.JLabel();
        comboBoxTraCuuTheo = new javax.swing.JComboBox();
        txtTraCuu = new javax.swing.JTextField();
        btnTraCuu = new javax.swing.JButton();
        panelChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        tnLamMoi = new javax.swing.JButton();
        btnDng = new javax.swing.JButton();
        lblThu = new javax.swing.JLabel();
        lblBuoi = new javax.swing.JLabel();
        comboBoxThu = new javax.swing.JComboBox();
        comboBoxBuoi = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLopHoc = new javax.swing.JTable();

        setTitle("Danh Sách Lớp Học");

        panelThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin"));

        lblMaLop.setText("Mã Lớp");

        lblTenLop.setText("Tên Lớp");

        lblTrinhDo.setText("Trình Độ");

        lblTenGiangVien.setText("Tên Giảng Viên");

        lblThoiGianHoc.setText("Thời Gian Học");

        lblNgayBatDau.setText("Ngày Bắt Đầu");

        lblNgayKetThuc.setText("Ngày Kết Thúc");

        lblHocPhi.setText("Học Phí");

        dateChooserNgayBatDau.setDateFormatString("dd/MM/YYYY");

        panelTraCuu.setBorder(javax.swing.BorderFactory.createTitledBorder("Tra Cứu"));

        lblTraCuuTheo.setText("Tra Cứu Theo");

        comboBoxTraCuuTheo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã Lớp", "Tên Lớp" }));

        btnTraCuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Timkiem.png"))); // NOI18N
        btnTraCuu.setText("Tra Cứu");

        javax.swing.GroupLayout panelTraCuuLayout = new javax.swing.GroupLayout(panelTraCuu);
        panelTraCuu.setLayout(panelTraCuuLayout);
        panelTraCuuLayout.setHorizontalGroup(
            panelTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTraCuuLayout.createSequentialGroup()
                .addGroup(panelTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTraCuuLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblTraCuuTheo)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxTraCuuTheo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTraCuu))
                    .addGroup(panelTraCuuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTraCuu)))
                .addGap(32, 32, 32))
        );
        panelTraCuuLayout.setVerticalGroup(
            panelTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraCuuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTraCuuTheo)
                    .addComponent(comboBoxTraCuuTheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTraCuu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttonadd.png"))); // NOI18N
        btnThem.setText("Thêm");

        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/update.png"))); // NOI18N
        btnCapNhat.setText("Cập Nhật");

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Button-Refresh-icon.png"))); // NOI18N
        tnLamMoi.setText("Làm Mới");

        btnDng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close1.png"))); // NOI18N
        btnDng.setText("Đóng");
        btnDng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChucNangLayout = new javax.swing.GroupLayout(panelChucNang);
        panelChucNang.setLayout(panelChucNangLayout);
        panelChucNangLayout.setHorizontalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCapNhat)
                .addGap(28, 28, 28)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelChucNangLayout.setVerticalGroup(
            panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa)
                    .addComponent(tnLamMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnDng)
                .addContainerGap())
        );

        lblThu.setText("Thứ ");

        lblBuoi.setText("Buổi");

        comboBoxThu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hai", "Ba", "Tư", "Năm", "Sáu", "Bảy", "CN" }));

        comboBoxBuoi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sáng", "Chiều", "Tối" }));

        javax.swing.GroupLayout panelThongTinLayout = new javax.swing.GroupLayout(panelThongTin);
        panelThongTin.setLayout(panelThongTinLayout);
        panelThongTinLayout.setHorizontalGroup(
            panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongTinLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNgayBatDau)
                    .addGroup(panelThongTinLayout.createSequentialGroup()
                        .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTenLop)
                            .addComponent(lblMaLop)
                            .addComponent(lblTrinhDo)
                            .addComponent(lblTenGiangVien))
                        .addGap(18, 18, 18)
                        .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTebGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTrinhDo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelThongTinLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblThoiGianHoc))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongTinLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNgayKetThuc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblHocPhi)
                                        .addComponent(lblThu, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblBuoi, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                .addGap(18, 18, 18)
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtThoiGianHoc)
                        .addComponent(dateChooserNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateChooserNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtHocPhi))
                    .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxBuoi, javax.swing.GroupLayout.Alignment.LEADING, 0, 106, Short.MAX_VALUE)
                        .addComponent(comboBoxThu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTraCuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelThongTinLayout.setVerticalGroup(
            panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaLop)
                    .addComponent(lblThoiGianHoc)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThoiGianHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTenLop)
                        .addComponent(lblNgayBatDau)
                        .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChooserNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTrinhDo)
                        .addComponent(lblNgayKetThuc)
                        .addComponent(txtTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChooserNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenGiangVien)
                    .addComponent(lblHocPhi)
                    .addComponent(txtTebGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThu)
                    .addComponent(comboBoxThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuoi)
                    .addComponent(comboBoxBuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelThongTinLayout.createSequentialGroup()
                .addComponent(panelTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tableLopHoc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableLopHoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(panelThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnDngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDngActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDngActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDng;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox comboBoxBuoi;
    private javax.swing.JComboBox comboBoxThu;
    private javax.swing.JComboBox comboBoxTraCuuTheo;
    private com.toedter.calendar.JDateChooser dateChooserNgayBatDau;
    private com.toedter.calendar.JDateChooser dateChooserNgayKetThuc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuoi;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblMaLop;
    private javax.swing.JLabel lblNgayBatDau;
    private javax.swing.JLabel lblNgayKetThuc;
    private javax.swing.JLabel lblTenGiangVien;
    private javax.swing.JLabel lblTenLop;
    private javax.swing.JLabel lblThoiGianHoc;
    private javax.swing.JLabel lblThu;
    private javax.swing.JLabel lblTraCuuTheo;
    private javax.swing.JLabel lblTrinhDo;
    private javax.swing.JPanel panelChucNang;
    private javax.swing.JPanel panelThongTin;
    private javax.swing.JPanel panelTraCuu;
    private javax.swing.JTable tableLopHoc;
    private javax.swing.JButton tnLamMoi;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtTebGiangVien;
    private javax.swing.JTextField txtTenLop;
    private javax.swing.JTextField txtThoiGianHoc;
    private javax.swing.JTextField txtTraCuu;
    private javax.swing.JTextField txtTrinhDo;
    // End of variables declaration//GEN-END:variables
}
