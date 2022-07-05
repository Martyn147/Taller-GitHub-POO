package Taller_n_Objetos;
import java.io.FileWriter;
import java.util.Scanner;

public class Clases_Metodos_Objetos {

    private String nombre;
    private String apellido;
    private int matricula;
    private int numeroCedula;
    private String codigoCarrera;
    private int nMaterias;
    private char grupo;
    private int aula;

    public Clases_Metodos_Objetos(String nombre, String apellido, int matricula, int numeroCedula, String codigoCarrera, int nMaterias, char grupo, int aula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.numeroCedula = numeroCedula;
        this.codigoCarrera = codigoCarrera;
        this.nMaterias = nMaterias;
        this.grupo = grupo;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getnMaterias() {
        return nMaterias;
    }

    public void setnMaterias(int nMaterias) {
        this.nMaterias = nMaterias;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }
    public void ingresoAlumnos(){
        Scanner teclado=new Scanner(System.in);
        int n;
        System.out.print("Ingrese el numero de alumnos: ");
        n=teclado.nextInt();
        int Alumnos[]=new int[n];

        try {
            String filePath= "C:\\POO_NO_ABRIR\\TAREAS EN CLASE\\EJERCICIO_TALLER\\Alumnos_Registro.txt";
            FileWriter fw=new FileWriter(filePath, true);
            String lineToAppend ="";
            fw.write(lineToAppend);

            for ( int i=0;i< Alumnos.length;i++){

                System.out.print("Dijite el Nombre del estudiante: ");
                nombre=teclado.next();
                fw.write("Nombre: ");
                fw.write(nombre+"\n");
                System.out.print("Dijite el Apellido del estudiante: ");
                apellido=teclado.next();
                fw.write("Apellido: ");
                fw.write(apellido+"\n");
                System.out.print("Dijite la matricula del estudiante: ");
                matricula=teclado.nextInt();
                fw.write("Matricula: ");
                fw.write(matricula+"\n");
                System.out.print("Dijite el numero de cedula del estudiante: ");
                numeroCedula=teclado.nextInt();
                fw.write("CI: ");
                fw.write(numeroCedula+"\n");
                System.out.print("Dijite el Codigo de Carrera del estudiante: ");
                codigoCarrera=teclado.next();
                fw.write("CodCarrera: ");
                fw.write(codigoCarrera+"\n");
                System.out.print("Dijite el numero de materias registradas por el estudiante: ");
                nMaterias=teclado.nextInt();
                fw.write("Numero de Materias: ");
                fw.write(nMaterias+"\n");
                System.out.print("Dijite el grupo del estudiante: ");
                grupo=teclado.next().charAt(0);
                fw.write("Grupo: ");
                fw.write(grupo+"\n");
                System.out.print("Dijite el AULA del estudiante: ");
                aula=teclado.nextInt();
                fw.write("Aula: ");
                fw.write(aula+"\n");
            }

            fw.close();

        }catch (Exception e){
            System.out.println("Escribiste mal bobo");
        }


    }


}
