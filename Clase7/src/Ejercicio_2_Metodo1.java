import java.util.Scanner;

public class Ejercicio_2_Metodo1 {
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
        int mayor; //Variable para almacenar el número mayor del arreglo.
        int menor; //Variable para almacenar el número menor del arreglo.
        int auxiliar;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                auxiliar = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = auxiliar;
            }
        }
        menor = numeros[0];
        mayor = numeros[numeros.length - 1];
        //------Resultado:
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);
    }
}
