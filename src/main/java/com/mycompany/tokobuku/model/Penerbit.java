
package com.mycompany.tokobuku.model;

public class Penerbit {
    private int id_penerbit;
    private String nama_penerbit;
    private String email;        
            
    public int getIdPenerbit(){
        return id_penerbit;
    }
    public void setIdPenerbit(int id_penerbit){
        this.id_penerbit=id_penerbit;
    }
    
    public String getNamaPenerbit(){
        return nama_penerbit;
    }
    public void setNamaPenerbit(String nama_penerbit){
        this.nama_penerbit=nama_penerbit;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
