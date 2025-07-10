package modulo05.classes.teste;

import modulo05.classes.Dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Wolksvagen";
        carro1.ano = 1969;

        carro2.nome = "Fusion";
        carro2.modelo = "Ford";
        carro2.ano = 2025;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
