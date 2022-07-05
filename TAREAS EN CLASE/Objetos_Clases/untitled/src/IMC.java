import IMC_MÉTODOS.imc;

import java.util.Scanner;

public class IMC {

    public static void main (String[] args){

        Scanner teclado =new Scanner(System.in);

        double imc;
        double altura1=0,peso1=0;

        imc persona1=new imc(altura1,peso1);
        System.out.print("Dijite la altura de la persona: ");
        altura1=teclado.nextDouble();
        System.out.println("====================");
        System.out.print("Dijite le peso de la persona: ");
        peso1=teclado.nextDouble();
        imc=peso1/(altura1*2);
        persona1.setAltura(altura1);
        persona1.setPeso(peso1);

        System.out.println(" ======================");
        System.out.println(persona1.toString()+" resgitra un imc de "+imc);
    }
}
