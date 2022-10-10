import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        
        System.out.println("A continuación vamos a aplicar descuentos en función de la categoria de cliente indicada por el usuario.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique una categoria entre las siguientes [0, 1, 2]: ");
        short cat = sc.nextShort();
        System.out.println("Ahora indique el precio del producto: ");
        short price = sc.nextShort();
        sc.close();

        while(cat < 0 || cat > 2) {
            System.out.println("Introduzca una categoria válida");
        }

        switch(cat) {
            case 0 : {
                double res = price - ((price * 15)/100);
                System.out.println("A los usuarios de categoria " + cat + " se les aplica un 15% de descuento, por lo que el producto con precio " + price + "Euros quedaria en " + res + "Euros");break;
            }
            case 1 : {
                double res = price - ((price * 20)/100);
                System.out.println("A los usuarios de categoria " + cat + " se les aplica un 20% de descuento, por lo que el producto con precio " + price + "Euros quedaria en " + res + "Euros");break;
            }
            case 2 : {
                double res = price - ((price * 25)/100);
                System.out.println("A los usuarios de categoria " + cat + " se les aplica un 25% de descuento, por lo que el producto con precio " + price + "Euros quedaria en " + res + "Euros");break;
            }
        }
    }
}
