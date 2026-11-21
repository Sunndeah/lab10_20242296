package com.iweb.lab10.laboratorio10.daos;

import com.iweb.lab10.laboratorio10.beans.EquiposRed;
import com.iweb.lab10.laboratorio10.beans.Sedes;


import java.sql.*;
import java.util.ArrayList;

public class EquiposRedDao extends BaseDao{


    public ArrayList<EquiposRed>listarEquipos() throws SQLException {
        ArrayList<EquiposRed>lista = new ArrayList<>();

        String sql = "Select e.id_equipo," +
                "e.hostname, e.tipo, e.ip_gestion, e.estado, e.fecha_alta," +
                "j.id_sede, j.nombre, j.ciudad " +
                "FROM equipos_red e " +
                "INNER JOIN sedes j " +
                "ON e.id_equipo = j.id_sede";

        try(Connection conn = this.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery()){

            while (rs.next()){
                EquiposRed equipo = new EquiposRed();
                Sedes sede = new Sedes();

                equipo.setIdEquipo(rs.getInt("id_sede"));
                equipo.setHostName(rs.getString("hostname"));
                
                sede.setIdSede(rs.getInt("id_sede"));
                sede.setNombre(rs.getString("nombre"));

                equipo.setIdSede(sede);
                
                lista.add(equipo);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
}
