import java.util.Scanner;

public class ejercicio_27 {
    public static void main(String[] args) {
        
       System.out.println("Vamos a verificar los divisores de un número.");
       Scanner sc = new Scanner(System.in);
       System.out.println("Indique el número al cual quiere verificar sus divisores");
       short num = sc.nextShort();
       short div = 1;
       int i =0;
       boolean esprimo=true;

       while (div <= num) {
        int res = num % div;
        if (res == 0) {
            i++;
            System.out.println("El número " + num + " es divisible entre " + div);
        } else {
            System.out.println("El número " + num + " no es divisible entre " + div);
        }
        div++;
       } 
       if(i==2) {
            esprimo=true;
        } else {
            esprimo=false;
        } sc.close();
        
        System.out.println("El número "+num+" es primo? "+esprimo);
    }
}

