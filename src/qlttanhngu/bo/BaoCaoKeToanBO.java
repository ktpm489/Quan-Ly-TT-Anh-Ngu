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
import qlttanhngu.dao.BaoCaoKeToanDAO;
import qlttanhngu.dto.BaoCaoKeToanDTO;

/**
 *
 * @author EvilZ
 */
public class BaoCaoKeToanBO {
    BaoCaoKeToanDAO baocaodao;
    public BaoCaoKeToanBO() throws Exception{
        baocaodao = new BaoCaoKeToanDAO();
    }
    
    public List<BaoCaoKeToanDTO> layBaoCaoDangKy(java.sql.Date ngaylap) throws SQLException, Exception{
        try {
            return baocaodao.layBaoCaoDangKy(ngaylap);
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            baocaodao.closeConnection();
        }
        return null;
    }
}
