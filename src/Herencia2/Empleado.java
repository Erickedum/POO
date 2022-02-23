package Herencia2;

public class Empleado extends Persona{

    private int sueldo;
    private int idEmpleado;

    public Empleado(int id, String nombre, String apellido, int edad, int sueldo, int idEmpleado) {
        super(id, nombre, apellido, edad);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                super.toString() +
                "sueldo=" + sueldo +
                ", idEmpleado=" + idEmpleado;
    }
}
