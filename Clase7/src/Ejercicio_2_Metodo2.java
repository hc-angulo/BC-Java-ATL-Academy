import java.util.Scanner;

public class Ejercicio_2_Metodo2 {
    public static void main(String[] args) {
        //----Ejercicio-----//
        //Dado un arreglo de números, mostrar el número mayor y el número menor de dicho arreglo.
        //----Solución-----//
        //Arreglo introducido por el usuario----------
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        //Llenamos el arreglo "numeros":
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        //Declaramos variables:
        int mayor = 0; //Variable para almacenar el número mayor del arreglo.
        int menor = 0; //Variable para almacenar el número menor del arreglo.

        boolean menorEncontrado = false; //Variable para indicar si hemos encontrado el número menor. La inicializamos en "false".
        boolean mayorEncontrado = false; //Variable para indicar si hemos encontrado el número mayor. La inicializamos en "false".
        //--------- Código para evaluar cual es el mayor y menor número del arreglo ---------//
        for (int i = 0; i < numeros.length; i++) {
            int cantidadDeNumerosMayores = 0;
            int cantidadDeNumerosMenores = 0;
            if (i != numeros.length - 1) { //Entraremos en este If si no estamos examinando el último número del arreglo.
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] < numeros[j] && menorEncontrado == false) {
                        cantidadDeNumerosMayores++;
                        if (cantidadDeNumerosMayores == numeros.length - i - 1) {
                            menor = numeros[i];
                            menorEncontrado = true;
                        }
                    } else if (numeros[i] > numeros[j] && mayorEncontrado == false) {
                        cantidadDeNumerosMenores++;
                        if (cantidadDeNumerosMenores == numeros.length - i - 1) {
                            mayor = numeros[i];
                            mayorEncontrado = true;
                        }
                    }
                }
            } else {
                if (mayorEncontrado == false) {
                    mayor = numeros[i];
                } else if (menorEncontrado == false) {
                    menor = numeros[i];
                }
            }
        }
        ///------Resultado-----//
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);
    }
}
