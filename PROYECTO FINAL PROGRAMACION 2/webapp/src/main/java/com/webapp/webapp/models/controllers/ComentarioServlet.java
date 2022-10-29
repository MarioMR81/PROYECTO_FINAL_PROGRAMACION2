package com.webapp.webapp.models.controllers;

import com.webapp.webapp.models.Comentario;
import com.webapp.webapp.repositories.ComentarioRepositoryJdbcImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ComentarioServlet", value = "/ComentarioServlet")
public class ComentarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String autor = (String) request.getParameter("autor");
        String comentario = (String) request.getParameter("comentario");
        String idNoticia = (String) request.getParameter("idNoticia");
        ComentarioRepositoryJdbcImpl repositoryJdbc = new ComentarioRepositoryJdbcImpl();
        Comentario comentarioOBJ = new Comentario(autor,comentario,Integer.parseInt(idNoticia));
        try {
            repositoryJdbc.append(comentarioOBJ);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
        }

    }
}
