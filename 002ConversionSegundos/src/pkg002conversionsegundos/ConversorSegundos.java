package pkg002conversionsegundos;

import java.util.Scanner;

/**
 *
 * @author luiss
 */
public class ConversorSegundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int segundosIniciales, segundos, minutos, horas, dias;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el número de segundos: ");
        segundosIniciales = teclado.nextInt();
        
        minutos = segundosIniciales / 60;
        segundos = segundosIniciales % 60;
        horas = minutos / 60;
        minutos = minutos % 60;
        dias = horas / 24;
        horas = horas % 24;
        System.out.println( segundosIniciales + " segundos son: " + dias + " dias, " + horas + " horas, "+
                minutos + " minutos, y " + segundos + "segundos");
    }
    
}
