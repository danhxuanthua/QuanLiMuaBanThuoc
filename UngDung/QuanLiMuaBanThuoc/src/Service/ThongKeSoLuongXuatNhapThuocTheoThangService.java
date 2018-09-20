/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ThongKeSoLuongXuatNhapThuocTheoNgay;
import Model.ThongKeSoLuongXuatNhapThuocTheoThang;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ThongKeSoLuongXuatNhapThuocTheoThangService extends MySQLService{
    
    public ArrayList laySoLuongXuatThuocTheoThang(ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoThang> dsthTheoThang = new ArrayList<>();
        try {
            String sql = "SELECT `chi_tiet_hoa_don_xuat`.`So_Chung_Tu_Xuat`, `thuoc`.`Ten_Thuoc`, `chi_tiet_hoa_don_xuat`.`So_Luong_Xuat`, `hoa_don_xuat`.`Tong_Tien_Ban`FROM `chi_tiet_hoa_don_xuat`, `hoa_don_xuat`,`thuoc` WHERE chi_tiet_hoa_don_xuat.So_Chung_Tu_Xuat=hoa_don_xuat.So_Chung_Tu_Xuat AND chi_tiet_hoa_don_xuat.Ma_Thuoc=thuoc.Ma_Thuoc AND MONTH(`hoa_don_xuat`.`Ngay_Gio_Xuat`)=? AND YEAR(`hoa_don_xuat`.`Ngay_Gio_Xuat`)= YEAR(CURRENT_DATE)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttt.getNgayGioXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                
                ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt1 = new ThongKeSoLuongXuatNhapThuocTheoThang();
                tkslxnttt1.setSoChungTuXuat(resultSet.getInt(1));
                tkslxnttt1.setTenThuoc(resultSet.getString(2));
                tkslxnttt1.setSoLuongXuat(resultSet.getInt(3));
                tkslxnttt1.setTongTienBan(resultSet.getInt(4));
                
                dsthTheoThang.add(tkslxnttt1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoThang;    
    }
    
    public ArrayList laySoLuongXuatThuocTheoThangNam(ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoThang> dsthTheoThang = new ArrayList<>();
        try {
            String sql = "SELECT `chi_tiet_hoa_don_xuat`.`So_Chung_Tu_Xuat`, `thuoc`.`Ten_Thuoc`, `chi_tiet_hoa_don_xuat`.`So_Luong_Xuat`, `hoa_don_xuat`.`Tong_Tien_Ban`FROM `chi_tiet_hoa_don_xuat`, `hoa_don_xuat`,`thuoc` WHERE chi_tiet_hoa_don_xuat.So_Chung_Tu_Xuat=hoa_don_xuat.So_Chung_Tu_Xuat AND chi_tiet_hoa_don_xuat.Ma_Thuoc=thuoc.Ma_Thuoc AND MONTH(`hoa_don_xuat`.`Ngay_Gio_Xuat`)=? AND YEAR(`hoa_don_xuat`.`Ngay_Gio_Xuat`)=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttt.getNgayGioXuat());
            preparedStatement.setString(2, tkslxnttt.getNamXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                
                ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt1 = new ThongKeSoLuongXuatNhapThuocTheoThang();
                tkslxnttt1.setSoChungTuXuat(resultSet.getInt(1));
                tkslxnttt1.setTenThuoc(resultSet.getString(2));
                tkslxnttt1.setSoLuongXuat(resultSet.getInt(3));
                tkslxnttt1.setTongTienBan(resultSet.getInt(4));
                
                dsthTheoThang.add(tkslxnttt1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoThang;    
    }
    
    
    public ArrayList layTongSoLuongXuatThuocTheoThang(ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoThang> dsthTheoThang = new ArrayList<>();
        try {
            String sql = "SELECT SUM(`Tong_Tien_Ban`) FROM `hoa_don_xuat` WHERE MONTH(`Ngay_Gio_Xuat`)=? AND YEAR(`hoa_don_xuat`.`Ngay_Gio_Xuat`)= YEAR(CURRENT_DATE)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttt.getNgayGioXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt1 = new ThongKeSoLuongXuatNhapThuocTheoThang();
                tkslxnttt1.setTongTienBan(resultSet.getInt(1));
                dsthTheoThang.add(tkslxnttt1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoThang;    
    }
    
    public ArrayList layTongSoLuongXuatThuocTheoThangNam(ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoThang> dsthTheoThang = new ArrayList<>();
        try {
            String sql = "SELECT SUM(`Tong_Tien_Ban`) FROM `hoa_don_xuat` WHERE MONTH(`Ngay_Gio_Xuat`)=? AND YEAR(`hoa_don_xuat`.`Ngay_Gio_Xuat`)=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttt.getNgayGioXuat());
            preparedStatement.setString(2, tkslxnttt.getNamXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt1 = new ThongKeSoLuongXuatNhapThuocTheoThang();
                tkslxnttt1.setTongTienBan(resultSet.getInt(1));
                dsthTheoThang.add(tkslxnttt1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoThang;    
    }
    
    public ArrayList laySoLuongNhapThuocTheoThang(ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoThang> dsthTheoThang = new ArrayList<>();
        try {
            String sql = "SELECT `So_Chung_Tu_Nhap`, `Ten_Nha_Cung_Cap`, `Tong_Tien_Nhap` FROM `hoa_don_nhap` WHERE MONTH(`Ngay_Gio_Nhap`)=? AND YEAR(`hoa_don_nhap`.`Ngay_Gio_Nhap`)= YEAR(CURRENT_DATE)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttt.getNgayGioXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt1 = new ThongKeSoLuongXuatNhapThuocTheoThang();
                tkslxnttt1.setSoChungTuXuat(resultSet.getInt(1));
                tkslxnttt1.setTenNhaCungCap(resultSet.getString(2));
                tkslxnttt1.setTongTienNhap(resultSet.getInt(3));
                
                dsthTheoThang.add(tkslxnttt1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoThang;    
    }
    
    public ArrayList laySoLuongNhapThuocTheoThangNam(ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoThang> dsthTheoThang = new ArrayList<>();
        try {
            String sql = "SELECT `So_Chung_Tu_Nhap`, `Ten_Nha_Cung_Cap`, `Tong_Tien_Nhap` FROM `hoa_don_nhap` WHERE MONTH(`Ngay_Gio_Nhap`)=? AND YEAR(`hoa_don_nhap`.`Ngay_Gio_Nhap`)=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttt.getNgayGioXuat());
            preparedStatement.setString(2,tkslxnttt.getNamNhap());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt1 = new ThongKeSoLuongXuatNhapThuocTheoThang();
                tkslxnttt1.setSoChungTuXuat(resultSet.getInt(1));
                tkslxnttt1.setTenNhaCungCap(resultSet.getString(2));
                tkslxnttt1.setTongTienNhap(resultSet.getInt(3));
                
                dsthTheoThang.add(tkslxnttt1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoThang;    
    }
    
    public ArrayList layTongSoLuongNhapThuocTheoThang(ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoThang> dsthTheoThang = new ArrayList<>();
        try {
            String sql = "SELECT SUM(`Tong_Tien_Nhap`) FROM `hoa_don_nhap` WHERE MONTH(`Ngay_Gio_Nhap`)=? AND YEAR(`hoa_don_nhap`.`Ngay_Gio_Nhap`)= YEAR(CURRENT_DATE)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttt.getNgayGioXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt1 = new ThongKeSoLuongXuatNhapThuocTheoThang();
                tkslxnttt1.setTongTienNhap(resultSet.getInt(1));
                dsthTheoThang.add(tkslxnttt1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoThang;    
    }
    
    public ArrayList layTongSoLuongNhapThuocTheoThangNam(ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoThang> dsthTheoThang = new ArrayList<>();
        try {
            String sql = "SELECT SUM(`Tong_Tien_Nhap`) FROM `hoa_don_nhap` WHERE MONTH(`Ngay_Gio_Nhap`)=? AND YEAR(`hoa_don_nhap`.`Ngay_Gio_Nhap`)=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttt.getNgayGioXuat());
            preparedStatement.setString(2, tkslxnttt.getNamNhap());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoThang tkslxnttt1 = new ThongKeSoLuongXuatNhapThuocTheoThang();
                tkslxnttt1.setTongTienNhap(resultSet.getInt(1));
                dsthTheoThang.add(tkslxnttt1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoThang;    
    }
}
