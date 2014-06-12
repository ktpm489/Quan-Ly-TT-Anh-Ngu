/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.PhanQuyenDO;
import qlttanhngu.dto.PhanQuyenDTO;

/**
 *
 * @author XuanVinh
 */
public class PhanQuyenController {

    private PhanQuyenDO phanQuyenDO;

    public PhanQuyenController() throws Exception {
        phanQuyenDO = new PhanQuyenDO();
    }

    //kiem tra quyen cua mot user boolean.
    public DefaultTableModel CheckListAuthorizationOfUser(String mahocvien) {
        try {

            DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[][]{}, new Object[]{"Quyền hạn"});
            Vector<String> rowdata;

            Vector<PhanQuyenDTO> vector = new Vector<PhanQuyenDTO>();
            vector = phanQuyenDO.GetListAuthorizationOfUser(mahocvien);

            for (int i = 0; i < vector.size(); i++) {
                rowdata = new Vector<String>();

                rowdata.add(vector.get(i).getTenQuyen());

                //thêm cột vào bảng
                defaultTableModel.addRow(rowdata);
            }

            return defaultTableModel;
        } catch (Exception ex) {
            Logger.getLogger(PhanQuyenController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public Vector<PhanQuyenDTO> GetListAuthorization() {
        try {
            return phanQuyenDO.GetListAuthorization();
        } catch (Exception ex) {
            Logger.getLogger(PhanQuyenController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public Boolean InsertAuthorization(String maquyen, String manhanvien){
        try {
            return phanQuyenDO.InsertAuthorization(maquyen, manhanvien);
        } catch (Exception ex) {
            Logger.getLogger(PhanQuyenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

     public boolean DeleteAuthorization(String maquyen, String mahocvien){
         try {
            return phanQuyenDO.DeleteAuthorization(mahocvien, maquyen);
        } catch (Exception ex) {
            Logger.getLogger(PhanQuyenController.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
     }
}
