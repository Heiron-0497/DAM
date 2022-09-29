import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a verificar el dia de la semana en funcion de un número entero del 1 al 7 ambos incluidos.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un número entero del 1 al 7: ");
        short numDia = sc.nextShort();
        sc.close();

        switch(numDia) {
            case 1: System.out.println("LUNES");break;
            case 2: System.out.println("MARTES");break;
            case 3: System.out.println("MIÉRCOLES");break;
            case 4: System.out.println("JUEVES");break;
            case 5: System.out.println("VIERNES");break;
            case 6: System.out.println("SÁBADO");break;
            case 7: System.out.println("DOMINGO");break;
            default: System.out.println("ERROR NO HA INTRODUCIDO UN VALOR VÁLIDO");break;
        }
    }
}
