/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.KhoaHocBO;
import qlttanhngu.dto.KhoaHocDTO;

/**
 *
 * @author EvilZ
 */
public class KhoaHocController {
    private KhoaHocBO khoahocbo;
    
    public KhoaHocController() throws Exception{
        khoahocbo = new KhoaHocBO();
    }
    
    public DefaultTableModel LoadListKhoaHoc() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Mã khóa học", "Tên khóa học", "Ngày khai giảng"
    });       
        List<KhoaHocDTO> tempKhoaHoc = khoahocbo.loadListKhoaHoc();
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempKhoaHoc.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempKhoaHoc.get(i).getMaKhoaHoc());
            rowData.add(tempKhoaHoc.get(i).getTenKhoaHoc());
            rowData.add(tempKhoaHoc.get(i).getNgayKhaiGiang1());
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
}
