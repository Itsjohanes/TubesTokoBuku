/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobuku.model;

/**
 *
 * @author ASUS
 */
public class Petugas {
    private int id_akun;
    private String username;
    private String password;
    private String status;

    public int getIdAkun(){
        return id_akun;
    }

    public void setIdAkun(int id_akun){
        this.id_akun=id_akun;
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }
}
