package modulo05.construtores.test;

import modulo05.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 15, "ação" );
        anime.imprime();
    }
}
