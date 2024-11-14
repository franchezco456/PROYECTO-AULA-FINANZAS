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

    private String url = "jdbc:mysql://root:GuGPjRkRxIFIHGFLYmZAPrXpjsfxHPrR@junction.proxy.rlwy.net:23905/railway";
    private String user = "root";
    private String password = "GuGPjRkRxIFIHGFLYmZAPrXpjsfxHPrR";

    public void ingresos(String id, String tipo, int cantidad, String cuenta) {
        try {
            LocalDate fechaActual = LocalDate.now();
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("insert into Economia values (?,?,?,?,?)");
            pst.setString(1, id);
            pst.setString(2, (fechaActual + ""));
            pst.setString(3, tipo);
            pst.setInt(4, cantidad);
            pst.setString(5, cuenta);
            pst.executeUpdate();
            System.out.println("se ha insertado correctamente");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

    }

    public void egresos(String id, String tipo, int cantidad, String cuenta) {
        try {
            LocalDate fechaActual = LocalDate.now();
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("insert into Economia values (?,?,?,?,?)");
            pst.setString(1, id);
            pst.setString(2, (fechaActual + ""));
            pst.setString(3, tipo);
            pst.setInt(4, (cantidad * -1));
            pst.setString(5, cuenta);
            pst.executeUpdate();
            System.out.println("se ha insertado correctamente");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

    }

    public int [] cantidad_Cuenta(String id) {
        int[] total = new int[3];
        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("select * from Economia where ID = ?");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                do {
                    switch (rs.getString(5)) {
                        case "Efectivo" -> total[0] += (rs.getInt(4));
                        case "Ahorros" -> total[1] += (rs.getInt(4));
                        case "Banco" -> total[2] += (rs.getInt(4));
                        default -> {
                        }
                    }
                } while (rs.next());

            } else {
                return total;
            }
        } catch (SQLException e) {

        }
        return total;
    }

    public String cantidad_Total(String id) {
        int cantidad = 0;
        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("select * from Economia where ID = ?");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                do {

                    cantidad += rs.getInt(4);

                } while (rs.next());

            } else {
                return cantidad + "";
            }
        } catch (SQLException e) {

        }
        return cantidad + "";
    }

    public void vaciar(String id) {
        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("delete from Economia where ID = " + id);
            pst.executeUpdate();
            System.out.println("se han eliminado todos los registros");
        } catch (SQLException e) {
            System.out.println("Error = " + e);
        }
    }

    public void cambio_id(String id_viejo, String id_nuevo) {
        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("update Economia set ID = ? where ID = ?");
            pst.setString(1, id_nuevo);
            pst.setString(2, id_viejo);
            pst.executeUpdate();
            System.out.println("se han modificado todos los registros");
        } catch (SQLException e) {
            System.out.println("Error = " + e);
        }
    }

    public int[] gastos_tipo(String id) {
        int[] total = new int[9];
        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("select * from Economia where ID = ?");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                do {
                    switch (rs.getString(3)) {
                        case "Comidas" -> total[0] += (rs.getInt(4) * -1);
                        case "Compras" -> total[1] += (rs.getInt(4) * -1);
                        case "Viviendas" -> total[2] += (rs.getInt(4) * -1);
                        case "Transporte" -> total[3] += (rs.getInt(4) * -1);
                        case "Vehiculos" -> total[4] += (rs.getInt(4) * -1);
                        case "Vida y Entretenimiento" -> total[5] += (rs.getInt(4) * -1);
                        case "Comunicaciones" -> total[6] += (rs.getInt(4) * -1);
                        case "Gastos financieros" -> total[7] += (rs.getInt(4) * -1);
                        case "Otros" -> total[8] += (rs.getInt(4) * -1);
                        default -> {
                        }
                    }
                } while (rs.next());

            } else {
                return total;
            }
        } catch (SQLException e) {

        }
        return total;
    }

    public static void main(String[] args) {

    }
}
