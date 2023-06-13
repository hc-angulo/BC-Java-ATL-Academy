import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //----Ejercicio-----//
        //Mostrar el promedio de los números almacenados en un arreglo.
        //----Solución------//
        //Arreglo de números introducido por usuario:
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        //Llenamos el arreglo "numeros" por valores que introduzca el usuario:
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        //Promedio de los elementos del arreglo:
        double promedio;
        int suma = 0;
        int denominador = numeros.length;
        for (int numero : numeros) {
            suma += numero;
        }
        promedio = (double)suma / denominador;
        System.out.println("El promedio de los números introducidos por el usuario es: " + promedio);
    }
}
