import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        //---- Ejercicio ----//
        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        //---- Solución -----//
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        //Llenamos el arreglo "numeros" por valores que introduzca el usuario:
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        //A continuación, mostraremos los números que son elementos del arreglo "numeros"
        for (int numero : numeros) {
            System.out.print(numero);
        }
    }
}