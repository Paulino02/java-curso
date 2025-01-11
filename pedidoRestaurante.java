interface pedidoRestaurantee {
    void adicionarItem(String item, double preco);
    void calcularTotal();
}

class Pedido implements pedidoRestaurantee {
    private double total = 0;

    public void adicionarItem(String item, double preco) {
        System.out.println("Adicionando item: " + item + " - R$ " + preco);
        total += preco;
    }

    public void calcularTotal() {
        System.out.println("Total do pedido: R$ " + total);
    }
}

public class pedidoRestaurante {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.adicionarItem("Hamburguer", 10.0);
        p.adicionarItem("Refrigerante", 5.0);
        p.calcularTotal();
    }
}