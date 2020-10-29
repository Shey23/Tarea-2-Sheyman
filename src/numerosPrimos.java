import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int a= 0, n, i;

        System.out.println("Ingrese un Numero Entero");
        n = lector.nextInt();

        if(n>4 & n<301){

            System.out.println("Numero dentro del rango");

            for (i = 1; i <= n; i++) {
                if (n % i == 0) a++;

            }
            if (a != 2) {
                System.out.println("No es Primo");
            }   else {
                System.out.println("Si es Primo");
            }
        }
        else {
            System.out.println("Incorrecto! " + "Ingrese un Numero entre el 5 y el 300");
        }
    }
}
