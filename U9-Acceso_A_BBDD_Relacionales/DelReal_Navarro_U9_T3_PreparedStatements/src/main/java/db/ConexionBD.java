package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author rocio
 */

public class ConexionBD {
    private static ConexionBD conBD = null;
    private static Connection con;

    private ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root",
                    ""); //quito la contraseña para subirla al git.
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
        }
    }
}
