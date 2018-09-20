/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author danhx
 */
public class ThongKeThuocBanChayNhat {
    
    private String tenThuoc;
    private int tongSoLuongXuat;
    private int soChungTuXuat;
    private String maThuoc;

    public ThongKeThuocBanChayNhat() {
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getTongSoLuongXuat() {
        return tongSoLuongXuat;
    }

    public void setTongSoLuongXuat(int tongSoLuongXuat) {
        this.tongSoLuongXuat = tongSoLuongXuat;
    }

    public int getSoChungTuXuat() {
        return soChungTuXuat;
    }

    public void setSoChungTuXuat(int soChungTuXuat) {
        this.soChungTuXuat = soChungTuXuat;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }
    
}
