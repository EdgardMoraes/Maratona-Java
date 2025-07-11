package modulo05.metodos.testes;

import modulo05.metodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Antonia";
        funcionario.idade = 38;
        funcionario.salario = new Double []{4508.0, 4507.0, 5980.0};

        funcionario.imprimir();
        funcionario.mediaSalario();

    }
}
