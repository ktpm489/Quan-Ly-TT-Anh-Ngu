/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.util.List;
import java.util.Vector;
import qlttanhngu.dao.BangDiemDAO;
import qlttanhngu.dto.BangDiemDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XuanVinh
 */
public class BangDiemDO {

    private BangDiemDAO bangdiemdao;

    public BangDiemDO() throws Exception {
        bangdiemdao = new BangDiemDAO();
    }

    public List<HocVienDTO> GetListHocVienInBangDiem() throws Exception {
        try {
            return bangdiemdao.GetListHocVienInBangDiem();
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }

    public Vector<String> GetListTenLopHocHocVien() throws Exception {
        try {
            return bangdiemdao.GetListTenLopHocHocVien();
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }

    public List<BangDiemDTO> GetListBangDiemHocVien(String mahocvien) throws Exception {
        try {
            return bangdiemdao.GetListBangDiemHocVien(mahocvien);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }
        return null;
    }

    public Boolean UpdateBangDiemHocVien(String mabangdiem, String mahocvien, String makythi, Double diem) throws Exception {
        try {
            return bangdiemdao.UpdateBangDienHocVien(mabangdiem, mahocvien, makythi, diem);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return false;
    }

    public Boolean DeleteBangDiemHocVien(String mahocvien) throws Exception {
        try {
            return bangdiemdao.DeleteBangDiemOfHocVien(mahocvien);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }
        return false;
    }

    public String GetMaKyThiTheoTen(String tenkythi) throws Exception {
        try {
            return bangdiemdao.GetMaKyThiTheoTen(tenkythi);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return "";
    }

    public Vector<String> GetListMaHocVien() throws Exception {
        try {
            return bangdiemdao.GetListMaHocVienChinhThuc();
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }
    
    public String GetTenHocVienByMaHocVien(String mahocvien) throws Exception{
        try { 
        return bangdiemdao.GetTenHocVienByMaHocVien(mahocvien);
        }catch(Exception e){
            
        }finally{
            bangdiemdao.closeConnection();
        }
        return "";
    }

}
