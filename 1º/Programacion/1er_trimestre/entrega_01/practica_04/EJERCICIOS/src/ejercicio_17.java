import java.util.Scanner;

public class ejercicio_17 {
    public static void main(String[] args) {
        
        System.out.println("A continuacion vamos a validar si la fecha de entrega es válida.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Primero introduzca el año de la entrega: ");
        int year = sc.nextInt();

        if((year >= 1970) && (year <= 2022)) {
            System.out.println("De acuerdo, ahora introduzca el numero de mes. [1 - 12]");
            int mon = sc.nextInt();
            if((mon == 1) || (mon == 3) || (mon == 5) || (mon == 7) || (mon == 8) || (mon == 10) || (mon == 12)) {
                System.out.println("Introduzca el día del mes. [1 - 31].");
                int day = sc.nextInt();
                if((day >= 1) && (day <= 31)) {
                    System.out.println("Fecha correcta, dentro de rango.");
                } else {
                    System.out.println("Fecha fuera de rango.");
                }
            } else if((mon == 4) || (mon == 6) || (mon == 9) || (mon == 11)) {
                System.out.println("Introduzca el día del mes. [1 - 30].");
                int day = sc.nextInt();
                if((day >= 1) && (day <= 30)) {
                    System.out.println("Fecha correcta, dentro de rango.");
                } else {
                    System.out.println("Fecha fuera de rango.");
                }
            } else if(mon == 2) {
                System.out.println("Introduzca el día del mes. [1 - 28].");
                int day = sc.nextInt();
                if((day >= 1) && (day <= 28)) {
                    System.out.println("Fecha correcta, dentro de rango.");
                } else {
                    System.out.println("Fecha fuera de rango.");
                }
            } else {
                System.out.println("Introduzca un número de mes válido [1- 12]");
            }
        } else {
            System.out.println("El año introducido está fuera de rango.");
        } sc.close();
    }
}
