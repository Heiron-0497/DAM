import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        
        int a, b, sum, res, mult, div, mod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el número a: ");
        a= sc.nextInt();
        System.out.println("Escriba el número b: ");
        b= sc.nextInt();

        sum = a + b;
        res = a - b;
        mult = a * b;
        div = a / b;
        mod = a % b;

        System.out.println("El resultado de la suma es: " + sum);
        System.out.println("El resultado de la resta es: " + res);
        System.out.println("El resultado de la multiplicación es: " + mult);
        System.out.println("El resultado de la división es: " + div);
        System.out.println("El resultado del módulo es: " + mod);
    }
}
