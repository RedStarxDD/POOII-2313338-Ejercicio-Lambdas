/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Dante;

import java.util.List;

/**
 *
 * @author user
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        List<String> nombres=List.of("Qantu","Lileth","Valentina");
        Consumidor consumidor= (list) -> {
            list.stream().map(name->name.toUpperCase()).forEach(System.out::println);
        };
        consumidor.consumir(nombres);
    }
}
