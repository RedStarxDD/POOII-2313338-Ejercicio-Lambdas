/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dante;

import java.util.List;

/**
 *
 * @author user
 */
@FunctionalInterface
public interface Predicador {
    boolean predicar(String texto, List<String> lista);
}
