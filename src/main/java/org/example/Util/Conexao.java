package org.example.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static final String URL = "jdbc:mysql://localhost:3356/industrialSystem?useSSL=false&serverTimezone=UTC";
    public static final String ROOT = "root";
    public static final String PASSWORD = "mysqlPW";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, ROOT, PASSWORD);
    }
}
