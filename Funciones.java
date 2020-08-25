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
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion){

                case 1:

                break;
                case 2:
			calculoDiscriminante();
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
    

}
