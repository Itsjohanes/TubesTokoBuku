
package com.mycompany.tokobuku.controller;


import com.mycompany.tokobuku.model.Penerbit;

import com.mycompany.tokobuku.db.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class PenerbitDAOImp implements PenerbitDAO{

    @Override
    public void insert(Penerbit penerbit){
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="INSERT INTO tb_penerbit (id_penerbit, nama_penerbit, email) VALUES (?,?,?)";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setInt(1, penerbit.getIdPenerbit());
            ps.setString(2, penerbit.getNamaPenerbit());
            ps.setString(3, penerbit.getEmail());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been saved!");
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot insert into table!");
        }
    }

    @Override
    public void update(Penerbit penerbit){
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="UPDATE tb_penerbit SET id_penerbit=?, nama_penerbit=?, email=? WHERE id_penerbit=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setInt(1, penerbit.getIdPenerbit());
            ps.setString(2, penerbit.getNamaPenerbit());
            ps.setString(3, penerbit.getEmail());
            ps.setInt(4, penerbit.getIdPenerbit());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been update!");
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot update into table!");
        }
    }

    @Override
    public void delete(Penerbit penerbit){
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="DELETE FROM tb_penerbit WHERE id_penerbit=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setInt(1, penerbit.getIdPenerbit());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been delete!");
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot delete data into table!");
        }
    }

    @Override
    public Penerbit getPenerbit(int id_penerbit){
        Penerbit penerbit=new Penerbit();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_penerbit WHERE id_penerbit=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setInt(1, id_penerbit);
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                penerbit.setIdPenerbit(rs.getInt("id_penerbit"));
                penerbit.setNamaPenerbit(rs.getString("nama_penerbit"));
                penerbit.setEmail(rs.getString("email"));
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using id_akun");
        }
        return penerbit;
    }

@Override
    public Penerbit getNamaPenerbit(String nama_penerbit){
        Penerbit penerbit=new Penerbit();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_penerbit WHERE nama_penerbit=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setString(1, nama_penerbit);
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                 penerbit.setIdPenerbit(rs.getInt("id_penerbit"));
                penerbit.setNamaPenerbit(rs.getString("nama_penerbit"));
                penerbit.setEmail(rs.getString("email"));
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using Username");
        }
        return penerbit;
    }

    @Override
    public List<Penerbit> list(){
        List<Penerbit> listPenerbit= new ArrayList<Penerbit>();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_penerbit";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Penerbit penerbit=new Penerbit();
                penerbit.setIdPenerbit(rs.getInt("id_penerbit"));
                penerbit.setNamaPenerbit(rs.getString("nama_penerbit"));
                penerbit.setEmail(rs.getString("email"));
                listPenerbit.add(penerbit);
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table");
        }
        return listPenerbit;
    }

    @Override
    public List<Penerbit> listByNamaPenerbit(String nama_penerbit){
        List<Penerbit> listPenerbit= new ArrayList<Penerbit>();
        try{
            Connection conDB=ConnectionDB.getConnection();
            String sql="SELECT * FROM tb_penerbit WHERE nama_penerbit=?";
            PreparedStatement ps=conDB.prepareStatement(sql);
            ps.setString(1, nama_penerbit);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Penerbit penerbit=new Penerbit();
                 penerbit.setIdPenerbit(rs.getInt("id_penerbit"));
                penerbit.setNamaPenerbit(rs.getString("nama_penerbit"));
                penerbit.setEmail(rs.getString("email"));
                listPenerbit.add(penerbit);   
            }
        }catch(Exception e){
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Cannot get data from table by using username");
        }
        return listPenerbit;
    }

}
    
