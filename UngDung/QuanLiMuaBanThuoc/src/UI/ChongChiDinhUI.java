/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Benh;
import Model.ChongChiDinh;
import Model.CoChiDinh;
import Model.Thuoc;
import Service.BenhService;
import Service.ChongChiDinhService;
import Service.CoChiDinhService;
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
public class ChongChiDinhUI extends javax.swing.JFrame {

    /**
     * Creates new form ChongChiDinhUI
     */
    public ChongChiDinhUI() {
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

        ThemChongChiDinh = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbBenh = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbThuoc = new javax.swing.JComboBox<>();
        btnLuuChongChiDinh = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        SuaChongChiDinh = new javax.swing.JDialog();
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
        tbChongChiDinh = new javax.swing.JTable();
        btnThemChongChiDinh = new javax.swing.JButton();
        btnSuaChongChiDinh = new javax.swing.JButton();
        btnXoaChongChiDinh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        ThemChongChiDinh.setSize(new java.awt.Dimension(450, 320));

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

        btnLuuChongChiDinh.setBackground(new java.awt.Color(0, 153, 51));
        btnLuuChongChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLuuChongChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnLuuChongChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/floppy-disk-save-button.png"))); // NOI18N
        btnLuuChongChiDinh.setText("Lưu");
        btnLuuChongChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuChongChiDinhActionPerformed(evt);
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
                        .addComponent(btnLuuChongChiDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuuChongChiDinh)
                    .addComponent(btnThoat))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout ThemChongChiDinhLayout = new javax.swing.GroupLayout(ThemChongChiDinh.getContentPane());
        ThemChongChiDinh.getContentPane().setLayout(ThemChongChiDinhLayout);
        ThemChongChiDinhLayout.setHorizontalGroup(
            ThemChongChiDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThemChongChiDinhLayout.setVerticalGroup(
            ThemChongChiDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SuaChongChiDinh.setSize(new java.awt.Dimension(450, 320));

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

        javax.swing.GroupLayout SuaChongChiDinhLayout = new javax.swing.GroupLayout(SuaChongChiDinh.getContentPane());
        SuaChongChiDinh.getContentPane().setLayout(SuaChongChiDinhLayout);
        SuaChongChiDinhLayout.setHorizontalGroup(
            SuaChongChiDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SuaChongChiDinhLayout.setVerticalGroup(
            SuaChongChiDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lí chống chỉ định của thuốc");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbChongChiDinh = new javax.swing.JTable () {
            public boolean isCellEditable (int rowIndex, int colIndex) {
                return false; // Không cho phép chỉnh sửa bất kỳ ô nào
            }
        };
        tbChongChiDinh.setModel(new javax.swing.table.DefaultTableModel(
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
        tbChongChiDinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChongChiDinhMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbChongChiDinh);

        btnThemChongChiDinh.setBackground(new java.awt.Color(0, 153, 51));
        btnThemChongChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemChongChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnThemChongChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/add.png"))); // NOI18N
        btnThemChongChiDinh.setText("Thêm");
        btnThemChongChiDinh.setToolTipText("");
        btnThemChongChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemChongChiDinhActionPerformed(evt);
            }
        });

        btnSuaChongChiDinh.setBackground(new java.awt.Color(255, 204, 0));
        btnSuaChongChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSuaChongChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaChongChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/refresh-button.png"))); // NOI18N
        btnSuaChongChiDinh.setText("Sửa");
        btnSuaChongChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaChongChiDinhActionPerformed(evt);
            }
        });

        btnXoaChongChiDinh.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaChongChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoaChongChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaChongChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/round-delete-button.png"))); // NOI18N
        btnXoaChongChiDinh.setText("Xóa");
        btnXoaChongChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaChongChiDinhActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Danh sách thuốc có chống chỉ định");

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
                        .addComponent(btnThemChongChiDinh)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaChongChiDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaChongChiDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(141, 141, 141)
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
                    .addComponent(btnThemChongChiDinh)
                    .addComponent(btnSuaChongChiDinh)
                    .addComponent(btnXoaChongChiDinh))
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
     
        model = (DefaultTableModel) tbChongChiDinh.getModel();    
        model.setDataVector(data, header);
    }
    
    ArrayList<ChongChiDinh> dsChongChiDinh=null;
    public void hienThiToanBoChongChiDinh(){
        ChongChiDinhService chongChiDinhService = new ChongChiDinhService();
        dsChongChiDinh = chongChiDinhService.layToanBoDanhSachChongChiDinh();
        
        model.setRowCount(0);
        for (ChongChiDinh chongChiDinh : dsChongChiDinh) {
            Vector row = new Vector();
            row.add(chongChiDinh.getMaBenh() +"-"+chongChiDinh.getTenBenh());
            row.add(chongChiDinh.getMaThuoc()+"_"+chongChiDinh.getTenThuoc());
            
            data.add(row);
        }
    }
    
    String maBenh;
    String maThuoc;
    private void tbChongChiDinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChongChiDinhMouseClicked
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();
    
        cbThuocSua.removeAllItems();
        cbBenhSua.removeAllItems();
        hienThiToanBenhSua();
        hienThiToanBoThuocSua();
        
        int row = tbChongChiDinh.getSelectedRow();
        String maBenhVaTenBenh = tbChongChiDinh.getValueAt(row, 0).toString();
        String maThuocVaTenThuoc = tbChongChiDinh.getValueAt(row, 1).toString();

        maBenh = trangChuUI.ngatChuoi(maBenhVaTenBenh, "-", 0);
        maThuoc = trangChuUI.ngatChuoi(maThuocVaTenThuoc, "_", 0);

       
        cbBenhSua.setSelectedItem(maBenhVaTenBenh);
        cbThuocSua.setSelectedItem(maThuocVaTenThuoc);
    }//GEN-LAST:event_tbChongChiDinhMouseClicked

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
    
    private void btnThemChongChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemChongChiDinhActionPerformed
        // TODO add your handling code here:
        ThemChongChiDinh.setVisible(true);
        ThemChongChiDinh.setLocationRelativeTo(null);

        hienThiToanBenh();
        hienThiToanBoThuoc();
    }//GEN-LAST:event_btnThemChongChiDinhActionPerformed

    private void btnSuaChongChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaChongChiDinhActionPerformed
        // TODO add your handling code here:
        if ( maThuoc == null && maBenh == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn thuốc");
            return;
        }
        SuaChongChiDinh.setVisible(true);
        SuaChongChiDinh.setLocationRelativeTo(null);
        cbBenhSua.disable();

        
    }//GEN-LAST:event_btnSuaChongChiDinhActionPerformed

    private void btnXoaChongChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaChongChiDinhActionPerformed
        // TODO add your handling code here:
        if (maThuoc == null && maBenh == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thuốc cần xóa");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa?", "Xác nhận", JOptionPane.YES_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        ChongChiDinh chongChiDinh = new ChongChiDinh();
        chongChiDinh.setMaBenh(Integer.parseInt(maBenh));
        chongChiDinh.setMaThuoc(maThuoc);

        ChongChiDinhService chongChiDinhService = new ChongChiDinhService();
        int result = chongChiDinhService.xoaChongChiDinh(chongChiDinh);
        if (result > 0) {
            hienThiToanBoChongChiDinh();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }else{
            JOptionPane.showMessageDialog(null, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoaChongChiDinhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ThanhPhanThuocVaChiDinhUI thanhPhanThuocVaChiDinhUI = new ThanhPhanThuocVaChiDinhUI();
        thanhPhanThuocVaChiDinhUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLuuChongChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuChongChiDinhActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();
        ChongChiDinh chongChiDinh = new ChongChiDinh();

        String maBenh = trangChuUI.ngatChuoi(cbBenh.getSelectedItem().toString(), "-", 0);
        chongChiDinh.setMaBenh(Integer.parseInt(maBenh));
        String maThuoc = trangChuUI.ngatChuoi(cbThuoc.getSelectedItem().toString() , "_", 0);
        chongChiDinh.setMaThuoc(maThuoc);

        ChongChiDinhService chongChiDinhService = new ChongChiDinhService();
        int result = chongChiDinhService.themChongChiDinh(chongChiDinh);
        if (result > 0) {
            hienThiToanBoChongChiDinh();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(null, "Thuốc đã được thêm chỉ định. Vui lòng kiểm tra lại");
        }
    }//GEN-LAST:event_btnLuuChongChiDinhActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        ThemChongChiDinh.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:

        TrangChuUI trangChuUI = new TrangChuUI();

        ChongChiDinh chongChiDinh = new ChongChiDinh();
        String maThuocSua = trangChuUI.ngatChuoi((String) cbThuocSua.getSelectedItem(), "_", 0);
        chongChiDinh.setMaThuoc(maThuocSua);

        chongChiDinh.setMaBenhSua(Integer.parseInt(maBenh));
        chongChiDinh.setMaThuocSua(maThuoc);

        ChongChiDinhService chongChiDinhService = new ChongChiDinhService();

        int result = chongChiDinhService.suaChongChiDinh(chongChiDinh);
        if (result > 0) {
            hienThiToanBoChongChiDinh();
            JOptionPane.showMessageDialog(null, "Đã cập nhật");
        }else{
            JOptionPane.showMessageDialog(null, "Thuốc này đã được thêm trước đó. Vui lòng kiểm tra lại");
        }

    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        // TODO add your handling code here:
        SuaChongChiDinh.dispose();
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
            java.util.logging.Logger.getLogger(ChongChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChongChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChongChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChongChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChongChiDinhUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SuaChongChiDinh;
    private javax.swing.JDialog ThemChongChiDinh;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuuChongChiDinh;
    private javax.swing.JButton btnSuaChongChiDinh;
    private javax.swing.JButton btnThemChongChiDinh;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnXoaChongChiDinh;
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
    private javax.swing.JTable tbChongChiDinh;
    // End of variables declaration//GEN-END:variables
}
