/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author spsither
 */
public class DBConnector {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement  stmt = null;
    ResultSetMetaData meta = null;
    static String pwd = null;
    
    
    DBConnector(){
    pwd = "ipeans";
    try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/TR","root",pwd);
            
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Pelase check if MySql server is on.", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    boolean checkLogin(Admin admin){
        try {
            String query = "select * from admin where name =? and password =?;";
            stmt = con.prepareStatement(query);
            stmt.setString(1, admin.getName());
            stmt.setString(2, admin.getPassword());
            rs = stmt.executeQuery();
            
            return rs.next();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    ResultSet selectQuery(long id){
         try {
            
            stmt = con.prepareStatement("select Name, AddressLine1, AddressLine2, AddressLine3, AddressLine4, City,State ,Pin, Country, ExpDate, NoOfCopy, BillOrComp from customer where id =?;");
            stmt.setLong(1, id);
            rs = stmt.executeQuery();
            meta = rs.getMetaData();
            return rs;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    ResultSet executeQuery(String query){
         try {
            
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            meta = rs.getMetaData();
            return rs;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    int executeUpdate(String query){
        int r = 0;
    try {
            r = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return r;
    }
    
    
    void close(){
        try {
            if(con != null){
            con.close();
            }
            if(rs != null){
            rs.close();
            }
            if(stmt != null){
            stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    void deleteRecord(long id) {
        try {
            
            stmt = con.prepareStatement("delete from customer where id = ?;");
            stmt.setObject(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    boolean insert(Customer cus) {
        try {if(cus.getBillOrComp().equals("BILL")){
            String query = "insert into customer (Name, AddressLine1, AddressLine2, AddressLine3, AddressLine4, City,State ,Pin, Country, ExpDate, NoOfCopy, BillOrComp) values" +
        "(?,?,?,?,?,?,?,?,?,?,?,?);";
            stmt = con.prepareStatement(query);
            stmt.setString(1, cus.getName());
            stmt.setString(2, cus.getAddressLine1());
            stmt.setString(3, cus.getAddressLine2());
            stmt.setString(4, cus.getAddressLine3());
            stmt.setString(5, cus.getAddressLine4());
            stmt.setString(6, cus.getCity());
            stmt.setString(7, cus.getState());
            stmt.setInt(8, cus.getPin());
            stmt.setString(9, cus.getCountry());
            stmt.setString(10, cus.getExpDate());
            stmt.setInt(11, cus.getNoOfCopy());
            stmt.setString(12, cus.getBillOrComp());
            
            stmt.executeUpdate();
            
            return true;
        }
        else {
            String query = "insert into customer (Name, AddressLine1, AddressLine2, AddressLine3, AddressLine4, City,State ,Pin, Country, NoOfCopy, BillOrComp) values" +
        "(?,?,?,?,?,?,?,?,?,?,?);";
            stmt = con.prepareStatement(query);
            stmt.setString(1, cus.getName());
            stmt.setString(2, cus.getAddressLine1());
            stmt.setString(3, cus.getAddressLine2());
            stmt.setString(4, cus.getAddressLine3());
            stmt.setString(5, cus.getAddressLine4());
            stmt.setString(6, cus.getCity());
            stmt.setString(7, cus.getState());
            stmt.setInt(8, cus.getPin());
            stmt.setString(9, cus.getCountry());
            stmt.setInt(10, cus.getNoOfCopy());
            stmt.setString(11, cus.getBillOrComp());
            
            stmt.executeUpdate();
            
            return true;
            
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    
    boolean edit(Customer cus,long id) {
        try {
            if(cus.getBillOrComp().equals("BILL")){
            String query = "update customer set Name = ?, AddressLine1 = ?, AddressLine2 = ?, AddressLine3 = ?, AddressLine4 = ?, City = ?,State = ?,Pin = ?, Country = ?, ExpDate = ?, NoOfCopy = ?, BillOrComp = ? where id = ?;";
            stmt = con.prepareStatement(query);
            stmt.setString(1, cus.getName());
            stmt.setString(2, cus.getAddressLine1());
            stmt.setString(3, cus.getAddressLine2());
            stmt.setString(4, cus.getAddressLine3());
            stmt.setString(5, cus.getAddressLine4());
            stmt.setString(6, cus.getCity());
            stmt.setString(7, cus.getState());
            stmt.setInt(8, cus.getPin());
            stmt.setString(9, cus.getCountry());
            stmt.setString(10, cus.getExpDate());
            stmt.setInt(11, cus.getNoOfCopy());
            stmt.setString(12, cus.getBillOrComp());
            stmt.setLong(13, id);
            stmt.executeUpdate();
            
            return true;
            }
            else{
            String query = "update customer set Name = ?, AddressLine1 = ?, AddressLine2 = ?, AddressLine3 = ?, AddressLine4 = ?, City = ?,State = ?,Pin = ?, Country = ?, ExpDate = ?, NoOfCopy = ?, BillOrComp = ? where id = ?;";
            stmt = con.prepareStatement(query);
            stmt.setString(1, cus.getName());
            stmt.setString(2, cus.getAddressLine1());
            stmt.setString(3, cus.getAddressLine2());
            stmt.setString(4, cus.getAddressLine3());
            stmt.setString(5, cus.getAddressLine4());
            stmt.setString(6, cus.getCity());
            stmt.setString(7, cus.getState());
            stmt.setInt(8, cus.getPin());
            stmt.setString(9, cus.getCountry());
            stmt.setString(10, null);
            stmt.setInt(11, cus.getNoOfCopy());
            stmt.setString(12, cus.getBillOrComp());
            stmt.setLong(13, id);
            stmt.executeUpdate();
            
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    long getStrength() {
        //"select count(*) from customer;";
        try {
            
            stmt = con.prepareStatement("select count(*) from customer;");
            rs = stmt.executeQuery();
            meta = rs.getMetaData();
            //System.out.println(" rs.getInt(1) = "+rs.getInt(1));
            if(rs.next())
                return rs.getLong(1);
            else return -1;
            
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    long getExpStrength() {
        try {
            
            stmt = con.prepareStatement("select count(*) from customer where ExpDate < now();");
            rs = stmt.executeQuery();
            meta = rs.getMetaData();
            if(rs.next())
                return rs.getLong(1);
            else return -1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    StringBuffer  getCountryWiseStrength() {
        StringBuffer list = new StringBuffer();
        try {
            
            stmt = con.prepareStatement("select Country, count(*) from customer group by Country order by count(*) desc;");
            rs = stmt.executeQuery();
            meta = rs.getMetaData();
            while(rs.next()){
                list.append(rs.getString(1)).append(" -> ").append(rs.getLong(2)).append("\n");
            }
            return list;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return list;
        }
    }

    boolean changePwd(Admin admin){
        String query = "update admin set password = ? where name = ?;";
        try{
            stmt = con.prepareStatement(query);
            stmt.setString(1, admin.getPassword());
            stmt.setString(2, admin.getName());
            stmt.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            return true;
    }
    
}
