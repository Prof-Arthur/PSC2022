package departamento;

public class Funcionario { // Superclasse

    private String nome;
    private double salario; 

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void aumentarSalario(double perc) {
        this.salario += this.salario * perc / 100.;
    }
    
    @Override
    public String toString() {
        return "Funcionario [nome=" + this.nome + ", salario=" + this.salario + "]";
    }
    
}
