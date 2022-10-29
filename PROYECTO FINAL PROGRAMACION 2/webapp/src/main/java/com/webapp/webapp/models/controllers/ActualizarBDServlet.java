package com.webapp.webapp.models.controllers;

import java.io.*;
import java.sql.SQLException;
import java.util.List;

import com.webapp.webapp.models.Noticia;
import com.webapp.webapp.repositories.ComentarioRepositoryJdbcImpl;
import com.webapp.webapp.repositories.NoticiaRepositoryJdbcImpl;
import com.webapp.webapp.services.APINewYorkTimes;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ActualizarBDServlet", value = "/ActualizarBDServlet")
public class ActualizarBDServlet extends HttpServlet {
    private String message;

    public void init() {
        List<Noticia> noticias = APINewYorkTimes.getNoticias();
        NoticiaRepositoryJdbcImpl repositoryJdbc = new NoticiaRepositoryJdbcImpl();
        ComentarioRepositoryJdbcImpl repositoryJdbc2= new ComentarioRepositoryJdbcImpl();
        try {
            repositoryJdbc2.deleteAll();
            repositoryJdbc.deleteAll();
        } catch (SQLException e) {
            //throw new RuntimeException(e);
        }

        for (Noticia not: noticias) {
            try {
                repositoryJdbc.append(not);
            } catch (SQLException e) {
                //throw new RuntimeException(e);
            }
        }
        message = "Datos cargados con exito";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}