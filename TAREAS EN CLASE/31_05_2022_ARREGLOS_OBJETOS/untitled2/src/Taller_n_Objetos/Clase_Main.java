package Taller_n_Objetos;

import java.util.Scanner;

public class Clase_Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        String nombre=" ";
        String apellido=" ";
        int matricula=0;
        int numeroCedula=0;
        String codigoCarrera="";
        int nMaterias=0;
        char grupo=' ';
        int aula=0;

        Clases_Metodos_Objetos alumno=new Clases_Metodos_Objetos(nombre,apellido,matricula,numeroCedula,codigoCarrera,nMaterias,grupo,aula);

        alumno.ingresoAlumnos();


    }
}
