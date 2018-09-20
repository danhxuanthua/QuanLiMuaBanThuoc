/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Benh;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class BenhService extends MySQLService{
    
    public ArrayList<Benh> layToanBoBenh(){
        ArrayList<Benh> dsBenh = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM `benh` WHERE 1";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                Benh benh = new Benh();
                benh.setMaBenh(resultSet.getInt(1));
                benh.setTenBenh(resultSet.getString(2));
                
                dsBenh.add(benh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsBenh;
    }
    
    public int themBenh(Benh benh){
        try {
            String sql = "INSERT INTO `benh`(`Ma_Benh`, `Ten_Benh`) VALUES (?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, benh.getMaBenh());
            preparedStatement.setString(2, benh.getTenBenh());
            
            return  preparedStatement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaBenh(Benh benh){
        try {
            String sql = "UPDATE `benh` SET `Ten_Benh`=? WHERE `Ma_Benh`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, benh.getTenBenh());
            preparedStatement.setInt(2, benh.getMaBenh());
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaBenh(Benh benh){
        try {
            String sql = "DELETE FROM `benh` WHERE `Ma_Benh`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, benh.getMaBenh());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
}
