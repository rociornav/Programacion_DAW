package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static ConexionBD conBD = null;
    private static Connection con;

    private ConexionBD() {
        System.out.println("Conexión Creada");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String password="";//quito contraseña para subirlo al git
            con = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?autoReconnect=true",user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para crear una conexion
    public static Connection getConnectionSingleton() {
        if (con == null) {

            new ConexionBD();
        }
        return con;
    }

    public static ConexionBD getConBD() {
        return conBD;
    }

    public static void setConBD(ConexionBD conBD) {
        ConexionBD.conBD = conBD;
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        ConexionBD.con = con;
    }

    public static void closeConection() {

        if (con != null) {
            con = null;
            System.out.println("Conexion cerrada");
        }
    }
}
