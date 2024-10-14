/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Lileth
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Función lambda en el Main
        Function<List<Integer>, List<Integer>> filtrarImpares = lista -> lista.stream()
        // Filtra solo números impares
            .filter(n -> n % 2 != 0) 
            .collect(Collectors.toList());

        // Aplicandolo en un ejemplo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ,12 ,13 ,14 );
        List<Integer> impares = filtrarImpares.apply(numeros);

        System.out.println("Números impares: " + impares);
    }
}