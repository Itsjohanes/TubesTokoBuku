/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tokobuku.controller;
import com.mycompany.tokobuku.db.ConnectionDB;
import com.mycompany.tokobuku.model.Buku;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Johannes Alexander Putra
 */
public class BukuDAOImp implements BukuDAO{

    @Override
    public void insert(Buku buku) {
        
        try {
            Connection conDB = ConnectionDB.getConnection();
            String sql = "INSERT into tb_buku(id_buku,judul_buku,penulis,tahun_terbit,jenis_buku,id_penerbit,kuantitas) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ps.setInt(1, buku.getIdBuku());
            ps.setString(2, buku.getJudulBuku());
            ps.setString(3,buku.getPenulis());
            ps.setString(4,buku.getTahunTerbit());
            ps.setString(5,buku.getJenisBuku());
            ps.setInt(6,buku.getIDPenerbit());
            ps.setInt(7, buku.getKuantitas());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal tersimpan");
            System.out.println(ex);
        }
        
        
    }



    @Override
    public void update(Buku buku) {
        try {
            Connection conDB =  ConnectionDB.getConnection();
            String sql = "UPDATE tb_buku SET judul_buku =?, penulis=?, tahun_terbit=?, jenis_buku=?, id_penerbit=?, kuantitas=? WHERE id_buku=?";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ps.setInt(7, buku.getIdBuku());
            ps.setString(1, buku.getJudulBuku());
            ps.setString(2,buku.getPenulis());
            ps.setString(3,buku.getTahunTerbit());
            ps.setString(4,buku.getJenisBuku());
            ps.setInt(5,buku.getIDPenerbit());
            ps.setInt(6, buku.getKuantitas());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been update");
        }  
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot update into table");
        }
    }

    @Override
    public void delete(Buku buku) {
         try {
            Connection conDB =  ConnectionDB.getConnection();
            String sql = "DELETE FROM tb_buku WHERE id_buku=?";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ps.setInt(1, buku.getIdBuku());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been delete");
        }  
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot update into table");
        }
    }
    @Override
    public List<Buku> list(){
        List<Buku> listBuku = new ArrayList<>();
        try{
            Connection conDB = ConnectionDB.getConnection();
            String sql = "Select * from tb_buku";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("id_buku"));
                buku.setJudulBuku(rs.getString("judul_buku"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahun_terbit"));
                buku.setJenisBuku(rs.getString("jenis_buku"));
                buku.setIdPenerbit(rs.getInt("id_penerbit"));
                buku.setKuantitas(rs.getInt("kuantitas"));
                listBuku.add(buku);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Query Data");
                    
        }
        return listBuku;
    }
    public Buku getList(int idBuku){
        Buku buku = new Buku();
        try {
            Connection conDB = ConnectionDB.getConnection();
            String sql = "SELECT * FROM tb_buku WHERE id_buku=?";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ps.setInt(1, idBuku);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                buku.setIdBuku(rs.getInt("id_buku"));
                buku.setJudulBuku(rs.getString("judul_buku"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahun_terbit"));
                buku.setJenisBuku(rs.getString("jenis_buku"));
                buku.setIdPenerbit(rs.getInt("id_penerbit"));
                buku.setKuantitas(rs.getInt("kuantitas"));
                
            }
        
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using productId");
        }
        return buku;
        
    }

    @Override
    public List<Buku> listByJudulBuku(String judul) {
        List<Buku> listbuku= new ArrayList<Buku>();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_buku WHERE judul_buku=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setString(1, judul);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("id_buku"));
                buku.setJudulBuku(rs.getString("judul_buku"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahun_terbit"));
                buku.setJenisBuku(rs.getString("jenis_buku"));
                buku.setIdPenerbit(rs.getInt("id_penerbit"));
                buku.setKuantitas(rs.getInt("kuantitas"));
                listbuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using judul Buku");
        }
        return listbuku;
    }

    @Override
    public Buku getJudul(String judul) {
        Buku buku=new Buku();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_buku WHERE judul_buku=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setString(1, judul);
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                buku.setIdBuku(rs.getInt("id_buku"));
                buku.setJudulBuku(rs.getString("judul_buku"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahun_terbit"));
                buku.setJenisBuku(rs.getString("jenis_buku"));
                buku.setIdPenerbit(rs.getInt("id_penerbit"));
                buku.setKuantitas(rs.getInt("kuantitas"));
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using Judul");
        }
        return buku;
    }
    
  
    
    
   
}
