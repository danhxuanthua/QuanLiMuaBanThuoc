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

public class CoThanhPhan {
    private String maThuoc;
    private String maThuocSua;
    private String tenThuoc;
    private int maThanhPhan;
    private int maThanhPhanSua;
    private String tenThanhPhan;
    
    public String getMaThuocSua() {
        return maThuocSua;
    }

    public void setMaThuocSua(String maThuocSua) {
        this.maThuocSua = maThuocSua;
    }

    public int getMaThanhPhanSua() {
        return maThanhPhanSua;
    }

    public void setMaThanhPhanSua(int maThanhPhanSua) {
        this.maThanhPhanSua = maThanhPhanSua;
    }
    

    public CoThanhPhan() {
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

    public int getMaThanhPhan() {
        return maThanhPhan;
    }

    public void setMaThanhPhan(int maThanhPhan) {
        this.maThanhPhan = maThanhPhan;
    }

    public String getTenThanhPhan() {
        return tenThanhPhan;
    }

    public void setTenThanhPhan(String tenThanhPhan) {
        this.tenThanhPhan = tenThanhPhan;
    }
    
}
