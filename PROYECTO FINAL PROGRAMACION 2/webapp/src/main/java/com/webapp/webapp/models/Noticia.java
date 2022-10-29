package com.webapp.webapp.models;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
    private int idNoticia;
    private String title;
    private String abstractt;
    private String byline;
    private String url;

    private List<Comentario> comentarios;
    public Noticia() {
        comentarios = new ArrayList<>();
    }

    public Noticia(String title, String abstractt, String byline, String url) {
        this.title = title;
        this.abstractt = abstractt;
        this.byline = byline;
        this.url = url;
        comentarios = new ArrayList<>();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractt() {
        return abstractt;
    }

    public void setAbstractt(String abstractt) {
        this.abstractt = abstractt;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(int idNoticia) {
        this.idNoticia = idNoticia;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Noticia{");
        sb.append("title='").append(title).append('\'');
        sb.append(", abstractt='").append(abstractt).append('\'');
        sb.append(", byline='").append(byline).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
