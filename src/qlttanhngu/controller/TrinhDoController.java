/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.TrinhDoBO;
import qlttanhngu.dto.TrinhDoDTO;

/**
 *
 * @author EvilZ
 */
public class TrinhDoController {
    private TrinhDoBO trinhdobo;
    
    public TrinhDoController() throws Exception{
        trinhdobo = new TrinhDoBO();
    }
    
    public DefaultTableModel LoadListTrinhDo() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Mã trình độ", "Tên trình độ", "Trình độ tiên quyết"
    });       
        List<TrinhDoDTO> tempKhoaHoc = trinhdobo.loadListTrinhDo();
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempKhoaHoc.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempKhoaHoc.get(i).getMaTrinhDo());
            rowData.add(tempKhoaHoc.get(i).getTenTrinhDo());
            rowData.add(tempKhoaHoc.get(i).getTenTrinhDoTienQuyet());
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
}
