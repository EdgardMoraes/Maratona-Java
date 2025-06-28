package modulo03;

public class EstruturaCondicionalIfElse {
    public static void main(String[] args) {

        // idade < 15 = catergoria infantil
        // idade >= 15 e < 18 = categoria juvenil
        // idade >= 18  = catergoria adulto

        int idade = 17;

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria Juvenil");
        } else {
            System.out.println("categoria Adulto");
        }
    }

}
