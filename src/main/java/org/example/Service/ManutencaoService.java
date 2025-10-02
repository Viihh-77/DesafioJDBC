package org.example.Service;

import org.example.View.ManutencaoView;

import java.sql.SQLException;
import java.util.Scanner;

public class ManutencaoService {

    static Scanner input = new Scanner(System.in);

    public static void menu() throws SQLException {
        boolean sair = false;

        while (!sair) {

            System.out.println(" ");
            System.out.println("|   SISTEMA DE GESTÃO DE ALMOXARIFADO INDUSTRIAL   |");
            System.out.println("|                                                  |");
            System.out.println("| 1 - Cadastrar Fornecedor                         |");
            System.out.println("| 2 - Cadastrar Material                           |");
            System.out.println("| 3 - Registrar Nota de Entrada                    |");
            System.out.println("| 4 - Criar Requisição de Material                 |");
            System.out.println("| 5 - Atender Requisição                           |");
            System.out.println("| 6 - Cancelar Requisição                          |");
            System.out.println("|                                                  |");
            System.out.println("| 0 - Sair                                         |");
            System.out.println(" ");
            int opcaoMenu = input.nextInt();
            input.nextLine();

            switch (opcaoMenu) {

                case 1 -> {
                    ManutencaoView.cadastrarFornecedor();
                }

                case 2 -> {
                    ManutencaoView.cadastrarMaterial();
                }

                case 3 -> {
                    ManutencaoView.registrarNotaEntrada();
                }
            }

        }
    }

}
