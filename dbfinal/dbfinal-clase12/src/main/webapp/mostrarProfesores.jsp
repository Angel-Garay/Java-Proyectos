<%-- 
    Document   : mostrarProfesores
    Created on : 4 oct. 2023, 21:03:23
    Author     : angel
--%>

<%@page import="com.unju.modelo.Profesor"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profesores</title>
    </head>
    <body>
        <h1>Profesores</h1>
        <%
            List<Profesor> profesores = (List) request.getSession().getAttribute("profesores");
            int cont = 1;
            for (Profesor p : profesores){
        %>
        
        <b>Profesor N° <%=cont%></b><br>
            Id_profesor: <%=p.getIdProfesor()%><br>
            Legajo: <%=p.getLegajo()%><br> 
            Nombres: <%=p.getNombres()%><br>
            Apellidos: <%=p.getApellidos()%><br>
            Telefono: <%=p.getTelefono()%><br>
            ------------<br>
        
        <%
            cont++;
            }
        %>
    </body>
</html>
