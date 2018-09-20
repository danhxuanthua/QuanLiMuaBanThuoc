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
public class DungCho {
    
    private String maThuoc;
    private String tenThuoc;
    private int maDoiTuongBenhNhan;
    private String tenDoiTuongBenhNhan;
    
    private String maThuocSua;
    private int maDoiTuongBenhNhanSua;

    public DungCho() {
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

    public int getMaDoiTuongBenhNhan() {
        return maDoiTuongBenhNhan;
    }

    public void setMaDoiTuongBenhNhan(int maDoiTuongBenhNhan) {
        this.maDoiTuongBenhNhan = maDoiTuongBenhNhan;
    }

    public String getTenDoiTuongBenhNhan() {
        return tenDoiTuongBenhNhan;
    }

    public void setTenDoiTuongBenhNhan(String tenDoiTuongBenhNhan) {
        this.tenDoiTuongBenhNhan = tenDoiTuongBenhNhan;
    }

    public String getMaThuocSua() {
        return maThuocSua;
    }

    public void setMaThuocSua(String maThuocSua) {
        this.maThuocSua = maThuocSua;
    }

    public int getMaDoiTuongBenhNhanSua() {
        return maDoiTuongBenhNhanSua;
    }

    public void setMaDoiTuongBenhNhanSua(int maDoiTuongBenhNhanSua) {
        this.maDoiTuongBenhNhanSua = maDoiTuongBenhNhanSua;
    }

}
