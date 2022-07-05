public class alumno {
    private String nombre;
    private int matricula;
    private char grupo;
    private int aula;

    public  alumno(){
        nombre="";
        matricula=0;
        grupo=' ';
        aula=0;
    }

    public alumno(String nombre, int matricula, char grupo, int aula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grupo = grupo;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
}


