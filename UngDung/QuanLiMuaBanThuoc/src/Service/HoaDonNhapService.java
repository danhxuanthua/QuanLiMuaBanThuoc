/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.HoaDonNhap;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class HoaDonNhapService extends MySQLService{
    
    //hien thi toan bo hoa don
    public ArrayList layToanToanBoHoaDon(){
        ArrayList<HoaDonNhap> dsHoaDonNhap = new ArrayList<>();
        try {
            String sql = "SELECT `So_Chung_Tu_Nhap`, nhan_vien.Ho, nhan_vien.Ten, `Ngay_Gio_Nhap`, `Ten_Nha_Cung_Cap`, `Tong_Tien_Nhap` FROM `hoa_don_nhap`, `nhan_vien` WHERE hoa_don_nhap.Ma_Nhan_Vien = nhan_vien.Ma_Nhan_Vien";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                HoaDonNhap hoaDonNhap = new HoaDonNhap();
                hoaDonNhap.setSoChungTuNhap(resultSet.getInt(1));
                hoaDonNhap.setHo(resultSet.getString(2));
                hoaDonNhap.setTen(resultSet.getString(3));
                hoaDonNhap.setNgayGioNhap(resultSet.getString(4));
                hoaDonNhap.setTenNhaCungCap(resultSet.getString(5));
                hoaDonNhap.setTongTienNhap(resultSet.getInt(6));
                
                dsHoaDonNhap.add(hoaDonNhap);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsHoaDonNhap;    
    }
    
    
    //Them hoa don
    public int themHoaDonNhap(HoaDonNhap hoaDonNhap){
        try {
            String sql ="INSERT INTO `hoa_don_nhap`( `Ma_Nhan_Vien`, `Ngay_Gio_Nhap`, `Ten_Nha_Cung_Cap`, `Tong_Tien_Nhap`) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, hoaDonNhap.getMaNhanVien());
            preparedStatement.setString(2, hoaDonNhap.getNgayGioNhap());
            preparedStatement.setString(3, hoaDonNhap.getTenNhaCungCap());
            preparedStatement.setInt(4, hoaDonNhap.getTongTienNhap());
            return preparedStatement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    //sua hoa don nhap
    public int suaHoaDonNhap(HoaDonNhap hoaDonNhap){
        try {
            String sql = "UPDATE `hoa_don_nhap` SET `Ngay_Gio_Nhap`=?,`Ten_Nha_Cung_Cap`=?,`Tong_Tien_Nhap`=? WHERE `So_Chung_Tu_Nhap`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, hoaDonNhap.getNgayGioNhap());
            preparedStatement.setString(2, hoaDonNhap.getTenNhaCungCap());
            preparedStatement.setInt(3, hoaDonNhap.getTongTienNhap());
            preparedStatement.setInt(4, hoaDonNhap.getSoChungTuNhap());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    //xoa hoa don
    public int xoaHoaDon(HoaDonNhap hoaDonNhap){
        try {
            String sql = "DELETE FROM `hoa_don_nhap` WHERE `So_Chung_Tu_Nhap` =?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, hoaDonNhap.getSoChungTuNhap());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    
    
}
