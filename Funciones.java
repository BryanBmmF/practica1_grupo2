import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Funciones {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
        while(!salir){
            System.out.println("1. Opcion 1");
            System.out.println("2. Discriminante");
            System.out.println("3. Numero Absoluto");
            System.out.println("4. Salir");
            
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion){

                case 1:

                break;
                case 2:
			        calculoDiscriminante();
                break;
                case 3:
			        calculoValorAbsoluto();
                break;

                default : 
                
                break;
            }
            
        }


    }
    
    
    
    public static void calculoDiscriminante(){
        double a,b,c;
	System.out.printf("Ingrese coeficientes a, b y c de la ecuación: ");
        Scanner reader = new Scanner(System.in);
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();        
        discriminante(a,b,c);
    }
    
    
    public static void discriminante(double a, double b, double c){        
	double discriminante = pow(b, 2) - 4 * a * c;
        System.out.println("\nLa discriminante es:"+discriminante);
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
            System.out.println("El numero "+numero+" es primo");
        } else {
            System.out.println("El numero "+numero+" no es primo");
        }
       
    /*funcion que calcula la potencia al cubo de un numero*/
    public static void realizarPotenciaAlCubo(double base){
        double resultado = (double) Math.pow(base, 3);
        System.out.println(base + " elevado a al cubo es igual a " + resultado);

    }

    /* Métodos para calcular un numero absoluto */
    public static void calculoValorAbsoluto(){
    	double a;
        System.out.printf("Ingrese el valor al cual hacerle valor absoluto: \n");
        Scanner reader = new Scanner(System.in);
        a = reader.nextDouble();
	valorAbsoluto(a);
    }
    
    public static void valorAbsoluto(double a){
	double resultado = Math.abs(a);
        System.out.println("El resultado es: "+resultado+"\n\n");
    }

}
