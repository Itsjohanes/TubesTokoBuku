
package com.mycompany.tokobuku.pdf;
import java.io.FileOutputStream;
import java.io.*;
import java.util.*;
import java.sql.*; 
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
/**
 *
 * @author Johannes Alexander Putra 
 */
public class BukuPDF {
    public static void main(String[] args) throws Exception{
                
                /* Create Connection objects */
               
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tokobuku_db", "root", "");
                Statement stmt = conn.createStatement();
                /* Define the SQL query */
                ResultSet query_set = stmt.executeQuery("Select * from tb_buku");
                /* Step-2: Initialize PDF documents - logical objects */
                Document my_pdf_report = new Document();
                PdfWriter.getInstance(my_pdf_report, new FileOutputStream("Report_Buku.pdf"));
                my_pdf_report.open();            
                //we have seven columns in our table
                PdfPTable my_report_table = new PdfPTable(7);
                //create a cell object
                PdfPCell table_cell;
                
                //my_pdf_report.add(new Paragraph("Data Buku"));
                /*Judul Table Gan*/
                 table_cell=new PdfPCell(new Phrase("ID Buku"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Judul Buku"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Penulis"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Tahun Terbit"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Jenis Buku"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("ID Penerbit"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Kuantitas"));
                my_report_table.addCell(table_cell);
                while (query_set.next()) { 
                    
                                int id_buku = query_set.getInt("id_buku");
                                table_cell=new PdfPCell(new Phrase(Integer.toString(id_buku)));
                                my_report_table.addCell(table_cell);
                                
                                String judul_buku=query_set.getString("judul_buku");
                                table_cell=new PdfPCell(new Phrase(judul_buku));
                                my_report_table.addCell(table_cell);
                                
                                String penulis =query_set.getString("penulis");
                                table_cell=new PdfPCell(new Phrase(penulis));
                                my_report_table.addCell(table_cell);
                                
                                String tahun_terbit=query_set.getString("tahun_terbit");
                                table_cell=new PdfPCell(new Phrase(tahun_terbit));
                                my_report_table.addCell(table_cell);
                                
                                String jenis_buku=query_set.getString("jenis_buku");
                                table_cell=new PdfPCell(new Phrase(jenis_buku));
                                my_report_table.addCell(table_cell);
                                
                                int id_penerbit = query_set.getInt("id_penerbit");
                                table_cell=new PdfPCell(new Phrase(Integer.toString(id_penerbit)));
                                my_report_table.addCell(table_cell);
                                
                                int kuantitas = query_set.getInt("kuantitas");
                                table_cell=new PdfPCell(new Phrase(Integer.toString(kuantitas)));
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
