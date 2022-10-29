package com.webapp.webapp.repositories;

import com.webapp.webapp.models.Comentario;
import com.webapp.webapp.util.ConexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComentarioRepositoryJdbcImpl extends ConexionBD {
    private static final String idComentario = "idComentario";
    private static final String autor = "autor";
    private static final String comentario = "comentario";
    private static final String idNoticia = "idNoticia";

    private static final String SQL_SELECT_ALL = "Select * from Comentario";

    private static final String SQL_SELECT_NOMBRE = "Select * from Comentario where " + idNoticia + " = ?";

    private static final String SQL_INSERT = "Insert into Comentario " + "(" + autor + "," + comentario + "," + idNoticia + ") VALUES (?,?,?)";

    private static final String SQL_DELETE = "Delete from Comentario where " + idComentario + " = ?";
    private static final String SQL_DELETE_ALL = "Delete from Comentario";


    public ComentarioRepositoryJdbcImpl() {
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
    public List getComentarios(int id) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List result = new ArrayList();

        ps = conexion.prepareCall(SQL_SELECT_NOMBRE);
        ps.setInt(1, id);
        rs = ps.executeQuery();

        while (rs.next()) {
            result.add(getObject(rs));
        }
        cerrar(ps);
        cerrar(rs);
        return result;

    }


    private Comentario getObject(ResultSet rs) throws SQLException {
        Comentario dtoComentario = new Comentario();

        dtoComentario.setIdComentario(rs.getInt(idComentario));
        dtoComentario.setAutor(rs.getString(autor));
        dtoComentario.setComentario(rs.getString(comentario));
        dtoComentario.setIdNoticia(rs.getInt(idNoticia));
        return dtoComentario;

    }

    public void append(Comentario dto) throws SQLException {
        PreparedStatement ps;

        ps = conexion.prepareStatement(SQL_INSERT);

        ps.setString(1, dto.getAutor());
        ps.setString(2, dto.getComentario());
        ps.setInt(3, dto.getIdNoticia());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void delete(Comentario dto) throws SQLException {
        PreparedStatement ps = null;
        ps = conexion.prepareStatement(SQL_DELETE);

        ps.setInt(1, dto.getIdNoticia());

        ps.executeUpdate();
        cerrar(ps);
    }

    public void deleteidComentario(String id) throws SQLException {
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

}
