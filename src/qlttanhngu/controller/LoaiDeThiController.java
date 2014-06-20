/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.LoaiDeThiBO;
import qlttanhngu.dto.LoaiDeThiDTO;

/**
 *
 * @author EvilZ
 */
public class LoaiDeThiController {
    private LoaiDeThiBO loaidethibo;
    
    public LoaiDeThiController() throws Exception{
        loaidethibo = new LoaiDeThiBO();
    }
    
    public DefaultTableModel LoadListKhoaHoc() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
        new String [] {
            "Mã loại đề thi", "Tên loại đề thi", "Thời lượng thi", "Tên trình độ"
        });       
        List<LoaiDeThiDTO> tempKhoaHoc = loaidethibo.loadListLoaiDeThi();
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempKhoaHoc.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempKhoaHoc.get(i).getMaLoaiDeThi());
            rowData.add(tempKhoaHoc.get(i).getTenLoaiDeThi());
            rowData.add(tempKhoaHoc.get(i).getThoiLuongthi());
            rowData.add(tempKhoaHoc.get(i).getTenTrinhDo());
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
}
