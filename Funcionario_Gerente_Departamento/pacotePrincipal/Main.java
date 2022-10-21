package pacotePrincipal;

import departamento.Departamento;
import departamento.Funcionario;
import departamento.Gerente;
// import departamento.*; // importa tudo que está no pacote departamento


public class Main {
    public static void main(String[] args) {
        Departamento departa = new Departamento(3);
        
        Funcionario func1 = new Funcionario("João", 10000);
        Gerente geren = new Gerente("Francisco", 50000, "Vendas");
        
        
        departa.adicionarFuncionario(func1);
        departa.adicionarFuncionario(new Funcionario("Alberto", 20000));
        departa.adicionarFuncionario(geren);
        
        System.out.println(departa); // Sem escrever explicitamento o .toString()
        
        departa.aplicarAumento(10);
        
        System.out.println(departa); // Sem escrever explicitamento o .toString()
        
        System.out.println("Checagem de tipos:");
        
        System.out.println(func1 instanceof Funcionario);
        System.out.println(func1 instanceof Gerente);
        System.out.println(geren instanceof Funcionario);
        System.out.println(geren instanceof Gerente);
    }
}

