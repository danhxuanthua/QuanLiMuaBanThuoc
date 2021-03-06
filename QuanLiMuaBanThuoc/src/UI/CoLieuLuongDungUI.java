/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.CoLieuLuongDung;
import Model.CoThanhPhan;
import Model.DoiTuongBenhNhan;
import Model.Thuoc;
import Service.CoLieuLuongDungService;
import Service.CoThanhPhanService;
import Service.DoiTuongBenhNhanService;
import Service.ThuocService;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danhx
 */
public class CoLieuLuongDungUI extends javax.swing.JFrame {

    /**
     * Creates new form CoLieuLuongDungUI
     */
    public CoLieuLuongDungUI() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon\\capsule.png")));
        setTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThemCoLieuLuongDung = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbThuoc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbDoiTuongBenhNhan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtLieuLuongDung = new javax.swing.JTextField();
        btbLuu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        SuaLieuLuongDung = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbThuocSua = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbDoiTuongBenhNhanSua = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtLieuLuongSua = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCoLieuLuongDung = new javax.swing.JTable();
        btnThemCoLieuLuongDung = new javax.swing.JButton();
        btnSuaCoLieuLuongDung = new javax.swing.JButton();
        btnXoaCoLieuLuongDung = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        ThemCoLieuLuongDung.setSize(new java.awt.Dimension(415, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Thuốc:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Đối tượng bệnh nhân:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Liều lượng dùng:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(cbThuoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbDoiTuongBenhNhan, 0, 200, Short.MAX_VALUE)
                    .addComponent(txtLieuLuongDung))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDoiTuongBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLieuLuongDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btbLuu.setBackground(new java.awt.Color(0, 153, 51));
        btbLuu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btbLuu.setForeground(new java.awt.Color(255, 255, 255));
        btbLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/floppy-disk-save-button.png"))); // NOI18N
        btbLuu.setText("Lưu");
        btbLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbLuuActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 51, 51));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/cancel-button.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btbLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbLuu)
                    .addComponent(btnThoat))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThemCoLieuLuongDungLayout = new javax.swing.GroupLayout(ThemCoLieuLuongDung.getContentPane());
        ThemCoLieuLuongDung.getContentPane().setLayout(ThemCoLieuLuongDungLayout);
        ThemCoLieuLuongDungLayout.setHorizontalGroup(
            ThemCoLieuLuongDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThemCoLieuLuongDungLayout.setVerticalGroup(
            ThemCoLieuLuongDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SuaLieuLuongDung.setSize(new java.awt.Dimension(415, 400));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Thuốc:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Đối tượng bệnh nhân:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Liều lượng:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(cbThuocSua, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbDoiTuongBenhNhanSua, 0, 200, Short.MAX_VALUE)
                    .addComponent(txtLieuLuongSua))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbThuocSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDoiTuongBenhNhanSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLieuLuongSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnCapNhat.setBackground(new java.awt.Color(0, 153, 51));
        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/floppy-disk-save-button.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThoat1.setBackground(new java.awt.Color(255, 51, 51));
        btnThoat1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat1.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/cancel-button.png"))); // NOI18N
        btnThoat1.setText("Thoát");
        btnThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnCapNhat)
                        .addGap(81, 81, 81)
                        .addComponent(btnThoat1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnThoat1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SuaLieuLuongDungLayout = new javax.swing.GroupLayout(SuaLieuLuongDung.getContentPane());
        SuaLieuLuongDung.getContentPane().setLayout(SuaLieuLuongDungLayout);
        SuaLieuLuongDungLayout.setHorizontalGroup(
            SuaLieuLuongDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SuaLieuLuongDungLayout.setVerticalGroup(
            SuaLieuLuongDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lí liều lượng dùng");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbCoLieuLuongDung = new javax.swing.JTable () {
            public boolean isCellEditable (int rowIndex, int colIndex) {
                return false; // Không cho phép chỉnh sửa bất kỳ ô nào
            }
        };
        tbCoLieuLuongDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCoLieuLuongDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCoLieuLuongDungMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbCoLieuLuongDung);

        btnThemCoLieuLuongDung.setBackground(new java.awt.Color(0, 153, 51));
        btnThemCoLieuLuongDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemCoLieuLuongDung.setForeground(new java.awt.Color(255, 255, 255));
        btnThemCoLieuLuongDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/add.png"))); // NOI18N
        btnThemCoLieuLuongDung.setText("Thêm");
        btnThemCoLieuLuongDung.setToolTipText("");
        btnThemCoLieuLuongDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCoLieuLuongDungActionPerformed(evt);
            }
        });

        btnSuaCoLieuLuongDung.setBackground(new java.awt.Color(255, 204, 0));
        btnSuaCoLieuLuongDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSuaCoLieuLuongDung.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaCoLieuLuongDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/refresh-button.png"))); // NOI18N
        btnSuaCoLieuLuongDung.setText("Sửa");
        btnSuaCoLieuLuongDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCoLieuLuongDungActionPerformed(evt);
            }
        });

        btnXoaCoLieuLuongDung.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaCoLieuLuongDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoaCoLieuLuongDung.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaCoLieuLuongDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/round-delete-button.png"))); // NOI18N
        btnXoaCoLieuLuongDung.setText("Xóa");
        btnXoaCoLieuLuongDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCoLieuLuongDungActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Danh sách thuốc có liều lượng dùng");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/left-arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btnThemCoLieuLuongDung)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaCoLieuLuongDung, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaCoLieuLuongDung, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(147, 147, 147)
                                .addComponent(jLabel1)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCoLieuLuongDung)
                    .addComponent(btnSuaCoLieuLuongDung)
                    .addComponent(btnXoaCoLieuLuongDung))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Vector<Object> header = new Vector<>();
    Vector<Object> data  = new Vector<>();
    DefaultTableModel model;
    private void setTable(){
        header.add("Tên thuốc");
        header.add("Đối tượng bệnh nhân");
        header.add("Liều lượng dùng");
     
        model = (DefaultTableModel) tbCoLieuLuongDung.getModel();    
        model.setDataVector(data, header);
    }
    
    ArrayList<CoLieuLuongDung> dsCoLieuLuongDung =null;
    public void hienThiToanBoCoLieuLuongDung(){
        CoLieuLuongDungService coLieuLuongDungService = new CoLieuLuongDungService();
        dsCoLieuLuongDung = coLieuLuongDungService.layToanBoCoLieuLuongDung();
        
        model.setRowCount(0);
        for (CoLieuLuongDung coLieuLuongDung : dsCoLieuLuongDung) {
            Vector row = new Vector();
            row.add(coLieuLuongDung.getMaThuoc() +"_"+coLieuLuongDung.getTenThuoc());
            row.add(coLieuLuongDung.getMaDoiTuongBenhNhan()+"-"+coLieuLuongDung.getTenDoiTuongBenhNhan());
            row.add(coLieuLuongDung.getLieuLuong());
            
            data.add(row);
        }
    }
    
    public void hienThiToanBoThuoc(){
        ArrayList<Thuoc> dsThuoc = null;
        ThuocService thuocService  = new ThuocService();
        dsThuoc = thuocService.layToanBoThongTinThuoc();
        
        for (Thuoc thuoc : dsThuoc) {
            cbThuoc.addItem(thuoc.getMaThuoc()+"_"+thuoc.getTenThuoc());
        }
        
    }
    
    public void hienThiToanBoThuocSua(){
        ArrayList<Thuoc> dsThuoc = null;
        ThuocService thuocService  = new ThuocService();
        dsThuoc = thuocService.layToanBoThongTinThuoc();
        
        for (Thuoc thuoc : dsThuoc) {
            cbThuocSua.addItem(thuoc.getMaThuoc()+"_"+thuoc.getTenThuoc());
        }
        
    }
    
    public void hienThiToanDoiTuongBenhNhan(){
        ArrayList<DoiTuongBenhNhan> dsDoiTuongBenhNhan = null;
        DoiTuongBenhNhanService doiTuongBenhNhanService  = new DoiTuongBenhNhanService();
        dsDoiTuongBenhNhan = doiTuongBenhNhanService.layToanBoDoiTuongBenhNhan();
        
        for (DoiTuongBenhNhan doiTuongBenhNhan : dsDoiTuongBenhNhan) {
            cbDoiTuongBenhNhan.addItem(doiTuongBenhNhan.getMaDoiTuongBenhNhan()+"-"+doiTuongBenhNhan.getTenDoiTuongBenhNhan());
        }
        
    }
    
    public void hienThiToanDoiTuongBenhNhanSua(){
        ArrayList<DoiTuongBenhNhan> dsDoiTuongBenhNhan = null;
        DoiTuongBenhNhanService doiTuongBenhNhanService  = new DoiTuongBenhNhanService();
        dsDoiTuongBenhNhan = doiTuongBenhNhanService.layToanBoDoiTuongBenhNhan();
        
        for (DoiTuongBenhNhan doiTuongBenhNhan : dsDoiTuongBenhNhan) {
            cbDoiTuongBenhNhanSua.addItem(doiTuongBenhNhan.getMaDoiTuongBenhNhan()+"-"+doiTuongBenhNhan.getTenDoiTuongBenhNhan());
        }
        
    }
    
    String maThuoc;
    String maDoiTuongBenhNhan;
    private void tbCoLieuLuongDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCoLieuLuongDungMouseClicked
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();

        cbThuocSua.removeAllItems();
        cbDoiTuongBenhNhanSua.removeAllItems();
        hienThiToanBoThuocSua();
        hienThiToanDoiTuongBenhNhanSua();

        int row = tbCoLieuLuongDung.getSelectedRow();
        String maThuocVaTenThuoc = tbCoLieuLuongDung.getValueAt(row, 0).toString();
        String maVaTenDoiTuongBenhNhan = tbCoLieuLuongDung.getValueAt(row, 1).toString();
        String lieuLuong = tbCoLieuLuongDung.getValueAt(row, 2).toString();
        
        //Tach lay ma 
        maThuoc = trangChuUI.ngatChuoi(maThuocVaTenThuoc, "_", 0);
        maDoiTuongBenhNhan = trangChuUI.ngatChuoi(maVaTenDoiTuongBenhNhan, "-", 0);
        //add vao form sua
        cbThuocSua.setSelectedItem(maThuocVaTenThuoc);
        cbDoiTuongBenhNhanSua.setSelectedItem(maVaTenDoiTuongBenhNhan);
        txtLieuLuongSua.setText(lieuLuong);
    }//GEN-LAST:event_tbCoLieuLuongDungMouseClicked

    private void btnThemCoLieuLuongDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCoLieuLuongDungActionPerformed
        // TODO add your handling code here:
        ThemCoLieuLuongDung.setVisible(true);
        ThemCoLieuLuongDung.setLocationRelativeTo(null);
        
        cbThuoc.removeAllItems();
        cbDoiTuongBenhNhan.removeAllItems();
        hienThiToanBoThuoc();
        hienThiToanDoiTuongBenhNhan();
    }//GEN-LAST:event_btnThemCoLieuLuongDungActionPerformed

    private void btnSuaCoLieuLuongDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCoLieuLuongDungActionPerformed
        // TODO add your handling code here:
        if ( maThuoc == null && maDoiTuongBenhNhan == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn thuốc");
            return;
        }
        SuaLieuLuongDung.setVisible(true);
        SuaLieuLuongDung.setLocationRelativeTo(null);
        cbThuocSua.disable();

    }//GEN-LAST:event_btnSuaCoLieuLuongDungActionPerformed

    private void btnXoaCoLieuLuongDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCoLieuLuongDungActionPerformed
        // TODO add your handling code here:
        if (maThuoc == null && maDoiTuongBenhNhan == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thuốc cần xóa");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa?", "Xác nhận", JOptionPane.YES_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        CoLieuLuongDung coLieuLuongDung = new CoLieuLuongDung();
        coLieuLuongDung.setMaThuoc(maThuoc);
        coLieuLuongDung.setMaDoiTuongBenhNhan(Integer.parseInt(maDoiTuongBenhNhan));
        
        CoLieuLuongDungService coLieuLuongDungService = new CoLieuLuongDungService();
        int result = coLieuLuongDungService.xoaCoLieuLuongDung(coLieuLuongDung);
        if (result > 0) {
            hienThiToanBoCoLieuLuongDung();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }else{
            JOptionPane.showMessageDialog(null, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoaCoLieuLuongDungActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DoiTuongBenhNhanVaSuDungThuocUI doiTuongBenhNhanVaSuDungThuocUI = new DoiTuongBenhNhanVaSuDungThuocUI();
        doiTuongBenhNhanVaSuDungThuocUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btbLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbLuuActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();
        CoLieuLuongDung coLieuLuongDung = new CoLieuLuongDung();
        
        //Ma thuoc
        String maThuoc = trangChuUI.ngatChuoi(cbThuoc.getSelectedItem().toString(), "_", 0);
        coLieuLuongDung.setMaThuoc(maThuoc);
        //Ma doi tuong benh nhan
        String maDoiTuongBenhNhan = trangChuUI.ngatChuoi(cbDoiTuongBenhNhan.getSelectedItem().toString() , "-", 0);
        coLieuLuongDung.setMaDoiTuongBenhNhan(Integer.parseInt(maDoiTuongBenhNhan));
        //Lieu luong
        if (trangChuUI.checkDoDai(txtLieuLuongDung.getText(), 1, 50)) {
            coLieuLuongDung.setLieuLuong(txtLieuLuongDung.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Liều lượng không được bỏ trống");
            txtLieuLuongDung.requestFocus();
            return;
        }
        
        CoLieuLuongDungService coLieuLuongDungService = new CoLieuLuongDungService();
        int result = coLieuLuongDungService.themCoLieuLuongDung(coLieuLuongDung);
        if (result > 0) {
            hienThiToanBoCoLieuLuongDung();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(null, "Thuốc đã được thêm liều lượng dùng trước đó. Vui lòng kiêm tra lại");
        }
    }//GEN-LAST:event_btbLuuActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        ThemCoLieuLuongDung.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();

        CoLieuLuongDung coLieuLuongDung = new CoLieuLuongDung();
        String maDoiTuongBenhNhanSua = trangChuUI.ngatChuoi((String) cbDoiTuongBenhNhanSua.getSelectedItem(), "-", 0);
        coLieuLuongDung.setMaDoiTuongBenhNhan(Integer.parseInt(maDoiTuongBenhNhanSua));
        
        if (trangChuUI.checkDoDai(txtLieuLuongSua.getText(), 1, 50)) {
            coLieuLuongDung.setLieuLuong(txtLieuLuongSua.getText().trim());
        }else{
            JOptionPane.showMessageDialog(null, "Liều lượng dùng không được bỏ trống");
            txtLieuLuongSua.requestFocus();
            return;
        }
        
        coLieuLuongDung.setMaThuocSua(maThuoc);
        coLieuLuongDung.setMaDoiTuongBenhNhanSua(Integer.parseInt(maDoiTuongBenhNhan));

        CoLieuLuongDungService coLieuLuongDungService = new CoLieuLuongDungService();
        int result = coLieuLuongDungService.suaCoLieuLuongDung(coLieuLuongDung);
        if (result > 0) {
            hienThiToanBoCoLieuLuongDung();
            JOptionPane.showMessageDialog(null, "Đã cập nhật");
        }else{
            JOptionPane.showMessageDialog(null, "Thuốc này đã được thêm liều lượng dùng trước đó. Vui lòng kiểm tra lại");
        }

    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        // TODO add your handling code here:
        SuaLieuLuongDung.dispose();
    }//GEN-LAST:event_btnThoat1ActionPerformed

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
            java.util.logging.Logger.getLogger(CoLieuLuongDungUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoLieuLuongDungUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoLieuLuongDungUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoLieuLuongDungUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoLieuLuongDungUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SuaLieuLuongDung;
    private javax.swing.JDialog ThemCoLieuLuongDung;
    private javax.swing.JButton btbLuu;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnSuaCoLieuLuongDung;
    private javax.swing.JButton btnThemCoLieuLuongDung;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnXoaCoLieuLuongDung;
    private javax.swing.JComboBox<String> cbDoiTuongBenhNhan;
    private javax.swing.JComboBox<String> cbDoiTuongBenhNhanSua;
    private javax.swing.JComboBox<String> cbThuoc;
    private javax.swing.JComboBox<String> cbThuocSua;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbCoLieuLuongDung;
    private javax.swing.JTextField txtLieuLuongDung;
    private javax.swing.JTextField txtLieuLuongSua;
    // End of variables declaration//GEN-END:variables
}
