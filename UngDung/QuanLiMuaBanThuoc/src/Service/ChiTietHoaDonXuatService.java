/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ChiTietHoaDonXuat;
import Model.CoChiDinh;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ChiTietHoaDonXuatService extends MySQLService{
    
    public ArrayList<ChiTietHoaDonXuat> layToanBoChiTietHoaDonXuat(){
        ArrayList<ChiTietHoaDonXuat> dsChiTietHoaDonXuat = new ArrayList<>();
        try {
            String sql = "SELECT `hoa_don_xuat`.`So_Chung_Tu_Xuat`, `thuoc`.`Ma_Thuoc`, `thuoc`.`Ten_Thuoc`, `So_Luong_Xuat` FROM `chi_tiet_hoa_don_xuat`, `hoa_don_xuat`, `thuoc` WHERE `chi_tiet_hoa_don_xuat`.`So_Chung_Tu_Xuat`=`hoa_don_xuat`.`So_Chung_Tu_Xuat` AND `chi_tiet_hoa_don_xuat`.`Ma_Thuoc`=`thuoc`.`Ma_Thuoc`";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                ChiTietHoaDonXuat chiTietHoaDonXuat = new ChiTietHoaDonXuat();
                chiTietHoaDonXuat.setSoChungTuXuat(resultSet.getInt(1));
                chiTietHoaDonXuat.setMaThuoc(resultSet.getString(2));
                chiTietHoaDonXuat.setTenThuoc(resultSet.getString(3));
                chiTietHoaDonXuat.setSoLuongXuat(resultSet.getInt(4));
                
                dsChiTietHoaDonXuat.add(chiTietHoaDonXuat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsChiTietHoaDonXuat;
    }
    
    public int themChiTietHoaDonXuat(ChiTietHoaDonXuat chiTietHoaDonXuat){
        try {
            String sql = "INSERT INTO `chi_tiet_hoa_don_xuat`(`So_Chung_Tu_Xuat`, `Ma_Thuoc`, `So_Luong_Xuat`) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, chiTietHoaDonXuat.getSoChungTuXuat());
            preparedStatement.setString(2, chiTietHoaDonXuat.getMaThuoc());
            preparedStatement.setInt(3, chiTietHoaDonXuat.getSoLuongXuat());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaGiaBanDuaVaoSoLuong(ChiTietHoaDonXuat chiTietHoaDonXuat){
        try {
            String sql = "UPDATE `chi_tiet_hoa_don_xuat` SET `GiaBanDuaVaoSoLuong`=? WHERE `chi_tiet_hoa_don_xuat`.`So_Chung_Tu_Xuat` =? AND `chi_tiet_hoa_don_xuat`.`Ma_Thuoc` =?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, chiTietHoaDonXuat.getGiaBanDuaVaoSoLuong());
            preparedStatement.setInt(2, chiTietHoaDonXuat.getSoChungTuXuat());
            preparedStatement.setString(3, chiTietHoaDonXuat.getMaThuoc());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaChiTietHoaDonXuat(ChiTietHoaDonXuat chiTietHoaDonXuat){
        try {
            String sql = "UPDATE `chi_tiet_hoa_don_xuat` SET `Ma_Thuoc` = ?, `So_Luong_Xuat` = ? WHERE `chi_tiet_hoa_don_xuat`.`So_Chung_Tu_Xuat` = ? AND `chi_tiet_hoa_don_xuat`.`Ma_Thuoc` = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, chiTietHoaDonXuat.getMaThuoc());
            preparedStatement.setInt(2, chiTietHoaDonXuat.getSoLuongXuat());
            
            preparedStatement.setInt(3, chiTietHoaDonXuat.getSoChungTuXuatSua());
            preparedStatement.setString(4, chiTietHoaDonXuat.getMaThuocSua());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaChiTietHoaDonXoat(ChiTietHoaDonXuat chiTietHoaDonXuat){
        try {
            String sql = "DELETE FROM `chi_tiet_hoa_don_xuat` WHERE `So_Chung_Tu_Xuat`=? AND `Ma_Thuoc`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, chiTietHoaDonXuat.getSoChungTuXuat());
            preparedStatement.setString(2, chiTietHoaDonXuat.getMaThuoc());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public ArrayList<ChiTietHoaDonXuat> layChiTietHoaDonXuatCoSoChungTuXuatLonNhat(){
        ArrayList<ChiTietHoaDonXuat> dsChiTietHoaDonXuat = new ArrayList<>();
        try {
            String sql = "SELECT MAX(`So_Chung_Tu_Xuat`), `Ma_Thuoc`, `So_Luong_Xuat`, `GiaBanDuaVaoSoLuong` FROM `chi_tiet_hoa_don_xuat` WHERE 1";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                ChiTietHoaDonXuat chiTietHoaDonXuat = new ChiTietHoaDonXuat();
                chiTietHoaDonXuat.setSoChungTuXuat(resultSet.getInt(1));
                chiTietHoaDonXuat.setMaThuoc(resultSet.getString(2));
                chiTietHoaDonXuat.setTenThuoc(resultSet.getString(3));
                chiTietHoaDonXuat.setSoLuongXuat(resultSet.getInt(4));
                
                dsChiTietHoaDonXuat.add(chiTietHoaDonXuat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsChiTietHoaDonXuat;
    }
    
    
    
}
