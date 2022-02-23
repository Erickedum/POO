package Herencia;
public class Animal {

    protected int id;
    protected String nombre;
    protected int edad;

    public void correr(){
        System.out.println();
    }

    public void comer(){
        System.out.println("Este animal come");
    }

    public Animal(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
}
