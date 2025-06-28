package modulo03;

public class EstruturaCondicionalExercicio {
    public static void main(String[] args) {

        // Dado um determinado Salário, qual o valor que temos que pagar de imposto anual conforme tabela abaixo:
//        Tax Rate %
//        Taxable Income	        Tax Rate %
//        0 to 34.712 €	            9,70%
//        34.713 to 68.507 €	     37,35%
//         Over 68.508 €           49,50%

        double salarioAnual = 90.000;
        double taxaImposto;
        double salarioLiquido;

        if (salarioAnual < 34.712) {
            taxaImposto = 9.70 ;
            salarioLiquido = salarioAnual - (salarioAnual * (taxaImposto/100));

        } else if (salarioAnual >= 34.713 && salarioAnual <= 68.507) {
            taxaImposto = 37.35 ;
            salarioLiquido = salarioAnual - (salarioAnual * (taxaImposto/100));
        }else {
            taxaImposto = 49.50;
            salarioLiquido = salarioAnual - (salarioAnual * (taxaImposto/100));
        }
        System.out.println("Total de imposto a ser descontado: " + taxaImposto + "%");
        System.out.println(" Salario a receber com os descontos: " + salarioLiquido );
    }
}
