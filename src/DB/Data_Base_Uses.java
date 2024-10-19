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
public class Data_Base_Uses {
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
    public static void main(String[] args) {
        Data_Base_Uses a = new Data_Base_Uses();
        boolean result=a.validacion_DB("12343", "4566");
        System.out.println("result = " + result);
    }
}
