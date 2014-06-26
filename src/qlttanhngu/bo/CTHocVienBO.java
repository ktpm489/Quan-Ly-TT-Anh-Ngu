/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.controller.NhanVienController;
import qlttanhngu.dao.CTHocVienDAO;
import qlttanhngu.dto.CTHocVienDTO;
import qlttanhngu.dto.NhanVienDTO;

/**
 *
 * @author DuyLuu
 */
public class CTHocVienBO {
    private CTHocVienDAO cthocviendao;
    public CTHocVienBO(){
        try {
            cthocviendao = new CTHocVienDAO();
        } catch (Exception ex) {
            Logger.getLogger(CTHocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean ThemCTHocVien(CTHocVienDTO cthocviendto) throws Exception{
        try{
            if(cthocviendao.ThemCTHocVien(cthocviendto))
                    return true;
        }finally{
            cthocviendao.closeConnection();
        }
        return false;
    }
    public boolean DeleteCTHocVien(CTHocVienDTO cthocviendto) throws Exception {
        try {
            if (cthocviendao.DeleteCTHocVien(cthocviendto)) {
                return true;
            }
        } catch (Exception e) {
        } finally {
            cthocviendao.closeConnection();
        }

        return false;
    }
    
    public List<CTHocVienDTO> LoadListHocVienTheoLop(String maLop){
        return cthocviendao.LoadListHocVienTheoLop(maLop);
    }
}
