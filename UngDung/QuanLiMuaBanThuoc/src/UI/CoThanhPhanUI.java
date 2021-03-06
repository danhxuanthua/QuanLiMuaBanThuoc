/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.CoThanhPhan;
import Model.ThanhPhan;
import Model.Thuoc;
import Service.CoThanhPhanService;
import Service.ThanhPhanService;
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
public class CoThanhPhanUI extends javax.swing.JFrame {

    /**
     * Creates new form CoThanhPhanUI
     */
    public CoThanhPhanUI() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon\\capsule.png")));
        setTable();
        hienThiToanBoCoThanhPhan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThemCoThanhPhan = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbMaThuoc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbThanhPhan = new javax.swing.JComboBox<>();
        btbLuuCoThanhPhan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        SuaCoThanhPhan = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbMaThuocSua = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbThanhPhanSua = new javax.swing.JComboBox<>();
        btnCapNhat = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCoThanhPhan = new javax.swing.JTable();
        btnThemCoThanhPhan = new javax.swing.JButton();
        btnSuaCoThanhPhan = new javax.swing.JButton();
        btnXoaCoThanhPhan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        ThemCoThanhPhan.setSize(new java.awt.Dimension(410, 320));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Thuốc:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Thành phần:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(cbMaThuoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbThanhPhan, 0, 200, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMaThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbThanhPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btbLuuCoThanhPhan.setBackground(new java.awt.Color(0, 153, 51));
        btbLuuCoThanhPhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btbLuuCoThanhPhan.setForeground(new java.awt.Color(255, 255, 255));
        btbLuuCoThanhPhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/floppy-disk-save-button.png"))); // NOI18N
        btbLuuCoThanhPhan.setText("Lưu");
        btbLuuCoThanhPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbLuuCoThanhPhanActionPerformed(evt);
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
                        .addComponent(btbLuuCoThanhPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbLuuCoThanhPhan)
                    .addComponent(btnThoat))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout ThemCoThanhPhanLayout = new javax.swing.GroupLayout(ThemCoThanhPhan.getContentPane());
        ThemCoThanhPhan.getContentPane().setLayout(ThemCoThanhPhanLayout);
        ThemCoThanhPhanLayout.setHorizontalGroup(
            ThemCoThanhPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThemCoThanhPhanLayout.setVerticalGroup(
            ThemCoThanhPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SuaCoThanhPhan.setSize(new java.awt.Dimension(410, 320));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Thuốc:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Thành phần:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(cbMaThuocSua, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbThanhPhanSua, 0, 200, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMaThuocSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbThanhPhanSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnCapNhat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat1))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
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

        javax.swing.GroupLayout SuaCoThanhPhanLayout = new javax.swing.GroupLayout(SuaCoThanhPhan.getContentPane());
        SuaCoThanhPhan.getContentPane().setLayout(SuaCoThanhPhanLayout);
        SuaCoThanhPhanLayout.setHorizontalGroup(
            SuaCoThanhPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SuaCoThanhPhanLayout.setVerticalGroup(
            SuaCoThanhPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lí thuốc có thành phần");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbCoThanhPhan = new javax.swing.JTable () {
            public boolean isCellEditable (int rowIndex, int colIndex) {
                return false; // Không cho phép chỉnh sửa bất kỳ ô nào
            }
        };
        tbCoThanhPhan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCoThanhPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCoThanhPhanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbCoThanhPhan);

        btnThemCoThanhPhan.setBackground(new java.awt.Color(0, 153, 51));
        btnThemCoThanhPhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemCoThanhPhan.setForeground(new java.awt.Color(255, 255, 255));
        btnThemCoThanhPhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/add.png"))); // NOI18N
        btnThemCoThanhPhan.setText("Thêm");
        btnThemCoThanhPhan.setToolTipText("");
        btnThemCoThanhPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCoThanhPhanActionPerformed(evt);
            }
        });

        btnSuaCoThanhPhan.setBackground(new java.awt.Color(255, 204, 0));
        btnSuaCoThanhPhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSuaCoThanhPhan.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaCoThanhPhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/refresh-button.png"))); // NOI18N
        btnSuaCoThanhPhan.setText("Sửa");
        btnSuaCoThanhPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCoThanhPhanActionPerformed(evt);
            }
        });

        btnXoaCoThanhPhan.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaCoThanhPhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoaCoThanhPhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaCoThanhPhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/round-delete-button.png"))); // NOI18N
        btnXoaCoThanhPhan.setText("Xóa");
        btnXoaCoThanhPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCoThanhPhanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Danh sách thuốc có thành phần");

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
                        .addComponent(btnThemCoThanhPhan)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaCoThanhPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaCoThanhPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnThemCoThanhPhan)
                    .addComponent(btnSuaCoThanhPhan)
                    .addComponent(btnXoaCoThanhPhan))
                .addContainerGap(39, Short.MAX_VALUE))
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Vector<Object> header = new Vector<>();
    Vector<Object> data  = new Vector<>();
    DefaultTableModel model;
    private void setTable(){
        header.add("Tên thuốc");
        header.add("Thành phần");
     
        model = (DefaultTableModel) tbCoThanhPhan.getModel();    
        model.setDataVector(data, header);
    }
    
    ArrayList<CoThanhPhan> dsCoThanhPhan=null;
    public void hienThiToanBoCoThanhPhan(){
        CoThanhPhanService coThanhPhanService = new CoThanhPhanService();
        dsCoThanhPhan = coThanhPhanService.layToanBoCoThanhPhan();
        
        model.setRowCount(0);
        for (CoThanhPhan coThanhPhan : dsCoThanhPhan) {
            Vector row = new Vector();
            row.add(coThanhPhan.getMaThuoc() +"_"+coThanhPhan.getTenThuoc());
            row.add(coThanhPhan.getMaThanhPhan()+"-"+coThanhPhan.getTenThanhPhan());
            
            data.add(row);
        }
    }
    
    String maThuoc;
    String maThanhPhan;
    private void tbCoThanhPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCoThanhPhanMouseClicked
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();
        
        cbMaThuocSua.removeAllItems();
        cbThanhPhanSua.removeAllItems();
        hienThiToanBoThuocSua();
        hienThiToanBoThanhPhanSua();
        
        int row = tbCoThanhPhan.getSelectedRow();
        String maThuocVaTenThuoc = tbCoThanhPhan.getValueAt(row, 0).toString();
        String maThanhPhanVaTenThanhPhan = tbCoThanhPhan.getValueAt(row, 1).toString();
        
        maThuoc = trangChuUI.ngatChuoi(maThuocVaTenThuoc, "_", 0);
        maThanhPhan = trangChuUI.ngatChuoi(maThanhPhanVaTenThanhPhan, "-", 0);
        
        cbMaThuocSua.setSelectedItem(maThuocVaTenThuoc);
        cbThanhPhanSua.setSelectedItem(maThanhPhanVaTenThanhPhan);
    }//GEN-LAST:event_tbCoThanhPhanMouseClicked

    private void btnThemCoThanhPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCoThanhPhanActionPerformed
        // TODO add your handling code here:
        ThemCoThanhPhan.setVisible(true);
        ThemCoThanhPhan.setLocationRelativeTo(null);
        hienThiToanBoThuoc();
        hienThiToanBoThanhPhan();

    }//GEN-LAST:event_btnThemCoThanhPhanActionPerformed

    private void btnSuaCoThanhPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCoThanhPhanActionPerformed
        // TODO add your handling code here:
        if ( maThuoc == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn thuốc");
            return;
        }
        SuaCoThanhPhan.setVisible(true);
        SuaCoThanhPhan.setLocationRelativeTo(null);
        cbMaThuocSua.disable();
        
    }//GEN-LAST:event_btnSuaCoThanhPhanActionPerformed

    private void btnXoaCoThanhPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCoThanhPhanActionPerformed
        // TODO add your handling code here:
        if (maThuoc == null && maThanhPhan == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thuốc cần xóa");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa?", "Xác nhận", JOptionPane.YES_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        CoThanhPhan coThanhPhan = new CoThanhPhan();
        coThanhPhan.setMaThuoc(maThuoc);
        coThanhPhan.setMaThanhPhan(Integer.parseInt(maThanhPhan));
        CoThanhPhanService coThanhPhanService = new CoThanhPhanService();
        int result = coThanhPhanService.xoaCoThanhPhan(coThanhPhan);
        if (result > 0) {
            hienThiToanBoCoThanhPhan();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }else{
            JOptionPane.showMessageDialog(null, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoaCoThanhPhanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ThanhPhanThuocVaChiDinhUI thanhPhanThuocVaChiDinhUI = new ThanhPhanThuocVaChiDinhUI();
        thanhPhanThuocVaChiDinhUI.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    public void hienThiToanBoThuoc(){
        ArrayList<Thuoc> dsThuoc = null;
        ThuocService thuocService  = new ThuocService();
        dsThuoc = thuocService.layToanBoThongTinThuoc();
        
        cbMaThuoc.removeAllItems();
        for (Thuoc thuoc : dsThuoc) {
            cbMaThuoc.addItem(thuoc.getMaThuoc()+"_"+thuoc.getTenThuoc());
        }
        
    }
    
    public void hienThiToanBoThuocSua(){
        ArrayList<Thuoc> dsThuoc = null;
        ThuocService thuocService  = new ThuocService();
        dsThuoc = thuocService.layToanBoThongTinThuoc();
        
        for (Thuoc thuoc : dsThuoc) {
            cbMaThuocSua.addItem(thuoc.getMaThuoc()+"_"+thuoc.getTenThuoc());
        }
        
    }
    
    public void hienThiToanBoThanhPhan(){
        ArrayList<ThanhPhan> dsThanhPhan=null;
        ThanhPhanService thanhPhanService = new ThanhPhanService();
        dsThanhPhan = thanhPhanService.layToanBoThanhPhan();
        
        cbThanhPhan.removeAllItems();
        for (ThanhPhan thanhPhan : dsThanhPhan) {
            cbThanhPhan.addItem(thanhPhan.getMaThanhPhan()+"-"+thanhPhan.getTenThanhPhan());
        }
    }
    
    public void hienThiToanBoThanhPhanSua(){
        ArrayList<ThanhPhan> dsThanhPhan=null;
        ThanhPhanService thanhPhanService = new ThanhPhanService();
        dsThanhPhan = thanhPhanService.layToanBoThanhPhan();
        
        for (ThanhPhan thanhPhan : dsThanhPhan) {
            cbThanhPhanSua.addItem(thanhPhan.getMaThanhPhan()+"-"+thanhPhan.getTenThanhPhan());
        }
    }
    
    
    private void btbLuuCoThanhPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbLuuCoThanhPhanActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();
        CoThanhPhan coThanhPhan = new CoThanhPhan();

        String maThuoc = trangChuUI.ngatChuoi(cbMaThuoc.getSelectedItem().toString(), "_", 0);
        coThanhPhan.setMaThuoc(maThuoc);
        String maThanhPhan = trangChuUI.ngatChuoi(cbThanhPhan.getSelectedItem().toString() , "-", 0);
        coThanhPhan.setMaThanhPhan(Integer.parseInt(maThanhPhan));
        
        
        CoThanhPhanService coThanhPhanService = new CoThanhPhanService();
        int result = coThanhPhanService.themCoThahPhan(coThanhPhan);
        if (result > 0) {
            hienThiToanBoCoThanhPhan();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(null, "Thuốc đã được thêm thành phân. Vui lòng kiêm tra lại");
        }

    }//GEN-LAST:event_btbLuuCoThanhPhanActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        ThemCoThanhPhan.dispose();

    }//GEN-LAST:event_btnThoatActionPerformed

    
    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChuUI = new TrangChuUI();
        
        CoThanhPhan coThanhPhan = new CoThanhPhan();
        String maThanhPhanSua = trangChuUI.ngatChuoi((String) cbThanhPhanSua.getSelectedItem(), "-", 0);
        coThanhPhan.setMaThanhPhan(Integer.parseInt(maThanhPhanSua));
        
        coThanhPhan.setMaThuocSua(maThuoc);
        coThanhPhan.setMaThanhPhanSua(Integer.parseInt(maThanhPhan));
        
        CoThanhPhanService coThanhPhanService = new CoThanhPhanService();
        
        int result = coThanhPhanService.suaCoThanhPhan(coThanhPhan);
        if (result > 0) {
            hienThiToanBoCoThanhPhan();
            JOptionPane.showMessageDialog(null, "Đã cập nhật");
        }else{
            JOptionPane.showMessageDialog(null, "Thuốc này đã được thêm thành phần trước đó. Vui lòng kiểm tra lại");
        }
        
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        // TODO add your handling code here:
        SuaCoThanhPhan.dispose();
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
            java.util.logging.Logger.getLogger(CoThanhPhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoThanhPhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoThanhPhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoThanhPhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoThanhPhanUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SuaCoThanhPhan;
    private javax.swing.JDialog ThemCoThanhPhan;
    private javax.swing.JButton btbLuuCoThanhPhan;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnSuaCoThanhPhan;
    private javax.swing.JButton btnThemCoThanhPhan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnXoaCoThanhPhan;
    private javax.swing.JComboBox<String> cbMaThuoc;
    private javax.swing.JComboBox<String> cbMaThuocSua;
    private javax.swing.JComboBox<String> cbThanhPhan;
    private javax.swing.JComboBox<String> cbThanhPhanSua;
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
    private javax.swing.JTable tbCoThanhPhan;
    // End of variables declaration//GEN-END:variables
}
