import java.util.Scanner;
public class ejercicio_04 {
    public static void main(String[] args) {

        double b, h, res;
        
        System.out.println("A continuación calcularemos el área de un rectángulo.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Primero indique la base, en centímetros, que tendrá el rectángulo: ");
        b = sc.nextDouble();

        System.out.println("Ahora indique la altura,en centímetros, que tendrá el rectángulo: ");
        h = sc.nextDouble();

        res = b * h;

        System.out.println("El área del rectángulo con base " + b + " cm y altura " + h + " cm, sería: " + res + " cm2");

    }
}
