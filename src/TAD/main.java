package TAD;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        System.out.println("x-x-x-x-xx-x-x-x-xx-x-x-x-x--x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x--x");
        System.out.println("🎵 BEM-VINDO AO GERENCIADOR DE PLAYLIST 🎵");
        System.out.println("x-x-x-x-xx-x-x-x-xx-x-x-x-x--x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x--x");

        System.out.println("Qual a capacidade da playlist?");
        int capacidade = sc.nextInt();

        PlayListMusical lista = new PlayListMusical(capacidade);

        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1.  Adicionar Música ao Final");
            System.out.println("2.  Adicionar Música no Início");
            System.out.println("3.  Inserir Música em Posição");
            System.out.println("4.  Inserir Música Ordenada");
            System.out.println("5.  Remover Última Música");
            System.out.println("6.  Remover Primeira Música");
            System.out.println("7.  Remover por Posição");
            System.out.println("8.  Remover por ID da Música");
            System.out.println("9.  Buscar Posição da Música");
            System.out.println("10. Obter ID da Música pela Posição");
            System.out.println("11. Alterar ID da Música");
            System.out.println("12. Exibir Informações da Playlist");
            System.out.println("13. EXIBIR PLAYLIST");
            System.out.println("0.  Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("ID da Música: ");
                    lista.addLast(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("ID da Música: ");
                    lista.addFirst(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Posição: ");
                    int idx = sc.nextInt();
                    System.out.print("ID da Música: ");
                    lista.insertAT(idx, sc.nextInt());
                }
                case 4 -> {
                    System.out.print("ID da Música: ");
                    lista.addSorted(sc.nextInt());
                }
                case 5 -> lista.removeLast();
                case 6 -> lista.removeFirst();
                case 7 -> {
                    System.out.print("Posição: ");
                    lista.removeAt(sc.nextInt());
                }
                case 8 -> {
                    System.out.print("ID da Música: ");
                    lista.remove(sc.nextInt());
                }
                case 9 -> {
                    System.out.print("ID da Música: ");
                    int pos = lista.find(sc.nextInt());
                    System.out.println(pos != -1 ? "Posição: " + pos : "Música não encontrada");
                }
                case 10 -> {
                    System.out.print("Posição: ");
                    int val = lista.get(sc.nextInt());
                    if(val != -1) System.out.println("ID da Música: " + val);
                }
                case 11 -> {
                    System.out.print("Posição: ");
                    int idx = sc.nextInt();
                    System.out.print("Novo ID da Música: ");
                    lista.set(idx, sc.nextInt());
                }
                case 12 -> {
                    System.out.println("Quantidade de Músicas: " + lista.count());
                    System.out.println("Vazia: " + lista.isEmpty() + " | Cheia: " + lista.isFull());
                }
                case 13 -> lista.display();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}