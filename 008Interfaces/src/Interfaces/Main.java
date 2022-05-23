package Interfaces;

/**
 *
 * @author luiss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1;
        Triangulo t1;
        
        r1 = new Rectangulo(7,5);
        t1 = new Triangulo(4,7);
        
        System.out.println("El área del rectángulo es: " + r1.area());
        System.out.println("El área del triángulo es: " + t1.area());
    }
    
}
