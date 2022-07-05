package Arreglos_Objetos;

import java.util.Scanner;
import java.io.PrintWriter;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        float uno=1756987;

        String marcaAux;
        /*cast*/
         String s=String.valueOf(uno);



        /*Fin cast */
        String dos="Ford";
        //Auto miAuto

        //miAuto=new Auto("Chevrolet",4340,2011,"Negro",1000,35000);

        Auto miAuto=new Auto("Chevrolet",4340,2011,"Negro",1000,35000);
        Auto miAuto2=new Auto("Ford",4450,2071,"Blnco",100020,100000);

        miAuto.setMarca(s);
         /*   System.out.println("Marca: "+miAuto.getMarca()+
                               "\nCilindraje: "+ miAuto.getCilindraje()+
                               "\nAño: "+miAuto.getAnio()+
                               "\nColor: "+miAuto.getColor()+
                               "\nKilometraje: "+miAuto.getKm()+
                               "\nPrecio"+ miAuto.getPrecio());*/

        marcaAux=miAuto.getMarca();
        System.out.println(marcaAux);
       try {
           PrintWriter mipr=new PrintWriter("C:\\POO_NO_ABRIR\\TAREAS EN CLASE\\EJERCICIO_TALLER\\misdatos.txt");

           mipr.print(miAuto.getMarca());
           mipr.print("\n");
           mipr.print(miAuto.getAnio());
           mipr.print("\n");
           mipr.print(miAuto.getCilindraje());
           mipr.print("\n");
           mipr.print(miAuto.getColor());
           mipr.print("\n");
           mipr.print(miAuto.getKm());
           mipr.print("\n");
           mipr.print(miAuto.getPrecio());
           mipr.print("\n");
           mipr.close();
           PrintWriter mipr2=new PrintWriter("C:\\POO_NO_ABRIR\\TAREAS EN CLASE\\EJERCICIO_TALLER\\misdatosford.txt");

           mipr2.print(miAuto2.getMarca());
           mipr2.print("\n");
           mipr2.print(miAuto2.getAnio());
           mipr2.print("\n");
           mipr2.print(miAuto2.getCilindraje());
           mipr2.print("\n");
           mipr2.print(miAuto2.getColor());
           mipr2.print("\n");
           mipr2.print(miAuto2.getKm());
           mipr2.print("\n");
           mipr2.print(miAuto2.getPrecio());
           mipr2.print("\n");
           mipr2.close();

       }catch (Exception e){
           e.printStackTrace();
       }

    }
}
