/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.client2101082033;


import com.famela.client2101082033.controller.BukuController;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class FormBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    BukuController controller;
    public FormBuku() {
        initComponents();
        controller = new BukuController(this);
        controller.bersihForm();
        controller.viewTabel();
    }

    public JTable getTableBuku() {
        return tableBuku;
    }

    public JTextField getTxtIdBuku() {
        return txtIdBuku;
    }

    public JTextField getTxtJudul() {
        return txtJudul;
    }

    public JTextField getTxtKode() {
        return txtKode;
    }

    public JTextField getTxtPenerbit() {
        return txtPenerbit;
    }

    public JTextField getTxtPengarang() {
        return txtPengarang;
    }

    public JTextField getTxtTahun() {
        return txtTahun;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdBuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("ID Buku");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 41, 16);

        txtIdBuku.setText("jTextField1");
        txtIdBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdBuku);
        txtIdBuku.setBounds(130, 20, 250, 22);

        jLabel2.setText("Kode");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 28, 16);

        txtKode.setText("jTextField2");
        getContentPane().add(txtKode);
        txtKode.setBounds(130, 50, 350, 22);

        txtJudul.setText("jTextField3");
        getContentPane().add(txtJudul);
        txtJudul.setBounds(130, 80, 350, 22);

        txtPengarang.setText("jTextField4");
        getContentPane().add(txtPengarang);
        txtPengarang.setBounds(130, 110, 350, 22);

        txtPenerbit.setText("jTextField5");
        getContentPane().add(txtPenerbit);
        txtPenerbit.setBounds(130, 140, 350, 22);

        jLabel3.setText("Judul Buku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 56, 16);

        txtTahun.setText("jTextField6");
        getContentPane().add(txtTahun);
        txtTahun.setBounds(130, 170, 350, 22);

        jLabel4.setText("Pengarang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 57, 16);

        jLabel5.setText("Penerbit");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 44, 16);

        jLabel6.setText("Tahun Terbit");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 66, 16);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(390, 20, 72, 22);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan);
        btnSimpan.setBounds(20, 210, 72, 22);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(130, 210, 72, 22);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(240, 210, 72, 22);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(350, 210, 72, 22);

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Buku", "Kode", "Judul Buku", "Pengarang", "Penerbit", "Tahun Terbit"
            }
        ));
        jScrollPane1.setViewportView(tableBuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 460, 190);

        setSize(new java.awt.Dimension(515, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        controller.saveBuku();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.updateBuku();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        controller.getBukuId();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controller.deleteBuku();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controller.bersihForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtIdBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBukuActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBuku;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
