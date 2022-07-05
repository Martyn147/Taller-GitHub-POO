package IMC_MÉTODOS;

public class imc {

    private double peso;
    private double altura;

    public imc(double ppeso,double paltura){

        altura=paltura;
        peso=ppeso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override

    public String toString(){

        return "La persona de peso "+peso+" y con una altura de "+altura+" ";
    }
}
