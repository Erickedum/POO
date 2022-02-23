package abstraccion;

public class JugadorFut extends Jugador{
    public JugadorFut(String nombre, int edad) {
        super(nombre, edad);
    }

    //El metodo abstracto es obligatorio llamarlo en las clases hijas.
    @Override
    public void jugar() { //Aqui el metodo abstracto si tiene cuerpo y se le puede dar un comportamineto.
        System.out.println("El jugador " + getNombre() + " tiene " + getEdad() + " años");
        System.out.println("El jugador patea el balon y mete un gol");
    }
}
