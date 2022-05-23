package Polimorfismo;

/**
 *
 * @author luiss
 */
public class Trabajador extends Persona{
    private double salario;
    
    Trabajador(String nombre, String apellidos, int edad, double salario) {
        super(nombre,apellidos,edad);
        this.salario = salario;
    }
    
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Salario: " + salario);
    }
    
}
