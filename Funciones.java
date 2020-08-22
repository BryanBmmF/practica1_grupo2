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



    /* funcion para validar un numero primo */
    public static void calcularPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
                contador++;
        }

        if(primo){
            system.out.println("El numero "+numero+" es primo");
        } else {
            system.out.println("El numero "+numero+" no es primo");
        }

    /*funcion que calcula la potencia al cubo de un numero*/
    public static void realizarPotenciaAlCubo(double base){
        double resultado = (double) Math.pow(base, 3);
        System.out.println(base + " elevado a al cubo es igual a " + resultado);

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
