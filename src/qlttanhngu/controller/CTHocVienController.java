/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.CTHocVienBO;
import qlttanhngu.dto.CTHocVienDTO;

/**
 *
 * @author DuyLuu
 */
public class CTHocVienController {
    private CTHocVienBO cthocvienbo;
    
    public CTHocVienController(){
        cthocvienbo = new CTHocVienBO();
    }
    
    public DefaultTableModel LoadListHocVienTheoLop(String maLop) throws Exception{
        DefaultTableModel tableDefault = new DefaultTableModel(new Object [][]{},new String []{
            "Mã học viên", "Tên học viên"
        });
        List<CTHocVienDTO> listCTHocVien = cthocvienbo.LoadListHocVienTheoLop(maLop);
        Vector<Object> rowData;
        for(int i = 0; i < listCTHocVien.size(); i++){
            rowData = new Vector<>();
            rowData.add(listCTHocVien.get(i).getMaHocVien());
            rowData.add(listCTHocVien.get(i).getTenHocVien());
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
}
