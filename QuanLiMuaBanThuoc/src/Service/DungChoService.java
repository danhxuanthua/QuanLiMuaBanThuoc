/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.CoLieuLuongDung;
import Model.DungCho;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class DungChoService extends MySQLService{
    
    public ArrayList<DungCho> layToanBoDungCho(){
        ArrayList<DungCho> dsDungCho = new ArrayList<>();
        try {
            String sql = "SELECT `thuoc`.`Ma_Thuoc`,`thuoc`.`Ten_Thuoc`, `doi_tuong_benh_nhan`.`Ma_Doi_Tuong_Benh_Nhan`, `doi_tuong_benh_nhan`.`Ten_Doi_Tuong_Benh_Nhan` FROM `dung_cho`, `thuoc`, `doi_tuong_benh_nhan` WHERE dung_cho.Ma_Thuoc=thuoc.Ma_Thuoc AND dung_cho.Ma_Doi_Tuong_Benh_Nhan=doi_tuong_benh_nhan.Ma_Doi_Tuong_Benh_Nhan";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                DungCho dungCho = new DungCho();
                dungCho.setMaThuoc(resultSet.getString(1));
                dungCho.setTenThuoc(resultSet.getString(2));
                dungCho.setMaDoiTuongBenhNhan(resultSet.getInt(3));
                dungCho.setTenDoiTuongBenhNhan(resultSet.getString(4));
                
                dsDungCho.add(dungCho);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsDungCho;
    }
    
    public int themDungCho(DungCho dungCho){
        try {
            String sql = "INSERT INTO `dung_cho`(`Ma_Thuoc`, `Ma_Doi_Tuong_Benh_Nhan`) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dungCho.getMaThuoc());
            preparedStatement.setInt(2, dungCho.getMaDoiTuongBenhNhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaDungCho(DungCho dungCho){
        try {
            String sql = "UPDATE `dung_cho` SET `Ma_Doi_Tuong_Benh_Nhan` =? WHERE `dung_cho`.`Ma_Thuoc` =? AND `dung_cho`.`Ma_Doi_Tuong_Benh_Nhan` =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, dungCho.getMaDoiTuongBenhNhan());
            
            preparedStatement.setString(2, dungCho.getMaThuocSua());
            preparedStatement.setInt(3, dungCho.getMaDoiTuongBenhNhanSua());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
 
    public int xoaDungCho(DungCho dungCho){
        try {
            String sql = "DELETE FROM `dung_cho` WHERE `Ma_Thuoc`=? AND `Ma_Doi_Tuong_Benh_Nhan`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dungCho.getMaThuoc());
            preparedStatement.setInt(2, dungCho.getMaDoiTuongBenhNhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return -1;
    }
}
