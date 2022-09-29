import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a verificar si un competidor ha conseguido una medalla (ORO - PLATA - BRONCE)");

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la posición en la que ha llegado el competidor: ");
        short posicion = sc.nextShort();
        sc.close();

        switch(posicion) {
            case 1: System.out.println("ORO");break;
            case 2: System.out.println("PLATA");break;
            case 3: System.out.println("BRONCE");break;
            default: System.out.println("SIN PREMIO");break;
        }

        
    }
}
