package modulo05.modificadoesAcesso.test;

import modulo05.modificadoesAcesso.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Pedro");
        pessoa1.setIdade(-1);
        pessoa1.imprime();
    }
}
