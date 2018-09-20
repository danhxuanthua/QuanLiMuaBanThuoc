/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ThanhPhan;
import Model.ThongKeThuocBanChayNhat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ThongKeThuocBanChayNhatService extends MySQLService{
    
    public ArrayList<ThongKeThuocBanChayNhat> layDanhSachThuocBanChayNhat(){
        ArrayList<ThongKeThuocBanChayNhat> dsBanChayNhats = new ArrayList<>();
        
        try {
            String sql = "SELECT `thuoc`.`Ten_Thuoc`, SUM(`chi_tiet_hoa_don_xuat`.`So_Luong_Xuat`) FROM `chi_tiet_hoa_don_xuat`, `hoa_don_xuat`,`thuoc` WHERE chi_tiet_hoa_don_xuat.So_Chung_Tu_Xuat=hoa_don_xuat.So_Chung_Tu_Xuat AND chi_tiet_hoa_don_xuat.Ma_Thuoc=thuoc.Ma_Thuoc GROUP by chi_tiet_hoa_don_xuat.Ma_Thuoc ORDER BY SUM(chi_tiet_hoa_don_xuat.So_Luong_Xuat) DESC";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                ThongKeThuocBanChayNhat thongKeThuocBanChayNhat = new ThongKeThuocBanChayNhat();
                thongKeThuocBanChayNhat.setTenThuoc(resultSet.getString(1));
                thongKeThuocBanChayNhat.setTongSoLuongXuat(resultSet.getInt(2));
                
                dsBanChayNhats.add(thongKeThuocBanChayNhat);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsBanChayNhats;
    }
    
}
