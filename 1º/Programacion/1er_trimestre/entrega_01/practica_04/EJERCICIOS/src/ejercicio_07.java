import java.util.Scanner;

public class ejercicio_07 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a verificar si un alumno ha aprovado o suspendido la asignatura de matemáticas. Para ello vamos a necesitar el nombre y las notas de los tres examenes de evaluación");

        int a, b, c, res;
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
        sc.close();

        res = (a + b + c) / 3;

        if (res >= 5) {
            System.out.println("El alumno " + nom + " ha aprovado");
        } else{
            System.out.println("El alumno " + nom + " ha suspendido");
        }
    }    
}
