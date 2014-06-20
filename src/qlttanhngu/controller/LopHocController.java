/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.LopHocBO;
import qlttanhngu.dto.LopHocDTO;

/**
 *
 * @author DuyLuu
 */
public class LopHocController {
    private LopHocBO lophocbo;
//    private static HashMap hashMapKhoaHoc;
//    private static HashMap hashMapGiangVien;
//    private static HashMap hashMapPhongHoc;
//    private static HashMap hashMapChuongTrinhHoc;
    public LopHocController() throws Exception{
        lophocbo = new LopHocBO();
    }
    
    public DefaultTableModel LoadListLopHoc() throws Exception{
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][] {},new String[]{
           "Mã lớp", "Tên lớp", "Tên Giảng Viên","Phòng", "Chương trình học", "Khóa học", "Ngày bắt đầu", "Ngày kết thúc", "Học phí" 
        });
        List<LopHocDTO> ListLH = lophocbo.LoadListLopHoc();
        Vector<Object> rowData;
        for(int i = 0; i<ListLH.size(); i++){
            rowData = new Vector<>();
            rowData.add(ListLH.get(i).getMaLop());
            rowData.add(ListLH.get(i).getTenLop());
            rowData.add(new LopHocController().GetListGiangVien().get(ListLH.get(i).getMaNhanVien()));
            rowData.add(new LopHocController().GetListPhongHoc().get(ListLH.get(i).getMaPhong()));
            rowData.add(new LopHocController().GetListChuongTrinhHoc().get(ListLH.get(i).getMaChuongTrinhHoc()));
            rowData.add(new LopHocController().GetListKhoaHoc().get(ListLH.get(i).getMaKhoaHoc()));
            rowData.add(ListLH.get(i).getNgayBatDau());
            rowData.add(ListLH.get(i).getNgayKetThuc());
            rowData.add(ListLH.get(i).getHocPhi());
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
    
    public List<LopHocDTO> LoadListLopHocTheoMaLop(String maLop) throws Exception{
        try{
            return lophocbo.LoadListLopHocTheoMaLop(maLop);
        }catch(SQLException ex){
            Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public List<LopHocDTO> LoadListLopHocTheoTenLop(String tenLop) throws Exception{
        try{
            return lophocbo.LoadListLopHocTheoTenLop(tenLop);
        }catch(SQLException ex){
            Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public boolean ThemLopHoc(LopHocDTO lophocdto) throws Exception{
        try{
            if(lophocbo.ThemLopHoc(lophocdto))
                return true;
        }catch(SQLException ex){
              Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean CapNhatThemLopHoc(LopHocDTO lophocdto) throws Exception{
        try{
            if(lophocbo.CapNhatLopHoc(lophocdto))
                return true;
        }catch(SQLException ex){
              Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean XoaLopHoc(String maLop) throws Exception{
        try{
            if(lophocbo.XoaLopHoc(maLop))
                return true;
        }catch(SQLException ex){
              Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public DefaultTableModel SearchLopHoc(String tuKhoa) throws Exception{
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][] {},new String[]{
           "Mã lớp", "Tên lớp", "Tên Giảng Viên","Phòng", "Chương trình học", "Khóa học", "Ngày bắt đầu", "Ngày kết thúc", "Học phí" 
        });
        List<LopHocDTO> ListLH = lophocbo.SearchLopHoc(tuKhoa);
        Vector<Object> rowData;
        for(int i = 0; i<ListLH.size(); i++){
            rowData = new Vector<>();
            rowData.add(ListLH.get(i).getMaLop());
            rowData.add(ListLH.get(i).getTenLop());
            rowData.add(new LopHocController().GetListGiangVien().get(ListLH.get(i).getMaNhanVien()));
            rowData.add(new LopHocController().GetListPhongHoc().get(ListLH.get(i).getMaPhong()));
            rowData.add(new LopHocController().GetListChuongTrinhHoc().get(ListLH.get(i).getMaChuongTrinhHoc()));
            rowData.add(new LopHocController().GetListKhoaHoc().get(ListLH.get(i).getMaKhoaHoc()));
            rowData.add(ListLH.get(i).getNgayBatDau());
            rowData.add(ListLH.get(i).getNgayKetThuc());
            rowData.add(ListLH.get(i).getHocPhi());
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
    
    public HashMap<String, String> GetListChuongTrinhHoc(){
        return lophocbo.GetListChuongTrinhHoc();
    }
    public HashMap<String, String> GetListKhoaHoc(){
        return lophocbo.GetListKhoaHoc();
    }
    public HashMap<String, String> GetListGiangVien(){
        return lophocbo.GetListGiangVien();
    }
    public HashMap<String, String> GetListPhongHoc(){
        return lophocbo.GetListPhongHoc();
    }
    public HashMap<String, String> GetListLopHoc(){
        return lophocbo.GetListLopHoc();
    }

    
}
