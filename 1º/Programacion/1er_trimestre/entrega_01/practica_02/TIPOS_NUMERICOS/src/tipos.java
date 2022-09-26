import java.util.Scanner;

public class tipos {
    public static void main(String[] args) {
        
        byte a, b, suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el número a: ");
        a= sc.nextByte();
        System.out.println("Escriba el número b: ");
        b= sc.nextByte();
        sc.close();

        suma = (byte) (a + b);

        System.out.println("El resultado es: " + suma);
    }
}
