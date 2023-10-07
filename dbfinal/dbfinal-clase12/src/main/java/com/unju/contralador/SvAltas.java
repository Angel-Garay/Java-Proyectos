
package com.unju.contralador;

import com.unju.modelo.dao.ProfesorDaoImpl;
import com.unju.modelo.Profesor;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvAltas", urlPatterns = {"/SvAltas"})
public class SvAltas extends HttpServlet {

    ProfesorDaoImpl profesorDaoImpl = new ProfesorDaoImpl();
            
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // --------------------------LISTAR PROFESORES ---------------
        List<Profesor> profesores = new ArrayList();
        
        profesores = profesorDaoImpl.listar();
        
        HttpSession session = request.getSession();
        session.setAttribute("profesores", profesores);
        
        response.sendRedirect("mostrarProfesores.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // ---------------- ALTA DE PROFESORES ---------------
        String legajo = request.getParameter("legajo");
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String telefono = request.getParameter("telefono");
        
        Profesor profesor = new Profesor();
        
        profesor.setLegajo(legajo);
        profesor.setNombres(nombres);
        profesor.setApellidos(apellidos);
        profesor.setTelefono(telefono);
        
        profesorDaoImpl.crear(profesor);
        
        //HttpSession session = request.getSession();
        //session.setAttribute("profesores", profesores);
        
        response.sendRedirect("index.html");
    }
    
   // protected void processRequest(HttpServletRequest request, HttpServletResponse response)
   //         throws ServletException, IOException {
   //     response.setContentType("text/html;charset=UTF-8");
   //     try (PrintWriter out = response.getWriter()) {
   //  
   //         out.println("<!DOCTYPE html>");
   //         out.println("<html>");
   //         out.println("<head>");
   //         out.println("<title>Servlet SvAltas</title>");            
   //         out.println("</head>");
   //         out.println("<body>");
   //         out.println("<h1>Servlet SvAltas at " + request.getContextPath() + "</h1>");
   //         out.println("</body>");
   //         out.println("</html>");
   //     }
   // }

}
