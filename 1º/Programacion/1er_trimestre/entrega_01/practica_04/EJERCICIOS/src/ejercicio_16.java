import java.util.Scanner;

public class ejercicio_16 {
    public static void main(String[] args) {
        
        String respuesta ="";

        System.out.println("Hola buenas, bienvenido a Hamborgueseria ElPayo!");

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quiere realizar un pedido? [Si / No]: ");
        respuesta = sc.nextLine().toLowerCase();

        if(respuesta.equals("no")) {
            System.out.println("No ha pedido nada...");
        } else if(respuesta.equals("si")) {
            System.out.println("¿Quiere pedir una hamburguesa? [Si / No]: ");
            respuesta = sc.nextLine().toLowerCase();
            
            if(respuesta.equals("no")) {
                System.out.println("Lo sentimos pero por el momento solo tenemos hamburguesas.");
                System.out.println("El cliente no realiza el pedido.");
            } else if(respuesta.equals("si")) {
                System.out.println("¿Quiere añadir más ingredientes? [Si / No]: ");
                respuesta = sc.nextLine().toLowerCase();

                if(respuesta.equals("no")) {
                    System.out.println("El cliente quiere la hamburguesa sola");
                    System.out.println("Estamos preparando su pedido...");
                } else if(respuesta.equals("si")) {
                    System.out.println("¿Quiere añadir tomate? [Si / No]: ");
                    respuesta = sc.nextLine().toLowerCase();

                    if(respuesta.equals("no")) {
                        System.out.println("El cliente no quiere añadir tomate a la hamburguesa");
                        System.out.println("Estamos preparando su pedido...");
                    } else if(respuesta.equals("si")) {
                        System.out.println("Perfecto! Añadiremos tomate.");
                        System.out.println("Estamos preparando su pedido...");
                    } else{
                        System.out.println("Respuesta no válida! Tienes que responder Si o No.");
                    }

                } else{
                    System.out.println("Respuesta no válida! Tienes que responder Si o No.");
                }

            } else{
                System.out.println("Respuesta no válida! Tienes que responder Si o No.");
            }

        } else{
            System.out.println("Respuesta no válida! Tienes que responder Si o No.");
        } sc.close();
    } 
}
