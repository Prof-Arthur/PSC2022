package departamento;

public class Gerente extends Funcionario { // Subclasse de Funcionario
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public void aumentarSalario(double perc){
        super.aumentarSalario(perc + 20);
    }
    
    @Override
    public String toString() {
        return "Gerente [departamento=" + this.departamento + "] " + super.toString();
    }
}
