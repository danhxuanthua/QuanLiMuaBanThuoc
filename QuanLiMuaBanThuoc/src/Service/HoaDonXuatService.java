/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ChiTietHoaDonXuat;
import Model.HoaDonNhap;
import Model.HoaDonXuat;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class HoaDonXuatService extends MySQLService{
    
    //hien thi toan bo hoa don xuat
    public ArrayList layToanToanBoHoaXuat(){
        ArrayList<HoaDonXuat> dsHoaDonXuat = new ArrayList<>();
        try {
            String sql = "SELECT `So_Chung_Tu_Xuat`, `nhan_vien`.`Ho`, `nhan_vien`.`Ten`, `Ngay_Gio_Xuat`, `Tong_Tien_Ban` FROM `hoa_don_xuat`, `nhan_vien` WHERE hoa_don_xuat.Ma_Nhan_Vien = nhan_vien.Ma_Nhan_Vien";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                HoaDonXuat hoaDonXuat = new HoaDonXuat();
                hoaDonXuat.setSoChungTuXuat(resultSet.getInt(1));
                hoaDonXuat.setHo(resultSet.getString(2));
                hoaDonXuat.setTen(resultSet.getString(3));
                hoaDonXuat.setNgayGioXuat(resultSet.getString(4));
                hoaDonXuat.setTongTienBan(resultSet.getInt(5));
                
                dsHoaDonXuat.add(hoaDonXuat);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsHoaDonXuat;    
    }
    
    //Them hoa don
    public int themHoaDonXuat(HoaDonXuat hoaDonXuat){
        try {
            String sql ="INSERT INTO `hoa_don_xuat`(`Ma_Nhan_Vien`, `Ngay_Gio_Xuat`, `Tong_Tien_Ban`) VALUES (?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, hoaDonXuat.getMaNhanVien());
            preparedStatement.setString(2, hoaDonXuat.getNgayGioXuat());
            preparedStatement.setInt(3, hoaDonXuat.getTongTienBan());
            return preparedStatement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    //sua hoa don nhap
    public int suaHoaDonXuat(HoaDonXuat hoaDonXuat){
        try {
            String sql = "UPDATE `hoa_don_xuat` SET `Ngay_Gio_Xuat`=?,`Tong_Tien_Ban`=? WHERE `So_Chung_Tu_Xuat`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, hoaDonXuat.getNgayGioXuat());
            preparedStatement.setInt(2, hoaDonXuat.getTongTienBan());
            preparedStatement.setInt(3, hoaDonXuat.getSoChungTuXuat());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    //xoa hoa don
    public int xoaHoaDon(HoaDonXuat hoaDonXuat){
        try {
            String sql = "DELETE FROM `hoa_don_xuat` WHERE `So_Chung_Tu_Xuat`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, hoaDonXuat.getSoChungTuXuat());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public ArrayList layToanHoaXuatCoSoChungTuXuatLonNhat(){
        ArrayList<HoaDonXuat> dsHoaDonXuat = new ArrayList<>();
        try {
            String sql = "SELECT MAX(`So_Chung_Tu_Xuat`), `Ma_Nhan_Vien`, `Ngay_Gio_Xuat`, `Tong_Tien_Ban` FROM `hoa_don_xuat` WHERE 1";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                HoaDonXuat hoaDonXuat = new HoaDonXuat();
                hoaDonXuat.setSoChungTuXuat(resultSet.getInt(1));
                hoaDonXuat.setMaNhanVien(resultSet.getInt(2));
                hoaDonXuat.setNgayGioXuat(resultSet.getString(3));
                hoaDonXuat.setTongTienBan(resultSet.getInt(4));
                
                dsHoaDonXuat.add(hoaDonXuat);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsHoaDonXuat;    
    }
    
    //sua hoa don nhap
    public int suaTongTienBan(HoaDonXuat hoaDonXuat){
        try {
            String sql = "UPDATE `hoa_don_xuat` SET `Tong_Tien_Ban`=? WHERE `So_Chung_Tu_Xuat`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, hoaDonXuat.getTongTienBan());
            preparedStatement.setInt(2, hoaDonXuat.getSoChungTuXuat());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public ArrayList tinhTongTienBanDuaVaoSoChungTuXuat(ChiTietHoaDonXuat chiTietHoaDonXuat){
        ArrayList<HoaDonXuat> dsHoaDonXuat = new ArrayList<>();
        try {
            String sql = "SELECT SUM(chi_tiet_hoa_don_xuat.GiaBanDuaVaoSoLuong) FROM `hoa_don_xuat`, `chi_tiet_hoa_don_xuat` WHERE hoa_don_xuat.So_Chung_Tu_Xuat=chi_tiet_hoa_don_xuat.So_Chung_Tu_Xuat AND hoa_don_xuat.So_Chung_Tu_Xuat=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, chiTietHoaDonXuat.getSoChungTuXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                HoaDonXuat hoaDonXuat = new HoaDonXuat();
                hoaDonXuat.setTongTienBan(resultSet.getInt(1));
                
                dsHoaDonXuat.add(hoaDonXuat);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsHoaDonXuat;    
    }
   
    
}
