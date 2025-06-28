package modulo03;

public class EstruturaCondicionalOperadorTernario {
    public static void main(String[] args) {
        // condição para verificar se é possível efetuar uma doação caso o salário seja maior que 5k

        int salario = 7000;
        String mensagemDoar = " Eu vou doar a quantia de R$500,00";
        String mensagemNãoDoar = " Infelizmente não tenho condições";

        // variável = condição ? resultado positivo : resultado negativo;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;
        System.out.println(resultado);

        // usando If else

//        if (salario > 5000) {
//            resultado = mensagemDoar;
//
//        } else {
//            resultado = mensagemNãoDoar;
//
//        }
//        System.out.println(resultado);

    }
}
