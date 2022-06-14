package com.mycompany.tokobuku.controller;


import com.mycompany.tokobuku.model.Penerbit;
import java.util.List;
        
    public interface PenerbitDAO {
        
        public void insert(Penerbit penerbit);
        public void update(Penerbit penerbit);
        public void delete(Penerbit penerbit);
        public Penerbit getPenerbit(int id_penerbit);
        public Penerbit getNamaPenerbit(String nama_penerbit);
        public List<Penerbit> list();
        public List<Penerbit> listByNamaPenerbit(String nama_penerbit);
       
}
