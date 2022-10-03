import java.util.Scanner;

public class ejercicio_19 {
    public static void main(String[] args) {
        
       System.out.println("\n\n Bienvenido a nuestro restaurante, aqui tiene la carta. El dia de hoy tenemos disponibles tres menus para comer: \n ·Menu 1 --> Revuelto de Champiñones; Filete de Pollo; 8 Euros. \n ·Menu 2 --> Sopa Castellana; Chuletillas; 12 Euros. \n ·Menu 3 --> Sopa de Marisco; Bacalao; 15 Euros.\n");
       Scanner sc = new Scanner(System.in);
       System.out.println("Qué menú desean pedir ? [ Menu 1 - Menu 2 - Menu 3 ].");
       String orden = sc.nextLine().toLowerCase();

       if(orden.equals("menu 1") || orden.equals("menu1")) {
        System.out.println("De acuerdo! Ha elegido usted el " + orden + ", enseguida se lo preparamos.");

       } else if(orden.equals("menu 2") || orden.equals("menu2")) {
        System.out.println("De acuerdo! Ha elegido usted el " + orden + ", enseguida se lo preparamos.");

       } else if(orden.equals("menu 3") || orden.equals("menu3")) {
        System.out.println("De acuerdo! Ha elegido usted el " + orden + ", enseguida se lo preparamos.");
        
       } else if(orden.equals("")) {
        System.out.println("Lo siento, debe elegir uno de los menus de la carta");
       } else {
        System.out.println("Lo sentimos pero el " + orden + " no existe");
        
       } sc.close();
    }
}
