/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.CaVaNgayBO;
import qlttanhngu.dto.CaVaNgayDTO;

/**
 *
 * @author DuyLuu
 */
public class CaVaNgayController {
    private CaVaNgayBO cavangaybo;
    
    public CaVaNgayController() throws Exception{
        cavangaybo = new CaVaNgayBO();
    }
    
    public DefaultTableModel LoadListNgay() throws Exception{
        DefaultTableModel tableDefault = new DefaultTableModel(new Object [][]{},new String []{
            "Mã ngày", "Danh sách ngày"
        });
        List<CaVaNgayDTO> listCaNgay = cavangaybo.LoadListNgay();
        Vector<Object> rowData;
        for(int i = 0; i < listCaNgay.size(); i++){
            rowData = new Vector<>();
            rowData.add(listCaNgay.get(i).getMaNgay());
            rowData.add(listCaNgay.get(i).getDanhSachNgay());
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
    
    public DefaultTableModel LoadListCa() throws Exception{
        DefaultTableModel tableDefault = new DefaultTableModel(new Object [][]{},new String []{
            "Mã ca", "Buổi", "Giờ bắt đầu", "Giờ kết thúc"
        });
        List<CaVaNgayDTO> listCaNgay = cavangaybo.LoadListCa();
        Vector<Object> rowData;
        for(int i = 0; i < listCaNgay.size(); i++){
            rowData = new Vector<>();
            rowData.add(listCaNgay.get(i).getMaCa());
            rowData.add(listCaNgay.get(i).getBuoi());
            rowData.add(listCaNgay.get(i).getGioBatDau());
            rowData.add(listCaNgay.get(i).getGioKetThuc());
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
    
    public boolean ThemNgay(CaVaNgayDTO cavangaydto) throws Exception{
       
        if(cavangaybo.ThemNgay(cavangaydto))
                return true;
        
        return false;
    }
    
    public boolean ThemCa(CaVaNgayDTO cavangaydto) throws Exception{
       
        if(cavangaybo.ThemCa(cavangaydto))
                return true;
        
        return false;
    }
    
    public int MaNgay(){
        return cavangaybo.MaNgay();
    }
}
