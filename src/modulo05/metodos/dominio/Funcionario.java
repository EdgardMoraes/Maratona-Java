package modulo05.metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public Double[] salario;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (Double salario : this.salario) {
            System.out.println("Salario: " + salario);
        }
    }

    public void mediaSalario(){
        Double totalSalario = 0.0;
        Double mediaSalario = 0.0;
        for (int i=0; i<this.salario.length; i++){
            totalSalario += this.salario[i];
            mediaSalario = totalSalario / this.salario.length;
        }
        System.out.println("Média dos salarios: " + mediaSalario);
    }

}
