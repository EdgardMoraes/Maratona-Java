package modulo02;

public class Operadores {
    public static void main(String[] args) {
        // operadores aritiméticos - soma, subtração, multiplicação e divisão.

        int numero01 = 10;
        int numero02 = 20;
        int resultadA = numero01 + numero02;
        int resultadB = numero01 - numero02;
        int resultadC = numero01 * numero02;
        int resultadD = numero02 / numero01;
         System.out.println(resultadA);
         System.out.println(resultadB);
         System.out.println(resultadC);
         System.out.println(resultadD);

         // operador resto ( muito utilziado para saber se o número é par ou impar)

        int resto = 23 % 2;
        System.out.println(resto);

        // operadores lógicos <> <= >= == != ( sempre retornam valores booleanos)
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        System.out.println("isDezMaiorQueVinte = " + isDezIgualVinte);
        System.out.println("isDezMenorQueVinte = " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte = " + isDezIgualVinte);

        // AND && e OR ||

        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario <= 3500;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 1000;
        float valorPlayStation = 5000;

        boolean isPlayStationCompravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupanca >= valorPlayStation;
        System.out.println("isPlayStationCompravel = " + isPlayStationCompravel);



    }
}
