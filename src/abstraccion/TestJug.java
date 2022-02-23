package abstraccion;

public class TestJug {
    public static void main(String[] args) {
        Jugador jugador = new JugadorFut("Erick", 27);
        Jugador jugador2 = new JugadorTenis("Eduardo", 30);

        jugador.jugar();
        jugador2.jugar();
    }
}
