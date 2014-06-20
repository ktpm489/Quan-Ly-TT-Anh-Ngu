/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.dao.NhanVienDAO;
import qlttanhngu.dto.NhanVienDTO;

/**
 *
 * @author DuyLuu
 */
public class NhanVienBO {
    private NhanVienDAO nhanviendao;
    public NhanVienBO() throws Exception{
        nhanviendao = new NhanVienDAO();
    }
    public List<NhanVienDTO> LoadListNhanVien() throws Exception{
       try{
            return nhanviendao.LoadListNhanVien();
       //}try(SQLException ex){
         //  Logger.getLogger(NhanVienBO.class.getName()).log(Level.SEVERE, null, ex);
       }
       finally{
           nhanviendao.closeConnection();
       }
       //return null;
    }
    
    public boolean ThemNhanVien (NhanVienDTO nhanviendto) throws Exception{
        try{
            if(nhanviendao.ThemNhanVien(nhanviendto))
                return true;
        }finally{
            nhanviendao.closeConnection();
        }
        return false;
    }
    
    public boolean UpdateNhanVien(NhanVienDTO nhanviendto) throws Exception{
       try{
            if( nhanviendao.UpdateNhanVien(nhanviendto))
                return true;
       }finally{
           nhanviendao.closeConnection();
       }
       
       return false;
    }
    
    public boolean XoaNhanVien(String maNhanVien) throws Exception{
        try{
            if(nhanviendao.XoaNhanVien(maNhanVien))
                return true;
        }finally{
            nhanviendao.closeConnection();
        }
        return false;
    }
    
    public Vector<String> GetListChucVu() throws Exception{
        try{
            return nhanviendao.GetListChucVu();
        //}catch(SQLException ex){
          //  Logger.getLogger(NhanVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            nhanviendao.closeConnection();
        }
     //   return null;
    }
    
    public String GetMaChucVuTheoTen(String tenChucVu) throws Exception{
        try{
            return nhanviendao.GetMaChucVuTheoTen(tenChucVu);
        }finally{
            nhanviendao.closeConnection();
        }
        //return "";
    }
    
    public String GetTenChucVuTheoMa(String maChucVu) throws Exception{
        try{
            return nhanviendao.GetTenChucVuTheoMa(maChucVu);
        }finally{
            nhanviendao.closeConnection();
        }
    }
    
    public List<NhanVienDTO> SearchNhanVien(String tukhoa) throws Exception{
        try{
            return nhanviendao.SearchNhanVien(tukhoa);
        }finally{
            nhanviendao.closeConnection();
        }
    }
    
    public int MaNhanVien() throws SQLException{
        try{
            return nhanviendao.MaNhanVien();
        }finally{
            try {
                nhanviendao.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(NhanVienBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

