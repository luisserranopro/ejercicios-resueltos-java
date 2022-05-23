package pkg003calculointeressimple;

import java.util.Scanner;

/**
 *
 * @author luiss
 */
public class CalculoInteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float capitalInicial, interesAnual, interesTotal, capitalFinal;
        int meses;
        final int MESES_ANIO = 12;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el capital a invertir: ");
        capitalInicial = teclado.nextFloat();
        System.out.print("Introduce el interés anual (%): ");
        interesAnual = teclado.nextFloat();
        System.out.print("Introduce el numero de meses a invertir: ");
        meses = teclado.nextInt();
        interesTotal = capitalInicial * interesAnual / 100 * meses / MESES_ANIO;
        capitalFinal = interesTotal + capitalInicial;
        System.out.println("El capital final será: " + capitalFinal);
        System.out.println("El interés generado será: " + interesTotal);
    }
    
}
