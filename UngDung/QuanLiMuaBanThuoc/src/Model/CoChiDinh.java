/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
SELECT `benh`.`Ma_Benh`,`benh`.`Ten_Benh`,`thuoc`.`Ma_Thuoc`,`thuoc`.`Ten_Thuoc` FROM `co_chi_dinh`,`benh`,`thuoc` WHERE co_chi_dinh.Ma_Benh=benh.Ma_Benh AND co_chi_dinh.Ma_Thuoc=thuoc.Ma_Thuoc
 */
package Model;

/**
 *
 * @author danhx
 */
public class CoChiDinh {
    private int maBenh;
    private String tenBenh;
    private String maThuoc;
    private String tenThuoc;
    private int maBenhSua;
    private String maThuocSua;

    public CoChiDinh() {
    }

    public int getMaBenh() {
        return maBenh;
    }

    public void setMaBenh(int maBenh) {
        this.maBenh = maBenh;
    }

    public String getTenBenh() {
        return tenBenh;
    }

    public void setTenBenh(String tenBenh) {
        this.tenBenh = tenBenh;
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

    public int getMaBenhSua() {
        return maBenhSua;
    }

    public void setMaBenhSua(int maBenhSua) {
        this.maBenhSua = maBenhSua;
    }

    public String getMaThuocSua() {
        return maThuocSua;
    }

    public void setMaThuocSua(String maThuocSua) {
        this.maThuocSua = maThuocSua;
    }
    
    
}
