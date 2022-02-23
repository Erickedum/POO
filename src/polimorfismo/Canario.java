package polimorfismo;

public class Canario extends Animal{

    private String groseria;

    public Canario(double peso, int edad, String groseria) {
        super(peso, edad);
        this.groseria = groseria;
    }

    @Override
    public void sonido() {
        System.out.println("El canario pesa " + getPeso() + " kilos,\n" +
                "tiene " + getEdad() + " años,\n" +
                "sabe decir " + groseria + " y tambien canta rancheras");
    }
}
