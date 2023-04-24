package com.example.atividade3;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/processa_vaga")
public class ProcessaVagaServlet extends HttpServlet {

    private DateTimeFormatter formatter;

    @Override
    public void init() throws ServletException{
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String fieldNome = request.getParameter("field_nome");
        if(fieldNome.equals("")){
            response.sendRedirect("http://localhost:8080/Exercicio3web_war_exploded/");
        }

        String stringDate = request.getParameter("field_data");

        LocalDate fieldData = LocalDate.parse(stringDate, formatter);

        String fieldIdioma = request.getParameter("field_idioma");

        String [] fieldHabilidades = request.getParameterValues("field_habilidades");

        request.setAttribute("attr_nome", fieldNome);
        request.setAttribute("attr_data", fieldData);
        request.setAttribute("attr_idioma", fieldIdioma);
        request.setAttribute("attr_habilidades", fieldHabilidades);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("tela_confirmacao.jsp");
        requestDispatcher.forward(request, response);

    }
}