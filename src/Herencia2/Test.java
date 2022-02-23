package Herencia2;

public class Test {
    public static void main(String[] args) {

        Empleado empleado = new Empleado(87463, "Erick", "Martinez", 27, 20000, 9999);
        Estudiante estudiante = new Estudiante(18745, "Claudia", "Gonzalez", 24, 9.4, 12488);
        System.out.println(empleado.toString());
        System.out.println(estudiante.toString());
    }
}
