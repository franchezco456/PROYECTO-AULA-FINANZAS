/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.collection.PdfTargetDictionary;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author FRANKY F
 */
public class Pdf {
       private String url="jdbc:mysql://root:GuGPjRkRxIFIHGFLYmZAPrXpjsfxHPrR@junction.proxy.rlwy.net:23905/railway";
        private String user="root";
        private String password="GuGPjRkRxIFIHGFLYmZAPrXpjsfxHPrR";
    public void reporte_PDF(String id){
        Document d = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(d, new FileOutputStream(ruta + "/Documents/Reporte.pdf"));
            d.open();

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("ID");
            tabla.addCell("FECHA");
            tabla.addCell("TIPO");
            tabla.addCell("CANTIDAD");
            tabla.addCell("CUENTA");

            try (Connection cn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pst = cn.prepareStatement("select * from Economia where ID = " + id);
                 ResultSet rs = pst.executeQuery()) {

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                }else{
                    System.out.println("el id ingresado no existe en la base de datos");
                    return;
                }

              d.add(tabla);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
            }

            d.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el PDF: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Pdf p = new Pdf();
        p.reporte_PDF("0");
    }
}
