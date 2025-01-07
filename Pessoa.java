// Definição da classe
public class Carro {
    // Atributos da classe
    private String marca;
    private int ano;
    private String modelo;

    // Construtor da classe
    public Carro(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    // Construtor padrão, sem parametros

    public Carro(){}
    // Construtor que só recebe 2 parametros
    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }    

    // Métodos getter e setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String nome) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int idade) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String cidade) {
        this.modelo = modelo;
    }



    // Método para exibir informações da pessoa
    public void exibirInfo() {
        System.out.println("marca: " + marca);
        System.out.println("ano: " + ano);
        System.out.println("modelo: " + modelo);
    }

    // Método principal para teste
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Carro carro = new Carro("fiat", 2001, "uno");

        // criando outro objeto da classe pessoa

        Carro carro2 Carro ("fiat", 2001, "palio");

        // Chamando métodos do objeto
        pessoa.exibirInfo();
        pessoa2.exibirInfo();
    }
}