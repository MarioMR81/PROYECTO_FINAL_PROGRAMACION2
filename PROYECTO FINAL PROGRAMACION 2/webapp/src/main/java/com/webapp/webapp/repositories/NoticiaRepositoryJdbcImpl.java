package com.webapp.webapp.repositories;

import com.webapp.webapp.models.Noticia;
import com.webapp.webapp.util.ConexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoticiaRepositoryJdbcImpl extends ConexionBD {

    private static final String idNoticias = "idNoticias";
    private static final String title = "title";
    private static final String abstractt = "abstract";
    private static final String byline = "byline";
    private static final String url = "url";
    
    private static final String SQL_SELECT_ALL = "Select * from Noticia";
    private static final String SQL_SELECT_COINCidNoticiasENCIAS = "Select * from Noticia WHERE " + idNoticias + " like ?"
            + " or " + title + " like? " + " or " + abstractt + " like? " + "or " + byline
            + " like? " + " or " + url + " like? ";

    private static final String SQL_SELECT_NOMBRE = "Select * from Noticia where " + title + " = ?";

    private static final String SQL_INSERT = "Insert into Noticia " + "(" + title + "," + abstractt + "," + byline + "," + url
            + ") VALUES (?,?,?,?)";

    private static final String SQL_DELETE = "Delete from Noticia where " + idNoticias + " = ?";
    private static final String SQL_DELETE_ALL = "Delete from Noticia";

    private static final String SQL_UPDATE = "Update Noticia set "+title + " = ?,"
            + abstractt + " = ?," + byline + " = ?," + url + " = ? where " + idNoticias + " = ?";

    public NoticiaRepositoryJdbcImpl() {
        super();
    }

    public List readALL() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List result = new ArrayList();

        ps = conexion.prepareCall(SQL_SELECT_ALL);

        rs = ps.executeQuery();

        while (rs.next()) {
            result.add(getObject(rs));
        }
        cerrar(ps);
        cerrar(rs);
        return result;

    }
    public Noticia getNoticia(String nombre) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Noticia noticia=null;

        ps = conexion.prepareCall(SQL_SELECT_NOMBRE);
        ps.setString(1, nombre);
        rs = ps.executeQuery();

        while (rs.next()) {
            noticia =  getObject(rs);
        }
        cerrar(ps);
        cerrar(rs);
        return noticia;

    }


    private Noticia getObject(ResultSet rs) throws Exception {
        Noticia dtoNoticia = new Noticia();

        dtoNoticia.setIdNoticia(rs.getInt(idNoticias));
        dtoNoticia.setTitle(rs.getString(title));
        dtoNoticia.setAbstractt(rs.getString(abstractt));
        dtoNoticia.setByline(rs.getString(byline));
        dtoNoticia.setUrl(rs.getString(url));
        ComentarioRepositoryJdbcImpl repositoryJdbc2= new ComentarioRepositoryJdbcImpl();
        dtoNoticia.setComentarios(repositoryJdbc2.getComentarios(dtoNoticia.getIdNoticia()));
        return dtoNoticia;

    }

    public void append(Noticia dto) throws SQLException {
        PreparedStatement ps;

        ps = conexion.prepareStatement(SQL_INSERT);

        ps.setString(1, dto.getTitle());
        ps.setString(2, dto.getAbstractt());
        ps.setString(3, dto.getByline());
        ps.setString(4, dto.getUrl());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void delete(Noticia dto) throws SQLException {
        PreparedStatement ps = null;
        ps = conexion.prepareStatement(SQL_DELETE);

        ps.setInt(1, dto.getIdNoticia());

        ps.executeUpdate();
        cerrar(ps);
    }

    public void deleteidNoticias(String id) throws SQLException {
        PreparedStatement ps = null;
        ps = conexion.prepareStatement(SQL_DELETE);

        ps.setString(1,id);

        ps.executeUpdate();
        cerrar(ps);
    }

    public void deleteAll() throws SQLException {
        PreparedStatement ps = null;
        ps = conexion.prepareStatement(SQL_DELETE_ALL);
        ps.executeUpdate();
        cerrar(ps);
    }

    public void update(Noticia dto) throws SQLException {

        PreparedStatement ps = null;

        ps = conexion.prepareStatement(SQL_UPDATE);

        ps.setString(1, dto.getTitle());
        ps.setString(2, dto.getAbstractt());
        ps.setString(3, dto.getByline());
        ps.setString(4, dto.getUrl());
        ps.setInt(5, dto.getIdNoticia());
        ps.executeUpdate();
        cerrar(ps);
    }
    public List buscarCoincidencias(String cadena) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List result = new ArrayList();
        String nuevaCadena = "%"+cadena+"%";
        ps = conexion.prepareCall(SQL_SELECT_COINCidNoticiasENCIAS);
        ps.setString(1, nuevaCadena);
        ps.setString(2, nuevaCadena);
        ps.setString(3, nuevaCadena);
        ps.setString(4, nuevaCadena);
        ps.setString(5, nuevaCadena);
        rs = ps.executeQuery();
        while (rs.next()) {
            result.add(getObject(rs));
        }
        cerrar(ps);
        cerrar(rs);
        return result;

    }
}
