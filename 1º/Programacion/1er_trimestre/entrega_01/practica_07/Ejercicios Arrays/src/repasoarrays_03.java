import java.util.Scanner;

public class repasoarrays_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero");
            numeros[i] = sc.nextInt();
        }
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] < 0) {
                System.out.println("El numero introducido es menor que 0");
            } else if (numeros[j] == 0) {
                System.out.println("El numero es igual que 0");
            } else {
                System.out.println("El numero introducido es mayor que 0");
            }
		} sc.close();
    }
}
