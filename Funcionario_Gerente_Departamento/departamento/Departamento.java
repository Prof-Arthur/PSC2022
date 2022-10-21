package departamento;

public class Departamento {
    
    private Funcionario[] funcionarios;
    
    private int qtd;
    private int max;
    
    public Departamento(int quantidadeDeFuncionarios) {
        this.funcionarios = new Funcionario[quantidadeDeFuncionarios];
        this.qtd = 0;
        this.max = quantidadeDeFuncionarios;
    }
    
    public void adicionarFuncionario(Funcionario funcionario) {
        if (this.qtd == this.max) {
            System.out.println("Não é mais possível adicionar funcionários");
            return;
        }
        this.funcionarios[this.qtd] = funcionario;
        this.qtd++;
    }
    
    public void aplicarAumento(double perc) {
        for (int i = 0; i < this.qtd; i++) {
            this.funcionarios[i].aumentarSalario(perc);
        }
    }
    
    @Override
    public String toString(){
        String saida = "Departamento:\n";
        
        for (int i = 0; i < this.qtd; i++) {
            saida = saida + "\t" + this.funcionarios[i].toString() + "\n";
        }
        
        return saida;
    }
    
}
