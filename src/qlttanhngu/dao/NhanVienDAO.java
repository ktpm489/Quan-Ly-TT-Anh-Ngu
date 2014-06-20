/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.NhanVienDTO;

/**
 *
 * @author DuyLuu
 */
public class NhanVienDAO extends DataBase {
    
    public NhanVienDAO() throws Exception
    {
        super();
    }
    public List<NhanVienDTO> LoadListNhanVien(){
        List<NhanVienDTO> lstNV = new ArrayList<NhanVienDTO>();
        NhanVienDTO nv = null;
        ResultSet resultSet = null;
        int i = 0;
        
        resultSet = this.executeQuery("{call LayDanhSachNhanVien() }");
        try{
            while(resultSet.next()){
                nv = new NhanVienDTO();
                nv.setMaNhanVien(resultSet.getString(1));
                nv.setMaChucVu(resultSet.getString(2));
                nv.setHoTen(resultSet.getString(3));
                nv.setGioiTinh(resultSet.getBoolean(4));
                nv.setQuocTich(resultSet.getString(5));
                nv.setTrinhDo(resultSet.getString(6));
                nv.setSoDienThoai(resultSet.getString(7));
                nv.setDiaChi(resultSet.getString(8));
                nv.setTaiKhoan(resultSet.getString(9));
                nv.setMatKhau(resultSet.getString(10));
                //nv.setNamSinh(resultSet.getString(11));
                
                lstNV.add(nv);
                i++;
            }
        }
        catch(SQLException ex){
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                this.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstNV;
    }
    
    public boolean ThemNhanVien(NhanVienDTO nhanviendto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try{
            callableStatement = this.getConnection().prepareCall("{call ThemNhanVien(?,?,?,?,?,?,?,?,?,?)}");
            callableStatement.setString(1, nhanviendto.getMaNhanVien());
            callableStatement.setString(2, nhanviendto.getMaChucVu());
            callableStatement.setString(3, nhanviendto.getHoTen());
            callableStatement.setBoolean(4, nhanviendto.getGioiTinh());
            callableStatement.setString(5, nhanviendto.getQuocTich());
            callableStatement.setString(6, nhanviendto.getTrinhDo());
            callableStatement.setString(7, nhanviendto.getSoDienThoai());
            callableStatement.setString(8, nhanviendto.getDiaChi());
            callableStatement.setString(9, nhanviendto.getTaiKhoan());
            callableStatement.setString(10, nhanviendto.getMatKhau());
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean UpdateNhanVien(NhanVienDTO nhanviendto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try{
            callableStatement = this.getConnection().prepareCall("{call CapNhatNhanVien(?,?,?,?,?,?,?,?,?,?)}");
            callableStatement.setString(1, nhanviendto.getMaNhanVien());
            callableStatement.setString(2, nhanviendto.getMaChucVu());
            callableStatement.setString(3, nhanviendto.getHoTen());
            callableStatement.setBoolean(4, nhanviendto.getGioiTinh());
            callableStatement.setString(5, nhanviendto.getQuocTich());
            callableStatement.setString(6, nhanviendto.getTrinhDo());
            callableStatement.setString(7, nhanviendto.getSoDienThoai());
            callableStatement.setString(8, nhanviendto.getDiaChi());
            callableStatement.setString(9, nhanviendto.getTaiKhoan());
            callableStatement.setString(10, nhanviendto.getMatKhau());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean XoaNhanVien(String maNhanVien){
        CallableStatement callableStatement = null;
        int resultSet = 0;
        try{
            callableStatement = this.getConnection().prepareCall("{call XoaNhanVien(?)}");
            callableStatement.setString(1, maNhanVien);
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Vector<String> GetListChucVu(){
        Vector<String> dataChucVu = new Vector<String>();
        ResultSet resultSet =  null;
        
        try{
            resultSet = this.executeQuery("{call LayDanhSachChucVu()}");
            while(resultSet.next()){
                dataChucVu.add(resultSet.getString(1));
            }
        }catch(SQLException ex){
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataChucVu;
    }
    public String GetMaChucVuTheoTen(String tenChucVu){
        String temp = "";
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try{
            callableStatement = getConnection().prepareCall("{call LayMaChucVuTheoTen(?)}");
            callableStatement.setString(1, tenChucVu);
            resultSet = this.executeQuery(this.getConnection(), callableStatement);
            while(resultSet.next()){
                temp = resultSet.getString(1);
            };
        }catch(SQLException ex){
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    public String GetTenChucVuTheoMa(String maChucVu) throws Exception{
        String temp = "";
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try{
            callableStatement = getConnection().prepareCall("{call LayTenChucVuTheoMa(?)}");
            callableStatement.setString(1, maChucVu);
            resultSet = this.executeQuery(this.getConnection(), callableStatement);
            while(resultSet.next()){
                temp = resultSet.getString(1);
            }
        }catch(SQLException ex){
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return temp;
    }
    public List<NhanVienDTO> SearchNhanVien(String tukhoa) throws Exception{
        List<NhanVienDTO> listNV = new ArrayList<NhanVienDTO>();
        CallableStatement callableStatement = null;
        NhanVienDTO nv = null;
        ResultSet resultSet = null;
        int i = 0;
        callableStatement = getConnection().prepareCall("{call TimKiemNhanVien(?)}");
        callableStatement.setString(1, tukhoa);
        resultSet = this.executeQuery(getConnection(), callableStatement);
        try {
            while(resultSet.next()){
            nv = new NhanVienDTO();
            
                nv.setMaNhanVien(resultSet.getString(1));
                nv.setMaChucVu(resultSet.getString(2));
                nv.setHoTen(resultSet.getString(3));
                nv.setGioiTinh(resultSet.getBoolean(4));
                nv.setQuocTich(resultSet.getString(5));
                nv.setTrinhDo(resultSet.getString(6));
                nv.setSoDienThoai(resultSet.getString(7));
                nv.setDiaChi(resultSet.getString(8));
                nv.setTaiKhoan(resultSet.getString(9));
                
                listNV.add(nv);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return listNV;    
        
    }
    public int MaNhanVien(){
        int kq = 0;
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call DemSoNhanVien()}");
            resultSet = this.executeQuery(this.getConnection(), callableStatement);
            while(resultSet.next()){
            kq = resultSet.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
        
        
    }
    
}
