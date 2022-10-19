import java.util.Scanner;

public class scrum_01 {
    public static void main(String[] args) {
        
        final int maxCorredores= 15;
        int dorsal, tiempo;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        while(contador <= maxCorredores) {
            System.out.println("indique el dorsal del corredor: [1 - 15]");
            dorsal = sc.nextInt();
            System.out.println("indique el tiempo en segundos que ha tardado el corredor.");
            tiempo = sc.nextInt();
            if((tiempo >= 50) && (tiempo <= 90)) {
                System.out.println("El corredor con el dorsal " + dorsal + " y con el tiempo de " + tiempo + " seg, está entre los 10 primeros");
            }
            contador++;
        } sc.close();
    }
}
