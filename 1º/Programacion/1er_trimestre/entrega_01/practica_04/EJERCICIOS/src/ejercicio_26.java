import java.util.Scanner;

public class ejercicio_26 {
    public static void main(String[] args) {
        
       System.out.println("Vamos a verificar los divisores de un número.");
       Scanner sc = new Scanner(System.in);
       System.out.println("Indique el número al cual quiere verificar sus divisores");
       int num = sc.nextShort();
       sc.close();

       for (int i = 1; i <= num; i++) {
        int res = num % i;
        if (res == 0) {
            System.out.println("El número " + num + " es divisible entre " + i);
        } else {
            System.out.println("El número " + num + " no es divisible entre " + i);
        }
       }
    }
}
