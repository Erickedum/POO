package Herencia2;

public class Estudiante extends Persona{

    private double calificaciones;
    private int idEstudiante;

    public Estudiante(int id, String nombre, String apellido, int edad, double calificaciones, int idEstudiante) {
        super(id, nombre, apellido, edad);
        this.calificaciones = calificaciones;
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                super.toString() +
                "calificaciones=" + calificaciones +
                ", idEstudiante=" + idEstudiante;
    }
}
