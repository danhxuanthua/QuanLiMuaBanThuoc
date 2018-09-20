/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ThongKeDanhSachThuocSapHetHanSuDung;
import Model.ThongkeChi;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class ThongKeDanhSachThuocSapHetHanService extends MySQLService{
    
    public ArrayList layDanhSachThuocSapHetHan(){
        ArrayList<ThongKeDanhSachThuocSapHetHanSuDung> dsHetHanSuDung = new ArrayList<>();
        try {
            String sql = "SELECT `lo`.`Ma_Lo`, `lo`.`So_Chung_Tu_Nhap`, `thuoc`.`Ten_Thuoc`, `lo`.`Ngay_San_Xuat`, `lo`.`Han_Su_Dung`, `lo`.`Gia_Ban`, `lo`.`So_Luong`, `lo`.`Don_Gia_Von` FROM `lo`, `thuoc` WHERE lo.Ma_Thuoc=thuoc.Ma_Thuoc AND DATEDIFF(Now(),`Han_Su_Dung`)>=3 OR DATEDIFF(Now(),`Han_Su_Dung`)>= -3";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                
                ThongKeDanhSachThuocSapHetHanSuDung thuocSapHetHanSuDung = new ThongKeDanhSachThuocSapHetHanSuDung();
                thuocSapHetHanSuDung.setMaLo(resultSet.getString(1));
                thuocSapHetHanSuDung.setSoChungTuNhap(resultSet.getInt(2));
                thuocSapHetHanSuDung.setTenThuoc(resultSet.getString(3));
                thuocSapHetHanSuDung.setNgaySanXuat(resultSet.getString(4));
                thuocSapHetHanSuDung.setHanSuDung(resultSet.getString(5));
                thuocSapHetHanSuDung.setSoLuong(resultSet.getInt(6));
                
                dsHetHanSuDung.add(thuocSapHetHanSuDung);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsHetHanSuDung;    
    }
    
}
