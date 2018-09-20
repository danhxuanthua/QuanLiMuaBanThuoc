/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.NhanVien;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author danhx
 */
public class NhanVienService extends MySQLService{
    
    public ArrayList<NhanVien> layMotNhanVien(NhanVien nhanVien2){ 
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `nhan_vien` WHERE `Ten_Dang_Nhap`=? AND `Mat_Khau`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanVien2.getTenDangNhap());
            preparedStatement.setString(2, nhanVien2.getMatKhau());
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNhanVien(resultSet.getInt(1));
                nhanVien.setHo(resultSet.getString(2));
                nhanVien.setTen(resultSet.getString(3));
                nhanVien.setChucVu(resultSet.getString(4));
                nhanVien.setTuoi(resultSet.getInt(5));
                nhanVien.setDiaChi(resultSet.getString(6));
                nhanVien.setSDT(resultSet.getString(7));
                nhanVien.setEmail(resultSet.getString(8));
                nhanVien.setTenDangNhap(resultSet.getString(9));
                nhanVien.setMatKhau(resultSet.getString(10));
                nhanVien.setLevel(resultSet.getInt(11));
                
                dsNhanVien.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
    
    
    public ArrayList<NhanVien> layToanBoNhanVien(){ 
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `nhan_vien` WHERE 1";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNhanVien(resultSet.getInt(1));
                nhanVien.setHo(resultSet.getString(2));
                nhanVien.setTen(resultSet.getString(3));
                nhanVien.setChucVu(resultSet.getString(4));
                nhanVien.setTuoi(resultSet.getInt(5));
                nhanVien.setDiaChi(resultSet.getString(6));
                nhanVien.setSDT(resultSet.getString(7));
                nhanVien.setEmail(resultSet.getString(8));
                nhanVien.setTenDangNhap(resultSet.getString(9));
                nhanVien.setMatKhau(resultSet.getString(10));
                nhanVien.setLevel(resultSet.getInt(11));
                dsNhanVien.add(nhanVien);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
    
    
    public int themNhanVien(NhanVien nhanVien){
        try {
            
            String sql = "INSERT INTO `nhan_vien`(`Ho`, `Ten`, `Chuc_Vu`, `Tuoi`, `Dia_Chi`, `SDT`, `Email`, `Ten_Dang_Nhap`, `Mat_Khau`, `Level`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanVien.getHo());
            preparedStatement.setString(2, nhanVien.getTen());
            preparedStatement.setString(3, nhanVien.getChucVu());
            preparedStatement.setInt(4, nhanVien.getTuoi());
            preparedStatement.setString(5, nhanVien.getDiaChi());
            preparedStatement.setString(6, nhanVien.getSDT());
            preparedStatement.setString(7, nhanVien.getEmail());
            preparedStatement.setString(8, nhanVien.getTenDangNhap());
            preparedStatement.setString(9, nhanVien.getMatKhau());
            preparedStatement.setInt(10, nhanVien.getLevel());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int suaNhanVien(NhanVien nhanVien){
        
        try {
            String sql = "UPDATE `nhan_vien` SET `Ho`=?,`Ten`=?,`Chuc_Vu`=?,`Tuoi`=?,`Dia_Chi`=?,`SDT`=?,`Email`=?,`Ten_Dang_Nhap`=?,`Mat_Khau`=?,`Level`=? WHERE `Ma_Nhan_Vien`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanVien.getHo());
            preparedStatement.setString(2, nhanVien.getTen());
            preparedStatement.setString(3, nhanVien.getChucVu());
            preparedStatement.setInt(4, nhanVien.getTuoi());
            preparedStatement.setString(5, nhanVien.getDiaChi());
            preparedStatement.setString(6, nhanVien.getSDT());
            preparedStatement.setString(7, nhanVien.getEmail());
            preparedStatement.setString(8, nhanVien.getTenDangNhap());
            preparedStatement.setString(9, nhanVien.getMatKhau());
            preparedStatement.setInt(10, nhanVien.getLevel());
            preparedStatement.setInt(11, nhanVien.getMaNhanVien());
        
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    
    public int xoaNhanVien(NhanVien nhanVien){
        try {
            String sql = "DELETE FROM `nhan_vien` WHERE `Ma_Nhan_Vien`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, nhanVien.getMaNhanVien());
        
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
}
