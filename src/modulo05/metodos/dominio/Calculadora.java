package modulo05.metodos.dominio;

public class Calculadora {
    public void soma() {
        System.out.println(10 + 10);
    }

    // criando um metodo com parametros
    public void multiplcaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public Double divideDoisNumeros(Double num1, Double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0.0;
        }
        return num1 / num2;
    }

    public void somarVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros){
            soma += num;
            System.out.println(soma);
        }

    }
}
