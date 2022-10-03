import java.util.Scanner;

public class ejercicio_18 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenidos a la MiniCalculadora.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Primero indique cual de las siguientes operaciones quiere realizar: Sumar - Restar - Multiplicar - Dividir.");
        String operacion = sc.nextLine().toLowerCase();

        if((!operacion.equals("sumar")) && (!operacion.equals("restar")) && (!operacion.equals("multiplicar")) && (!operacion.equals("dividir"))) {
            System.out.println("Operación no válida. Elija entre : Sumar - Restar - Multiplicar - Dividir. ");
        } else if(operacion.equals("sumar")) {
            System.out.println("De acuerdo, ha elegido la operacion "+ operacion + ". introduzca el primer número.");
            int num1 = sc.nextInt();
            System.out.println("Ahora introduzca el segundo numero.");
            int num2 = sc.nextInt();
            int res = num1 + num2;
            System.out.println("El resultado de " + operacion + " " + num1 + " + " + num2 + " es: " + res + ".");
        } else if(operacion.equals("restar")) {
            System.out.println("De acuerdo, ha elegido la operacion "+ operacion + ". introduzca el primer número.");
            int num1 = sc.nextInt();
            System.out.println("Ahora introduzca el segundo número.");
            int num2 = sc.nextInt();
            int res = num1 - num2;
            System.out.println("El resultado de " + operacion + " " + num1 + " - " + num2 + " es: " + res + ".");
        } else if(operacion.equals("multiplicar")) {
            System.out.println("De acuerdo, ha elegido la operacion "+ operacion + ". introduzca el primer número.");
            int num1 = sc.nextInt();
            System.out.println("Ahora introduzca el segundo número.");
            int num2 = sc.nextInt();
            int res = num1 * num2;
            System.out.println("El resultado de " + operacion + " " + num1 + " x " + num2 + " es: " + res + ".");
        } else if(operacion.equals("dividir")) {
            System.out.println("De acuerdo, ha elegido la operacion "+ operacion + ". introduzca el primer número.");
            int num1 = sc.nextInt();
            System.out.println("Ahora introduzca el segundo número.");
            int num2 = sc.nextInt();
            if(num2 == 0) {
                System.out.println("No se puede dividir entre cero cateto!");
            } else {
                int res = num1 / num2;
                System.out.println("El resultado de " + operacion + " " + num1 + " / " + num2 + " es: " + res + ".");
            }
        } sc.close();
    }
}
