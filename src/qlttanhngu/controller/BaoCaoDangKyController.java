/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.BaoCaoDangKyBO;
import qlttanhngu.dto.BaoCaoDangKyDTO;

/**
 *
 * @author EvilZ
 */
public class BaoCaoDangKyController {
    private BaoCaoDangKyBO dethibo;
    
    public BaoCaoDangKyController() throws Exception{
        dethibo = new BaoCaoDangKyBO();
    }
    
    public DefaultTableModel LoadListDeThi(String khoahoc, java.sql.Date ngaydk) throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Tên lớp", "Trình độ", "Số lượng đăng ký", "Tỉ lệ đăng ký"
    });       
        List<BaoCaoDangKyDTO> tempBaoCao = dethibo.layBaoCaoDangKy(khoahoc, ngaydk);
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempBaoCao.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempBaoCao.get(i).getTenLop());
            rowData.add(tempBaoCao.get(i).getTrinhDo());
            rowData.add(tempBaoCao.get(i).getSoLuongDangKy());
            rowData.add(tempBaoCao.get(i).getTiLeDat());
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
}
