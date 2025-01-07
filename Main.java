public class Bolo {
    int quantidadeAcucar;

    public static void main(String[] args) {
        Bolo bolodemorango = new Bolo(); //objeto

        bolodemorango.quantidadeAcucar = 150;

        Bolo bolodebaunilha = new Bolo();

        bolodebaunilha.quantidadeAcucar = 111;

        system.Out.println("quantidade de açucar no bolo de chocolate: " + bolodemorango.quantidadeAcucar);
        system.Out.println("quantidade de açucar no bolo de baunilha: " + bolodebaunilha.quantidadeAcucar);
    }
}