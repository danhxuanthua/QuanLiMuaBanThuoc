/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ThongKeSoLuongXuatNhapThuocTheoNgay;
import Model.ThongkeChi;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ThongKeSoLuongXuatNhapThuocTheoNgayService extends MySQLService{
    
    public ArrayList laySoLuongXuatThuocTheoNgay(ThongKeSoLuongXuatNhapThuocTheoNgay tkslxnttn){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoNgay> dsthTheoNgay = new ArrayList<>();
        try {
            String sql = "SELECT `chi_tiet_hoa_don_xuat`.`So_Chung_Tu_Xuat`, `thuoc`.`Ten_Thuoc`, `chi_tiet_hoa_don_xuat`.`So_Luong_Xuat`, `hoa_don_xuat`.`Tong_Tien_Ban`FROM `chi_tiet_hoa_don_xuat`, `hoa_don_xuat`,`thuoc` WHERE chi_tiet_hoa_don_xuat.So_Chung_Tu_Xuat=hoa_don_xuat.So_Chung_Tu_Xuat AND chi_tiet_hoa_don_xuat.Ma_Thuoc=thuoc.Ma_Thuoc AND hoa_don_xuat.Ngay_Gio_Xuat=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttn.getNgayGioXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoNgay tkslxnttn1 = new ThongKeSoLuongXuatNhapThuocTheoNgay();
                tkslxnttn1.setSoChungTuXuat(resultSet.getInt(1));
                tkslxnttn1.setTenThuoc(resultSet.getString(2));
                tkslxnttn1.setSoLuongXuat(resultSet.getInt(3));
                tkslxnttn1.setTongTienBan(resultSet.getInt(4));
                
                dsthTheoNgay.add(tkslxnttn1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoNgay;    
    }
    
    
    public ArrayList laySoLuongNhapThuocTheoNgay(ThongKeSoLuongXuatNhapThuocTheoNgay tkslxnttn){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoNgay> dsthTheoNgay = new ArrayList<>();
        try {
            String sql = "SELECT `So_Chung_Tu_Nhap`, `Ten_Nha_Cung_Cap`, `Tong_Tien_Nhap` FROM `hoa_don_nhap` WHERE `Ngay_Gio_Nhap`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttn.getNgayGioXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoNgay tkslxnttn1 = new ThongKeSoLuongXuatNhapThuocTheoNgay();
                tkslxnttn1.setSoChungTuXuat(resultSet.getInt(1));
                tkslxnttn1.setTenNhaCungCap(resultSet.getString(2));
                tkslxnttn1.setTongTienNhap(resultSet.getInt(3));
                
                dsthTheoNgay.add(tkslxnttn1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoNgay;    
    }
    
    public ArrayList layTongSoLuongNhapThuocTheoNgay(ThongKeSoLuongXuatNhapThuocTheoNgay tkslxnttn){
        ArrayList<ThongKeSoLuongXuatNhapThuocTheoNgay> dsthTheoNgay = new ArrayList<>();
        try {
            String sql = "SELECT SUM(`Tong_Tien_Nhap`) FROM `hoa_don_nhap` WHERE `Ngay_Gio_Nhap`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, tkslxnttn.getNgayGioXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeSoLuongXuatNhapThuocTheoNgay tkslxnttn1 = new ThongKeSoLuongXuatNhapThuocTheoNgay();
                tkslxnttn1.setTongTienNhap(resultSet.getInt(1));
                dsthTheoNgay.add(tkslxnttn1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthTheoNgay;    
    }
    
}
