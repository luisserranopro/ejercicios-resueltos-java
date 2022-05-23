package pkg004creacionclase;

/**
 *
 * @author luiss
 */
public class CreacionClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asignatura asignatura1 = new Asignatura("Programacion", "1PROG", 1);
        Asignatura asignatura2 = new Asignatura("Lenguaje de Marcas", "1LMSI", 1);
        asignatura2.setCodigo("1LM");
        asignatura1.setCurso(2);
        
        System.out.println("La primera asignatura es " + asignatura1.getNombre() + " con código " + asignatura1.getCodigo());
        System.out.println("La segunda asignatura es " + asignatura2.getNombre() + " del curso " + asignatura2.getCurso());
    }
    
}
