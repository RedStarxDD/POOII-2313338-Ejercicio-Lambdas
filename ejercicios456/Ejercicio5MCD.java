/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qantuw.ejercicios456;

import java.util.Scanner;


public class Ejercicio5MCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numerador: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numerador: ");
        int numero2 = scanner.nextInt();

        CalculadorMCD calcularMCD = (a, b) -> {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        };

        int mcd = calcularMCD.calcular(numero1, numero2);
        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);

        scanner.close();
    }

    @FunctionalInterface
    interface CalculadorMCD {
        int calcular(int a, int b);
    }
}
    

