package SistemaAvisos;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAvisos {
    private ArrayList<Aviso> avisos;
    private Scanner scanner;

    public SistemaAvisos() {
        avisos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha
            switch (opcao) {
                case 1:
                    adicionarAviso();
                    break;
                case 2:
                    listarAvisos();
                    break;
                case 3:
                    removerAviso();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n===== Sistema de Avisos da Faculdade =====");
        System.out.println("1. Adicionar Aviso");
        System.out.println("2. Listar Avisos");
        System.out.println("3. Remover Aviso");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarAviso() {
        System.out.print("Digite o título do aviso: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite a mensagem do aviso: ");
        String mensagem = scanner.nextLine();
        
        Aviso novoAviso = new Aviso(titulo, mensagem);
        avisos.add(novoAviso);
        
        System.out.println("Aviso adicionado com sucesso!");
    }

    private void listarAvisos() {
        if (avisos.isEmpty()) {
            System.out.println("Nenhum aviso encontrado.");
        } else {
            System.out.println("\nLista de Avisos:");
            for (int i = 0; i < avisos.size(); i++) {
                System.out.println("\nAviso " + (i + 1) + ":");
                System.out.println(avisos.get(i));
            }
        }
    }

    public static void main(String[] args) {
        SistemaAvisos sistema = new SistemaAvisos();
        sistema.iniciar();
    }
}
