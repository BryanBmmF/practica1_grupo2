import java.util.*;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.ArrayList;

public class Funciones {

  static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {

    boolean salir = false;
    int opcion; //Guardaremos la opcion del usuario

    while(!salir){
      System.out.println("1. Calcular numero primo");
      System.out.println("2. Discriminante");
      System.out.println("3. Número Absoluto");
      System.out.println("4. Potencia al cubo");
      System.out.println("5. Raíz cúbica");
      System.out.println("6. Multiplicaión");
      System.out.println("7. División");
      System.out.println("8. Salir");

      System.out.println("Escribe una de las opciones");
      opcion = reader.nextInt();

      switch (opcion){

        case 1:
        calcularPrimo();
        break;
        case 2:
        calculoDiscriminante();
        break;
        case 3:
        calculoValorAbsoluto();
        break;
        case 4:
        realizarPotenciaAlCubo();
        break;
        case 5:
        calcularRaizCubica();
        break;
        case 6:
        calcularMultiplicacion();
        break;
        case 7:
        calcularDivision();
        break;
        case 8:
            System.out.println("---- ¡Adios! ----");
            System.exit(0);
        break;
        default :
            System.out.println("---- Por favor ingrese una opcion valida. ----");
      }

    }
  }

  public static void calculoDiscriminante(){
    double a,b,c;
    System.out.printf("Ingrese coeficientes a, b y c de la ecuación: ");
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
  public static void calcularPrimo(){
    System.out.printf("Ingrese un numero entero para saber si es primo: ");
    int numero = reader.nextInt();
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
  }

  /*funcion que calcula la potencia al cubo de un numero*/
  public static void realizarPotenciaAlCubo(){
    System.out.printf("Ingrese un numero base para elevar al cubo: ");
    double base = reader.nextDouble();
    double resultado = (double) Math.pow(base, 3);
    System.out.println(base + " elevado a al cubo es igual a " + resultado);
  }



  /* Funcion para calcular la raiz cubica */
  public static void calcularRaizCubica(){
    System.out.printf("Ingrese un numero para calcular su raiz cubica: ");
    double valor = reader.nextDouble();
    double  resultado;
    Scanner sc=new Scanner(System.in);
    resultado=Math.pow(valor,1.0/3.0);
    System.out.println("Su raiz cubica es:"+resultado);
  }

  /* Métodos para calcular un numero absoluto */
  public static void calculoValorAbsoluto(){
    double a;
    System.out.printf("Ingrese el valor al cual hacerle valor absoluto: \n");
    a = reader.nextDouble();
    valorAbsoluto(a);
  }

  /* Funcion para calcular el valor absoluto */
  public static void valorAbsoluto(double a){
    double resultado = Math.abs(a);
    System.out.println("El resultado es: "+resultado+"\n\n");
  }

  /* Funcion para calcular una multiplicaion */
  public static void calcularMultiplicacion(){
    System.out.printf("Ingrese el primer numero: ");
    double num1 = reader.nextDouble();
    System.out.printf("Ingrese el segundo numero: ");
    double num2 = reader.nextDouble();
    double resultado = num1*num2;
    System.out.println("El resultado de la multiplicación es: "+resultado+"\n");
  }

  /* Funcion para calcular una divisio */
  public static void calcularDivision(){
    System.out.printf("Ingrese el dividendo: ");
    double num1 = reader.nextDouble();
    System.out.printf("Ingrese el divisor: ");
    double num2 = reader.nextDouble();
    if (num2 == 0) {
      System.out.println("El divisor no puede ser 0.\n");
    } else{
      double resultado = num1/num2;
      System.out.println("El resultado de la division es: "+resultado+"\n");
    }
  }

  /* Funcion para calcular una suma de una cantidad de numeros seleccionada por el usuario */
    public static void calcularSuma() {
        int cantidadDatos;
        double resultado = 0;
        ArrayList<Double> listaDatos = new ArrayList<>();
        System.out.printf("Ingrese cuantos numeros quiere sumar: ");
        cantidadDatos = reader.nextInt();
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("Ingrese un numero: ");
            double valor = reader.nextDouble();
            listaDatos.add(valor);
        }
        for (int i = 0; i < listaDatos.size(); i++) {
            resultado += listaDatos.get(i);
        }
        System.out.println("El resultado de la suma es: " + resultado);
    }

}
