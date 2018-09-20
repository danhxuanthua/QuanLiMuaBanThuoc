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
public class ChiTietHoaDonXuat {
    
    private int soChungTuXuat;
    private String maThuoc;
    private String tenThuoc;
    private int soLuongXuat;
    
    private int soChungTuXuatSua;
    private String maThuocSua;

    private int giaBanDuaVaoSoLuong;

    public int getGiaBanDuaVaoSoLuong() {
        return giaBanDuaVaoSoLuong;
    }

    public void setGiaBanDuaVaoSoLuong(int giaBanDuaVaoSoLuong) {
        this.giaBanDuaVaoSoLuong = giaBanDuaVaoSoLuong;
    }
    
    public int getSoChungTuXuatSua() {
        return soChungTuXuatSua;
    }

    public void setSoChungTuXuatSua(int soChungTuXuatSua) {
        this.soChungTuXuatSua = soChungTuXuatSua;
    }

    public String getMaThuocSua() {
        return maThuocSua;
    }

    public void setMaThuocSua(String maThuocSua) {
        this.maThuocSua = maThuocSua;
    }

    public ChiTietHoaDonXuat() {
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

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getSoLuongXuat() {
        return soLuongXuat;
    }

    public void setSoLuongXuat(int soLuongXuat) {
        this.soLuongXuat = soLuongXuat;
    }
    
}
