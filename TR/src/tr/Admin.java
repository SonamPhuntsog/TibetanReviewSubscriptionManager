/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr;

/**
 *
 * @author spsither
 */
public class Admin {
    private String name;
    private String password;
    Admin(String n, String pwd){
        name = "";
        password = "";
        if(n != null){
        name = n;
        }
        if(pwd != null){
        password = pwd;
        }
    }
    Admin(){
        name = "";
        password = "";
    }
    void setName(String n){
        if(n != null)
        name = n;
    }
    void setPassword(String pwd){
        if(pwd != null)
        password = pwd;
    }
    String getName(){
        return name;
    }
    String getPassword(){
        return password;
    }
    
}
