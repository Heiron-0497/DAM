import java.util.Scanner;

public class ejercicio_28 {
    public static void main(String[] args) {
        
       System.out.println("\n\nVamos a verificar todos los números pares hasta el introducido.\n");
       Scanner sc = new Scanner(System.in);
       System.out.println("Indique el número al cual quiere verificar sus pares");
       int num = sc.nextShort();
       int cont = 1;
       System.out.println("\nLos números pares contenidos entre 0 y " + num + " son:\n");

       while(cont <= num) {
        int res = cont % 2;
        if (res==0) {
            System.out.println(cont);
        } 
        cont++;
       }
       sc.close();
    }
}

