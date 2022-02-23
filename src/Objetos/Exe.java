package Objetos;

public class Exe {
    public static void main(String[] args) {
        Lavadora lavadora2 = new Lavadora(1, 123488, "Clasico", "Blanco", "uirpul", 150.00);
        Lavadora lavadora1 = new Lavadora(2, 12345, "Oreo", "Azul", "Mabe", 100.00);
        System.out.println(lavadora1.toString());
        System.out.println(lavadora2.toString());
        lavadora1.setMarca("nueva");
        System.out.println(lavadora1.getMarca());
    }
}
