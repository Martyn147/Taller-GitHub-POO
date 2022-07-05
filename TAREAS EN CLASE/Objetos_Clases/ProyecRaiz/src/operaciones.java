public class operaciones {
    private double a;
    private double b;
    private double c;

    public operaciones(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    private void getRaices(){
        double x1=(-b+Math.sqrt(obtenerDiscriminante()))/(2*a);
        double x2=(-b-Math.sqrt(obtenerDiscriminante()))/(2*a);
        System.out.println("solucion x1:");
        System.out.println(x1);
        System.out.println("solucion x2:");
        System.out.println(x2);
    }
    private void getRaiz() {
        double x=(-b)/(2*a);
        System.out.println("solucion x:");
        System.out.println(x);
    }
    private double obtenerDiscriminante(){
        return Math.pow(b,2)-(4*a+c);
    }
    private boolean tieneRaices(){
        return obtenerDiscriminante()>0;
    }
    private boolean tieneRaiz() {
        return obtenerDiscriminante() == 0;
    }
    public void calcular (){
        if (tieneRaices()) {
        }else if(tieneRaices()){
            getRaices();
        }else if(tieneRaiz()){
            getRaiz();
        }else{
            System.out.println("no tiene solucion");
        }
    }
}
