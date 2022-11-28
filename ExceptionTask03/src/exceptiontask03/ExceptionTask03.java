/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontask03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 25 Nov 2022
 */
public class ExceptionTask03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String a, b;
        int result;
        result = 0;
        System.out.println("Division de numeros");
        System.out.println("*******************");
        System.out.print("Numero 1°: ");
        a = read.next();
        System.out.print("Numero 2°: ");
        b = read.next();
        System.out.println("");
        try {
            result = Integer.parseInt(a) / Integer.parseInt(b);
            System.out.print("El resultado es: " + result);
            System.out.println("");
            System.out.println("");
        } catch (ArithmeticException e) {
            System.out.println("No puede dividir por 0");
            System.out.println("");
        } catch (NumberFormatException e) {
            System.out.println("No puede dividir. Error aritmetico");
            System.out.println("");
        } catch (InputMismatchException e) {
            System.out.println("Error en el ingreso de datos por teclado");
        }

    }

}
