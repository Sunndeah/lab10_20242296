package com.iweb.lab10.laboratorio10.servlet;

import com.iweb.lab10.laboratorio10.beans.Sedes;
import com.iweb.lab10.laboratorio10.daos.SedesDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/SedesServlet")


public class SedesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        SedesDao sedeDao = new SedesDao();
        ArrayList<Sedes>lista = sedeDao.listarSedes();

        req.setAttribute("listaSedes", lista);
        req.getRequestDispatcher("sedes.jsp").forward(req,resp);
    }







}
