/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.NhomThuoc;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class NhomThuocService extends MySQLService{
    
    public ArrayList<NhomThuoc> layToanBoNhomThuoc(){
        
        ArrayList<NhomThuoc> dsNhomThuoc = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `nhom_thuoc` WHERE 1";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet =  preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                NhomThuoc  nhomThuoc = new NhomThuoc();
                nhomThuoc.setMaNhom(resultSet.getInt(1));
                nhomThuoc.setTenNhom(resultSet.getString(2));
                
                dsNhomThuoc.add(nhomThuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        
        }
        
        return dsNhomThuoc;
    }
    
    public int themNhomThuoc(NhomThuoc nhomThuoc){
        try {
            String sql = "INSERT INTO `nhom_thuoc`(`Ten_Nhom`) VALUES (?)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, nhomThuoc.getTenNhom());
            
            return  preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaNhomThuoc(NhomThuoc nhomThuoc){
        try {
            String sql = "UPDATE `nhom_thuoc` SET `Ten_Nhom`=? WHERE `Ma_Nhom`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, nhomThuoc.getTenNhom());
            preparedStatement.setInt(2, nhomThuoc.getMaNhom());
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int xoaNhomThuoc(NhomThuoc nhomThuoc){
        try {
            String sql = "DELETE FROM `nhom_thuoc` WHERE `Ma_Nhom`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1,nhomThuoc.getMaNhom());
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
}
