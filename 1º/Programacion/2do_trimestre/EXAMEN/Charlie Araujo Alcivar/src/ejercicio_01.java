import java.util.Scanner;

public class ejercicio_01 {
    public static void main(String[] args) {
        

        System.out.println("Seleccione una opcion:\n");
        System.out.println("A. Dar de alta a un paciente.");
        System.out.println("B. Listar a los pacientes.");
        System.out.println("C. Consultar aseguradora.");
        System.out.println("S. Salir.\n");

        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine().toLowerCase();

        while (opcion.equals("S")) {
            System.out.println("Ha seleccionado la opcion salir.");
        }

        sc.close();
    }
}
