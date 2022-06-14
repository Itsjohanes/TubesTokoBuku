/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tokobuku.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class PenerbitPDF {
     public static void main(String[] args) throws Exception{
                
                /* Create Connection objects */
               
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tokobuku_db", "root", "");
                Statement stmt = conn.createStatement();
                /* Define the SQL query */
                ResultSet query_set = stmt.executeQuery("Select * from tb_penerbit");
                /* Step-2: Initialize PDF documents - logical objects */
                Document my_pdf_report = new Document();
                PdfWriter.getInstance(my_pdf_report, new FileOutputStream("Report_Penerbit.pdf"));
                my_pdf_report.open();            
                //we have seven columns in our table
                PdfPTable my_report_table = new PdfPTable(3);
                //create a cell object
                PdfPCell table_cell;
                
                //my_pdf_report.add(new Paragraph("Data Buku"));
                /*Judul Table Gan*/
                 table_cell=new PdfPCell(new Phrase("ID Penerbit"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Nama Penerbit"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Email"));
                my_report_table.addCell(table_cell);
 
                while (query_set.next()) { 
                    
                                int id_penerbit = query_set.getInt("id_penerbit");
                                table_cell=new PdfPCell(new Phrase(Integer.toString(id_penerbit)));
                                my_report_table.addCell(table_cell);
                                
                                String nama_penerbit=query_set.getString("nama_penerbit");
                                table_cell=new PdfPCell(new Phrase(nama_penerbit));
                                my_report_table.addCell(table_cell);
                                
                                String email =query_set.getString("email");
                                table_cell=new PdfPCell(new Phrase(email));
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


