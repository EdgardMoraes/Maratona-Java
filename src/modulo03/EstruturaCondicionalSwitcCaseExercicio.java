package modulo03;

import java.util.Scanner;

public class EstruturaCondicionalSwitcCaseExercicio {
    public static void main(String[] args) {
        /* Dado um valor de 1 a 7, imprima se o dia da semana é útil ou final de semana
        considerando Domingo como 1.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero referente ao dia da semana: ");
        byte diaDaSemana = sc.nextByte();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo é final de semana.");
                break;

            case 2:
                System.out.println("Segunda é dia útil.");
                break;

            case 3:
                System.out.println("Terça é dia útil.");
                break;

            case 4:
                System.out.println("Quarta é dia útil.");
                break;

            case 5:
                System.out.println("Quinta é dia útil.");
                break;

            case 6:
                System.out.println("Sexta é dia útil.");
                break;

            case 7:
                System.out.println("Sabado é final de seamana.");
                break;

            default:
                System.out.println("Digite um dia válido.");


        }
    }
}
