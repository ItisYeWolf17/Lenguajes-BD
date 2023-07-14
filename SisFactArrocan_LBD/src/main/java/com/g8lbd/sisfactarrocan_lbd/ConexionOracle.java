/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8lbd.sisfactarrocan_lbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gblan
 */
public class ConexionOracle {
    
   private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:orclbd";
    private final String user = "admin_arro";
    private final String password = "arro123";
    private Connection connection;

    public ConexionOracle() {
        this.connection = null;
    }

    public Connection linkBD() {
        try {
            Class.forName(driver);
            this.connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }

        return this.connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión");
            e.printStackTrace();
        }
    }
}
    
    
