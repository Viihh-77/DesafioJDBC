package org.example.View;

import org.example.Dao.FornecedorDAO;
import org.example.Dao.MateriaisDAO;
import org.example.Model.Fornecedores;
import org.example.Model.Materias;
import org.example.Model.NotaEntrada;
import org.example.Model.NotaEntradaItem;

import java.sql.Date;
import java.sql.SQLException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManutencaoView {

    static Scanner input = new Scanner(System.in);

    public static void cadastrarFornecedor() throws SQLException {

        System.out.println("Nome fornecedor: ");
        String nome = input.nextLine();

        System.out.println("CNPJ fornecedor: ");
        String cnpj = input.nextLine();

        if (!nome.isEmpty() && !cnpj.isEmpty()) {
            var fornecedores = new Fornecedores(nome, cnpj);
            var fornecedoresDAO = new FornecedorDAO();

            try {
                if (!fornecedoresDAO.verificaCnpj(fornecedores)) {
                    FornecedorDAO.cadastrarFornecedor(fornecedores);
                    System.out.println("Sucesso: Fornecedor cadastrado!");
                } else {
                    System.out.println("Erro: Fornecedor não cadastrado!");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Erro: Fornecedor não cadastrado no banco de dados");
            }
        } else {
            System.out.println("Erro: NOME e CNPJ obrigatórios!");
        }
    }

    public static void cadastrarMaterial() throws SQLException {

        System.out.println("Nome material: ");
        String nome = input.nextLine();

        System.out.println("Unidade de medida: ");
        String unidade = input.nextLine();

        System.out.println("Quantidade: ");
        double quantidade = input.nextDouble();
        input.nextLine();

        if (!nome.isEmpty() && quantidade >= 0) {
            var materiais = new Materias(nome, unidade, quantidade);
            var materiaisDAO = new MateriaisDAO();

            try {
                if (!materiaisDAO.verificaMaterial(materiais)) {
                    MateriaisDAO.cadastrarMaterial(materiais);
                    System.out.println("Sucesso: Material cadastrado!");
                } else {
                    System.out.println("Erro: Material não cadastrado!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Erro: Material não cadastrado no banco de dados!");
            }
        } else {
            System.out.println("Erro: NOME é obrigatório e QUANTIDADE não pode ser inferior a 0");
        }
    }

    public static void registrarNotaEntrada() throws SQLException {

        System.out.println("ID fornecedor: ");
        int idFornecedor = input.nextInt();

        if (!FornecedorDAO.verificaFornecedor(idFornecedor)) {
            System.out.println("Erro: Fornecedor não encontrado!");
            return;
        }

        LocalDate dataEntrada = LocalDate.now();

        NotaEntrada nota = new NotaEntrada(idFornecedor, dataEntrada);
        List<NotaEntradaItem> items = new ArrayList<>();
        List<Integer> materiaisAdicionados = new ArrayList<>();

        boolean adicionado = true;

        while (adicionado) {
            MateriaisDAO.listarMateriais();

            System.out.println("ID material: ");
            int inMaterial = input.nextInt();
            input.nextLine();

            boolean existe = false;

            if (materiaisAdicionados.contains(inMaterial)) {
                System.out.println("Erro: Material já cadastrado!");
                continue;
            }

            if (!MateriaisDAO.verificaIDMaterial(inMaterial)) {
                System.out.println("Erro: Material não encontrado!");
                continue;
            }
        }

    }
}
