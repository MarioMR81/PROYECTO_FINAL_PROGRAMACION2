package com.webapp.webapp.models;

public class Comentario {
    private int idComentario;
    private String autor;
    private String comentario;
    private int idNoticia;

    public Comentario(String autor, String comentario, int idNoticia) {
        this.autor = autor;
        this.comentario = comentario;
        this.idNoticia = idNoticia;
    }

    public Comentario() {
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(int idNoticia) {
        this.idNoticia = idNoticia;
    }
}
