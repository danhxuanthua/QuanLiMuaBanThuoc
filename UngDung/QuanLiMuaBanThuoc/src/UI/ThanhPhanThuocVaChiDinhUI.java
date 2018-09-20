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
public class ThanhPhanThuocVaChiDinhUI extends javax.swing.JFrame {

    /**
     * Creates new form ThanhPhanThuocVaChiDinh
     */
    public ThanhPhanThuocVaChiDinhUI() {
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
        btnCoChiDinh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnCoThanhPhan = new javax.swing.JButton();
        btnChongChiDinh = new javax.swing.JButton();
        btnThanhPhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lí thành phần thuốc và chỉ định");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCoChiDinh.setBackground(new java.awt.Color(0, 102, 204));
        btnCoChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCoChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnCoChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/medicine-tablets-and-a-glass.png"))); // NOI18N
        btnCoChiDinh.setText("Chỉ định");
        btnCoChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoChiDinhActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/left-arrow.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/home.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnCoThanhPhan.setBackground(new java.awt.Color(204, 51, 0));
        btnCoThanhPhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCoThanhPhan.setForeground(new java.awt.Color(255, 255, 255));
        btnCoThanhPhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/pillsss.png"))); // NOI18N
        btnCoThanhPhan.setText("Thuốc có thành phần");
        btnCoThanhPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoThanhPhanActionPerformed(evt);
            }
        });

        btnChongChiDinh.setBackground(new java.awt.Color(153, 0, 51));
        btnChongChiDinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnChongChiDinh.setForeground(new java.awt.Color(255, 255, 255));
        btnChongChiDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/nopills.png"))); // NOI18N
        btnChongChiDinh.setText("Chống chỉ định");
        btnChongChiDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChongChiDinhActionPerformed(evt);
            }
        });

        btnThanhPhan.setBackground(new java.awt.Color(0, 153, 0));
        btnThanhPhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThanhPhan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhPhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icon/mediciness.png"))); // NOI18N
        btnThanhPhan.setText("Thành phần");
        btnThanhPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhPhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCoChiDinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThanhPhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCoThanhPhan, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(btnChongChiDinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCoThanhPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThanhPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCoChiDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnChongChiDinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        TrangChuUI trangChu = new TrangChuUI();
        trangChu.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DanhMucThuocVaBenhUI danhMucThuocVaBenh = new DanhMucThuocVaBenhUI();
        danhMucThuocVaBenh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnThanhPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhPhanActionPerformed
        // TODO add your handling code here:
        ThanhPhanUI thanhPhanUI = new ThanhPhanUI();
        thanhPhanUI.setVisible(true);
        thanhPhanUI.setLocationRelativeTo(null);
        this.dispose();
        thanhPhanUI.hienThiToanBoThanhPhan();
    }//GEN-LAST:event_btnThanhPhanActionPerformed

    private void btnCoThanhPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoThanhPhanActionPerformed
        // TODO add your handling code here:
        CoThanhPhanUI coThanhPhanUI = new CoThanhPhanUI();
        coThanhPhanUI.setVisible(true);
        coThanhPhanUI.setLocationRelativeTo(null);
        coThanhPhanUI.hienThiToanBoCoThanhPhan();
        this.dispose();
        
    }//GEN-LAST:event_btnCoThanhPhanActionPerformed

    private void btnCoChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoChiDinhActionPerformed
        // TODO add your handling code here:
        CoChiDinhUI coChiDinhUI = new CoChiDinhUI();
        coChiDinhUI.setVisible(true);
        coChiDinhUI.setLocationRelativeTo(null);
        coChiDinhUI.hienThiToanBoCoChiDinh();
        this.dispose();
    }//GEN-LAST:event_btnCoChiDinhActionPerformed

    private void btnChongChiDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChongChiDinhActionPerformed
        // TODO add your handling code here:
        ChongChiDinhUI chongChiDinhUI = new ChongChiDinhUI();
        chongChiDinhUI.setVisible(true);
        chongChiDinhUI.setLocationRelativeTo(null);
        chongChiDinhUI.hienThiToanBoChongChiDinh();
        this.dispose();
    }//GEN-LAST:event_btnChongChiDinhActionPerformed

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
            java.util.logging.Logger.getLogger(ThanhPhanThuocVaChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhPhanThuocVaChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhPhanThuocVaChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhPhanThuocVaChiDinhUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhPhanThuocVaChiDinhUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChongChiDinh;
    private javax.swing.JButton btnCoChiDinh;
    private javax.swing.JButton btnCoThanhPhan;
    private javax.swing.JButton btnThanhPhan;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}