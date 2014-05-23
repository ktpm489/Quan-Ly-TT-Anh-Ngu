
package qlttanhngu.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XUANVINHTD
 */
public class DataBase {
    
    //Tạo đối tượng kết nối với dữ liệu.
    private  Connection connect = null;
    
  //  public Connection getConnect()
    //Tạo đối tượng thực hiện các thao tác.
    private  CallableStatement callableStatement = null;
    
    public DataBase() throws Exception
    {
        connect = ConnectionDataBase.getConnection();
    }
    
     //Thực hiện câu lênh Stored procedures không có tham số đầu vào và trả về kiểu ResultSet
    public ResultSet executeQuery(String ProcedureName) throws SQLException 
    {
        ResultSet resultSet = null;
        //Tạo đối tượng kết nối.       
        try
        {
            // hủy chế độ comit tự động.
            connect.setAutoCommit(false);

            // Khởi tạo đối tượng để thực hiện câu Stored procedure
            callableStatement = connect.prepareCall(ProcedureName);
            // Thực hiện câu StoreProcedures
            resultSet = callableStatement.executeQuery();
            
            // thực hiện việc xác nhận với hệ quản trị cơ sỏ dữ liệu.
            connect.commit();
            
        } catch (SQLException ex) 
        {
            if(connect != null)
                connect.rollback();          
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Lỗi...!", JOptionPane.ERROR_MESSAGE);
        }          
        return resultSet;
    }
    
     //Thực hiện câu lênh Stored procedures có tham số đầu vào và trả về kiểu ResultSet
    public  ResultSet executeQuery(Connection cnn, CallableStatement callableStatement) throws SQLException 
    {
        ResultSet resultSet = null;     
        //Tạo đối tượng kết nối.    
        try
        {
            // hủy chế độ comit tự động.
            cnn.setAutoCommit(false);         
            // Thực hiện câu StoreProcedures
            resultSet = callableStatement.executeQuery();
            
            // thực hiện việc xác nhận với hệ quản trị cơ sỏ dữ liệu.
            cnn.commit();
            
        } catch (SQLException ex) 
        {
            if(cnn != null)
                cnn.rollback();          
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Lỗi...!", JOptionPane.ERROR_MESSAGE);
        }        
        return resultSet;
    }
    
     //Thực hiện câu lênh Stored procedures không có tham số đầu vào và trả về dữ liệu bảng 
    public  DefaultTableModel  executeQuery_Table(String ProcedureName) throws SQLException 
    {
        //lấy kq trả về từ câu lệnh
        ResultSet resultSet = null;
        //Bảng lưu kq
        DefaultTableModel  defaultTableModel  = null;
        //chứa tên của các cột.
        Vector columnNames = new Vector();
        //chức dữ liệu của từng cột.
        Vector data = new Vector();
        //Tạo đối tượng kết nối.      
        try
        {
            // hủy chế độ comit tự động.
            connect.setAutoCommit(false);

            // Khởi tạo đối tượng để thực hiện câu Stored procedure
            callableStatement = connect.prepareCall(ProcedureName);
            // Thực hiện câu StoreProcedures
            resultSet = callableStatement.executeQuery();
            
            // thực hiện việc xác nhận với hệ quản trị cơ sỏ dữ liệu.
            connect.commit();
            
        } catch (SQLException ex) 
        {
            if(connect != null)
                connect.rollback();          
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Lỗi...!", JOptionPane.ERROR_MESSAGE);
        }    
        
        ResultSetMetaData md = resultSet.getMetaData();
        int column = md.getColumnCount();
        //lấy tên cột trong bảng
        for(int i = 1;i <= column ;i++)
            columnNames.addElement(md.getColumnName(i));
        
        //lấy dữ liệu add vào table
        while(resultSet.next())
        {
            // chứa dữ liệu tuong ứng với mỗi dòng
            Vector Datarow = new Vector();
            for(int i = 1; i <= column; i++)
                Datarow.addElement(resultSet.getObject(i));
           
            data.addElement(Datarow);
        }
        
        defaultTableModel  = new DefaultTableModel (data, columnNames);
        
        return defaultTableModel ;
    }
    
    //Thực hiện câu lênh Stored procedures có tham số đầu vào và trả về dữ liệu bảng 
    public  DefaultTableModel  executeQuery_Table(Connection cnn, CallableStatement callableStatement) throws SQLException 
    {
        //lấy kq trả về từ câu lệnh
        ResultSet resultSet = null;
        //Bảng lưu kq
        DefaultTableModel  defaultTableModel  = null;
        //chứa tên của các cột.
        Vector columnNames = new Vector();
        //chức dữ liệu của từng cột.
        Vector data = new Vector();
        //Tạo đối tượng kết nối.

        try
        {
            // hủy chế độ comit tự động.
            cnn.setAutoCommit(false);
            // Thực hiện câu StoreProcedures
            resultSet = callableStatement.executeQuery();   
            // thực hiện việc xác nhận với hệ quản trị cơ sỏ dữ liệu.
            cnn.commit();
            
        } catch (SQLException ex) 
        {
            if(cnn != null)
                cnn.rollback();          
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Lỗi...!", JOptionPane.ERROR_MESSAGE);
        }    
        
        ResultSetMetaData md = resultSet.getMetaData();
        int column = md.getColumnCount();
        //lấy tên cột trong bảng
        for(int i = 1;i <= column ;i++)
            columnNames.addElement(md.getColumnName(i));
        
        //lấy dữ liệu add vào table
        while(resultSet.next())
        {
            // chứa dữ liệu tuong ứng với mỗi dòng
            Vector Datarow = new Vector();
            for(int i = 1; i <= column; i++)
                Datarow.addElement(resultSet.getObject(i));
           
            data.addElement(Datarow);
        }
        
        defaultTableModel  = new DefaultTableModel (data, columnNames);
        
        return defaultTableModel ;
    }
      
     //Thực hiện câu lênh Stored procedures không có tham số đầu vào và trả về dữ liệu bảng 
    public  DefaultComboBoxModel  executeQuery_ComBoBox(String ProcedureName) throws SQLException 
    {
        //lấy kq trả về từ câu lệnh
        ResultSet resultSet = null;
        //Combox lưu kq
        DefaultComboBoxModel  defaultComboBoxModel  = null;
        //chức dữ liệu của từng cột.
        Vector data = new Vector();
        //Tạo đối tượng kết nối.
        
        try
        {
            // hủy chế độ comit tự động.
            connect.setAutoCommit(false);

            // Khởi tạo đối tượng để thực hiện câu Stored procedure
            callableStatement = connect.prepareCall(ProcedureName);
            // Thực hiện câu StoreProcedures
            resultSet = callableStatement.executeQuery();
            
            // thực hiện việc xác nhận với hệ quản trị cơ sỏ dữ liệu.
            connect.commit();
            
        } catch (SQLException ex) 
        {
            if(connect != null)
                connect.rollback();          
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Lỗi...!", JOptionPane.ERROR_MESSAGE);
        }    
        
       //lấy dữ liệu add vào ComBoBox
        while(resultSet.next())
            data.addElement(resultSet.getObject(1));
        
        defaultComboBoxModel  = new DefaultComboBoxModel (data);
        
        return defaultComboBoxModel ;
    }
    
    //Thực hiện câu lênh Stored procedures có tham số đầu vào và trả về dữ liệu bảng 
    public  DefaultComboBoxModel  executeQuery_ComBoBox(Connection cnn, CallableStatement callableStatement) throws SQLException 
    {
        //lấy kq trả về từ câu lệnh
        ResultSet resultSet = null;
        //Combox lưu kq
        DefaultComboBoxModel  defaultComboBoxModel  = null;
        //chức dữ liệu của từng cột.
        Vector data = new Vector();
        //Tạo đối tượng kết nối.       
        try
        {
            // hủy chế độ comit tự động.
            cnn.setAutoCommit(false);        
            // Thực hiện câu StoreProcedures
            resultSet = callableStatement.executeQuery();
            
            // thực hiện việc xác nhận với hệ quản trị cơ sỏ dữ liệu.
            cnn.commit();
            
        } catch (SQLException ex) 
        {
            if(cnn != null)
                cnn.rollback();          
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Lỗi...!", JOptionPane.ERROR_MESSAGE);
        }    
        
       //lấy dữ liệu add vào ComBoBox
        while(resultSet.next())
            data.addElement(resultSet.getObject(1));
        
        defaultComboBoxModel  = new DefaultComboBoxModel (data);
        
        return defaultComboBoxModel ;
    }
    
    //Thực hiện câu lênh Stored procedures không có tham số đầu vào (update , delete, insert..)
    public  int executeQueryUpdate(String ProcedureName) throws SQLException 
    {
        int resultSet = 0;
        //Tạo đối tượng kết nối.
        try
        {
            // hủy chế độ comit tự động.
            connect.setAutoCommit(false);

            // Khởi tạo đối tượng để thực hiện câu Stored procedure
            callableStatement = connect.prepareCall(ProcedureName);
            // Thực hiện câu StoreProcedures
            resultSet = callableStatement.executeUpdate();
            
            // thực hiện việc xác nhận với hệ quản trị cơ sỏ dữ liệu.
            connect.commit();
            
        } catch (SQLException ex) 
        {
            if(connect != null)
                connect.rollback();          
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Lỗi...!", JOptionPane.ERROR_MESSAGE);
        }          
        return resultSet;
    }
    
    //Thực hiện câu lênh Stored procedures có tham số đầu vào (update , delete, insert..)
    public static int executeQueryUpdate(Connection cnn ,CallableStatement callableStatement) throws SQLException 
    {
        int resultSet = 0;       
        //Tạo đối tượng kết nối.     
        try
        {
            // hủy chế độ comit tự động.
            cnn.setAutoCommit(false);
            // Thực hiện câu StoreProcedures
            resultSet = callableStatement.executeUpdate();           
            // thực hiện việc xác nhận với hệ quản trị cơ sỏ dữ liệu.
            cnn.commit();
            
        } catch (SQLException ex) 
        {
            if(cnn != null)
                cnn.rollback();          
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Lỗi...!", JOptionPane.ERROR_MESSAGE);
        }              
        return resultSet;
    }
    
    //Đóng Kết nối
    public void closeConnection() throws Exception 
    {
         if(callableStatement != null)
         {
             callableStatement.close();
         }
        try {
            getConnection().close();
        }
        catch (Exception e) {
            System.out.println("Failed in closeConnection method in MapperDB:" + e);
        }
    }

     //Lấy đối tượng connect
    public Connection getConnection() {
        return connect;
    }
}
