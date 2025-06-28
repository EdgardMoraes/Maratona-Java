package modulo03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturaCondicionalSwitcCase {
    public static void main(String[] args) {
        // Imprima um código que exiba o dia da semana começando com o Domingo = 1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero referente ao dia da semana: ");
        byte diaDaSemana = sc.nextByte();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Seu dia da semana é Domingo.");
                break;

            case 2:
                System.out.println("Seu dia da semana é Segunda.");
                break;

            case 3:
                System.out.println("Seu dia da semana é Terça.");
                break;

            case 4:
                System.out.println("Seu dia da semana é Quarta.");
                break;

            case 5:
                System.out.println("Seu dia da semana é Quinta.");
                break;

            case 6:
                System.out.println("Seu dia da semana é Sexta.");
                break;

            case 7:
                System.out.println("Seu dia da semana é Sabado.");
                break;

            default:
                System.out.println("Digite um dia válido.");

        }

    }
}
