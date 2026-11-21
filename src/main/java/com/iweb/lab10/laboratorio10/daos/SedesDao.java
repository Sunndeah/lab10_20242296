package com.iweb.lab10.laboratorio10.daos;
import java.util.ArrayList;
import java.sql.*;
import com.iweb.lab10.laboratorio10.beans.Sedes;





public class SedesDao extends BaseDao{

    public ArrayList<Sedes>listarSedes(){
        ArrayList<Sedes>lista = new ArrayList<>();
        String sql = "SELECT * from sedes";

        try (Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()){

            while(rs.next()){
                Sedes sede = new Sedes();

                sede.setIdSede((Integer)rs.getObject("id_sede"));
                sede.setNombre(rs.getString("nombre"));
                sede.setCiudad(rs.getString("ciudad"));

                lista.add(sede);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;

    }

}
