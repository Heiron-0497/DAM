import java.util.Scanner;

public class scrum_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {

            int NMMates = 0, NMLengua = 0, NMIngles = 0, NMHistoria = 0, NMArte = 0, NMBiologia = 0;

            System.out.println("Matematicas:");
            int mates[] = new int[3];
            for (int NMates = 0; NMates < 3; NMates++) {
                System.out.print("Nota " + (NMates + 1) + ": ");
                int n = sc.nextInt();
                mates[NMates] = n;
            }
            NMMates = (mates[0] + mates[1] + mates[2]) / mates.length;

            System.out.println("Lengua:");
            int lengua[] = new int[3];
            for (int Nlengua = 0; Nlengua < 3; Nlengua++) {
                System.out.print("Nota " + (Nlengua + 1) + ": ");
                int n = sc.nextInt();
                lengua[Nlengua] = n;
            }
            NMLengua = (lengua[0] + lengua[1] + lengua[2]) / lengua.length;

            System.out.println("Ingles:");
            int ingles[] = new int[3];
            for (int Ningles = 0; Ningles < 3; Ningles++) {
                System.out.print("Nota " + (Ningles + 1) + ": ");
                int n = sc.nextInt();
                ingles[Ningles] = n;
            }
            NMIngles = (ingles[0] + ingles[1] + ingles[2]) / ingles.length;

            System.out.println("Historia:");
            int historia[] = new int[3];
            for (int Nhistoria = 0; Nhistoria < 3; Nhistoria++) {
                System.out.print("Nota " + (Nhistoria + 1) + ": ");
                int n = sc.nextInt();
                historia[Nhistoria] = n;
            }
            NMHistoria = (historia[0] + historia[1] + historia[2]) / historia.length;

            System.out.println("Arte:");
            int arte[] = new int[3];
            for (int Narte = 0; Narte < 3; Narte++) {
                System.out.print("Nota " + (Narte + 1) + ": ");
                int n = sc.nextInt();
                arte[Narte] = n;
            }
            NMArte = (arte[0] + arte[1] + arte[2]) / arte.length;

            System.out.println("Biologia:");
            int biologia[] = new int[3];
            for (int Nbiologia = 0; Nbiologia < 3; Nbiologia++) {
                System.out.print("Nota " + (Nbiologia + 1) + ": ");
                int n = sc.nextInt();
                biologia[Nbiologia] = n;
            }
            NMBiologia = (biologia[0] + biologia[1] + biologia[2]) / biologia.length;

            int notaFinal = (NMMates + NMLengua + NMBiologia + NMHistoria + NMArte + NMIngles) / 6;

            System.out.println("La nota final del alumno " + i + " es: " + notaFinal);
        } sc.close();
    }

}