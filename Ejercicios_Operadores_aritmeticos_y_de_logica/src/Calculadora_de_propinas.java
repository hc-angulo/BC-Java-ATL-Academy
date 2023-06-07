import java.util.Scanner;

public class Calculadora_de_propinas {
    public static void main(String[] args) {
    /*Pídele al usuario que ingrese el total de la cuenta en un restaurante. Pídele al usuario que
     ingrese el porcentaje de propina que desea dejar. Calcula el monto de la propina utilizando la
     fórmula: propina = totalCuenta * (porcentajePropina / 100)
     */
        //----Solución----
        Scanner cargadorDeDatos = new Scanner(System.in);
        double totalDeCuenta, porcentajeDePropina, propina;
        System.out.println("Introduzca el total de la cuenta: ");
        totalDeCuenta = cargadorDeDatos.nextDouble();
        System.out.println("Introduzca el porcentaje de propina que desea agregar: ");
        porcentajeDePropina = cargadorDeDatos.nextDouble();
        propina = totalDeCuenta * porcentajeDePropina / 100;
        System.out.println("La propina a recibir es:  " + propina);
    }
}
