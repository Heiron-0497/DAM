import java.util.Scanner;

public class ejercicio_09 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a verificar si un número es par o impar");

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el número a verificar: ");
        int a = sc.nextInt();
        sc.close();

        if (a % 2 == 0) {
            System.out.println("El número " + a + " es par");
        } 
        else {
            System.out.println("El número " + a + " es impar");
        }
    }    
}
