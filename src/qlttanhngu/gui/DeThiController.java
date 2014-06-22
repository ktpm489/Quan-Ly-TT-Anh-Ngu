/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.gui;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.DeThiBO;
import qlttanhngu.dto.DeThiDTO;

/**
 *
 * @author EvilZ
 */
public class DeThiController {
    private DeThiBO dethibo;
    
    public DeThiController() throws Exception{
        dethibo = new DeThiBO();
    }
    
    public DefaultTableModel LoadListDeThi() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Mã đề thi", "Tên loại đề thi", "Trình độ", "Ngày lập đề thi"
    });       
        List<DeThiDTO> tempDeThi = dethibo.loadListDeThi();
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempDeThi.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempDeThi.get(i).getMaDeThi());
            rowData.add(tempDeThi.get(i).getLoaiDeThi());
            rowData.add(tempDeThi.get(i).getTrinhDo());
            rowData.add(tempDeThi.get(i).getNgayCap1());
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
    
}
