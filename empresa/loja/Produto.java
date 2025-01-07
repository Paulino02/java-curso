package empresa.loja;
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nomeInit, double precoInit, int quantidadeEmEstoqueInit) {
        nome = nomeInit;
        preco = precoInit;
        quantidadeEmEstoque = quantidadeEmEstoqueInit;
    }
    public String ExibirInfo() {
        return "Nome: " + nome + ", Preco: " + preco + ", Quantidade em estoque: " + quantidadeEmEstoque;
    }
}