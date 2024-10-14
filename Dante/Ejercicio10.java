/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dante;

import java.util.List;

/**
 *
 * @author user
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> prohibidas=List.of("test","poo","funcional");
        Predicador predicador= (text, list) -> !list.stream().noneMatch(text::contains);

        System.out.println(predicador.predicar("Hola mundo", prohibidas));
        System.out.println(predicador.predicar("testing", prohibidas));
    }
}
