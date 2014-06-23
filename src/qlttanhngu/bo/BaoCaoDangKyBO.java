/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.bo;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.dao.BaoCaoDangKyDAO;
import qlttanhngu.dto.BaoCaoDangKyDTO;

/**
 *
 * @author EvilZ
 */
public class BaoCaoDangKyBO {
    BaoCaoDangKyDAO baocaodao;
    public BaoCaoDangKyBO() throws Exception{
        baocaodao = new BaoCaoDangKyDAO();
    }
    
    public List<BaoCaoDangKyDTO> layBaoCaoDangKy(String khoahoc, java.sql.Date ngaydk) throws SQLException, Exception{
        try {
            return baocaodao.layBaoCaoDangKy(khoahoc, ngaydk);
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            baocaodao.closeConnection();
        }
        return null;
    }
    
    
}
