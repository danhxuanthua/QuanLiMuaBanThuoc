/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ChongChiDinh;
import Model.CoChiDinh;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ChongChiDinhService extends MySQLService{
    
    public ArrayList<ChongChiDinh> layToanBoDanhSachChongChiDinh(){
        ArrayList<ChongChiDinh> dsChongChiDinh = new ArrayList<>();
        try {
            String sql = "SELECT `benh`.`Ma_Benh`, `benh`.`Ten_Benh`, `thuoc`.`Ma_Thuoc`,`thuoc`.`Ten_Thuoc` FROM `chong_chi_dinh`, `benh`,`thuoc` WHERE chong_chi_dinh.Ma_Benh=benh.Ma_Benh AND chong_chi_dinh.Ma_Thuoc=thuoc.Ma_Thuoc";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                ChongChiDinh chongChiDinh = new ChongChiDinh();
                chongChiDinh.setMaBenh(resultSet.getInt(1));
                chongChiDinh.setTenBenh(resultSet.getString(2));
                chongChiDinh.setMaThuoc(resultSet.getString(3));
                chongChiDinh.setTenThuoc(resultSet.getString(4));
                
                dsChongChiDinh.add(chongChiDinh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsChongChiDinh;
    }
    
    public int themChongChiDinh(ChongChiDinh chongChiDinh){
        try {
            String sql = "INSERT INTO `chong_chi_dinh` (`Ma_Benh`, `Ma_Thuoc`) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, chongChiDinh.getMaBenh());
            preparedStatement.setString(2, chongChiDinh.getMaThuoc());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int suaChongChiDinh(ChongChiDinh chongChiDinh){
        try {
            String sql = "UPDATE `chong_chi_dinh` SET `Ma_Thuoc` =? WHERE `chong_chi_dinh`.`Ma_Benh` =? AND `chong_chi_dinh`.`Ma_Thuoc` =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, chongChiDinh.getMaThuoc());
            preparedStatement.setInt(2, chongChiDinh.getMaBenhSua());
            preparedStatement.setString(3,chongChiDinh.getMaThuocSua());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaChongChiDinh(ChongChiDinh chongChiDinh){
        try {
            String sql = "DELETE FROM `chong_chi_dinh` WHERE `Ma_Benh`=? AND `Ma_Thuoc`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, chongChiDinh.getMaBenh());
            preparedStatement.setString(2, chongChiDinh.getMaThuoc());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
