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

    public static void realizarPotenciaAlCubo(double base){
        double resultado = (double) Math.pow(base, 3);
        System.out.println(base + " elevado a al cubo es igual a " + resultado);
    }

}