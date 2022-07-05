import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        String arreglo[]=new String[10];

        int numero[]=new int[10];

        alumno a[]=new alumno[2];
        Scanner teclado=new Scanner(System.in);
        String nombre="";
        int matricula=0;
        char grupo=' ';
        int aula=0;

        for (int i=0;i<a.length;i++){

            System.out.println("Ingrese su nombre: ");
            nombre=teclado.next();
            System.out.println("Ingrese su matricula: ");
            matricula=teclado.nextInt();
            System.out.println("Ingrese su grupo: ");
            grupo=teclado.next().charAt(0);
            System.out.println("Ingrese su aula: ");
            aula=teclado.nextInt();
            teclado.nextLine();

            a[i]=new alumno(nombre,matricula,grupo,aula);

        }

       for (int i=0;i<a.length;i++){

           //System.out.println(a[i]);
           System.out.println(a[i].getNombre()+" "+a[i].getMatricula()+" "+a[i].getGrupo()+" "+a[i].getAula()+" ");
       }


         /* a[0].setMatricula(12);
        a[0].setNombre("Erick");
        System.out.println(a[0].getMatricula());
        System.out.println("====");

        a[1].setMatricula(9);
        a[1].setNombre("Jonathan");
        System.out.println(a[1].getMatricula());
        */



    }
}
