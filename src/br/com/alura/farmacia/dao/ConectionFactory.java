package br.com.alura.farmacia.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConectionFactory {
    public Connection recuperarConexao(){
        try {

        return createDateSource().getConnection();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    private HikariDataSource createDateSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/farmacia");
        config.setUsername("renato");
        config.setPassword("senac");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}
