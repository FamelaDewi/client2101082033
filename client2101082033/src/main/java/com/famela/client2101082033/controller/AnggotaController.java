/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.client2101082033.controller;

import com.mycompany.client2101082033.FormAnggota;
import com.famela.client2101082033.service.AnggotaService;
import com.famela.client2101082033.service.entity.Anggota;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class AnggotaController {
    private final AnggotaService anggotaService;
    private final FormAnggota formAnggota;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaService = new AnggotaService();
    }
    
    public void bersihForm(){
        formAnggota.getTxtAnggotaId().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public Anggota saveAnggota(){
        Anggota anggota = new Anggota();
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        return anggotaService.saveAnggota(anggota);
    }
    
    public Anggota getAnggotaId(){
        Long id = Long.parseLong(formAnggota.getTxtAnggotaId().getText());
        Anggota anggota = anggotaService.getAnggota(id);
        if(anggota!=null){
            formAnggota.getTxtNama().setText(anggota.getNama());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
        }else{
            JOptionPane.showMessageDialog(formAnggota, "Data tidak ada");
        }
        return anggota;
    }
    
    public void updateAnggota(){
        Anggota anggota = new Anggota();
        anggota.setAnggotaId(Long.parseLong(formAnggota.getTxtAnggotaId().getText()));
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota = anggotaService.updateAnggota(anggota);
        if(anggota != null){
            formAnggota.getTxtAnggotaId().setText(anggota.getAnggotaId().toString());
            JOptionPane.showMessageDialog(formAnggota, "Update Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formAnggota, "Update Data Gagal");
        }
    }
    public void deleteAnggota(){
        Long id = Long.parseLong(formAnggota.getTxtAnggotaId().getText());
        anggotaService.deleteAnggota(id);
        JOptionPane.showMessageDialog(formAnggota,"Delete Data Berhasil");
    }
    
    public void viewTabel(){
        DefaultTableModel tabelModel = (DefaultTableModel)
                formAnggota.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> anggotaList = anggotaService.getAllAnggota();
        for (Anggota anggota : anggotaList){
            Object[] row ={
                anggota.getAnggotaId(),
                anggota.getNama(),
                anggota.getAlamat()
            };
            tabelModel.addRow(row);
        }
    }
}
