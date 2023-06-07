import java.util.Scanner;

public class Adivinar_un_numero {
    public static void main(String[] args) {
        //Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
        //----Solución----
        Scanner cargadorDeDatos = new Scanner(System.in);
        //Generamos un número aleatorio entre 1 y 100:
        int aleatorio, numeroDelUsuario;
        aleatorio = (int) (Math.random() * 100) + 1;
        System.out.println("El número aleatorio es: " + aleatorio);
        System.out.println("Introduce un número mayor o igual a 1 y menor o igual a 100: ");
        int intentos = 0;
        do {
            intentos++;
            numeroDelUsuario = cargadorDeDatos.nextInt();
            if (aleatorio > numeroDelUsuario) {
                System.out.println("Intente con un número más grande que " + numeroDelUsuario);
            } else {
                System.out.println("Intente con un número más pequeño que " + numeroDelUsuario);
            }
        } while (aleatorio != numeroDelUsuario);
        System.out.println("¡Felicidades! Usted ha acertado el número en " + intentos + " intentos.");
    }
}
