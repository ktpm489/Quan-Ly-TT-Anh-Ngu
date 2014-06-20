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
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.NhanVienBO;
import qlttanhngu.dto.NhanVienDTO;

/**
 *
 * @author DuyLuu
 */
public class NhanVienController {
    private NhanVienBO nhanvienbo;
    
    public NhanVienController() throws Exception{
        nhanvienbo = new NhanVienBO();
    }
    
    public DefaultTableModel LoadListNhanVien() throws Exception{
        DefaultTableModel tableDefault = new DefaultTableModel(new Object [][]{},new String []{
            "Mã nhân viên", "Chức vụ", "Họ tên", "Giới tính", "Quốc tịch", "Trình độ", "Số điện thoại", "Địa chỉ", "Tài khoản"
        });
        List<NhanVienDTO> listNhanVien = nhanvienbo.LoadListNhanVien();
        Vector<Object> rowData;
        for(int i = 0; i < listNhanVien.size(); i++){
            rowData = new Vector<>();
            rowData.add(listNhanVien.get(i).getMaNhanVien());
            rowData.add(new NhanVienBO().GetTenChucVuTheoMa(listNhanVien.get(i).getMaChucVu()));
            rowData.add(listNhanVien.get(i).getHoTen());
            rowData.add("true".equals(listNhanVien.get(i).getGioiTinh().toString()) ? "Nam" : "Nữ"  );
            rowData.add(listNhanVien.get(i).getQuocTich());
            rowData.add(listNhanVien.get(i).getTrinhDo());
            rowData.add(listNhanVien.get(i).getSoDienThoai());
            rowData.add(listNhanVien.get(i).getDiaChi());
            rowData.add(listNhanVien.get(i).getTaiKhoan());
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
    
    public boolean ThemNhanVien(NhanVienDTO nhanviendto) throws Exception{
        try{
            if(nhanvienbo.ThemNhanVien(nhanviendto))
                    return true;
        }catch(SQLException ex){
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean UpdateNhanVien(NhanVienDTO nhanviendto) throws Exception{
        try{
            if(nhanvienbo.UpdateNhanVien(nhanviendto))
                    return true;
        }catch(SQLException ex){
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean XoaNhanVien(String maNhanVien) throws Exception{
        try{
            if(nhanvienbo.XoaNhanVien(maNhanVien))
                    return true;
        }catch(SQLException ex){
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public DefaultComboBoxModel GetListChucVu() throws Exception{
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(nhanvienbo.GetListChucVu());
        return defaultComboBox;
    }
    
    public String GetMaChucVuTheoTen(String tenChucVu) throws Exception{
        return nhanvienbo.GetMaChucVuTheoTen(tenChucVu);
    }
    
    public String GetTenChucVuTheoMa(String maChucVu) throws Exception{
        return nhanvienbo.GetTenChucVuTheoMa(maChucVu);
    }
    
    public DefaultTableModel SearchNhanVien(String tukhoa) throws Exception{
        DefaultTableModel tabledefault = new DefaultTableModel(new Object [][] {}, new String[] {
            "Mã nhân viên", "Mã chức vụ", "Họ tên", "Giới tính", "Quốc tịch", "Trình độ", "Số điện thoại", "Địa chỉ", "Tài khoản"
        });
        List<NhanVienDTO> listNhanVien = nhanvienbo.SearchNhanVien(tukhoa);
        Vector<Object> rowData;
        
        for(int i = 0; i <listNhanVien.size(); i++){
            rowData = new Vector<>();
            rowData.add(listNhanVien.get(i).getMaNhanVien());
            rowData.add(new NhanVienBO().GetTenChucVuTheoMa(listNhanVien.get(i).getMaChucVu()));
            rowData.add(listNhanVien.get(i).getHoTen());
            rowData.add(listNhanVien.get(i).getGioiTinh() == true ? "Nam" : "Nữ");
            rowData.add(listNhanVien.get(i).getQuocTich());
            rowData.add(listNhanVien.get(i).getTrinhDo());
            rowData.add(listNhanVien.get(i).getSoDienThoai());
            rowData.add(listNhanVien.get(i).getDiaChi());
            rowData.add(listNhanVien.get(i).getTaiKhoan());
            
            tabledefault.addRow(rowData);
        }
        return tabledefault;
    }
    
    public int MaNhanVien() throws SQLException{
        return nhanvienbo.MaNhanVien();
    }
}
