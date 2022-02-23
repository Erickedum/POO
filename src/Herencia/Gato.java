package Herencia;
public class Gato extends Animal{

    int vidas; //atributos de la clase

    public Gato(int id, String nombre, int edad, int vidas) { //Al metodo constructor heredado se le añade los atributos de esta clase.
        super(id, nombre, edad); //inicializando atributos heredados.
        this.vidas = vidas; //inicializando atributos de la clase.
    }

    public void saltar(){
        System.out.println("El gato " + nombre + " con ID " + id + " tiene " + vidas + " vidas y esta saltando");
    }

    @Override
    public void correr() {
        System.out.println("El gato se llama " + nombre + "\nsu ID es " + id + "\ntiene " + edad + " años\ny puede correr.");

    }
}
