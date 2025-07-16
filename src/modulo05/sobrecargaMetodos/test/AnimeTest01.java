package modulo05.sobrecargaMetodos.test;

import modulo05.sobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Dragon Ball Z","TV", 12, "ação");
//        anime.setNome("Dragon Ball Z");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);

        anime.imprime();

    }
}
