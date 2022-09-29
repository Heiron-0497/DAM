import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a ver que estudios puede realizar un alumno en funcion de su nivel de estudios.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el nivel de estudios [ESO, Bachillerato, Grado Medio, Grado Superior, Grado Universitario]: ");
        String nivel = sc.nextLine().toLowerCase();
        sc.close();

        switch(nivel) {
            case "eso": System.out.println("El alumno puede hacer Bachillerato o un ciclo de Grado Medio");break;

            case "bachillerato": System.out.println("El alumno puede hacer un ciclo de Grado Superior o ir a la Universidad");break;

            case "grado medio": System.out.println("El alumno puede hacer un ciclo de Grado Superior");break;

            case "grado superior":System.out.println("El alumno puede ir a la Universidad");break;

            case "grado universitario": System.out.println("El alumno puede hacer un Máster");break;

            default: System.out.println("Indique un nivel de estudios válido");break;
        }
    }
}
