/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobuku.controller;

import com.mycompany.tokobuku.db.ConnectionDB;
import com.mycompany.tokobuku.model.Petugas;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public abstract class PetugasDAOImp implements PetugasDAO{
   @Override
    public void insert(Petugas petugas){
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="INSERT INTO tb_petugas (username, password, status) VALUES (?,?,?)";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setString(1, petugas.getUsername());
            ps.setString(2, petugas.getPassword());
            ps.setString(3, petugas.getStatus());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been saved!");
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot insert into table!");
        }
    }

    @Override
    public void update(Petugas petugas){
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="UPDATE tb_petugas SET username=?, password=?, status=? WHERE id_akun=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setString(1, petugas.getUsername());
            ps.setString(2, petugas.getPassword());
            ps.setString(3, petugas.getStatus());
            ps.setInt(4, petugas.getIdAkun());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been update!");
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot update into table!");
        }
    }

    @Override
    public void delete(Petugas petugas){
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="DELETE FROM tb_petugas WHERE id_akun=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setInt(1, petugas.getIdAkun());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been delete!");
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot delete data into table!");
        }
    }

    @Override
    public Petugas getPetugas(int id_akun){
        Petugas petugas=new Petugas();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_petugas WHERE id_akun=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setInt(1, id_akun);
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                petugas.setIdAkun(rs.getInt("id_akun"));
                petugas.setUsername(rs.getString("username"));
                petugas.setPassword(rs.getString("password"));
                petugas.setStatus(rs.getString("status"));
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using id_akun");
        }
        return petugas;
    }

@Override
    public Petugas getUsername(String username){
        Petugas petugas=new Petugas();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_petugas WHERE username=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                petugas.setIdAkun(rs.getInt("id_akun"));
                petugas.setUsername(rs.getString("username"));
                petugas.setPassword(rs.getString("password"));
                petugas.setStatus(rs.getString("status"));
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using Username");
        }
        return petugas;
    }

    @Override
    public List<Petugas> list(){
        List<Petugas> listPetugas= new ArrayList<Petugas>();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_petugas";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Petugas petugas=new Petugas();
                petugas.setIdAkun(rs.getInt("id_akun"));
                petugas.setUsername(rs.getString("username"));
                petugas.setPassword(rs.getString("password"));
                petugas.setStatus(rs.getString("status"));
                listPetugas.add(petugas);
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table");
        }
        return listPetugas;
    }

    @Override
    public List<Petugas> listByUsername(String username){
        List<Petugas> listPetugas= new ArrayList<Petugas>();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_petugas WHERE username=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Petugas petugas=new Petugas();
                petugas.setIdAkun(rs.getInt("id_akun"));
                petugas.setUsername(rs.getString("username"));
                petugas.setPassword(rs.getString("password"));
                petugas.setStatus(rs.getString("status"));
                listPetugas.add(petugas);   
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using username");
        }
        return listPetugas;
    }

}
