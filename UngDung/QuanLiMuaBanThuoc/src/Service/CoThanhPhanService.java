/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.CoThanhPhan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class CoThanhPhanService extends MySQLService{
    
    public ArrayList<CoThanhPhan> layToanBoCoThanhPhan(){
        ArrayList<CoThanhPhan> dsCoThanhPhan = new ArrayList<>();
        try {
            String sql = "SELECT `thuoc`.`Ma_Thuoc`,`thuoc`.`Ten_Thuoc`, `thanh_phan`.`Ma_Thanh_Phan`, `thanh_phan`.`Ten_Thanh_Phan` FROM `co_thanh_phan`, `thanh_phan`, `thuoc` WHERE co_thanh_phan.Ma_Thanh_Phan=thanh_phan.Ma_Thanh_Phan AND co_thanh_phan.Ma_Thuoc=thuoc.Ma_Thuoc";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                CoThanhPhan coThanhPhan = new CoThanhPhan();
                coThanhPhan.setMaThuoc(resultSet.getString(1));
                coThanhPhan.setTenThuoc(resultSet.getString(2));
                coThanhPhan.setMaThanhPhan(resultSet.getInt(3));
                coThanhPhan.setTenThanhPhan(resultSet.getString(4));
                
                dsCoThanhPhan.add(coThanhPhan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsCoThanhPhan;
    }
    
    public int themCoThahPhan(CoThanhPhan coThanhPhan){
        try {
            String sql = "INSERT INTO `co_thanh_phan`(`Ma_Thuoc`, `Ma_Thanh_Phan`) VALUES (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, coThanhPhan.getMaThuoc());
            preparedStatement.setInt(2, coThanhPhan.getMaThanhPhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaCoThanhPhan(CoThanhPhan coThanhPhan){
        try {
            String sql = "UPDATE `co_thanh_phan` SET `Ma_Thanh_Phan` =? WHERE `Ma_Thuoc` =? AND `Ma_Thanh_Phan` =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
    
            preparedStatement.setInt(1, coThanhPhan.getMaThanhPhan());
            
            preparedStatement.setString(2, coThanhPhan.getMaThuocSua());
            preparedStatement.setInt(3, coThanhPhan.getMaThanhPhanSua());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaCoThanhPhan(CoThanhPhan coThanhPhan){
        try {
            String sql = "DELETE FROM `co_thanh_phan` WHERE `Ma_Thuoc`=? AND `Ma_Thanh_Phan`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, coThanhPhan.getMaThuoc());
            preparedStatement.setInt(2, coThanhPhan.getMaThanhPhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return -1;
    }
    
}
