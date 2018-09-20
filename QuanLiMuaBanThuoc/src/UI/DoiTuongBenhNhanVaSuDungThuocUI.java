/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Toolkit;

/**
 *
 * @author danhx
 */
public class DoiTuongBenhNhanVaSuDungThuocUI extends javax.swing.JFrame {

    /**
     * Creates new form DoiTuongBenhNhanVaSuDungThuoc
     */
    public DoiTuongBenhNhanVaSuDungThuocUI() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon\\capsule.png")));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnDoiTuongBenhNhan = new javax.swing.JButton();
        btnKhongDungCho = new javax.swing.JButton();
        btnDungCho = new javax.swing.JButton();
        btnLieuLuongDung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lí đối tượng bệnh nhân và sử dụng thuốc");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/left-arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/home.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnDoiTuongBenhNhan.setBackground(new java.awt.Color(255, 51, 0));
        btnDoiTuongBenhNhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDoiTuongBenhNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnDoiTuongBenhNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/hospital.png"))); // NOI18N
        btnDoiTuongBenhNhan.setText("Đối tượng bệnh nhân");
        btnDoiTuongBenhNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiTuongBenhNhanActionPerformed(evt);
            }
        });

        btnKhongDungCho.setBackground(new java.awt.Color(0, 153, 0));
        btnKhongDungCho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKhongDungCho.setForeground(new java.awt.Color(255, 255, 255));
        btnKhongDungCho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/pillssss.png"))); // NOI18N
        btnKhongDungCho.setText("Thuốc không dùng cho đối tượng bệnh nhân");
        btnKhongDungCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongDungChoActionPerformed(evt);
            }
        });

        btnDungCho.setBackground(new java.awt.Color(0, 102, 204));
        btnDungCho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDungCho.setForeground(new java.awt.Color(255, 255, 255));
        btnDungCho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/prescription.png"))); // NOI18N
        btnDungCho.setText("Thuốc dùng cho đối tượng bênh nhân");
        btnDungCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDungChoActionPerformed(evt);
            }
        });

        btnLieuLuongDung.setBackground(new java.awt.Color(255, 0, 51));
        btnLieuLuongDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLieuLuongDung.setForeground(new java.awt.Color(255, 255, 255));
        btnLieuLuongDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/medicines-time.png"))); // NOI18N
        btnLieuLuongDung.setText("Liều lượng dùng");
        btnLieuLuongDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLieuLuongDungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDoiTuongBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLieuLuongDung, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDungCho, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhongDungCho, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDoiTuongBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDungCho, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLieuLuongDung, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhongDungCho, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLieuLuongDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLieuLuongDungActionPerformed
        // TODO add your handling code here:
        CoLieuLuongDungUI coLieuLuongDungUI = new CoLieuLuongDungUI();
        coLieuLuongDungUI.setVisible(true);
        coLieuLuongDungUI.setLocationRelativeTo(null);
        coLieuLuongDungUI.hienThiToanBoCoLieuLuongDung();
        this.dispose();
        
    }//GEN-LAST:event_btnLieuLuongDungActionPerformed

    private void btnDungChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDungChoActionPerformed
        // TODO add your handling code here:
        DungChoUI dungChoUI = new DungChoUI();
        dungChoUI.setVisible(true);
        dungChoUI.setLocationRelativeTo(null);
        dungChoUI.hienThiToanBoDungCho();
        
        this.dispose();
    }//GEN-LAST:event_btnDungChoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChu = new TrangChuUI();
        trangChu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DanhMucThuocVaBenhUI danhMucThuocVaBenh = new DanhMucThuocVaBenhUI();
        danhMucThuocVaBenh.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDoiTuongBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiTuongBenhNhanActionPerformed
        // TODO add your handling code here:
        DoiTuongBenhNhanUI doiTuongBenhNhanUI = new DoiTuongBenhNhanUI();
        doiTuongBenhNhanUI.setVisible(true);
        doiTuongBenhNhanUI.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDoiTuongBenhNhanActionPerformed

    private void btnKhongDungChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongDungChoActionPerformed
        // TODO add your handling code here:
        KhongDungDuocUI khongDungDuocUI = new KhongDungDuocUI();
        khongDungDuocUI.setVisible(true);
        khongDungDuocUI.setLocationRelativeTo(null);
        khongDungDuocUI.hienThiToanBoKhongDungDuoc();
        
        this.dispose();
    }//GEN-LAST:event_btnKhongDungChoActionPerformed

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
            java.util.logging.Logger.getLogger(DoiTuongBenhNhanVaSuDungThuocUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiTuongBenhNhanVaSuDungThuocUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiTuongBenhNhanVaSuDungThuocUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiTuongBenhNhanVaSuDungThuocUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiTuongBenhNhanVaSuDungThuocUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiTuongBenhNhan;
    private javax.swing.JButton btnDungCho;
    private javax.swing.JButton btnKhongDungCho;
    private javax.swing.JButton btnLieuLuongDung;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}