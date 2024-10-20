  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.*;

/**
 *
 * @author FRANKY F
 */
public class Data_Base_Users {
        private String url="jdbc:mysql://root:WxdRLyKGfWeAvPkaQaRTWUofQscvcBiy@junction.proxy.rlwy.net:58437/railway";
        private String user="root";
        private String password="WxdRLyKGfWeAvPkaQaRTWUofQscvcBiy";
    public boolean validacion_DB(String id, String pass){
        try{  
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("select * from Usuarios where ID = ? AND PASSWORD = ?");
            pst.setString(1, id);
            pst.setString(2,pass);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                //cambiar
                System.out.println("CONEXION EXITOSA");
                System.out.println(rs.getString("ID"));
                System.out.println(rs.getString("PASSWORD"));
                return true;
            }else{
                //cambiar
                System.out.println("no existe");
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error: " + e);
            return false;
        }
    }
    public boolean existe_DB_USER(String id){
        try{  
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("select * from Usuarios where ID = ?");
            pst.setString(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    public void crear_Usuario(String id, String pass){
        if(!existe_DB_USER(id)){
            try{
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("insert into Usuarios values (?,?)");
            pst.setString(1, id);
            pst.setString(2,pass);
            pst.executeUpdate();
            System.out.println("se ha insertado correctamente");
            }catch(SQLException e){
                System.out.println("Error: " +  e);
            }
        }else{
            System.out.println("El usuario ya se encuentra registrado por favor inicie sesion");
        }
    }
    
    public void modificar_Usuario(String id, String id_nuevo, String password_nuevo){
        if(existe_DB_USER(id)){
            try{
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("update Usuarios set ID = ? , PASSWORD = ? where ID = " + id);
            pst.setString(1, id_nuevo);
            pst.setString(2,password_nuevo);
            pst.executeUpdate();
            System.out.println("el usuario se ha modificado correctamente");
            }catch(SQLException e){
                System.out.println("Error: " +  e);
            }
        }else{
            System.out.println("El usuario no existe en la base de datos");
        }
    }
    
    public void eliminar_Usuario(String id){
         if(existe_DB_USER(id)){
            try{
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst =cn.prepareStatement("delete from Usuarios where ID = ?");
            pst.setString(1, id);
            pst.executeUpdate();
            System.out.println("el usuario se eliminado correctamente");
            }catch(SQLException e){
                System.out.println("Error: " +  e);
            }
        }else{
            System.out.println("El usuario no existe en la base de datos");
        }
    }
    public static void main(String[] args) {
        Data_Base_Users a = new Data_Base_Users();
        a.crear_Usuario("987654321", "qwerty");
    }
}
