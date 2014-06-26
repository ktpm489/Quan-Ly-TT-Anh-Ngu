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
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.CTHocVienDTO;

/**
 *
 * @author DuyLuu
 */
public class CTHocVienDAO extends DataBase{
    
    public CTHocVienDAO() throws Exception{
        super();
    }
    
    public boolean ThemCTHocVien(CTHocVienDTO cthocviendto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try{
            callableStatement = this.getConnection().prepareCall("{call ThemCTHocVien(?,?)}");
            callableStatement.setString(1, cthocviendto.getMaLop());
            callableStatement.setString(2, cthocviendto.getMaHocVien());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(CTHocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //delete thông tin danh sach kỳ thi
    public Boolean DeleteCTHocVien(CTHocVienDTO cthocviendto) {
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call XoaCTHocVien(?,?)}");
            callableStatement.setString(1, cthocviendto.getMaLop());
            callableStatement.setString(2, cthocviendto.getMaHocVien());

            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if (resultSet != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CTHocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<CTHocVienDTO> LoadListHocVienTheoLop(String maLop){
        List<CTHocVienDTO> lstHV = new ArrayList<CTHocVienDTO>();
        CTHocVienDTO hv = null;
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        int i = 0;
        try {
            callableStatement = this.getConnection().prepareCall("{call GetListHocVienThuocLop(?) }");
            callableStatement.setString(1, maLop);
            resultSet = this.executeQuery(this.getConnection(), callableStatement);
        } catch (SQLException ex) {
            Logger.getLogger(CTHocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            while(resultSet.next()){
                hv = new CTHocVienDTO();
                hv.setMaHocVien(resultSet.getString(1));
                hv.setTenHocVien(resultSet.getString(2));
               
                lstHV.add(hv);
                i++;
            }
        }
        catch(SQLException ex){
            Logger.getLogger(CTHocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                this.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(CTHocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstHV;
    }
}
