/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.bo.QuyDinhBO;
import qlttanhngu.dto.QuyDinhDTO;

/**
 *
 * @author XuanVinh
 */
public class QuyDinhController {

    private QuyDinhBO quyDinhBO;

    public QuyDinhController() throws Exception {
        quyDinhBO = new QuyDinhBO();
    }

    public QuyDinhDTO GetQuyDinh(String tenquydinh) {
        try {
            return quyDinhBO.GetQuyDinh(tenquydinh);
        } catch (Exception ex) {
            Logger.getLogger(QuyDinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Boolean UpdateQuyDinh(QuyDinhDTO quyDinhDTO) {
        try {
            return quyDinhBO.UpdateQuyDinh(quyDinhDTO);
        } catch (Exception ex) {
            Logger.getLogger(QuyDinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
