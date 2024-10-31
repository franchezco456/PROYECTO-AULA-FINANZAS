/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import PDF.Pdf;
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
        
        public String cantidad_Cuenta(String id, String cuenta){
            int cantidad=0;
            try{
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("select * from Economia where ID = ? AND CUENTA = ?");
            pst.setString(1, id);
            pst.setString(2,cuenta);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
            do{
           
               cantidad+=rs.getInt(4);
            
            }while(rs.next());
            
             }else{
                 return cantidad+"";
             }
            }catch(SQLException e){
                
            }
            return cantidad+"";
        }
        
        public String cantidad_Total(String id){
            int cantidad=0;
            try{
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("select * from Economia where ID = ?");
            pst.setString(1, id);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
            do{
           
               cantidad+=rs.getInt(4);
            
            }while(rs.next());
            
             }else{
                 return cantidad+"";
             }
            }catch(SQLException e){
                
            }
            return cantidad+"";
        }
        public void vaciar(String id){
            try{
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("delete from Economia where ID = " + id);
            pst.executeUpdate();
            System.out.println("se han eliminado todos los registros");
            }catch(SQLException e){
                System.out.println("Error = " + e);
            }
        }
          public void cambio_id(String id_viejo, String id_nuevo){
            try{
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("update Economia set ID = ? where ID = ?");
            pst.setString(1,id_nuevo);
            pst.setString(2,id_viejo);
            pst.executeUpdate();
            System.out.println("se han modificado todos los registros");
            }catch(SQLException e){
                System.out.println("Error = " + e);
            }  
        }
          public static void main(String[] args) {
        ingresos_Egresos x = new ingresos_Egresos();
        x.egresos("0", "dj", 1500000, "nequi");
        
    }
}
