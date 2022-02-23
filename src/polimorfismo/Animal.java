package polimorfismo;

public abstract class Animal {

    private double peso;
    private int edad;

    public Animal(double peso, int edad) {
        this.peso = peso;
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void sonido();
}
