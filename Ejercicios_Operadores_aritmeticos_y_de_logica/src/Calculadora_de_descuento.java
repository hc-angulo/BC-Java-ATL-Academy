import java.util.Scanner;

public class Calculadora_de_descuento {
    public static void main(String[] args) {
    /*
     Pídele al usuario que ingrese el precio original de un producto. Pídele al usuario que
     ingrese el porcentaje de descuento. Calcula el precio final después de aplicar el descuento
     utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
     Muestra el precio final al usuario
     */
        //----Solución----
        Scanner cargadorDeDatos = new Scanner(System.in);
        double precioOriginal, descuento, precioFinal;
        System.out.println("Introduzca el precio original del producto: ");
        precioOriginal = cargadorDeDatos.nextDouble();
        System.out.println("Introduzca el porcentaje de descuento: ");
        descuento = cargadorDeDatos.nextDouble();
        precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio original del producto es " + precioFinal);

    }
}
