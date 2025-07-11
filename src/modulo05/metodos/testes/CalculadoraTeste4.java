package modulo05.metodos.testes;

import modulo05.metodos.dominio.Calculadora;

public class CalculadoraTeste4 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        calc.somarVarArgs(1,3,5,7,9);  // podemos passar como argumentos uma lista pre definida de array ou um varArgs qdo não sabemos a qtd exata de numeros como argumento.

    }
}
