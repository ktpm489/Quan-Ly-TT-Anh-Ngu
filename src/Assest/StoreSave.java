/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assest;


import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import qlttanhngu.dto.HocVienDTO;
import qlttanhngu.dto.PhanQuyenDTO;
import qlttanhngu.gui.FrameDSHocVien;
import qlttanhngu.gui.FrameMain;

/**
 *
 * @author XUANVINHTD
 */
public class StoreSave {
    //Sử dụng để kiểm tra một số quyền hạng
    public static String accountNameSave;
    public static String userNamSave;
    public static String manhanvien;
    public static String machucvu;
    public static PhanQuyenDTO phanquyen;
    
    public int number;
    
    //dùng để hiển thị một frame mới
    public static JDesktopPane desktop;
    
    // sử dụng trong frame bảng điểm học viên
    public static String mahocvien;
    public static String tenhocvien;
    
    //Lưu lại một số giá trị của học viên để frame khác sử dụng
    public static HocVienDTO hocvien;
    
    //sử dụng để update lại frame danh sách học viên
    public static FrameDSHocVien frameDSHocVien;
    
    //sử dụng để update frame main
    public static FrameMain frameMain;
    
     //Khởi Tạo các frameInternal 
    public static void InitFrameInternal(JInternalFrame jInternalFrame) {
        
        StoreSave.desktop.add(jInternalFrame);
        try {
            jInternalFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jInternalFrame.show();
        
    }

    //Kiểm tra xem frame đó đã được khởi tạo và show lên chưa
    public static Boolean isExsting(JInternalFrame jInternalFrame) {
        JInternalFrame[] lstDesktop;
        lstDesktop =   StoreSave.desktop.getAllFrames();
        
        for (int i = 0; i < lstDesktop.length; i++) {
            if (lstDesktop[i].getClass() == jInternalFrame.getClass()) {
                try {
                    lstDesktop[i].setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                return false;
            }
        }
        return true;
    }
      
}
