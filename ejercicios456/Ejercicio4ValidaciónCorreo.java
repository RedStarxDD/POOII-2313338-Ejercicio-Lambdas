/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qantuw.ejercicios456;

import java.util.Scanner;

public class Ejercicio4ValidaciónCorreo {
   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Ingrese su correo electrónico: ");
           String correo = scanner.nextLine();
           
           ValidadorCorreo esCorreoValido = (email) -> email.contains("@") && email.contains(".");
           
           if (esCorreoValido.validar(correo)) {
               System.out.println("El correo es válido.");
           } else {
               System.out.println("El correo no es válido.");
           }
       }
    }

    @FunctionalInterface
    interface ValidadorCorreo {
        boolean validar(String correo);
    }
}
