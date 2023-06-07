import java.util.Scanner;

public class Conversor_de_millas_a_kilometros {
    public static void main(String[] args) {
        /*
         Pídele al usuario que ingrese una distancia en millas. Convierte la distancia a
         kilómetros utilizando la fórmula: kilómetros = millas * 1.60934. Muestra la distancia
         en kilómetros al usuario.
        */
        //----Solución---
        Scanner cargadorDeDatos = new Scanner(System.in);
        System.out.println("Introduzca la distancia en Millas: ");
        double millas = cargadorDeDatos.nextDouble();
        double factorDeConversion = 1.60934;
        double deMillasAKilometros = millas * factorDeConversion;
        System.out.println("Su distancia en Kilómetros es " + deMillasAKilometros);
    }
}
