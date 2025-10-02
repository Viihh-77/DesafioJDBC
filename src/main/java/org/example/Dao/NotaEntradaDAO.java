package org.example.Dao;

import org.example.Model.NotaEntrada;
import org.example.Util.Conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NotaEntradaDAO {

    public static void registrarNotaEntrada (NotaEntrada notaEntrada) throws SQLException {
        String query = """
                INSERT INTO NotaEntrada
                (idFornecedor, dataEntrada)
                VALUES
                (?,?)
                """;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, notaEntrada.getIdFornecedor());
            stmt.setDate(2, Date.valueOf(notaEntrada.getDataEntrada()));
            stmt.executeUpdate();
        }
    }

}
