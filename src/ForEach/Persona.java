package ForEach;
    //Se crea una clase normal, con variables, costructor y G&S.
public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private double altura;

    public Persona(int id, String nombre, int edad, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
