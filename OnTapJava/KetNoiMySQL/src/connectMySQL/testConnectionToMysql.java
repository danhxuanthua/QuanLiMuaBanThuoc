/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectMySQL;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.util.Properties;

/**
 *
 * @author danhx
 */
public class testConnectionToMysql {
    public static void main(String[] args) {
        try {
            String strConnect = "jdbc:mysql://172.17.8.8/danhxuan_KGUMap?useSSL=true";
            Properties pro = new Properties();
            pro.put("user", "danhxuan_kgumap");
            pro.put("password", "123456789@Thua");
            Driver driver = new Driver();
            Connection con = (Connection) driver.connect(strConnect, pro);
            if (con != null) {
                System.out.println("Ket noi thanh cong");
            }else{
                System.out.println("Ket not that bai");
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
