package abstraccion;

public abstract class Jugador {

    private String nombre;
    private int edad;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void jugar();
    //El metodo abstracto no puede llevar cuerpo en la clase padre, solo en las clases hijas.
    //El metodo abstracto es obligatorio llamarlo en las clases hijas.

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
