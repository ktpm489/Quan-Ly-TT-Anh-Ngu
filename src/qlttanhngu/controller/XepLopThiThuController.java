/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.XepLopThiThuBO;
import qlttanhngu.dto.DanhSachThiDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XuanVinh
 */
public class XepLopThiThuController {
    
    private XepLopThiThuBO xepLopThiThuBO;

    public XepLopThiThuController() throws Exception {
        xepLopThiThuBO = new XepLopThiThuBO();
    }
     public DefaultTableModel GetListHocVienTiemNang(String matrinhdo) throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã học viên", "Tên học viên"
                });
        List<HocVienDTO> tempdsthi = xepLopThiThuBO.GetListHocVienTiemNang(matrinhdo);
        Vector<Object> rowData;

        for (int i = 0; i < tempdsthi.size(); i++) {
            rowData = new Vector<>();
            rowData.add(tempdsthi.get(i).getMaHocVien());
            rowData.add(tempdsthi.get(i).getTenHocVien());

            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
     
     public DefaultTableModel GetListHocVieninPhongThi(String maphong, String makythi) throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã học viên", "Tên học viên"
                });
        List<DanhSachThiDTO> tempdsthi = xepLopThiThuBO.GetListHocVieninPhongThi(maphong, makythi);
        Vector<Object> rowData;

        for (int i = 0; i < tempdsthi.size(); i++) {
            rowData = new Vector<>();
            rowData.add(tempdsthi.get(i).getMahocvien());
            rowData.add(tempdsthi.get(i).getTenhocvien());

            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
     
      public boolean InsertHocVien(DanhSachThiDTO danhSachThiDTO) {
        try {      
            if (xepLopThiThuBO.InsertHocVien(danhSachThiDTO)) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(XepLopThiThuController.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return false;
    }
      
       public HashMap<String, String> GetListPhong(String makythi)  {
        try {             
            return xepLopThiThuBO.GetListPhong(makythi);
        } catch (Exception ex) {
            Logger.getLogger(XepLopThiThuController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return null;
    }  
}
