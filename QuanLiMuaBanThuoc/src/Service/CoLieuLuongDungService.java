/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.CoLieuLuongDung;
import Model.CoThanhPhan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class CoLieuLuongDungService extends MySQLService{
    
    public ArrayList<CoLieuLuongDung> layToanBoCoLieuLuongDung(){
        ArrayList<CoLieuLuongDung> dsCoLieuLuongDung = new ArrayList<>();
        try {
            String sql = "SELECT `thuoc`.`Ma_Thuoc`,`thuoc`.`Ten_Thuoc`,`doi_tuong_benh_nhan`.`Ma_Doi_Tuong_Benh_Nhan`, `doi_tuong_benh_nhan`.`Ten_Doi_Tuong_Benh_Nhan`, `Lieu_Luong` FROM `co_lieu_luong_dung`, `doi_tuong_benh_nhan`, `thuoc` WHERE co_lieu_luong_dung.Ma_Doi_Tuong_Benh_Nhan=doi_tuong_benh_nhan.Ma_Doi_Tuong_Benh_Nhan AND co_lieu_luong_dung.Ma_Thuoc=thuoc.Ma_Thuoc";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                CoLieuLuongDung coLieuLuongDung = new CoLieuLuongDung();
                coLieuLuongDung.setMaThuoc(resultSet.getString(1));
                coLieuLuongDung.setTenThuoc(resultSet.getString(2));
                coLieuLuongDung.setMaDoiTuongBenhNhan(resultSet.getInt(3));
                coLieuLuongDung.setTenDoiTuongBenhNhan(resultSet.getString(4));
                coLieuLuongDung.setLieuLuong(resultSet.getString(5));
                
                dsCoLieuLuongDung.add(coLieuLuongDung);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsCoLieuLuongDung;
    }
    
    public int themCoLieuLuongDung(CoLieuLuongDung coLieuLuongDung){
        try {
            String sql = "INSERT INTO `co_lieu_luong_dung`(`Ma_Doi_Tuong_Benh_Nhan`, `Ma_Thuoc`, `Lieu_Luong`) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, coLieuLuongDung.getMaDoiTuongBenhNhan());
            preparedStatement.setString(2, coLieuLuongDung.getMaThuoc());
            preparedStatement.setString(3, coLieuLuongDung.getLieuLuong());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaCoLieuLuongDung(CoLieuLuongDung coLieuLuongDung){
        try {
            String sql = "UPDATE `co_lieu_luong_dung` SET `Ma_Doi_Tuong_Benh_Nhan` = ?, `Lieu_Luong` = ? WHERE `co_lieu_luong_dung`.`Ma_Doi_Tuong_Benh_Nhan` = ? AND `co_lieu_luong_dung`.`Ma_Thuoc` = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, coLieuLuongDung.getMaDoiTuongBenhNhan());
            preparedStatement.setString(2, coLieuLuongDung.getLieuLuong());
            
            preparedStatement.setInt(3, coLieuLuongDung.getMaDoiTuongBenhNhanSua());
            preparedStatement.setString(4, coLieuLuongDung.getMaThuocSua());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaCoLieuLuongDung(CoLieuLuongDung coLieuLuongDung){
        try {
            String sql = "DELETE FROM `co_lieu_luong_dung` WHERE `Ma_Thuoc`=? AND `Ma_Doi_Tuong_Benh_Nhan`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, coLieuLuongDung.getMaThuoc());
            preparedStatement.setInt(2, coLieuLuongDung.getMaDoiTuongBenhNhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return -1;
    }
    
}
