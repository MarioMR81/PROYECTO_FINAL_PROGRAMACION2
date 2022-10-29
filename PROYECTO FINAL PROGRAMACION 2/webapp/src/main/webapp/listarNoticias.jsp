<%@ page import="com.webapp.webapp.models.Noticia" %>
<%@ page import="java.util.List" %>
<%@ page import="com.webapp.webapp.models.Comentario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  List<Noticia> noticias = (List<Noticia>) request.getAttribute("noticias");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Listado de noticias</title>
  <link href='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css' rel='stylesheet'>
  <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'>
  <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
  <style>
    ::-webkit-scrollbar {
      width: 8px;
    }

    /* Track */
    ::-webkit-scrollbar-track {
      background: #f1f1f1;
    }

    /* Handle */
    ::-webkit-scrollbar-thumb {
      background: #888;
    }

    /* Handle on hover */
    ::-webkit-scrollbar-thumb:hover {
      background: #555;
    }

    body {
      background: #eee;
    }

    .filter {
      border-top-right-radius: 10px;
      border-bottom-left-radius: 10px;
      border-bottom-right-radius: 10px;
    }

    .profiles img {
      margin-right: -6px;
    }

    .col-md-4 {
      margin-top: 26px;
    }
  </style>
</head>
<body>
<div class="container mt-5 mb-5">
  <div class="row">
    <div class="col-md-12">
      <div class="d-flex flex-row justify-content-between align-items-center filters">
        <h6>Listado de noticias</h6>
        <div class="right-sort">
          <div class="sort-by"><span class="mr-1">Sort by:</span><a href="#">Most popular</a><i class="fa fa-angle-down ml-1"></i><button class="btn btn-outline-dark btn-sm ml-3 filter" type="button">Filters&nbsp;<i class="fa fa-flask"></i></button></div>
        </div>
      </div>
    </div>
  </div>
  <div class="row mt-1">
    <% for(Noticia p: noticias)
    {%>
    <div class="col-md-4">
      <div class="p-card bg-white p-2 rounded px-3">
        <h5 class="mt-2">
          <a href="<%=request.getContextPath()%>/NoticiaServlet?title=<%=p.getTitle() %>"> <%= p.getIdNoticia() + ".\t"+ p.getTitle() %> </a>
        </h5>
        <span class="badge badge-danger py-1 mb-2"><%= p.getByline()  %></span>
        <% for(Comentario c: p.getComentarios())
        {%>
          <span class="badge badge-pill badge-secondary d-block mb-1"><%= c.getAutor()%></span>
          <span class="d-block mb-2"><%= c.getComentario()%></span>
        </span>
        <%}%>

        <div class="d-flex justify-content-between stats">
          <div><i class="fa fa-calendar-o"></i><span class="ml-2">1 days ago</span></div>
          <div class="d-flex flex-row align-items-center">
            <div class="profiles"><img class="rounded-circle" src="https://i.imgur.com/4nUVGjW.jpg" width="30"><img class="rounded-circle" src=" https://i.imgur.com/GHCtqgp.jpg" width="30"><img class="rounded-circle" src="https://i.imgur.com/UL0GS75.jpg" width="30"></div><span class="ml-3">12</span></div>
        </div>
      </div>
    </div>
    <%
      }
    %>
  </div>
</div>
</body>
</html>
