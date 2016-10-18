/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipes
 */
@WebServlet(name = "calculo", urlPatterns = {"/calculo"})
public class calculo extends HttpServlet {

   public float imc;  
   public String classificacao;
   public String cor;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        String altura = request.getParameter("altura");  
        String peso = request.getParameter("peso");  

        imc = Float.parseFloat(peso) / (Float.parseFloat(altura) * Float.parseFloat(altura));  

        if(imc < 20){
            classificacao = "abaixo do peso";
            cor = "#333300";
        }else if(imc <= 25){
            classificacao = "com peso normal";
            cor = "#3366FF";
        }else if(imc < 30){
            classificacao = "com sobrepeso";
            cor = "blue";
        }else if(imc < 40){
            classificacao = "Obeso";
            cor = "#FF9900";
        }else{
            classificacao = "com obesidade mórbida";
            cor = "red";
        }
            
        request.setAttribute("imc", imc); 
        request.setAttribute("classificacao", classificacao); 
        request.setAttribute("cor", cor); 

        RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");  
        rd.forward(request, response);  
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
