package co.mateusgil;

import java.util.Scanner;

public class app {
    int andarAtual = 0;
    int totAndares;
    int capacidade;
    int num = 0;
    int menu;
    Scanner ler = new Scanner(System.in);

    public void inicia() {
        System.out.println("Capacidade maxima de pessoas no elevador: ".toUpperCase());
        capacidade = ler.nextInt();
        System.out.println("Total de andares no predio: ".toUpperCase());
        totAndares = ler.nextInt();
        while (menu != 5) {
            System.out.println("[1]entrar  [2]sair  [3]subir andar  [4]descer andar  [5]terminar: ".toUpperCase());
            int menu = ler.nextInt();
            if (menu == 1)
                entrar();

            if (menu == 2)
                sair();

            if (menu == 3)
                subir();

            if (menu == 4)
                descer();

            if (menu == 5)
                break;
        }
    }

    private void subir() {
        if (num != 0) {
            if (andarAtual != totAndares && andarAtual <= totAndares) {
                System.out.println("O elevador esta no " + andarAtual + " andar.");
                System.out.println("O predio possui " + totAndares + " andares.");
                System.out.println("Deseja subir quantos andares: ".toUpperCase());
                int subirAndar = ler.nextInt();
                andarAtual = andarAtual + subirAndar;
                System.out.println("O elevador esta no " + andarAtual + " andar.");
            } else
                System.out.println("O elevador ja esta no ultimo andar.");
            System.out.println("O predio possui " + totAndares + " andares.");
        } else {
            System.out.println("O elevador nao pode subir pois nao possui passageiros.");
        }
    }

    private void descer() {
        if (num != 0) {
            if (andarAtual != 0) {
                System.out.println("Deseja descer quantos andares: ".toUpperCase());
                int descerAndar = ler.nextInt();
                andarAtual = andarAtual - descerAndar;
                System.out.println("O elevador esta no " + andarAtual + " andar.");
                System.out.println("O predio possui " + totAndares + " andares.");
            } else {
                System.out.println("O elevador ja esta no terreo.");
            }

        } else {
            System.out.println("O elevador nao pode descer pois nao tem passageiro.");
        }
    }

    private void sair() {
        if (num != 0) {
            System.out.println("Numero de passageiros que vao sair: ".toUpperCase());
            int numSai = ler.nextInt();
            num = num - numSai;
            System.out.println("Numero de passageiros: " + num);
            System.out.println("Capacidade maxima: " + capacidade);
        }
    }


    private void entrar() {
        if (num < capacidade) {
            num = num + 1;
            System.out.println("Numero de passageiros: " + num);
            System.out.println("Capacidade Maxima: " + capacidade);
        } else {
            System.out.println("O elevador esta cheio !!!".toUpperCase());
        }
    }
}
