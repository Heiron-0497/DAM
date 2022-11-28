import java.util.Scanner;

public class ejercicio_01 {
    public static void main(String[] args) {
        
        int a, b, suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el número a: ");
        a= sc.nextInt();
        System.out.println("Escriba el número b: ");
        b= sc.nextInt();
        sc.close();

        suma = a + b;

        System.out.println("El resultado es: " + suma);
    }
}
