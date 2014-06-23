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
import java.util.Date;
import java.util.List;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.BaoCaoDangKyDTO;

/**
 *
 * @author EvilZ
 */
public class BaoCaoDangKyDAO extends DataBase{
    
    public BaoCaoDangKyDAO() throws Exception{
        super();
    }
    
    public List<BaoCaoDangKyDTO> layBaoCaoDangKy(String khoahoc, java.sql.Date ngaydk) throws SQLException{
        List<BaoCaoDangKyDTO> lstBc = new ArrayList<BaoCaoDangKyDTO>();
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        int i = 0;
        callableStatement = getConnection().prepareCall("{call LayKhoaHoc()}");
        callableStatement.setString(1,khoahoc );
        callableStatement.setDate(2, ngaydk);
        resultSet = this.executeQuery(this.getConnection(), callableStatement);
        while(resultSet.next()){
            BaoCaoDangKyDTO baocaodto = new BaoCaoDangKyDTO();
            baocaodto.setTenLop(resultSet.getString(1));
            baocaodto.setTrinhDo(resultSet.getString(2));
            baocaodto.setSoLuongDangKy(resultSet.getFloat(3));
            baocaodto.setTiLeDat(resultSet.getFloat(4));
            lstBc.add(baocaodto);
        };
        return lstBc;
    }
}
