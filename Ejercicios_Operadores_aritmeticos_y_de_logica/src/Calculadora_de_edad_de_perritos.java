import java.util.Scanner;

public class Calculadora_de_edad_de_perritos {
    public static void main(String[] args) {
        /*
          Pídele al usuario que ingrese la edad de su perro. Convierte esa edad a años de
          perro (se dice que 1 año humano equivale a 7 años de perro).
        */
        //----Solución----
        int entrada, edadDePerrito;
        Scanner cargadorDeDatos = new Scanner(System.in);
        entrada = cargadorDeDatos.nextInt();
        final int factorDeConversion = 7;
        edadDePerrito = entrada * factorDeConversion;
        System.out.println("La edad del Perrito es " + edadDePerrito);
    }
}

