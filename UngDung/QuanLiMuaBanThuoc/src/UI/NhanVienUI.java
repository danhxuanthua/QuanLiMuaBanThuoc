/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.NhanVien;
import Service.NhanVienService;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danhx
 */
public class NhanVienUI extends javax.swing.JFrame {

    private JScrollPane jScrollPane1;

    /**
     * Creates new form NhanVien
     */
    

    public NhanVienUI(JDialog ThemNhanVien, JButton btnThemNhanVien, JComboBox<String> cbLevel, JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JLabel jLabel1, JLabel jLabel10, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JLabel jLabel8, JLabel jLabel9, JPanel jPanel1, JPanel jPanel2, JScrollBar jScrollBar1, JScrollPane jScrollPane1, JScrollPane jScrollPane2, JTable jTable1, JTextField txtChucVu, JTextArea txtDiaChi, JTextField txtEmail, JTextField txtHoTen, JPasswordField txtMatKhau, JTextField txtTenDangNhap, JTextField txtTuoi) throws HeadlessException {
        this.ThemNhanVien = ThemNhanVien;
        this.btnThemNhanVien = btnThemNhanVien;
        this.cbLevel = cbLevel;
        this.jButton1 = jButton1;
        this.btbLuuNhanVien = jButton2;
        this.jButton3 = jButton3;
        this.btnXoaNhanVien = jButton4;
        this.jLabel1 = jLabel1;
        this.jLabel10 = jLabel10;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.jLabel9 = jLabel9;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.tbNhanVien = jTable1;
        this.txtChucVu = txtChucVu;
        this.txtDiaChi = txtDiaChi;
        this.txtEmail = txtEmail;
        this.txtHo = txtHoTen;
        this.txtMatKhau = txtMatKhau;
        this.txtTenDangNhap = txtTenDangNhap;
        this.txtTuoi = txtTuoi;
    }
    
    //vector tao bang
    Vector<Object> header = new Vector<>();
    Vector<Object> data  = new Vector<>();
    DefaultTableModel model;
    
    //arraylis chưa danh sach nhan vien
    ArrayList<NhanVien> dsNhanVien = null;
    
    public NhanVienUI() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon\\capsule.png")));
        setTable();
        hienThiToanBoNhanVien();
        this.setLocationRelativeTo(null);
        
    }
    
    
    //tao noi dung bang
    
    public void setTable(){
        
        header.add("Mã NV");
        header.add("Họ");
        header.add("Tên");
        header.add("Chức vụ");
        header.add("Tuổi");
        header.add("Địa chỉ");
        header.add("SĐT");
        header.add("Email");
        header.add("Tên đăng nhập");
        header.add("Mật khẩu");
        header.add("Level");
        
        model = (DefaultTableModel) tbNhanVien.getModel();    
        model.setDataVector(data, header);
        
    }
    
    //Hien thi toan bo nhan vien
    public void hienThiToanBoNhanVien(){
        NhanVienService nhanVienService = new NhanVienService();
        dsNhanVien = nhanVienService.layToanBoNhanVien();
        model.setRowCount(0);
        for (NhanVien nhanVien : dsNhanVien) {
            Vector row = new Vector();
            row.add(nhanVien.getMaNhanVien());
            row.add(nhanVien.getHo());
            row.add(nhanVien.getTen());
            row.add(nhanVien.getChucVu());
            row.add(nhanVien.getTuoi());
            row.add(nhanVien.getDiaChi());
            row.add(nhanVien.getSDT());
            row.add(nhanVien.getEmail());
            row.add(nhanVien.getTenDangNhap());
            row.add(nhanVien.getMatKhau());
            row.add(nhanVien.getLevel());
            data.add(row);
        }
    }

    //function check do dai chuoi
    public boolean checkDoDai(String value, int min, int max){
        if (value.length() >= min && value.length() <= max ) {
            return true;
        }
        
        return false;
    }
    
    //Function check So toi thieu va toi da
    public boolean checkMinToMax(String value, int min, int max){
        if (Integer.parseInt(value) >= min && Integer.parseInt(value) <= max) {
            return true;
        }
        return false;
    }
    
    //function reg
    public boolean  checkReg(String value, String pattern){
        
        if (value.matches(pattern)){
            return true;
        }
        return false;
    }
    
    public boolean checkMax(String value, int Min){
        if (Integer.parseInt(value) >= Min) {
            return true;
        }
        
        return false;
    }
    
    //ma hoa md5
    public String md5(String str){
		MessageDigest md;
		String result = "";
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			BigInteger bi = new BigInteger(1, md.digest());
			
			result = bi.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThemNhanVien = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtHo = new javax.swing.JTextField();
        txtChucVu = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbLevel = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        txtMatKhau = new javax.swing.JPasswordField();
        cbAnHienMatKhau = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btbLuuNhanVien = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        SuaNhanVien = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtHoSua = new javax.swing.JTextField();
        txtChucVuSua = new javax.swing.JTextField();
        txtTuoiSua = new javax.swing.JTextField();
        txtEmailSua = new javax.swing.JTextField();
        txtTenDangNhapSua = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbLevelSua = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiaChiSua = new javax.swing.JTextArea();
        txtMatKhauSua = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        txtTenSua = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtMaNhanVienSua = new javax.swing.JTextField();
        txtSDTSua = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnCapNhatNhanVien = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnThemNhanVien = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnXoaNhanVien = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();

        ThemNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        ThemNhanVien.setPreferredSize(new java.awt.Dimension(393, 553));
        ThemNhanVien.setResizable(false);
        ThemNhanVien.setSize(new java.awt.Dimension(530, 650));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Thêm nhân viên"));
        jPanel2.setToolTipText("");

        jLabel3.setText("Họ");

        jLabel4.setText("Chức vụ");

        jLabel5.setText("Tuổi");

        jLabel6.setText("Địa chỉ");

        jLabel7.setText("Email");

        jLabel8.setText("Tên đăng nhập");

        jLabel9.setText("Mật khẩu");

        cbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel10.setText("Level");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDiaChi.setColumns(20);
        txtDiaChi.setLineWrap(true);
        txtDiaChi.setRows(5);
        txtDiaChi.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDiaChi);

        cbAnHienMatKhau.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cbAnHienMatKhau.setText("Hiện");
        cbAnHienMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnHienMatKhauActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên");

        jLabel21.setText("SĐT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel21))))
                            .addGap(4, 4, 4)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)))
                                .addGap(0, 5, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAnHienMatKhau))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtChucVu)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenDangNhap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnHienMatKhau)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(39, 39, 39))
        );

        btbLuuNhanVien.setBackground(new java.awt.Color(0, 153, 51));
        btbLuuNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btbLuuNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btbLuuNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/floppy-disk-save-button.png"))); // NOI18N
        btbLuuNhanVien.setText("Lưu");
        btbLuuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbLuuNhanVienActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/cancel-button.png"))); // NOI18N
        jButton5.setText("Thoát");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btbLuuNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btbLuuNhanVien))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThemNhanVienLayout = new javax.swing.GroupLayout(ThemNhanVien.getContentPane());
        ThemNhanVien.getContentPane().setLayout(ThemNhanVienLayout);
        ThemNhanVienLayout.setHorizontalGroup(
            ThemNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThemNhanVienLayout.setVerticalGroup(
            ThemNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SuaNhanVien.setSize(new java.awt.Dimension(558, 670));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Sửa nhân viên"));
        jPanel3.setToolTipText("");

        jLabel11.setText("Họ");

        jLabel12.setText("Chức vụ");

        jLabel13.setText("Tuổi");

        jLabel14.setText("Địa chỉ");

        jLabel15.setText("Email");

        jLabel16.setText("Tên đăng nhập");

        jLabel17.setText("Mật khẩu");

        cbLevelSua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel18.setText("Level");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDiaChiSua.setColumns(20);
        txtDiaChiSua.setLineWrap(true);
        txtDiaChiSua.setRows(5);
        txtDiaChiSua.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtDiaChiSua);

        jLabel19.setText("Tên");

        jLabel20.setText("Mã nhân viên");

        jLabel22.setText("SĐT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDTSua)
                    .addComponent(txtTenDangNhapSua)
                    .addComponent(cbLevelSua, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(txtEmailSua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtChucVuSua)
                    .addComponent(txtTuoiSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhauSua)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtHoSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaNhanVienSua, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtMaNhanVienSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19)
                    .addComponent(txtTenSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChucVuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTuoiSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDTSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDangNhapSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhauSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLevelSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(30, 30, 30))
        );

        btnCapNhatNhanVien.setBackground(new java.awt.Color(0, 153, 51));
        btnCapNhatNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCapNhatNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhatNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/floppy-disk-save-button.png"))); // NOI18N
        btnCapNhatNhanVien.setText("Cập nhật");
        btnCapNhatNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatNhanVienActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/cancel-button.png"))); // NOI18N
        jButton6.setText("Thoát");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCapNhatNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapNhatNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SuaNhanVienLayout = new javax.swing.GroupLayout(SuaNhanVien.getContentPane());
        SuaNhanVien.getContentPane().setLayout(SuaNhanVienLayout);
        SuaNhanVienLayout.setHorizontalGroup(
            SuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        SuaNhanVienLayout.setVerticalGroup(
            SuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/left-arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Danh sách nhân viên");

        btnThemNhanVien.setBackground(new java.awt.Color(0, 153, 51));
        btnThemNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnThemNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/add.png"))); // NOI18N
        btnThemNhanVien.setText("Thêm");
        btnThemNhanVien.setToolTipText("");
        btnThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhanVienActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/refresh-button.png"))); // NOI18N
        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnXoaNhanVien.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoaNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/round-delete-button.png"))); // NOI18N
        btnXoaNhanVien.setText("Xóa");
        btnXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNhanVienActionPerformed(evt);
            }
        });

        tbNhanVien = new javax.swing.JTable () {
            public boolean isCellEditable (int rowIndex, int colIndex) {
                return false; // Không cho phép chỉnh sửa bất kỳ ô nào
            }
        };
        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbNhanVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(343, 343, 343)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(btnThemNhanVien)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNhanVien)
                    .addComponent(jButton3)
                    .addComponent(btnXoaNhanVien))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhanVienActionPerformed
        // TODO add your handling code here:
        ThemNhanVien.setVisible(true);
        ThemNhanVien.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnThemNhanVienActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();
        trangChuUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btbLuuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbLuuNhanVienActionPerformed
        // TODO add your handling code here:
        NhanVien nhanVien = new NhanVien();
        
        //check ho ten
        if (checkDoDai(txtTen.getText(), 3, 50)) {
            nhanVien.setHo(txtHo.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Họ không hợp lệ. Vui long kiểm tra lại");
            txtHo.requestFocus();
            return;
        }
        
        //check ten
        if (checkDoDai(txtTen.getText(), 3, 50)) {
            nhanVien.setTen(txtTen.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Tên không hợp lệ. Vui long kiểm tra lại");
            txtTen.requestFocus();
            return;
        }
        
        //check chuc vu
        if (checkDoDai(txtChucVu.getText(), 3, 50)) {
            nhanVien.setChucVu(txtChucVu.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Chức vụ phải từ 3 đến 50 ký tự.");
            txtChucVu.requestFocus();
            return;
        }
        
        //check tuoi
        if (checkReg(txtTuoi.getText(), "\\d{1,3}") && checkMinToMax(txtTuoi.getText(), 18, 60)) {
            nhanVien.setTuoi(Integer.parseInt(txtTuoi.getText().trim()));
        }else{
            JOptionPane.showMessageDialog(null, "Tuổi là số nguyên dương từ 18 trở lên có độ dài tối đa 3 ký tự.");
            txtTuoi.requestFocus();
            return;
        }
        
        //check dia chi
        if(checkDoDai(txtDiaChi.getText(), 5, 100)){
            nhanVien.setDiaChi(txtDiaChi.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Địa chỉ từ 5 đến 100 ký tự");
            txtDiaChi.requestFocus();
            return;
        }
        //Check so dien thoai
        if (checkReg(txtSDT.getText(), "\\d{10,11}")) {
            nhanVien.setSDT(txtSDT.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ");
            txtSDT.requestFocus();
            return;
        }
        
        //check email
        String patternMail ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (checkReg(txtEmail.getText(), patternMail)) {
            nhanVien.setEmail(txtEmail.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Địa chỉ email không hợp lệ.");
            txtEmail.requestFocus();
            return;
        }
        
        //check ten dang nhap
        if (checkReg(txtTenDangNhap.getText(), "^[a-z0-9._-]{3,15}$")) {
            nhanVien.setTenDangNhap(txtTenDangNhap.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Tên đăng nhập từ 3-15 ký tự từ a-Z,Các chữ số từ 0-9 và một số ký tự đặc biệt _,-,.");
            txtTenDangNhap.requestFocus();
            return;
        }
        
        //check mat khau
        if (checkReg(txtMatKhau.getText(), "^(?=.*\\d)(?=.*[a-zA-Z])[0-9a-zA-Z@#$%^&*_!]{6,}")) {
            nhanVien.setMatKhau(md5(txtMatKhau.getText()));
        }else{
            JOptionPane.showMessageDialog(null, "Mật khẩu có độ dài tối thiểu 6 ký tự, có ít nhất 1 ký tự thường,\n 1 ký tự viết hoa và 1 ký tự số, hoặc số ký tự đặc biệt ! # $ @ + , ? . -");
            txtMatKhau.requestFocus();
            return;
        }
        
        nhanVien.setLevel(Integer.parseInt((String) cbLevel.getSelectedItem()));
        
        NhanVienService nhanVienService = new NhanVienService();
        int result = nhanVienService.themNhanVien(nhanVien);
        if (result > 0) {
            hienThiToanBoNhanVien();
            JOptionPane.showMessageDialog(null, "Đã lưu!");
        }else{
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc email đã được sử dụng. Vui lòng kiểm tra lại!");
        }
        
    }//GEN-LAST:event_btbLuuNhanVienActionPerformed

    private void btnCapNhatNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatNhanVienActionPerformed
        // TODO add your handling code here:
        
        
        NhanVien nhanVien = new NhanVien();
        
        //MaNV
        nhanVien.setMaNhanVien(Integer.parseInt(maNV));
        
        //check ho
        if (checkDoDai(txtHoSua.getText(), 1, 50)) {
            nhanVien.setHo(txtHoSua.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Họ không hợp lệ. Vui lòng kiểm tra lại");
            txtHoSua.requestFocus();
            return;
        }
        
        //check ten
        if (checkDoDai(txtTenSua.getText(), 3, 50)) {
            nhanVien.setTen(txtTenSua.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Tên phải từ 3 đến 50 ký tự. Vui lòng kiểm tra lại");
            txtTenSua.requestFocus();
            return;
        }
        
        //check chuc vu
        if (checkDoDai(txtChucVuSua.getText(), 3, 50)) {
            nhanVien.setChucVu(txtChucVuSua.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Chức vụ phải từ 3 đến 50 ký tự.");
            txtChucVuSua.requestFocus();
            return;
        }
        
        //check tuoi
        if (checkReg(txtTuoiSua.getText(), "\\d{1,3}") && checkMinToMax(txtTuoiSua.getText(), 18, 999)) {
            nhanVien.setTuoi(Integer.parseInt(txtTuoiSua.getText().trim()));
        }else{
            JOptionPane.showMessageDialog(null, "Tuổi là số nguyên dương từ 18 trở lên.");
            txtTuoiSua.requestFocus();
            return;
        }
        
        //check dia chi
        if(checkDoDai(txtDiaChiSua.getText(), 5, 100)){
            nhanVien.setDiaChi(txtDiaChiSua.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Địa chỉ từ 5 đến 100 ký tự");
            txtDiaChiSua.requestFocus();
            return;
        }
        
        //Check so dien thoai
        if (checkReg(txtSDTSua.getText(), "\\d{10,11}")) {
            nhanVien.setSDT(txtSDTSua.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ");
            txtSDTSua.requestFocus();
            return;
        }
        
        //check email
        String patternMail ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (checkReg(txtEmailSua.getText(), patternMail)) {
            nhanVien.setEmail(txtEmailSua.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Địa chỉ email không hợp lệ.");
            txtEmailSua.requestFocus();
            return;
        }
        
        //check ten dang nhap
        if (checkReg(txtTenDangNhapSua.getText(), "^[a-z0-9._-]{3,15}$")) {
            nhanVien.setTenDangNhap(txtTenDangNhapSua.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Tên đăng nhập từ 3-15 ký tự từ a-Z,Các chữ số từ 0-9 và một số ký tự đặc biệt _,-,.");
            txtTenDangNhapSua.requestFocus();
            return;
        }
        
        //check mat khau
        if (checkReg(txtMatKhauSua.getText(), "^(?=.*\\d)(?=.*[a-zA-Z])[0-9a-zA-Z@#$%^&*_!]{6,}")) {
            nhanVien.setMatKhau(txtMatKhauSua.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Mật khẩu có độ dài tối thiểu 6 ký tự, có ít nhất 1 ký tự thường,\n 1 ký tự viết hoa và 1 ký tự số, hoặc số ký tự đặc biệt ! # $ @ + , ? . -");
            txtMatKhauSua.requestFocus();
            return;
        }
        
        //level
        nhanVien.setLevel(Integer.parseInt((String) cbLevelSua.getSelectedItem()));
        
        NhanVienService nhanVienService = new NhanVienService();
        int result = nhanVienService.suaNhanVien(nhanVien);
        if (result > 0) {
            hienThiToanBoNhanVien();
            JOptionPane.showMessageDialog(null, "Đã cập nhật!");
        }else{
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc email đã được sử dụng. Vui lòng kiểm tra lại!");
        }
        
        
    }//GEN-LAST:event_btnCapNhatNhanVienActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (maNV == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn nhân viên");
            return;
        }
        SuaNhanVien.setVisible(true);
        SuaNhanVien.setLocationRelativeTo(null);
        
        
                
    }//GEN-LAST:event_jButton3ActionPerformed
    String maNV;
    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        // TODO add your handling code here:
        int row  = tbNhanVien.getSelectedRow();
        
        maNV = tbNhanVien.getValueAt(row, 0).toString();
        String ho =  (String) tbNhanVien.getValueAt(row, 1);
        String ten =  (String) tbNhanVien.getValueAt(row, 2);
        String chuVu = (String) tbNhanVien.getValueAt(row, 3);
        String tuoi =  tbNhanVien.getValueAt(row, 4).toString();
        String diaChi = (String) tbNhanVien.getValueAt(row, 5);
        String sDT = (String) tbNhanVien.getValueAt(row, 6).toString();
        String email = (String) tbNhanVien.getValueAt(row, 7);
        String tenDangNhap = (String) tbNhanVien.getValueAt(row, 8);
        String matKhau = (String) tbNhanVien.getValueAt(row, 9);
        String level = tbNhanVien.getValueAt(row, 10).toString();
        
        txtMaNhanVienSua.setText(maNV);
        txtMaNhanVienSua.disable();
        txtHoSua.setText(ho);
        txtTenSua.setText(ten);
        txtChucVuSua.setText(chuVu);
        txtTuoiSua.setText(tuoi);
        txtDiaChiSua.setText(diaChi);
        txtSDTSua.setText(sDT);
        txtEmailSua.setText(email);
        txtTenDangNhapSua.setText(tenDangNhap);
        txtMatKhauSua.setText(matKhau);
        cbLevelSua.setSelectedItem(level);
        txtMatKhauSua.disable();
        
    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void btnXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNhanVienActionPerformed
        // TODO add your handling code here:
        
        if (maNV != null) {
            
            NhanVien nhanVien = new NhanVien();
            nhanVien.setMaNhanVien(Integer.parseInt(maNV));
            NhanVienService nhanVienService = new NhanVienService();

            int resultConfirm = JOptionPane.showConfirmDialog(null,"Bạn chắc chắn muốn xóa?","Xác nhận",JOptionPane.YES_OPTION);
            if (resultConfirm == JOptionPane.YES_OPTION) {

                int result = nhanVienService.xoaNhanVien(nhanVien);
                if (result > 0) {
                    hienThiToanBoNhanVien();
                    JOptionPane.showMessageDialog(null, "Đã xóa");
                }else{
                    JOptionPane.showMessageDialog(null, "Nhân viên đang được sử dụng không thể xóa, Vui lòng kiểm tra lại");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần xóa!");
            return;
        }
        
    }//GEN-LAST:event_btnXoaNhanVienActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        SuaNhanVien.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ThemNhanVien.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbAnHienMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnHienMatKhauActionPerformed
        // TODO add your handling code here:
        if (cbAnHienMatKhau.isSelected()) {
            cbAnHienMatKhau.setText("Ẩn");
            txtMatKhau.setEchoChar((char)0);
        }else{
            cbAnHienMatKhau.setText("Hiện");
            txtMatKhau.setEchoChar('*');
        }
    }//GEN-LAST:event_cbAnHienMatKhauActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhanVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SuaNhanVien;
    private javax.swing.JDialog ThemNhanVien;
    private javax.swing.JButton btbLuuNhanVien;
    private javax.swing.JButton btnCapNhatNhanVien;
    private javax.swing.JButton btnThemNhanVien;
    private javax.swing.JButton btnXoaNhanVien;
    private javax.swing.JCheckBox cbAnHienMatKhau;
    private javax.swing.JComboBox<String> cbLevel;
    private javax.swing.JComboBox<String> cbLevelSua;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtChucVuSua;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextArea txtDiaChiSua;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailSua;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtHoSua;
    private javax.swing.JTextField txtMaNhanVienSua;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauSua;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSDTSua;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtTenDangNhapSua;
    private javax.swing.JTextField txtTenSua;
    private javax.swing.JTextField txtTuoi;
    private javax.swing.JTextField txtTuoiSua;
    // End of variables declaration//GEN-END:variables
}
