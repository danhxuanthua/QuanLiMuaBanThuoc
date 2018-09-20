/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.CoChiDinh;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author danhx
 */
public class CoChiDinhService extends MySQLService{
    
    public ArrayList<CoChiDinh> layToanBoDanhSachCoChiDinh(){
        ArrayList<CoChiDinh> dsCoChiDinh = new ArrayList<>();
        try {
            String sql = "SELECT `benh`.`Ma_Benh`,`benh`.`Ten_Benh`,`thuoc`.`Ma_Thuoc`,`thuoc`.`Ten_Thuoc` FROM `co_chi_dinh`,`benh`,`thuoc` WHERE co_chi_dinh.Ma_Benh=benh.Ma_Benh AND co_chi_dinh.Ma_Thuoc=thuoc.Ma_Thuoc";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                CoChiDinh coChiDinh = new CoChiDinh();
                coChiDinh.setMaBenh(resultSet.getInt(1));
                coChiDinh.setTenBenh(resultSet.getString(2));
                coChiDinh.setMaThuoc(resultSet.getString(3));
                coChiDinh.setTenThuoc(resultSet.getString(4));
                
                dsCoChiDinh.add(coChiDinh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsCoChiDinh;
    }
    
    public int themCoChiDinh(CoChiDinh coChiDinh){
        try {
            String sql = "INSERT INTO `co_chi_dinh` (`Ma_Benh`, `Ma_Thuoc`) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, coChiDinh.getMaBenh());
            preparedStatement.setString(2, coChiDinh.getMaThuoc());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int suaCoChiDinh(CoChiDinh coChiDinh){
        try {
            String sql = "UPDATE `co_chi_dinh` SET `Ma_Thuoc` =? WHERE `co_chi_dinh`.`Ma_Benh` =? AND `co_chi_dinh`.`Ma_Thuoc` =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, coChiDinh.getMaThuoc());
            preparedStatement.setInt(2, coChiDinh.getMaBenhSua());
            preparedStatement.setString(3,coChiDinh.getMaThuocSua());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int xoaCoChiDinh(CoChiDinh coChiDinh){
        try {
            String sql = "DELETE FROM `co_chi_dinh` WHERE `Ma_Benh`=? AND `Ma_Thuoc`=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, coChiDinh.getMaBenh());
            preparedStatement.setString(2, coChiDinh.getMaThuoc());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
