import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a convertir un número entero en número romano.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un número entero de los siguientes [1, 5, 10, 50, 100, 500, 1000]: ");
        short num = sc.nextShort();
        sc.close();

        switch(num) {
            case 1: System.out.println("El número" + num + "sería I en romano");break;
            case 5: System.out.println("El número" + num + "sería V en romano");break;
            case 10: System.out.println("El número" + num + "sería X en romano");break;
            case 50: System.out.println("El número" + num + "sería L en romano");break;
            case 100: System.out.println("El número" + num + "sería C en romano");break;
            case 500: System.out.println("El número" + num + "sería D en romano");break;
            case 1000: System.out.println("El número" + num + "sería M en romano");break;
            default: System.out.println("ERROR NO HA INTRODUCIDO UN VALOR VÁLIDO");break;
        }
    }
}
