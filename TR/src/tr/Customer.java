/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spsither
 */
public class Customer {
    private String Name, AddressLine1, AddressLine2, AddressLine3, AddressLine4,City, State, Country, ExpDate, BillOrComp;
   private int Pin, NoOfCopy;
   Customer(){
       Name = AddressLine1 = AddressLine2 = AddressLine3 = AddressLine4 = State = City = Country = ExpDate = BillOrComp = "";
       Pin = NoOfCopy = 0;
   }
   boolean setName(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       Name = n;
       return true;
    }
   boolean setAddressLine1(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       AddressLine1 = n;
       return true;
    }
   boolean setAddressLine2(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       AddressLine2 = n;
       return true;
    }
   boolean setAddressLine3(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       AddressLine3 = n;
       return true;
    }
   boolean setAddressLine4(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       AddressLine4 = n;
       return true;
    }
   boolean setCity(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       City = n;
       return true;
    }
   boolean setState(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       State = n;
       return true;
    }
   boolean setCountry(String n){
       if(n == null || n.isEmpty() || n.equals("-select-")){
           return false;
       }
       Country = n;
       return true;
    }
   boolean setExpDate(String n){
        try {
            if(n == null || n.isEmpty()){
                return false;
            }
            
            new SimpleDateFormat("yyyy-MM-dd").parse(n);
            ExpDate = n;
            
            return true;
        } catch (ParseException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   boolean setBillOrComp(String n){
       if(n == null || n.isEmpty()|| (!n.equals("BILL")&& !n.equals("COMP"))){
           return false;
       }
       BillOrComp = n;
       return true;
    }
   boolean setPin(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       try{
           Pin = Integer.parseInt(n);
           if(Pin < 0) throw new NumberFormatException();
           return true;
       }
       catch(NumberFormatException ex){
           return false;
       }
       
       
    }
   boolean setPin(int n){
       if(n < 0){
           return false;
       }
       Pin = n;
       return true;
   }
   boolean setNoOfCopy(String n){
       if(n == null || n.isEmpty()){
           return false;
       }
       try{
           NoOfCopy = Integer.parseInt(n);
           if(NoOfCopy < 1) throw new NumberFormatException();
           return true;
       }
       catch(NumberFormatException ex){
           return false;
       } 
    }
   boolean setNoOfCopy(int n){
       if (n < 1)
           return false;
       NoOfCopy = n;
       return true;
   }
   String getName(){
       return Name;
   }
   String getAddressLine1(){
       return AddressLine1;
   }
   String getAddressLine2(){
       return AddressLine2;
   }
   String getAddressLine3(){
       return AddressLine3;
   }
   String getAddressLine4(){
       return AddressLine4;
   }
   String getCity(){
       return City;
   }
   String getState(){
       return State;
   }
   String getCountry(){
       return Country;
   }
   String getBillOrComp(){
       return BillOrComp;
   }
   String getExpDate(){
       return ExpDate;
   }
   int getPin(){
       return Pin;
   }
   int getNoOfCopy(){
       return NoOfCopy;
       
   }
    @Override
   public String toString(){
       String s = "\r\n\r\n";
       
       if(NoOfCopy > 0){
       s += "     "+NoOfCopy+"C";
       }
       if(!ExpDate.isEmpty()){
       s += "  Exp "+ExpDate ;
       }
       s +=" "+BillOrComp+"\r\n"+Name+"\r\n"+AddressLine1;
       if(!AddressLine2.isEmpty()){
       s += "\r\n"+ AddressLine2;    
       }
       if(!AddressLine3.isEmpty()){
       s += "\r\n"+ AddressLine3;
       }
       if(!AddressLine4.isEmpty()){
       s += "\r\n"+ AddressLine4;
       }
       if(!City.isEmpty()){
       s += "\r\n"+ City;
       }
       if(!State.isEmpty()){
       s += "\r\n" +State;    
       }
       if(Pin >= 0){
       s += " "+Pin;
       }
       if(!Country.isEmpty()){
       s += "\r\n"+Country;
       }
       s += "\r\n\r\n";
       return s;
   }
    void load(ResultSet rs){
        try {
            setName(rs.getString("Name"));
            setAddressLine1(rs.getString("AddressLine1"));
            setAddressLine2(rs.getString("AddressLine2"));
            setAddressLine3(rs.getString("AddressLine3"));
            setAddressLine4(rs.getString("AddressLine4"));
            setCity(rs.getString("City"));
            setState(rs.getString("State"));
            setCountry(rs.getString("Country"));
            
            //System.out.println(rs.getString("ExpDate"));
            setExpDate(rs.getString("ExpDate"));
            setBillOrComp(rs.getString("BillOrComp"));
            
            setPin(rs.getInt("Pin"));
            setNoOfCopy(rs.getInt("NoOfCopy"));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    void clear(){
         Name = AddressLine1 = AddressLine2 = AddressLine3 = AddressLine4 = State = City = Country = ExpDate = BillOrComp = "";
       Pin = NoOfCopy = 0;
    }
}
