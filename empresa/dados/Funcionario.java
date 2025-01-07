package empresa.dados;
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}