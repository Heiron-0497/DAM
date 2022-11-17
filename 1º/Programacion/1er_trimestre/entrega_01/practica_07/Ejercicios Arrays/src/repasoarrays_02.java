import java.util.Random;
import java.util.Scanner;

public class repasoarrays_02 {
    public static void main(String[] args) {
        
        int temp[] = new int[7];
        String dia;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for (int i=0; i < temp.length; i++) {
            temp[i] = r.nextInt(40);
        }sc.close();
    }
}
