/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.util.Properties;

/**
 *
 * @author danhx
 */
public class MySQLService {
    Connection connection = null;
    protected  MySQLService(){
        try {
            String strConnect = "jdbc:mysql://localhost/java";
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "");
            
            Driver driver = new Driver();
            connection = (Connection) driver.connect(strConnect, properties);
            
            if (connection != null) {
                System.out.println("ket noi thanh cong");
            }else{
                System.out.println("Ket not that bai");
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
