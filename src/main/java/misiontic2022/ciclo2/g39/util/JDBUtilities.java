package misiontic2022.ciclo2.g39.util;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;




public class JDBUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {


        String url = "jdbc:sqlite:" + DATABASE_LOCATION; 

        return DriverManager.getConnection(url);
    }
}
