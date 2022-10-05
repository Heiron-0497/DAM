public class ejercicio_22 {
    public static void main(String[] args) {
        
       short contador = 10;
       short premio = 2;

       do{
        System.out.println("Su premio es: " + premio * contador);
        contador--;

       } while(contador >= 0);
    }
}
