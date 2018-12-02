/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class jConnnect {
    private jConnnect() {
        
    }
    static Connection con;
    public static Connection connectIt(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root&password=root&useSSL=false&verifyServerCertificate=false&allowMultiQueries=false");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
