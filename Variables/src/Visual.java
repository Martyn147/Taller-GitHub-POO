import javax.swing.*;
import java.util.Scanner;

public class Visual {

    //Declaracion de las diferentes variable
    private int nentero;
    private short nShort;
    private byte nByte;
    private long nLong;

    private  double nDouble;

    public Visual(int nentero, short nShort, byte nByte, long nLong,  double nDouble) {
        this.nentero = nentero;
        this.nShort = nShort;
        this.nByte = nByte;
        this.nLong = nLong;
        this.nDouble = nDouble;
    }

    public int getNentero() {
        return nentero;
    }

    public void setNentero(int nentero) {
        this.nentero = nentero;
    }

    public short getnShort() {
        return nShort;
    }

    public void setnShort(short nShort) {
        this.nShort = nShort;
    }

    public byte getnByte() {
        return nByte;
    }

    public void setnByte(byte nByte) {
        this.nByte = nByte;
    }

    public long getnLong() {
        return nLong;
    }

    public void setnLong(long nLong) {
        this.nLong = nLong;
    }





    public double getnDouble() {
        return nDouble;
    }

    public void setnDouble(double nDouble) {
        this.nDouble = nDouble;
    }

    public void CasteoDatos(){

        int op;
        boolean salir=true;
        int num=0;

        Scanner teclado=new Scanner(System.in);

        while (salir==true){

            op=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la calculadora\n" +
                    "1. Transformar a entero\n" +
                    "2. Transformar a short\n" +
                    "3. Transformar a Byte\n" +
                    "4. Transformar a Long\n" +
                    "5. Transformar a Float\n" +
                    "6. Transformar a Double\n" +
                    "7. Salir" +
                    "Dijite un opcion: "));
            switch (op){

                case 1:
                    num=Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero: "));

                    nentero=(int)num;
                    if (nentero==num){

                        JOptionPane.showInputDialog("El numero se a convetido en entero");
                    }
                    else {

                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    salir=false;
                    break;
            }
        }




    }

}
