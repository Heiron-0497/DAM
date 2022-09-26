import java.util.Scanner;

public class ejercicio_06 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a verificar si dos números son divisibles entre sí.");
        int a, b, resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Para ello introduzca el primer número: ");
        a = sc.nextInt();
        System.out.println("Ahora introduzca el segundo número: ");
        b = sc.nextInt();
        sc.close();

        resto = a % b;

        if (resto == 0) {
            System.out.println("Sí, los números " + a + " y " + b +" son divisibles entre sí!");
        
        } else{
            System.out.println("Parece ser que los números " + a + " y " + b + " no se pueden dividir entre sí...");

        }
    }    
}
