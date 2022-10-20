
import java.util.Scanner;

public class scrum_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 1, dia, gasto = 0;
        final int mes = 30;
        while (contador <= mes) {
            System.out.println("Introduzca el gasto de hoy");
            dia = sc.nextInt();
            gasto = gasto + dia;
            contador++;

        } sc.close();
        System.out.println("El gasto mensual es " + (gasto / mes));
    }

}
