package com.example.demo.springboot.Model.Connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import jakarta.annotation.PostConstruct;

@Configuration
public class DatabaseConnectionConfig {
    
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void verificarConexion(){
        try (Connection conn = dataSource.getConnection()){
            System.out.println("Conexion a la base de datos establecida de manera exitosa: " + conn.getMetaData().getURL());
        } catch (SQLException e){
            System.out.println("Ha ocurrido un error al conectarse con la base de Datos: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
