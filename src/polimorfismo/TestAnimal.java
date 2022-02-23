package polimorfismo;

public class TestAnimal {
    public static void main(String[] args) {
        //Para aplicar polimorfismo se debe crear un objeto con el metodo constructor de subclase de tipo superclase
        //Es necesario utilizar las clases abstractas para llamar a los metodos mediante los objetos
        //el polimorfismo hace que la clase padre tome diferentes formas, segun sus clases hijas.
        Animal perro = new Perro(5.4, 5, 10);
        Animal gato = new Gato(2.1, 3, 8);
        Animal canario = new Canario(1.3, 2, "PUTO");

        perro.sonido();
        gato.sonido();
        canario.sonido();
    }
}
