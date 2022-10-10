public class ejercicio_29 {
    public static void main(String[] args) {
        
       int num = 10;
       
       while (num <= 100) {
        System.out.println(num);
        num++;
       }

       do {
        System.out.println(num);
        num++;
       } while (num <= 100);

       for(int i = num; i <= 100; i++) {
        System.out.println(i);
       }
    }
}

