/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ThongKeThu;
import Model.ThongkeChi;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ThongKeThuService extends MySQLService{
    
    
    //hien thi toan bo hoa don
    public ArrayList layThuTrongMotKhoangThoiGian(ThongKeThu thongKeThu){
        ArrayList<ThongKeThu> dsthongThu = new ArrayList<>();
        try {
            String sql = "SELECT SUM(`Tong_Tien_Ban`) FROM `hoa_don_xuat` WHERE `Ngay_Gio_Xuat` >=? AND `Ngay_Gio_Xuat`<=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, thongKeThu.getThoiGianBatDau());
            preparedStatement.setString(2, thongKeThu.getThoiGianKetThuc());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeThu thongKeThu1 = new ThongKeThu();
                thongKeThu1.setTongTienBan(resultSet.getInt(1));
                dsthongThu.add(thongKeThu1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthongThu;    
    }
    
    
    //hien thi toan bo hoa don
    public ArrayList layThangCoDoanhThuCaoNhat(){
        ArrayList<ThongKeThu> dsthongThu = new ArrayList<>();
        try {
            String sql = "SELECT MONTH(`Ngay_Gio_Xuat`), MAX(`Tong_Tien_Ban`) FROM `hoa_don_xuat` WHERE YEAR(`Ngay_Gio_Xuat`)=YEAR(CURRENT_DATE)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                ThongKeThu thongKeThu = new ThongKeThu();
                
                thongKeThu.setThoiGianBatDau(resultSet.getString(1));
                thongKeThu.setTongTienBan(resultSet.getInt(2));
                dsthongThu.add(thongKeThu);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsthongThu;    
    }
    
}
