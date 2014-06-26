/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.BaoCaoKeToanDTO;

/**
 *
 * @author EvilZ
 */
public class BaoCaoKeToanDAO extends DataBase {
    
    public BaoCaoKeToanDAO() throws Exception{
        super();
    }
    
    public List<BaoCaoKeToanDTO> layBaoCaoDangKy(java.sql.Date ngaylap) throws SQLException{
        List<BaoCaoKeToanDTO> lstBc = new ArrayList<BaoCaoKeToanDTO>();
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        int i = 0;
        callableStatement = getConnection().prepareCall("{call TaoBaoCaoKeToan(?)}");
        callableStatement.setDate(1, ngaylap);
        resultSet = this.executeQuery(this.getConnection(), callableStatement);
        while(resultSet.next()){
            BaoCaoKeToanDTO baocaodto = new BaoCaoKeToanDTO();
            baocaodto.setTenLop(resultSet.getString(1));
            baocaodto.setTrinhDo(resultSet.getString(2));
            baocaodto.setSiSo(resultSet.getInt(3));
            baocaodto.setSoTienThu(resultSet.getFloat(4));
            lstBc.add(baocaodto);
        };
        return lstBc;
    }
}
