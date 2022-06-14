/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tokobuku.pdf;
import java.io.FileOutputStream;
import java.io.*;
import java.util.*;
import java.sql.*; 
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

/**
 *
 * @author ASUS
 */
public class PetugasPDF {
    public static void main(String[] args) throws Exception{
                
                /* Create Connection objects */
               
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tokobuku_db", "root", "");
                Statement stmt = conn.createStatement();
                /* Define the SQL query */
                ResultSet query_set = stmt.executeQuery("Select * from tb_petugas");
                /* Step-2: Initialize PDF documents - logical objects */
                Document my_pdf_report = new Document();
                PdfWriter.getInstance(my_pdf_report, new FileOutputStream("Report_Akun_Petugas.pdf"));
                my_pdf_report.open();            
                //we have seven columns in our table
                PdfPTable my_report_table = new PdfPTable(3);
                //create a cell object
                PdfPCell table_cell;
                
                //my_pdf_report.add(new Paragraph("Data Buku"));
                /*Judul Table Gan*/
                 table_cell=new PdfPCell(new Phrase("ID Akun"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Username"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Status"));
                my_report_table.addCell(table_cell);
               
                while (query_set.next()) { 
                    
                                int id_akun = query_set.getInt("id_akun");
                                table_cell=new PdfPCell(new Phrase(Integer.toString(id_akun)));
                                my_report_table.addCell(table_cell);
                                
                                String username=query_set.getString("username");
                                table_cell=new PdfPCell(new Phrase(username));
                                my_report_table.addCell(table_cell);
                                
                                String status =query_set.getString("status");
                                table_cell=new PdfPCell(new Phrase(status));
                                my_report_table.addCell(table_cell);
                                
                                
                                }
                /* Attach report table to PDF */
                my_pdf_report.add(my_report_table);                       
                my_pdf_report.close();
                
                /* Close all DB related objects */
                query_set.close();
                stmt.close(); 
                conn.close();               
                
        }
    public static void PDF() throws Exception{
        main(null);
    }
}
