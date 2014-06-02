/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.BangDiemDO;
import qlttanhngu.dto.BangDiemDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XuanVinh
 */
public class BangDiemController {

    private BangDiemDO bangdiemdo;

    public BangDiemController() throws Exception {
        bangdiemdo = new BangDiemDO();
    }

    public DefaultTableModel GetListHocVienInBangDiem() throws Exception {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã Học Viên", "Tên Học Viên", "Lớp Học"
                });

        List<HocVienDTO> lsttemp = bangdiemdo.GetListHocVienInBangDiem();
        Vector<Object> rowData;

        for (int i = 0; i < lsttemp.size(); i++) {
            rowData = new Vector<>();

            rowData.add(lsttemp.get(i).getMaHocVien());
            rowData.add(lsttemp.get(i).getTenHocVien());
            rowData.add(lsttemp.get(i).getEmail());

            defaultTableModel.addRow(rowData);
        }

        return defaultTableModel;
    }

    public DefaultComboBoxModel GetistTenKiThiOfHocVien(String mahocvien) {
        try {
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(bangdiemdo.GetListTenKiThiOfHocVien(mahocvien));
            return defaultComboBoxModel;
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public DefaultTableModel GetListBangDiemHocVien(String mahocvien) {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[][]{},
                new String[]{"Mã Bảng Điểm", "Mã Kỳ Thi", "Điểm"});
        try {
            List<BangDiemDTO> tempBangDiem = bangdiemdo.GetListBangDiemHocVien(mahocvien);
            Vector<Object> rowData;

            for (int i = 0; i < tempBangDiem.size(); i++) {
                rowData = new Vector<>();

                rowData.add(tempBangDiem.get(i).getMaBangDiem());
                rowData.add(tempBangDiem.get(i).getMaKiThi());
                rowData.add(tempBangDiem.get(i).getDiem());

                defaultTableModel.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return defaultTableModel;
    }
    
    public Boolean UpdateBangDiemHocVien(String mabangdiem, String mahocvien, String makythi, Double diem){
        try {
            return bangdiemdo.UpdateBangDiemHocVien(mabangdiem, mahocvien, makythi, diem);
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

}
