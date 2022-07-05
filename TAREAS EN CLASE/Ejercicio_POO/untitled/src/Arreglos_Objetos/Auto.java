package Arreglos_Objetos;

public class Auto {

    private String marca;
    private int cilindraje;
    private int anio;
    private String color;
    private float km;
    private double precio;

    public Auto(String marca, int cilindraje, int anio, String color, float km, double precio) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.anio = anio;
        this.color = color;
        this.km = km;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /*Métodos especificos*/


}
