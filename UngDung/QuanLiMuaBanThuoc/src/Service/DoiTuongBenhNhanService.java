/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.DoiTuongBenhNhan;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class DoiTuongBenhNhanService extends MySQLService{
    
    public ArrayList<DoiTuongBenhNhan> layToanBoDoiTuongBenhNhan(){
        ArrayList<DoiTuongBenhNhan> dsDoiTuongBenhNhan = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM `doi_tuong_benh_nhan` WHERE 1";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                DoiTuongBenhNhan doiTuongBenhNhan = new DoiTuongBenhNhan();
                doiTuongBenhNhan.setMaDoiTuongBenhNhan(resultSet.getInt(1));
                doiTuongBenhNhan.setTenDoiTuongBenhNhan(resultSet.getString(2));
                
                dsDoiTuongBenhNhan.add(doiTuongBenhNhan);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsDoiTuongBenhNhan;
    }
    
    public int themDoiTuongBenhNhan(DoiTuongBenhNhan doiTuongBenhNhan){
        try {
            String sql = "INSERT INTO `doi_tuong_benh_nhan`(`Ma_Doi_Tuong_Benh_Nhan`, `Ten_Doi_Tuong_Benh_Nhan`) VALUES (?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, doiTuongBenhNhan.getMaDoiTuongBenhNhan());
            preparedStatement.setString(2, doiTuongBenhNhan.getTenDoiTuongBenhNhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int suaDoiTuongBenhNhan(DoiTuongBenhNhan doiTuongBenhNhan){
        try {
            String sql = "UPDATE `doi_tuong_benh_nhan` SET `Ten_Doi_Tuong_Benh_Nhan`=? WHERE `Ma_Doi_Tuong_Benh_Nhan`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, doiTuongBenhNhan.getTenDoiTuongBenhNhan());
            preparedStatement.setInt(2, doiTuongBenhNhan.getMaDoiTuongBenhNhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaDoiTuongBenhNhan(DoiTuongBenhNhan doiTuongBenhNhan){
        try {
            String sql = "DELETE FROM `doi_tuong_benh_nhan` WHERE `Ma_Doi_Tuong_Benh_Nhan`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, doiTuongBenhNhan.getMaDoiTuongBenhNhan());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
}
