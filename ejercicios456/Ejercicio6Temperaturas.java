/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qantuw.ejercicios456;

import java.util.Scanner;

public class Ejercicio6Temperaturas {
    
     public static void main(String[] args) {
        Scanner Temperatura = new Scanner(System.in);

        System.out.print("Coloque la temperatura en grados C: ");
        double TempCelsius = Temperatura.nextDouble();

            Conversor celsiusAFahrenheit = (celsius) -> celsius * 9 / 5 + 32; //lambda para pasar de celsius a farenheit

        double TempFarenheit = celsiusAFahrenheit.convertir(TempCelsius);

      System.out.println("La temperatura de "+TempCelsius + " grados Celsius  a Farenheit son" + TempFarenheit + " °");
        
        Temperatura.close();
   }

    @FunctionalInterface
    interface Conversor {
        double convertir(double valor);
    }
}

