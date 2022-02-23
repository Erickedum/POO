package abstraccion;

public class JugadorTenis extends Jugador{
    public JugadorTenis(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void jugar() {
        System.out.println("El jugador " + getNombre() + " tiene " + getEdad() + " años");
        System.out.println("El jugador de tenis golpea la pelota con su raqueta");
    }
}
