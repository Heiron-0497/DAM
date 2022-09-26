import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a verificar si un número es positivo o negativo");

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el número a verificar: ");
        int a = sc.nextInt();
        sc.close();

        if (a > 0) {
            System.out.println("El número " + a + " es positivo");
        } 
        else if(a < 0) {
            System.out.println("El número " + a + " es negativo");
        }
        else if(a == 0) {
            System.out.println("El número " + a + " es 0");
        }
        else {
            System.out.println("El valor introducido no es válido");
        }
    }
}
