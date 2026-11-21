package com.iweb.lab10.laboratorio10.servlet;

import com.iweb.lab10.laboratorio10.beans.EquiposRed;
import com.iweb.lab10.laboratorio10.daos.EquiposRedDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/EquipoServlet")

public class EquipoServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        EquiposRedDao equipoDao = new EquiposRedDao();

        ArrayList<EquiposRed> lista = null;
        try {
            lista = equipoDao.listarEquipos();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        req.setAttribute("listaEquipos", lista);
        req.getRequestDispatcher("equipos.jsp").forward(req,resp);

    }
}
