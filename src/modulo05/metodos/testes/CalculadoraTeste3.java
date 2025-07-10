package modulo05.metodos.testes;

import modulo05.metodos.dominio.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Double resultado = calc.divideDoisNumeros(10.0, 2.0);
        System.out.println(resultado);
    }
}
