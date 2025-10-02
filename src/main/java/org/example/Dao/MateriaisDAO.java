package org.example.Dao;

import org.example.Main;
import org.example.Model.Materias;
import org.example.Util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MateriaisDAO {

    public static void cadastrarMaterial(Materias materias) throws SQLException {
        String query = """
                INSERT INTO Material
                (nome, unidade, estoque)
                VALUES
                (?,?,?)
                """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, materias.getNome());
            stmt.setString(2, materias.getUnidade());
            stmt.setDouble(3, materias.getEstoque());
            stmt.executeUpdate();
        }
    }

    public boolean verificaMaterial(Materias materias) throws SQLException {
        String query = """
                SELECT COUNT(0) AS linhas
                FROM Material
                WHERE nome = ?
                """;

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, materias.getNome());
            ResultSet rs = stmt.executeQuery();

            if (rs.next() && rs.getInt("linhas") > 0) {
                return true;
            }
        }

        return false;

    }

    public static List<Materias> listarMateriais() throws SQLException {
        List<Materias> materiais = new ArrayList<>();
        String query = """
                SELECT id, nome, unidade, quantidade
                FROM Materiais
                """;

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Materias materias = new Materias(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("unidade"),
                        rs.getDouble("quantidade")
                );

                materiais.add(materias);

            }
        }

        return materiais;

    }

    public static boolean verificaIDMaterial(int idMaterial) throws SQLException {
        String query = """
                SELECT COUNT(0) AS linhas
                FROM Material
                WHERE id = ?
                """;

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idMaterial);
            ResultSet rs = stmt.executeQuery();

            if (rs.next() && rs.getInt("linhas") > 0) {
                return true;
            }
        }

        return false;

    }

}
