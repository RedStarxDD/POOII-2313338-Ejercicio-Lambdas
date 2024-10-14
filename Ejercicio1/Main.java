/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Lileth
 */
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Función lambda en el Main
        Function<String, Long> contarDeLetras = cadena -> cadena.chars()
            .filter(Character::isLetter)
            .count();

        // Aplicandolo en un ejemplo
        String ejemplo = "Hola";
        System.out.println("Cantidad de letras: " + contarDeLetras.apply(ejemplo));
    }
}