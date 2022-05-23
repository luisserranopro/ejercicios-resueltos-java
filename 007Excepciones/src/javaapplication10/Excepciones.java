package javaapplication10;

/**
 *
 * @author luiss
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dividendo = 30, divisor = 0, cociente;
       
        try {
            cociente = dividendo / divisor;
            System.out.println("Resultado: " + cociente);
        }
        catch(ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
}
