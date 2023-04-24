package com.example.atividade3ex2;

import com.example.atividade3ex2.service.LoginService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("field_user");
        String password = req.getParameter("field_password");

        LoginService service = new LoginService();

        try {
            service.validateLogin(user, password, req);
            resp.sendRedirect("http://localhost:8080/login/pagina.jsp");

        } catch (Exception e) {
            String msg = e.getMessage();
            resp.sendRedirect("http://localhost:8080/login/index.jsp?msg=" + msg);
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            HttpSession session = req.getSession(false);
            //session.setAttribute("is_logged_in", false);
            session.invalidate();

            resp.sendRedirect("http://localhost:8080/login/index.jsp");
        }


}
