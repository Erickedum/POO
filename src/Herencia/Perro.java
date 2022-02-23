package Herencia;
public class Perro extends Animal{

    String raza;

    public Perro(int id, String nombre, int edad, String raza) {
        super(id, nombre, edad);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("El perro " + id + " de nombre " + nombre + " de raza " + raza + " puede ladrar");
    }

    @Override //notacion necesaria para heredar un metodo de una superclase
    public void correr() {
        System.out.println("El perro se llama " + nombre + "\nsu ID es " + id + "\ntiene " + edad + " años\ny puede correr.");
    }
}