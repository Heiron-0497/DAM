import java.util.Scanner;

public class ejercicio_08 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a verificar si un alumno ha aprovado o suspendido la asignatura de matemáticas. Para ello vamos a necesitar el nombre y las notas de los cuatro examenes de evaluación");

        int a, b, c, d, res;
        String nom;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique el nombre del alumno: ");
        nom = sc.nextLine();

        System.out.println("Indique la nota del primer examen: ");
        a = sc.nextInt();

        System.out.println("Indique la nota del segundo examen: ");
        b = sc.nextInt();
        
        System.out.println("Indique la nota del tercer examen: ");
        c = sc.nextInt();

        System.out.println("Indique la nota del cuarto examen: ");
        d = sc.nextInt();

        res = (a + b + c + d) / 4;

        if ((res >= 0) && (res <= 4)) {
            System.out.println("El alumno " + nom + " ha suspendido");
        }
        else if((res >= 5) && (res <= 6)) {
            System.out.println("El alumno " + nom + " tiene una nota media de " + res + ". Por lo que tiene un suficiente en la asignatura");
        }
        else if((res >= 7) && (res <= 8)) {
            System.out.println("El alumno " + nom + " tiene una nota media de " + res + ". Por lo que tiene un notable en la asignatura");
        }
        else if((res >= 9) && (res <= 10)) {
            System.out.println("El alumno " + nom + " tiene una nota media de " + res + ". Por lo que tiene un sobresaliente en la asignatura");
        }
        else{
            System.out.println("Error: Los valores introducidos no son válidos");
        }
    }    
}
