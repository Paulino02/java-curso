interface servivo {
    public void breathe(); // abstract method
}

interface Animal extends servivo {
    String DESCRICAO = "Animal é um servivo importante"; // constant
    void eat(); // abstract method
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void breathe() {}
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating");
    }
    public void breathe() {}
}

public class testinterface {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();

        System.out.println("descrição da interface: " + Animal.DESCRICAO);
    }
}