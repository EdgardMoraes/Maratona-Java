package modulo05.modificadoesAcesso.dominio;

//O que é Encapsulamento?
//Encapsulamento é um dos quatro pilares da programação orientada a objetos (junto com herança, polimorfismo e abstração).
//Ele serve para proteger os dados de um objeto, controlando como eles são acessados e modificados.
//
//Em outras palavras:
//Encapsulamento é esconder os detalhes internos de uma classe e expor apenas o necessário.
//Como funciona na prática?
//      No Java, o encapsulamento é implementado principalmente com:
//
//Modificadores de acesso (private, public, protected)
//
//Getters e Setters (métodos para acessar e alterar atributos)

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

}
