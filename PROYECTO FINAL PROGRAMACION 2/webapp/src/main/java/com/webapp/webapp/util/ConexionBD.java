package com.webapp.webapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {

    protected Connection conexion;

    private static final String url = "jdbc:mysql://localhost/webapp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "Pizzy2022*";

    public ConexionBD() {
        conexion = null;
        try {
            Class.forName(driver);

            conexion = DriverManager.getConnection(url, user, password);
            if(conexion != null)
            {
                System.out.println("Conexion establecida");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }

    public ConexionBD getConexionBD()
    {
        return (ConexionBD) conexion;
    }

    protected void cerrar(PreparedStatement ps) throws SQLException
    {
        if(ps != null)
        {
            ps.close();
        }
    }

    protected void cerrar(ResultSet rs) throws SQLException
    {
        if(rs != null)
        {
            rs.close();
        }
    }
}
