/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import qlttanhngu.dao.QuyDinhDAO;
import qlttanhngu.dto.QuyDinhDTO;

/**
 *
 * @author XuanVinh
 */
public class QuyDinhBO {

    private QuyDinhDAO quyDinhDAO;

    public QuyDinhBO() throws Exception {
        quyDinhDAO = new QuyDinhDAO();
    }

    public QuyDinhDTO GetQuyDinh(String tenquydinh) throws Exception {

        try {
            return quyDinhDAO.GetQuyDinh(tenquydinh);
        } catch (Exception e) {

        } finally {
            quyDinhDAO.closeConnection();
        }
        return null;
    }

    public Boolean UpdateQuyDinh(QuyDinhDTO quyDinhDTO) throws Exception {
        try {
            return quyDinhDAO.UpdateQuyDinh(quyDinhDTO);
        } catch (Exception e) {

        } finally {
            quyDinhDAO.closeConnection();
        }
        return false;
    }
}
