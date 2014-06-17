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
import qlttanhngu.bo.KyThiBO;
import qlttanhngu.dto.KyThiDTO;

/**
 *
 * @author XuanVinh
 */
public class KyThiController {

    private KyThiBO kyThiBO;

    public KyThiController() throws Exception {
        kyThiBO = new KyThiBO();
    }

    public DefaultTableModel LoadListKyThi() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã kỳ thi", "Tên kỳ thi", "Tên Phòng", "Ngày thi"
                });
        List<KyThiDTO> tempkythi = kyThiBO.LoadListKyThi();
        Vector<Object> rowData;

        for (int i = 0; i < tempkythi.size(); i++) {
            rowData = new Vector<>();
            rowData.add(tempkythi.get(i).getMakythi());
            rowData.add(tempkythi.get(i).getTenkythi());
            rowData.add(tempkythi.get(i).getTenphong());
            rowData.add(tempkythi.get(i).getNgayThi());

            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }

    public boolean UpdateKyThi(KyThiDTO kyThidto) {
        try {
            return kyThiBO.UpdateKyThi(kyThidto);
        } catch (Exception ex) {
            Logger.getLogger(KyThiController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public boolean InsertKyThi(KyThiDTO kyThidto) throws Exception {
        try {
            if (kyThiBO.InsertKyThi(kyThidto)) {
                return true;
            }
        } catch (Exception e) {
        } finally {

        }
        return false;
    }

    public HashMap<String, String> GetListPhong() throws Exception {
        try {
            return kyThiBO.GetListPhong();
        } catch (Exception e) {

        } finally {

        }

        return null;
    }
    
    public Integer GetCountMakyThi() {
        try {   
            return kyThiBO.GetCountMakyThi();
        } catch (Exception ex) {
            Logger.getLogger(KyThiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
