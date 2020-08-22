import java.util.*;

public class Funciones {

    public static void main(String args[], int argv) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while(!salir){
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion){

                case 1:

                break;

                default :


            }

        }


    }

    /* Funcion para calcular la raiz cubica */
    public static void calcularRaizCubica(double valor){
      double  resultado;
       Scanner sc=new Scanner(System.in);
       resultado=Math.pow(valor,1.0/3.0);
       System.out.println("Su raiz cubica es:"+resultado);
     }

}
