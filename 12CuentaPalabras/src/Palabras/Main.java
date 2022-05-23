package Palabras;

import java.util.Scanner;

/**
 *
 * @author luiss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadenaUsuario = teclado.nextLine();
        System.out.println("\nLa cadena tiene " +cuentaPalabras(cadenaUsuario) + " palabras");
        teclado.close();
    }
    
    public static int cuentaPalabras(String cadena) {
        String[] palabras = cadena.trim().split(" +");
        return palabras.length;
    }
    
}
