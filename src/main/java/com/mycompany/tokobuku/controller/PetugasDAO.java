/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobuku.controller;
import com.mycompany.tokobuku.model.Petugas;
import java.util.List;
/**
 *
 * @author ASUS
 */
public interface PetugasDAO {
    public void insert(Petugas petugas);
    public void update(Petugas petugas);
    public void delete(Petugas petugas);
    public Petugas getPetugas(int id_akun);
    public Petugas getUsername(String username);
    public List<Petugas> list();
    public List<Petugas> listByUsername(String username);
}
