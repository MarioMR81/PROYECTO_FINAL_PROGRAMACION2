package com.webapp.webapp.models.controllers;

import com.webapp.webapp.models.Comentario;
import com.webapp.webapp.models.Noticia;
import com.webapp.webapp.repositories.ComentarioRepositoryJdbcImpl;
import com.webapp.webapp.repositories.NoticiaRepositoryJdbcImpl;
import com.webapp.webapp.services.APINewYorkTimes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "NoticiaServlet", value = "/NoticiaServlet")
public class NoticiaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NoticiaRepositoryJdbcImpl repositoryJdbc = new NoticiaRepositoryJdbcImpl();
        ComentarioRepositoryJdbcImpl repositoryJdbc2= new ComentarioRepositoryJdbcImpl();
        try {
            if(request.getParameter("title")==null)
            {
                List<Noticia> noticias = repositoryJdbc.readALL();

                request.setAttribute("noticias",noticias);
                getServletContext().getRequestDispatcher("/listarNoticias.jsp").forward(request,response);
            }else
            {
                Noticia noticia = repositoryJdbc.getNoticia((String) request.getParameter("title"));

                List<Comentario> comentarios = repositoryJdbc2.getComentarios(noticia.getIdNoticia());

                request.setAttribute("noticia",noticia);
                request.setAttribute("comentarios",comentarios);
                getServletContext().getRequestDispatcher("/noticia.jsp").forward(request,response);
            }
        } catch (Exception e) {
            //throw new RuntimeException(e);
        }

    }


}
