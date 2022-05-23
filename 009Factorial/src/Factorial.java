import java.util.Scanner;
/**
 *
 * @author luiss
 */
public class Factorial {

  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        teclado.close();
        System.out.println("\nEl factorial de " + numero + " es: " + factorial(numero));
    }
    
    public static int factorial(int numero) {
        //caso base
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero-1);
    }
    
}
