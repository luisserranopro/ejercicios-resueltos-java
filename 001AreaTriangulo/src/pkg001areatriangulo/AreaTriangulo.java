package pkg001areatriangulo;

import java.util.Scanner;

/**
 *
 * @author luiss
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float area, base, altura;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo: ");
        base = teclado.nextFloat();
        System.out.print("Introduce la altura del triángulo: ");
        altura = teclado.nextFloat();
        area = base * altura / 2;
        System.out.println("El área del triángulo es: " + area);
    }
    
}
