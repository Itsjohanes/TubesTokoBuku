/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tokobuku.controller;

import com.mycompany.tokobuku.model.Buku;
import java.util.List;

/**
 *
 * @author acer
 */
public interface BukuDAO {
    public void insert(Buku buku);
    public void update(Buku buku);
    public void delete(Buku buku);
    public List<Buku> list();
    public Buku getList(int idbuku);
    public List<Buku> listByJudulBuku(String judul);
    public Buku getJudul(String judul);
}
