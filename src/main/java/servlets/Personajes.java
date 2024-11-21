/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.Personaje;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
//import org.json.JSONObject;

/**
 *
 * @author Alejandro Beltran
 */
@WebServlet("/personajes")
public class Personajes extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Mickey Mouse", "Negro", "Disney", "Masculino", 94));
        personajes.add(new Personaje("Minnie Mouse", "Rojo", "Disney", "Femenino", 94));
        personajes.add(new Personaje("Bob Esponja", "Amarillo", "Nickelodeon", "Masculino", 25));
        personajes.add(new Personaje("Scooby-Doo", "Café", "Hanna-Barbera", "Masculino", 53));
        personajes.add(new Personaje("Lisa Simpson", "Amarillo", "Los Simpson", "Femenino", 8));

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        // convierte la lista a JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(personajes);

//        JSONObject objeto = new JSONObject();
//        objeto.append("saludo", "Holis");
//        objeto.append("idioma", "español");

        // Escribe JSON en la respuesta
        PrintWriter out = response.getWriter();
        out.write(json);
        out.flush();

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
