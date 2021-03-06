/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Benh;
import Model.CoChiDinh;
import Model.CoThanhPhan;
import Model.Thuoc;
import Service.BenhService;
import Service.CoChiDinhService;
import Service.CoThanhPhanService;
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
public class CoChiDinhUI extends javax.swing.JFrame {

    /**
     * Creates new form CoChiDinhUI
     */
    public CoChiDinhUI() {
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

        ThemCoChiDinh = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbBenh = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbThuoc = new javax.swing.JComboBox<>();
        btbLuuCoChiDinh = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        SuaCoChiDinh = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbBenhSua = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbThuocSua = new javax.swing.JComboBox<>();
        btnCapNhat = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCoChiDinh = new javax.swing.JTable();
        btnThemCoChiDinh = new javax.swing.JButton();
        btnSuaCoChiDinh = new javax.swing.JButton();
        btnXoaCoChiDinh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        ThemCoChiDinh.setSize(new java.awt.Dimension(450, 320));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Bênh:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Thuốc:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(cbBenh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbThuoc, 0, 200, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBenh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btbLuuCoChiDinh.setBackground(new java.awt.Color(0, 153, 51));
        btbLuuCoChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btbLuuCoChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btbLuuCoChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/floppy-disk-save-button.png"))); // NOI18N
        btbLuuCoChiDinh.setText("Lưu");
        btbLuuCoChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbLuuCoChiDinhActionPerformed(evt);
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
                        .addComponent(btbLuuCoChiDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbLuuCoChiDinh)
                    .addComponent(btnThoat))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout ThemCoChiDinhLayout = new javax.swing.GroupLayout(ThemCoChiDinh.getContentPane());
        ThemCoChiDinh.getContentPane().setLayout(ThemCoChiDinhLayout);
        ThemCoChiDinhLayout.setHorizontalGroup(
            ThemCoChiDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThemCoChiDinhLayout.setVerticalGroup(
            ThemCoChiDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SuaCoChiDinh.setSize(new java.awt.Dimension(450, 320));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Bênh:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Thuốc:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(cbBenhSua, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbThuocSua, 0, 200, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBenhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbThuocSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnCapNhat.setBackground(new java.awt.Color(0, 153, 51));
        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/floppy-disk-save-button.png"))); // NOI18N
        btnCapNhat.setText("Câp nhật");
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnCapNhat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat1))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnThoat1))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout SuaCoChiDinhLayout = new javax.swing.GroupLayout(SuaCoChiDinh.getContentPane());
        SuaCoChiDinh.getContentPane().setLayout(SuaCoChiDinhLayout);
        SuaCoChiDinhLayout.setHorizontalGroup(
            SuaCoChiDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SuaCoChiDinhLayout.setVerticalGroup(
            SuaCoChiDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lí thuốc có chỉ định");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbCoChiDinh = new javax.swing.JTable () {
            public boolean isCellEditable (int rowIndex, int colIndex) {
                return false; // Không cho phép chỉnh sửa bất kỳ ô nào
            }
        };
        tbCoChiDinh.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCoChiDinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCoChiDinhMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbCoChiDinh);

        btnThemCoChiDinh.setBackground(new java.awt.Color(0, 153, 51));
        btnThemCoChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemCoChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnThemCoChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/add.png"))); // NOI18N
        btnThemCoChiDinh.setText("Thêm");
        btnThemCoChiDinh.setToolTipText("");
        btnThemCoChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCoChiDinhActionPerformed(evt);
            }
        });

        btnSuaCoChiDinh.setBackground(new java.awt.Color(255, 204, 0));
        btnSuaCoChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSuaCoChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaCoChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/refresh-button.png"))); // NOI18N
        btnSuaCoChiDinh.setText("Sửa");
        btnSuaCoChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCoChiDinhActionPerformed(evt);
            }
        });

        btnXoaCoChiDinh.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaCoChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoaCoChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaCoChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/round-delete-button.png"))); // NOI18N
        btnXoaCoChiDinh.setText("Xóa");
        btnXoaCoChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCoChiDinhActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Danh sách thuốc có chỉ định");

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
                        .addComponent(btnThemCoChiDinh)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaCoChiDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaCoChiDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(164, 164, 164)
                                .addComponent(jLabel1)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCoChiDinh)
                    .addComponent(btnSuaCoChiDinh)
                    .addComponent(btnXoaCoChiDinh))
                .addContainerGap(54, Short.MAX_VALUE))
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
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Vector<Object> header = new Vector<>();
    Vector<Object> data  = new Vector<>();
    DefaultTableModel model;
    private void setTable(){
        header.add("Bệnh");
        header.add("Thuốc");
     
        model = (DefaultTableModel) tbCoChiDinh.getModel();    
        model.setDataVector(data, header);
    }
    
    ArrayList<CoChiDinh> dsCoChiDinh=null;
    public void hienThiToanBoCoChiDinh(){
        CoChiDinhService coChiDinhService = new CoChiDinhService();
        dsCoChiDinh = coChiDinhService.layToanBoDanhSachCoChiDinh();
        
        model.setRowCount(0);
        for (CoChiDinh coChiDinh : dsCoChiDinh) {
            Vector row = new Vector();
            row.add(coChiDinh.getMaBenh() +"-"+coChiDinh.getTenBenh());
            row.add(coChiDinh.getMaThuoc()+"_"+coChiDinh.getTenThuoc());
            
            data.add(row);
        }
    }
    
    String maBenh;
    String maThuoc;
    private void tbCoChiDinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCoChiDinhMouseClicked
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();

        cbBenhSua.removeAllItems();
        cbThuocSua.removeAllItems();
        hienThiToanBenhSua();
        hienThiToanBoThuocSua();
        
        int row = tbCoChiDinh.getSelectedRow();
        String maBenhVaTenBenh = tbCoChiDinh.getValueAt(row, 0).toString();
        String maThuocVaTenThuoc = tbCoChiDinh.getValueAt(row, 1).toString();

        maBenh = trangChuUI.ngatChuoi(maBenhVaTenBenh, "-", 0);
        maThuoc = trangChuUI.ngatChuoi(maThuocVaTenThuoc, "_", 0);

        cbBenhSua.setSelectedItem(maBenhVaTenBenh);
        cbThuocSua.setSelectedItem(maThuocVaTenThuoc);

    }//GEN-LAST:event_tbCoChiDinhMouseClicked

    public void hienThiToanBenh(){
        ArrayList<Benh> dsBenh = null;
        BenhService benhService  = new BenhService();
        dsBenh = benhService.layToanBoBenh();
        
        cbBenh.removeAllItems();
        for (Benh benh : dsBenh) {
            cbBenh.addItem(benh.getMaBenh()+"-"+benh.getTenBenh());
        }
        
    }
    
    public void hienThiToanBenhSua(){
        ArrayList<Benh> dsBenh = null;
        BenhService benhService  = new BenhService();
        dsBenh = benhService.layToanBoBenh();
        
        for (Benh benh : dsBenh) {
            cbBenhSua.addItem(benh.getMaBenh()+"-"+benh.getTenBenh());
        }
        
    }
    
    public void hienThiToanBoThuoc(){
        ArrayList<Thuoc> dsThuoc = null;
        ThuocService thuocService  = new ThuocService();
        dsThuoc = thuocService.layToanBoThongTinThuoc();
        
        cbThuoc.removeAllItems();
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
    
    
    private void btnThemCoChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCoChiDinhActionPerformed
        // TODO add your handling code here:
        ThemCoChiDinh.setVisible(true);
        ThemCoChiDinh.setLocationRelativeTo(null);
        
        hienThiToanBenh();
        hienThiToanBoThuoc();
    }//GEN-LAST:event_btnThemCoChiDinhActionPerformed

    private void btnSuaCoChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCoChiDinhActionPerformed
        // TODO add your handling code here:
        if ( maThuoc == null && maBenh == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn thuốc");
            return;
        }
        SuaCoChiDinh.setVisible(true);
        SuaCoChiDinh.setLocationRelativeTo(null);
        cbBenhSua.disable();
        
    }//GEN-LAST:event_btnSuaCoChiDinhActionPerformed

    private void btnXoaCoChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCoChiDinhActionPerformed
        // TODO add your handling code here:
        if (maThuoc == null && maBenh == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thuốc cần xóa");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa?", "Xác nhận", JOptionPane.YES_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        CoChiDinh coChiDinh = new CoChiDinh();
        coChiDinh.setMaBenh(Integer.parseInt(maBenh));
        coChiDinh.setMaThuoc(maThuoc);
        
        CoChiDinhService coChiDinhService = new CoChiDinhService();
        int result = coChiDinhService.xoaCoChiDinh(coChiDinh);
        if (result > 0) {
            hienThiToanBoCoChiDinh();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }else{
            JOptionPane.showMessageDialog(null, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoaCoChiDinhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ThanhPhanThuocVaChiDinhUI thanhPhanThuocVaChiDinhUI = new ThanhPhanThuocVaChiDinhUI();
        thanhPhanThuocVaChiDinhUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btbLuuCoChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbLuuCoChiDinhActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();
        CoChiDinh coChiDinh = new CoChiDinh();

        String maBenh = trangChuUI.ngatChuoi(cbBenh.getSelectedItem().toString(), "-", 0);
        coChiDinh.setMaBenh(Integer.parseInt(maBenh));
        String maThuoc = trangChuUI.ngatChuoi(cbThuoc.getSelectedItem().toString() , "_", 0);
        coChiDinh.setMaThuoc(maThuoc);

        CoChiDinhService coChiDinhService = new CoChiDinhService();
        int result = coChiDinhService.themCoChiDinh(coChiDinh);
        if (result > 0) {
            hienThiToanBoCoChiDinh();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(null, "Thuốc đã được thêm chỉ định. Vui lòng kiểm tra lại");
        }
    }//GEN-LAST:event_btbLuuCoChiDinhActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        ThemCoChiDinh.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        
        TrangChuUI trangChuUI = new TrangChuUI();
        
        CoChiDinh coChiDinh = new CoChiDinh();
        String maThuocSua = trangChuUI.ngatChuoi((String) cbThuocSua.getSelectedItem(), "_", 0);
        coChiDinh.setMaThuoc(maThuocSua);
        
        coChiDinh.setMaBenhSua(Integer.parseInt(maBenh));
        coChiDinh.setMaThuocSua(maThuoc);
        
        CoChiDinhService coChiDinhService = new CoChiDinhService();
        
        int result = coChiDinhService.suaCoChiDinh(coChiDinh);
        if (result > 0) {
            hienThiToanBoCoChiDinh();
            JOptionPane.showMessageDialog(null, "Đã cập nhật");
        }else{
            JOptionPane.showMessageDialog(null, "Thuốc này đã được thêm trước đó. Vui lòng kiểm tra lại");
        }
        
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        // TODO add your handling code here:
        SuaCoChiDinh.dispose();
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
            java.util.logging.Logger.getLogger(CoChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoChiDinhUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SuaCoChiDinh;
    private javax.swing.JDialog ThemCoChiDinh;
    private javax.swing.JButton btbLuuCoChiDinh;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnSuaCoChiDinh;
    private javax.swing.JButton btnThemCoChiDinh;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnXoaCoChiDinh;
    private javax.swing.JComboBox<String> cbBenh;
    private javax.swing.JComboBox<String> cbBenhSua;
    private javax.swing.JComboBox<String> cbThuoc;
    private javax.swing.JComboBox<String> cbThuocSua;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbCoChiDinh;
    // End of variables declaration//GEN-END:variables
}
