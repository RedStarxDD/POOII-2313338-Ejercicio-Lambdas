/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Lileth
 */
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Función lambda para validar si el día es laborable
        Predicate<String> esDiaLaborable = dia -> {
            String diaMinusculas = dia.toLowerCase();
            return diaMinusculas.equals("lunes") || diaMinusculas.equals("martes") ||
                   diaMinusculas.equals("miércoles") || diaMinusculas.equals("jueves") ||
                   diaMinusculas.equals("viernes");
        };

        // Aplicandolo en un ejemplo
        String dia1 = "Domingo";
        String dia2 = "Jueves";
        
        System.out.println(dia1 + " es laborable: " + esDiaLaborable.test(dia1));
        System.out.println(dia2 + " es laborable: " + esDiaLaborable.test(dia2));
    }
}