package modulo04;

public class Arrays {
    public static void main(String[] args) {
        int [] idades = new int[3];     //  int [] idades cria um array chamado idades e new int[3] define o lenth do array.
        System.out.println(idades);    // ao imprimir o array idades, o que irá aparecer é um endereço de memória ex. I@6acbcfc0

        System.out.println(idades[0]); // irá imprimir o índice ou posição doarray, lembrando que começa com 0. Como o array foi
                                       // inicializado porém não foi atribuido nenhum valor, será impresso 0.

        idades[0] = 20;
        idades[1] = 30;                 // array [i] foi atribuido valores ao array
        idades[2] = 40;

        System.out.println(idades[0]);
        System.out.println(idades[1]);  // Agora ao imprimir será impresso os valores atribuidos 20, 30, 40
        System.out.println(idades[2]);

        String[] nomes = new String[3];
        nomes[0] = "Julian";
        nomes[1] = "Samuel";
        nomes[2] = "Thomas";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);         // lógica para percorrer o array e imprimir os dados.
        }

        String[] nomes2 = new String[2];
        nomes2[0] = "Edgard";
        nomes2[1] = "Giulia";

        for (String nome : nomes2){
            System.out.println(nome);     // for each também percorre o array e imprime os dados, porém sem o indice
        }
    }
}

