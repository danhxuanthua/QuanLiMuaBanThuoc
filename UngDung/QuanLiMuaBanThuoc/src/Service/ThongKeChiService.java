/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.HoaDonNhap;
import Model.ThongkeChi;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ThongKeChiService extends MySQLService{
    
    //hien thi toan bo hoa don
    public ArrayList layChiTrongMotKhoangThoiGian(ThongkeChi thongkeChi){
        ArrayList<ThongkeChi> dsthongChi = new ArrayList<>();
        try {
            String sql = "SELECT SUM(`Tong_Tien_Nhap`) FROM `hoa_don_nhap` WHERE `Ngay_Gio_Nhap` >=? AND `Ngay_Gio_Nhap`<=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, thongkeChi.getThoiGianBatDau());
            preparedStatement.setString(2, thongkeChi.getThoiGianKetThuc());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongkeChi thongkeChi1 = new ThongkeChi();
                thongkeChi1.setTongTienNhap(resultSet.getInt(1));
                dsthongChi.add(thongkeChi1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthongChi;    
    }
}
