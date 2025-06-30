package modulo03;

public class EstruturaDeRepeticaoWhileEDoWhile {
    public static void main(String[] args) {

        int contador = 10;
        while (contador < 10) {
            System.out.println(contador); // nunca será executado
            contador++;
        }
        ;
        do {
            System.out.println("Dentro do Do While"); // será executado uma vez
        }while (contador < 10);
    }
}
