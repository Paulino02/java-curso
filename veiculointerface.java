interface veiculo {
   public void iniciar();
   public void parar();
   default public void buzinar() {
       System.out.println("Buzinando!");
   }
}

class carro implements veiculo {
    public void iniciar() {
        System.out.println("Carro iniciando");
    }

    public void parar() {
        System.out.println("Carro parando");
    }
}

class caminhao implements veiculo {
    public void iniciar() {
        System.out.println("Caminhão iniciando");
    }

    public void parar() {
        System.out.println("Caminhão parando");
    }
}

public class veiculointerface {
    public static void main(String[] args) {
        carro c = new carro();
        c.iniciar();
        c.parar();
        c.buzinar();

        caminhao cam = new caminhao();
        cam.iniciar();
        cam.parar();
        cam.buzinar();
    }
}