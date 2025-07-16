package modulo05.metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private Double[] salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double[] getSalario() {
        return salario;
    }

    public void setSalario(Double[] salario) {
        this.salario = salario;
    }

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
