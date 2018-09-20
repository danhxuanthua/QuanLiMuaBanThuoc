/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ThanhPhan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ThanhPhanService extends MySQLService{
    
    public ArrayList<ThanhPhan> layToanBoThanhPhan(){
        ArrayList<ThanhPhan> dsThanhPhan =new ArrayList();
        
        try {
            String sql = "SELECT * FROM `thanh_phan` WHERE 1";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                ThanhPhan thanhPhan = new ThanhPhan();
                thanhPhan.setMaThanhPhan(resultSet.getInt(1));
                thanhPhan.setTenThanhPhan(resultSet.getString(2));
                dsThanhPhan.add(thanhPhan);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsThanhPhan;
    }
    
    public int themThanhPhan(ThanhPhan thanhPhan){
        try {
            String sql = "INSERT INTO `thanh_phan`(`Ten_Thanh_Phan`) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thanhPhan.getTenThanhPhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaThanhPhan(ThanhPhan thanhPhan){
        try {
            String sql = "UPDATE `thanh_phan` SET `Ten_Thanh_Phan`=? WHERE `Ma_Thanh_Phan`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thanhPhan.getTenThanhPhan());
            preparedStatement.setInt(2, thanhPhan.getMaThanhPhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaThanhPhan(ThanhPhan thanhPhan){
        try {
            String sql = "DELETE FROM `thanh_phan` WHERE `Ma_Thanh_Phan`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, thanhPhan.getMaThanhPhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
