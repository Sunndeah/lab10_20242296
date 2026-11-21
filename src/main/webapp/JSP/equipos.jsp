<%@ page import="java.util.ArrayList" %>
<%@ page import="com.iweb.lab10.laboratorio10.beans.EquiposRed" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  ArrayList<EquiposRed> lista =
          (ArrayList<EquiposRed>) request.getAttribute("listarEquipos");

%>

<!DOCTYPE html>
<html>
<head>
  <title>Equipos</title>
</head>
<body>
<h1>Seleccionar Equipos</h1>

<form action="<%=request.getContextPath()%>/EquipoServlet"  method="post">

  <select name="equipoId">

    <% for (EquiposRed equipo : lista) { %>

    <option value="<%=equipo.getIdEquipo()%>">
      <%=equipo.getHostName()%>
    </option>

    <% } %>

  </select>

  <button type="submit">Enviar</button>

</form>

