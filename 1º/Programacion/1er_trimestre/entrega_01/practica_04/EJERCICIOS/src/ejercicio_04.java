import java.util.Scanner;

public class ejercicio_04 {
    public static void main(String[] args) {

        double b, h, res;
        
        System.out.println("A continuación calcularemos el área de un rectángulo.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Primero indique la base que tendrá el rectángulo: ");
        b = sc.nextDouble();

        System.out.println("Ahora indique la altura que tendrá el rectángulo: ");
        h = sc.nextDouble();

        res = b * h;

        System.out.println("El área del rectángulo con base " + b + " cm2 y altura " + h + " cm2, sería: " + res + " cm2");

    }
}
