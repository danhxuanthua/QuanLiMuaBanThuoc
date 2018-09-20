/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Thuoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ThuocService extends  MySQLService{
    
    
    public  ArrayList<Thuoc> layToanBoThongTinThuoc(){
        ArrayList<Thuoc> dsThuoc = new ArrayList<>();
        try {
            String sql = "SELECT nhom_thuoc.Ma_Nhom, nhom_thuoc.Ten_Nhom, `Ma_Thuoc`, `Ten_Thuoc`, `Dang_Thuoc`, `Xuat_Xu`, `Can_Toa_Bac_Si` FROM `thuoc`,`nhom_thuoc` WHERE thuoc.Ma_Nhom=nhom_thuoc.Ma_Nhom";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                Thuoc thuoc = new Thuoc();
                thuoc.setMaNhom(resultSet.getInt(1));
                thuoc.setTenNhom(resultSet.getString(2));
                thuoc.setMaThuoc(resultSet.getString(3));
                thuoc.setTenThuoc(resultSet.getString(4));
                thuoc.setDangThuoc(resultSet.getString(5));
                thuoc.setXuatXu(resultSet.getString(6));
                thuoc.setCanToaBacSi(resultSet.getString(7));
                
                dsThuoc.add(thuoc);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsThuoc;
    }
    
    
    public int themThuoc(Thuoc thuoc){
        try {
            String sql = "INSERT INTO `thuoc`(`Ma_Thuoc`, `Ma_Nhom`, `Ten_Thuoc`, `Dang_Thuoc`, `Xuat_Xu`, `Can_Toa_Bac_Si`) VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thuoc.getMaThuoc());
            preparedStatement.setInt(2, thuoc.getMaNhom());
            preparedStatement.setString(3, thuoc.getTenThuoc());
            preparedStatement.setString(4, thuoc.getDangThuoc());
            preparedStatement.setString(5, thuoc.getXuatXu());
            preparedStatement.setString(6, thuoc.getCanToaBacSi());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaThuoc(Thuoc thuoc){
        try {
            String sql = "UPDATE `thuoc` SET `Ma_Nhom`=?,`Ten_Thuoc`=?,`Dang_Thuoc`=?,`Xuat_Xu`=?,`Can_Toa_Bac_Si`=? WHERE `Ma_Thuoc`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
            preparedStatement.setInt(1, thuoc.getMaNhom());
            preparedStatement.setString(2, thuoc.getTenThuoc());
            preparedStatement.setString(3, thuoc.getDangThuoc());
            preparedStatement.setString(4, thuoc.getXuatXu());
            preparedStatement.setString(5, thuoc.getCanToaBacSi());
            preparedStatement.setString(6, thuoc.getMaThuoc());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaThuoc(Thuoc thuoc){
        try {
            String sql = "DELETE FROM `thuoc` WHERE `Ma_Thuoc`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thuoc.getMaThuoc());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
}
