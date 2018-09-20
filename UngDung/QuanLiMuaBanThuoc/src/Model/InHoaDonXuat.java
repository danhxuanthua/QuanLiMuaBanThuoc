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
public class InHoaDonXuat {
    private int soChungTuXuat;
    private String ngayGioXuat;
    private String ho;
    private String ten;
    private String tenThuoc;

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }
    private int soLuong;
    private int giaBanDuaVaoSoLuong;
    private int tongTienban;

    public InHoaDonXuat() {
    }

    public int getSoChungTuXuat() {
        return soChungTuXuat;
    }

    public void setSoChungTuXuat(int soChungTuXuat) {
        this.soChungTuXuat = soChungTuXuat;
    }

    public String getNgayGioXuat() {
        return ngayGioXuat;
    }

    public void setNgayGioXuat(String ngayGioXuat) {
        this.ngayGioXuat = ngayGioXuat;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaBanDuaVaoSoLuong() {
        return giaBanDuaVaoSoLuong;
    }

    public void setGiaBanDuaVaoSoLuong(int giaBanDuaVaoSoLuong) {
        this.giaBanDuaVaoSoLuong = giaBanDuaVaoSoLuong;
    }

    public int getTongTienban() {
        return tongTienban;
    }

    public void setTongTienban(int tongTienban) {
        this.tongTienban = tongTienban;
    }
    
    
}
