import java.util.Scanner;

public class ejercicio_05 {
    public static void main(String[] args) {
        
        double b, h, res;
        
        System.out.println("A continuación calcularemos el área de un triángulo.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Primero indique la base que tendrá el triángulo: ");
        b = sc.nextDouble();

        System.out.println("Ahora indique la altura que tendrá el triángulo: ");
        h = sc.nextDouble();

        res = (b * h)/2;

        System.out.println("El área del triángulo con base " + b + " cm2 y altura " + h + " cm2, sería: " + res + " cm2");

    }
}
