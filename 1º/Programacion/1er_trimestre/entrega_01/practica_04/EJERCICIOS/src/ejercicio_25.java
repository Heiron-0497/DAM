import java.util.Scanner;

public class ejercicio_25 {
    public static void main(String[] args) {
        
       System.out.println("Vamos a verificar los divisores de un número.");
       Scanner sc = new Scanner(System.in);
       System.out.println("Indique el número al cual quiere verificar sus divisores");
       short num = sc.nextShort();
       short div = 1;
       sc.close();

       do {
        int res = num % div;
        if (res == 0) {
            System.out.println("El número " + num + " es divisible entre " + div);
        } else {
            System.out.println("El número " + num + " no es divisible entre " + div);
        }
        div++;
       } while(div <= num);
    }
}
