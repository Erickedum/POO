package polimorfismo;

public class Perro extends Animal{
    private int manchas;

    public Perro(double peso, int edad, int manchas) {
        super(peso, edad);
        this.manchas = manchas;
    }

    @Override
    public void sonido() {
        System.out.println("El perro pesa " + getPeso() + " kilos,\n" +
                "tiene " + getEdad() + " años,\n" +
                "tiene " + manchas +  " manchas no sabe ladra\n");

    }
}
