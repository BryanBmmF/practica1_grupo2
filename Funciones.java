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
			discriminante();
                break;

                default :
                    

            }
            
        }


    }
    
    
    public void discriminante(){
        double a, b, c;
        System.out.printf("Ingrese coeficientes a, b y c de la ecuación: ");
        Scanner reader = new Scanner(System.in);
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();
        double discriminante = -20000000;
	discriminante = pow(b, 2) - 4 * a * c;
        System.out.println("\nEsta es la discriminante:"+discriminante);
    }
    

}
