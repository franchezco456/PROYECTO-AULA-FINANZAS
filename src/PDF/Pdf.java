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
        private String url="jdbc:mysql://root:WxdRLyKGfWeAvPkaQaRTWUofQscvcBiy@junction.proxy.rlwy.net:58437/railway";
        private String user="root";
        private String password="WxdRLyKGfWeAvPkaQaRTWUofQscvcBiy";
    public void reporte_PDF(){
        Document d = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(d, new FileOutputStream(ruta + "/OneDrive/Escritorio/Reporte.pdf"));
            d.open();

            PdfPTable tabla = new PdfPTable(2);
            tabla.addCell("Usuarios");
            tabla.addCell("Contraseñas");

            try (Connection cn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pst = cn.prepareStatement("select * from Usuarios");
                 ResultSet rs = pst.executeQuery()) {

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                    } while (rs.next());
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
        p.reporte_PDF();
    }
}
