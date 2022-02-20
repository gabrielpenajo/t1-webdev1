package br.ufscar.dsw1.planado.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ufscar.dsw1.planado.model.Client;

public class ClientDAO extends DefaultDAO implements Cloneable {
    public boolean insertClient(Client client) throws SQLException {
        String sql = "INSERT INTO client (name, cpf, email, password, profile, gender, phone, birth) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        connect();
        
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, client.getName());
        statement.setString(2, client.getCPF());
        statement.setString(3, client.getEmailLogin());
        statement.setString(4, client.getPasswordLogin());

        return true;
    }
    
}
