/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author FRANKY F
 */
public class ingresos_Egresos {
        private String url="jdbc:mysql://root:GuGPjRkRxIFIHGFLYmZAPrXpjsfxHPrR@junction.proxy.rlwy.net:23905/railway";
        private String user="root";
        private String password="GuGPjRkRxIFIHGFLYmZAPrXpjsfxHPrR";
        
        public void ingresos(String id, String tipo,int cantidad, String cuenta){
            try{
            LocalDate fechaActual = LocalDate.now();
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("insert into Economia values (?,?,?,?,?)");
            pst.setString(1, id);
            pst.setString(2,(fechaActual+""));
            pst.setString(3, tipo);
            pst.setInt(4, cantidad);
            pst.setString(5, cuenta);
            pst.executeUpdate();
            System.out.println("se ha insertado correctamente");
            }catch(SQLException e){
                System.out.println("Error: " +  e);
            }
        
    }
        
        public void egresos(String id, String tipo,int cantidad, String cuenta){
            try{
            LocalDate fechaActual = LocalDate.now();
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("insert into Economia values (?,?,?,?,?)");
            pst.setString(1, id);
            pst.setString(2,(fechaActual+""));
            pst.setString(3, tipo);
            pst.setInt(4, (cantidad*-1));
            pst.setString(5, cuenta);
            pst.executeUpdate();
            System.out.println("se ha insertado correctamente");
            }catch(SQLException e){
                System.out.println("Error: " +  e);
            }
        
    }
        
        public static void main(String[] args) {
        ingresos_Egresos a = new ingresos_Egresos();
    }
}
