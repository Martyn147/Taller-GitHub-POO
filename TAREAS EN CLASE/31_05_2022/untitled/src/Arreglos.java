public class Arreglos {


    public static void main(String[] args) {

        int numero[]={4,-7,100,965};

        ordenaciónBurbuja(numero);
        for (int i=0;i< numero.length;i++){

            System.out.println("El arreglo ordenado es: "+numero[i]);
        }
        QuickShort(numero);
        System.out.println("===============================");
        System.out.println("Por QuickShort");
        for (int i=0;i< numero.length;i++){

            System.out.println("El arreglo ordenado es: "+numero[i]);
        }




    }

    public static void ordenaciónBurbuja(int lista[]) {


        int contador=0;

        int aux;
        for (int i=0;i<(lista.length-1);i++){
            for (int j=0;j<(lista.length-1);j++){

                if (lista[j]>lista[j+1]){

                    aux = lista[j];
                    lista[j]=lista[j+1];
                    lista[j+1]=aux;

                }
            }
            contador++;
        }


    }

    public static int QuickShort(int[] arreglo) {

        int izquierda=0,derecha=0;
        int pivote = arreglo[izquierda];
        // Ciclo infinito
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }
}
