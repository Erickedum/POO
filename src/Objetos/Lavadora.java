package Objetos;

public class Lavadora {
    private int id;
    private int serie;
    private String modelo;
    private String color;
    private String marca;
    private double precio;

    public Lavadora(int id, int serie, String modelo, String color, String marca, double precio) {
        this.id = id;
        this.serie = serie;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "\nId=" + id +
                ",\nserie=" + serie +
                ",\n modelo='" + modelo + '\'' +
                ",\n color='" + color + '\'' +
                ",\n marca='" + marca + '\'' +
                ",\n precio=" + precio +
                '}';
    }
}
