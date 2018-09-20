/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ChiTietHoaDonXuat;
import Model.CoChiDinh;
import Model.HoaDonXuat;
import Model.InHoaDonXuat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class InHoaDonXuatService extends MySQLService{
    
    public ArrayList<InHoaDonXuat> layThongTinInHoaDonXuat(HoaDonXuat hoaDonXuat){
        ArrayList<InHoaDonXuat> dsInHoaDonXuat = new ArrayList<>();
        try {
            String sql = "SELECT `chi_tiet_hoa_don_xuat`.`So_Chung_Tu_Xuat`, `hoa_don_xuat`.`Ngay_Gio_Xuat`, `nhan_vien`.`Ho`, `nhan_vien`.`Ten`, `thuoc`.`Ten_Thuoc`, `chi_tiet_hoa_don_xuat`.`So_Luong_Xuat`, `chi_tiet_hoa_don_xuat`.`GiaBanDuaVaoSoLuong`, `hoa_don_xuat`.`Tong_Tien_Ban` FROM `chi_tiet_hoa_don_xuat`, `hoa_don_xuat`, `nhan_vien`, `thuoc`, `lo` WHERE chi_tiet_hoa_don_xuat.So_Chung_Tu_Xuat=hoa_don_xuat.So_Chung_Tu_Xuat AND chi_tiet_hoa_don_xuat.Ma_Thuoc=thuoc.Ma_Thuoc AND thuoc.Ma_Thuoc=lo.Ma_Thuoc AND hoa_don_xuat.Ma_Nhan_Vien=nhan_vien.Ma_Nhan_Vien AND chi_tiet_hoa_don_xuat.So_Chung_Tu_Xuat=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, hoaDonXuat.getSoChungTuXuat());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                InHoaDonXuat inHoaDonXuat = new InHoaDonXuat();
                inHoaDonXuat.setSoChungTuXuat(resultSet.getInt(1));
                inHoaDonXuat.setNgayGioXuat(resultSet.getString(2));
                inHoaDonXuat.setHo(resultSet.getString(3));
                inHoaDonXuat.setTen(resultSet.getString(4));
                inHoaDonXuat.setTenThuoc(resultSet.getString(5));
                inHoaDonXuat.setSoLuong(resultSet.getInt(6));
                inHoaDonXuat.setGiaBanDuaVaoSoLuong(resultSet.getInt(7));
                inHoaDonXuat.setTongTienban(resultSet.getInt(8));
                
                dsInHoaDonXuat.add(inHoaDonXuat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsInHoaDonXuat;
    }
}
