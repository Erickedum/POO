package Herencia;

public class TestAnimal {
    public static void main(String[] args) {
        Perro perro1 = new Perro(15874, "Pedro", 4, "Border C.");
        Gato gato1 = new Gato(13856, "Claudio", 6, 8);

        perro1.correr();
        perro1.ladrar();
        gato1.saltar();
        gato1.correr();
    }
}
