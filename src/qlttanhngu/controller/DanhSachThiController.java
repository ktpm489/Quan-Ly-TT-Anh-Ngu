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
import qlttanhngu.bo.DanhSachThiBO;
import qlttanhngu.dto.DanhSachThiDTO;

/**
 *
 * @author XuanVinh
 */
public class DanhSachThiController {

    private DanhSachThiBO danhSachThiBO;

    public DanhSachThiController() throws Exception {
        danhSachThiBO = new DanhSachThiBO();
    }

    public DefaultTableModel GetListDiemThiXepLop(String maphong, String makythi) throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã học viên", "Tên học viên", "điểm thi"
                });
        List<DanhSachThiDTO> tempdsthi = danhSachThiBO.GetListDiemThiXepLop(maphong, makythi);
        Vector<Object> rowData;

        for (int i = 0; i < tempdsthi.size(); i++) {
            rowData = new Vector<>();
            rowData.add(tempdsthi.get(i).getMahocvien());
            rowData.add(tempdsthi.get(i).getTenhocvien());
            rowData.add(tempdsthi.get(i).getKetquathixeplop());

            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }

    public DefaultTableModel GetListDiemThiXepLopBy(String maphong, String matrinhdo) throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã học viên", "Tên học viên", "điểm thi"
                });
        List<DanhSachThiDTO> tempdsthi = danhSachThiBO.GetListDiemThiXepLopBy(maphong, matrinhdo);
        Vector<Object> rowData;

        for (int i = 0; i < tempdsthi.size(); i++) {
            rowData = new Vector<>();
            rowData.add(tempdsthi.get(i).getMahocvien());
            rowData.add(tempdsthi.get(i).getTenhocvien());
            rowData.add(tempdsthi.get(i).getKetquathixeplop());

            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }

    public boolean UpdateDiemThiXepLop(DanhSachThiDTO danhSachThiDTO) {
        try {
            if (danhSachThiBO.UpdateDiemThiXepLop(danhSachThiDTO)) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhSachThiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public HashMap<String, String> GetListDeThi()  {
        try {      
            return danhSachThiBO.GetListDeThi();
        } catch (Exception ex) {
            Logger.getLogger(DanhSachThiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }      

    public String GetMaTrinhDoByHocVien(String name)  {
        try {    
            return danhSachThiBO.GetMaTrinhDoByHocVien(name);
        } catch (Exception ex) {
            Logger.getLogger(DanhSachThiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }
}
