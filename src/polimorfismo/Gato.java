package polimorfismo;

public class Gato extends Animal{

    private int vidas;

    public Gato(double peso, int edad, int vidas) {
        super(peso, edad);
        this.vidas = vidas;
    }

    @Override
    public void sonido() {
        System.out.println("El gato pesa " + getPeso() + " libras,\n" +
                "tiene " + getEdad() + " años,\n" +
                "le quedan " + vidas  + " vidas y no sabe maullar\n");
    }
}
