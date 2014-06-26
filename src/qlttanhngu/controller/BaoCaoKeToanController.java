/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.BaoCaoKeToanBO;
import qlttanhngu.dto.BaoCaoKeToanDTO;

/**
 *
 * @author EvilZ
 */
public class BaoCaoKeToanController {
    private BaoCaoKeToanBO dethibo;
    
    public BaoCaoKeToanController() throws Exception{
        dethibo = new BaoCaoKeToanBO();
    }
    
    public DefaultTableModel LoadListBaoCao(java.sql.Date ngaylap) throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Tên lớp", "Trình độ", "Sỉ số", "Tổng số tiền thu"
    });       
        List<BaoCaoKeToanDTO> tempBaoCao = dethibo.layBaoCaoDangKy(ngaylap);
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempBaoCao.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempBaoCao.get(i).getTenLop());
            rowData.add(tempBaoCao.get(i).getTrinhDo());
            rowData.add(tempBaoCao.get(i).getSiSo());
            rowData.add(tempBaoCao.get(i).getSoTienThu());
            tableDefault.addRow(rowData);
        }      
        return tableDefault;
    }
}
