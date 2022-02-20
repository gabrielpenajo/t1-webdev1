package br.ufscar.dsw1.planado.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract public class DefaultDAO {

    protected Connection jdbcConnection;

    public DefaultDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    protected void connect() throws SQLException {
        jdbcConnection =  DriverManager.getConnection(System.getenv("DATABASE_URI"),
                System.getenv("PLANADO_DATABASE_USER"),
                System.getenv("PLANADO_DATABASE_PASSWORD"));
    }

    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()){
            jdbcConnection.close();
        }
    }
}

