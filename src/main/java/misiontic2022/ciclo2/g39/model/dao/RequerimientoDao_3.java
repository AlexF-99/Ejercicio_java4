package misiontic2022.ciclo2.g39.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import misiontic2022.ciclo2.g39.model.vo.Requerimiento_3;
import misiontic2022.ciclo2.g39.util.JDBUtilities;

public class RequerimientoDao_3 {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBUtilities.getConnection();

        try {
            String consulta = "SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido,1,3) || SUBSTR(l.Segundo_Apellido,1,3) AS 'Abrev' " +
                                "FROM Lider l ";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                Requerimiento_3 requerimiento_3 = new Requerimiento_3(
                    rs.getString("Abrev")
                );

                respuesta.add(requerimiento_3);
            }

            rs.close();
            statement.close();
        } catch (Exception e) {
            System.err.println("Error de la consulta SQL Requerimiento_3 -> " + e);
        }finally{
            if (conexion != null){
                conexion.close();
            }
        }

        return respuesta;
    } 
}
