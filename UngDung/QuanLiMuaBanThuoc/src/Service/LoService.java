/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Lo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class LoService extends MySQLService{
    public ArrayList<Lo> layToanBoLo(){
        ArrayList<Lo> dsLo = new ArrayList<>();
        try {
            String sql = "SELECT hoa_don_nhap.So_Chung_Tu_Nhap, `Ma_Lo`, thuoc.Ma_Thuoc, thuoc.Ten_Thuoc, `Ngay_San_Xuat`, `Han_Su_Dung`, `Gia_Ban`, `So_Luong`, `Don_Gia_Von` FROM `lo`, `hoa_don_nhap`, `thuoc` WHERE hoa_don_nhap.So_Chung_Tu_Nhap=lo.So_Chung_Tu_Nhap AND thuoc.Ma_Thuoc=lo.Ma_Thuoc";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                Lo lo = new Lo();
                lo.setSoChungTuNhap(resultSet.getInt(1));
                lo.setMaLo(resultSet.getString(2));
                lo.setMaThuoc(resultSet.getString(3));
                lo.setTenThuoc(resultSet.getString(4));
                lo.setNgaySanXuat(resultSet.getString(5));
                lo.setHanSuDung(resultSet.getString(6));
                lo.setGiaBan(resultSet.getInt(7));
                lo.setSoLuong(resultSet.getInt(8));
                lo.setDonGiaVon(resultSet.getInt(9));
                
                dsLo.add(lo);
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsLo;
    }
    
    public int themLo(Lo lo){
        try {
            String sql ="INSERT INTO `lo`(`Ma_Lo`, `So_Chung_Tu_Nhap`, `Ma_Thuoc`, `Ngay_San_Xuat`, `Han_Su_Dung`, `Gia_Ban`, `So_Luong`, `Don_Gia_Von`) VALUES (?,?,?,?,?,?,?,?)" ;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lo.getMaLo());
            preparedStatement.setInt(2, lo.getSoChungTuNhap());
            preparedStatement.setString(3, lo.getMaThuoc());
            preparedStatement.setString(4, lo.getNgaySanXuat());
            preparedStatement.setString(5, lo.getHanSuDung());
            preparedStatement.setInt(6, lo.getGiaBan());
            preparedStatement.setInt(7, lo.getSoLuong());
            preparedStatement.setInt(8, lo.getDonGiaVon());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaLo(Lo lo){
        try {
            String sql ="UPDATE `lo` SET `So_Chung_Tu_Nhap`=?,`Ma_Thuoc`=?,`Ngay_San_Xuat`=?,`Han_Su_Dung`=?,`Gia_Ban`=?,`So_Luong`=?,`Don_Gia_Von`=? WHERE `Ma_Lo`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, lo.getSoChungTuNhap());
            preparedStatement.setString(2, lo.getMaThuoc());
            preparedStatement.setString(3, lo.getNgaySanXuat());
            preparedStatement.setString(4, lo.getHanSuDung());
            preparedStatement.setInt(5, lo.getGiaBan());
            preparedStatement.setInt(6, lo.getSoLuong());
            preparedStatement.setInt(7, lo.getDonGiaVon());
            preparedStatement.setString(8, lo.getMaLo());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaLo(Lo lo){
        try {
            String sql = "DELETE FROM `lo` WHERE `Ma_Lo`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lo.getMaLo());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public ArrayList<Lo> layGiaBanTheoMaThuoc(Lo lo2){
        ArrayList<Lo> dsLo = new ArrayList<>();
        try {
            String sql = "SELECT `Gia_Ban` FROM `lo` WHERE `Ma_Thuoc`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lo2.getMaThuoc());
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                Lo lo = new Lo();
                lo.setGiaBan(resultSet.getInt(1));
                dsLo.add(lo);
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsLo;
    }

    //lay so luong theo ma thuoc
    public ArrayList<Lo> laySoLuongTheoMaThuoc(Lo lo1){
        
                ArrayList<Lo> dsLo = new ArrayList<>();
        try {
            String sql = "SELECT `So_Luong`, `Don_Gia_Von` FROM `lo` WHERE `Ma_Thuoc`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lo1.getMaThuoc());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                Lo lo = new Lo(); 
                lo.setSoLuong(resultSet.getInt(1));
                dsLo.add(lo);
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsLo; 
    }
    
    
}
