<%@ page import="com.webapp.webapp.models.Noticia" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Optional" %>
<%@ page import="com.webapp.webapp.models.Comentario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Noticia noticia = (Noticia) request.getAttribute("noticia");
    List<Comentario> comentarios = (List<Comentario>) request.getAttribute("comentarios");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Astro Motion by TemplateMo</title>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@300;400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/slick.css" type="text/css" /> 
    <link rel="stylesheet" href="css/templatemo-style.css">
</head>
<body>
    <video autoplay muted loop id="bg-video">
        <source src="video/gfp-astro-timelapse.mp4" type="video/mp4">
    </video>
    <div class="page-container">
      <div class="container tm-content-container">
        <ul class="cd-hero-slider mb-0 py-5">
          <li class="px-3" data-page-no="1">
            <div class="page-width-1 page-left">
              <div class="d-flex position-relative tm-border-top tm-border-bottom intro-container">
                <div class="intro-left tm-bg-dark">
                  <h2 class="mb-4"><%=noticia.getTitle() %></h2>
                    <p class="mb-4">
                        <%=noticia.getAbstractt() %> </p>
                    <p class="mb-4">
                        <%=noticia.getByline() %> </p>
                </div>
                <div class="intro-right">
                  <img src=<%=noticia.getUrl() %> alt="Image" class="img-fluid intro-img-1">
                </div>
                <div class="circle intro-circle-1"></div>
                <div class="circle intro-circle-2"></div>
                <div class="circle intro-circle-3"></div>
                <div class="circle intro-circle-4"></div>
              </div>
              <div class="text-center">
                <a href="NoticiaServlet" data-page-no="2" class="btn btn-primary tm-intro-btn tm-page-link">
                  Back
                </a>
              </div>            
            </div>            
          </li>
        </ul>
    </div>
  </div>
    <section>
        <div class="container">
            <div class="row">
                <div class="col-sm-5 col-md-6 col-12 pb-4">
                    <h1>Comments</h1>
                    <% for(Comentario p: comentarios){%>
                    <div class="comment mt-4 text-justify float-left">
                        <img src="https://i.imgur.com/CFpa3nK.jpg" alt="" class="rounded-circle" width="40" height="40">
                        <h4><%=p.getAutor()%></h4>
                        <br>
                        <p><%=p.getComentario()%></p>
                    </div>
                    <%}%>
                </div>
                <div class="col-lg-4 col-md-5 col-sm-4 offset-md-1 offset-sm-1 col-12 mt-4">
                    <form id="algin-form" action="<%=request.getContextPath()%>/ComentarioServlet" method="post">
                        <div class="form-group">
                            <h4>Leave a comment</h4>
                            <label for="comentario">Message</label>
                            <textarea name="comentario" id="comentario" cols="30" rows="5" class="form-control" style="background-color: black;"></textarea>
                        </div>
                        <div class="form-group">
                            <label for="autor">Name</label>
                            <input type="text" name="autor" id="autor" class="form-control">
                        </div>
                        <div class="form-group">
                            <button type="submit" id="post" class="btn btn btn-primary tm-intro-btn tm-page-link">Post Comment </button>
                        </div>
                        <input type="hidden" name="idNoticia" value = <%=noticia.getIdNoticia()%>>
                    </form>
                </div>
            </div>
            <div class="container-fluid">
                <footer class="row mx-auto tm-footer">
                    <div class="col-md-6 px-0">

                    </div>
                    <div class="col-md-6 px-0 tm-footer-right">

                    </div>
                </footer>
            </div>
        </div>
    </section>

  <!-- Preloader, https://ihatetomatoes.net/create-custom-preloading-screen/ -->
  <div id="loader-wrapper">            
    <div id="loader"></div>
    <div class="loader-section section-left"></div>
    <div class="loader-section section-right"></div>
  </div>  
  <script src="js/jquery-3.5.1.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/slick.js"></script>
  <script src="js/templatemo-script.js"></script>
</body>
</html>