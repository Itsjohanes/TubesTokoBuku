/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tokobuku.model;

/**
 *
 * @author Johannes Alexander Putra
 */
public class Buku {
    private int id_buku;
    private String judul_buku;
    private String penulis;
    private String tahun_terbit;
    private String jenis_buku;
    private int id_penerbit;
    private int kuanitas;
    
    /*Setter*/
    public void setIdBuku(int id_buku){
        this.id_buku  = id_buku;
        
    }
    public void setJudulBuku(String judul_buku){
        this.judul_buku  = judul_buku;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public void setTahunTerbit(String tahun_terbit){
        this.tahun_terbit = tahun_terbit;
        
    }
    public void setJenisBuku(String jenis_buku){
        this.jenis_buku  = jenis_buku;
    }
    public void setIdPenerbit(int id_penerbit){
        this.id_penerbit = id_penerbit;
        
    }
    public void setKuantitas(int kuantitas){
        this.kuanitas = kuantitas;
    }
    /*Getter*/
    public int getIdBuku(){
        return this.id_buku;
    }
    public String getJudulBuku(){
        return this.judul_buku;
    }
     public String getTahunTerbit(){
        return this.tahun_terbit;
    }
    public String getPenulis(){
        return this.penulis;
    }
     public String getJenisBuku(){
        return this.jenis_buku;
    }
    public int getIDPenerbit(){
        return this.id_penerbit;
    }
    public int getKuantitas(){
        return this.kuanitas;
    }
}
