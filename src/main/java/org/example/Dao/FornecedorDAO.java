package org.example.Dao;

import com.mysql.cj.x.protobuf.MysqlxSql;
import org.example.Model.Fornecedores;
import org.example.Util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FornecedorDAO {

    public static void cadastrarFornecedor(Fornecedores fornecedores) throws SQLException {
        String query = """
                INSERT INTO Fornecedor
                (nome, cnpj)
                VALUES
                (?,?)
                """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, fornecedores.getNome());
            stmt.setString(2, fornecedores.getCnpj());
            stmt.executeUpdate();
        }
    }

    public boolean verificaCnpj (Fornecedores fornecedores) throws SQLException {
        String query = """
                SELECT COUNT(0) AS linhas
                FROM Fornecedor
                WHERE cnpj = ?
                """;

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, fornecedores.getCnpj());
            ResultSet rs = stmt.executeQuery();

            if (rs.next() && rs.getInt("linhas") > 0) {
                return true;
            }
        }

        return false;

    }

    public static boolean verificaFornecedor (int idFornecedor) throws SQLException {
        String query = """
                SELECT COUNT(0) AS linhas
                FROM Fornecedor
                WHERE id = ?
                """;

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idFornecedor);
            ResultSet rs = stmt.executeQuery();

            if (rs.next() && rs.getInt("linhas") > 0) {
                return true;
            }
        }

        return false;

    }

}
