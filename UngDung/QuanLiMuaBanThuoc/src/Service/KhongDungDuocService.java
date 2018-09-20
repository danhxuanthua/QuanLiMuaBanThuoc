/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.DungCho;
import Model.KhongDungDuoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class KhongDungDuocService extends MySQLService{
    
    public ArrayList<KhongDungDuoc> layToanBoKhongDungDuoc(){
        ArrayList<KhongDungDuoc> dsKhongDungDuoc = new ArrayList<>();
        try {
            String sql = "SELECT `thuoc`.`Ma_Thuoc`, `thuoc`.`Ten_Thuoc`,`doi_tuong_benh_nhan`.`Ma_Doi_Tuong_Benh_Nhan`, `doi_tuong_benh_nhan`.`Ten_Doi_Tuong_Benh_Nhan` FROM `k_dung_duoc`, `doi_tuong_benh_nhan`, `thuoc` WHERE k_dung_duoc.Ma_Thuoc=thuoc.Ma_Thuoc AND k_dung_duoc.Ma_Doi_Tuong_Benh_Nhan=doi_tuong_benh_nhan.Ma_Doi_Tuong_Benh_Nhan";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                KhongDungDuoc khongDungDuoc = new KhongDungDuoc();
                khongDungDuoc.setMaThuoc(resultSet.getString(1));
                khongDungDuoc.setTenThuoc(resultSet.getString(2));
                khongDungDuoc.setMaDoiTuongBenhNhan(resultSet.getInt(3));
                khongDungDuoc.setTenDoiTuongBenhNhan(resultSet.getString(4));
                
                dsKhongDungDuoc.add(khongDungDuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsKhongDungDuoc;
    }
    
    public int themKhongDungDuoc(KhongDungDuoc khongDungDuoc){
        try {
            String sql = "INSERT INTO `k_dung_duoc`(`Ma_Thuoc`, `Ma_Doi_Tuong_Benh_Nhan`) VALUES ( ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khongDungDuoc.getMaThuoc());
            preparedStatement.setInt(2, khongDungDuoc.getMaDoiTuongBenhNhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaKhongDungDuoc(KhongDungDuoc khongDungDuoc){
        try {
            String sql = "UPDATE `k_dung_duoc` SET `Ma_Doi_Tuong_Benh_Nhan` = ? WHERE `k_dung_duoc`.`Ma_Thuoc` = ? AND `k_dung_duoc`.`Ma_Doi_Tuong_Benh_Nhan` = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, khongDungDuoc.getMaDoiTuongBenhNhan());
            
            preparedStatement.setString(2, khongDungDuoc.getMaThuocSua());
            preparedStatement.setInt(3, khongDungDuoc.getMaDoiTuongBenhNhanSua());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaKhongDungDuoc(KhongDungDuoc khongDungDuoc){
        try {
            String sql = "DELETE FROM `k_dung_duoc` WHERE `Ma_Thuoc`=? AND `Ma_Doi_Tuong_Benh_Nhan`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khongDungDuoc.getMaThuoc());
            preparedStatement.setInt(2, khongDungDuoc.getMaDoiTuongBenhNhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return -1;
    }
}
