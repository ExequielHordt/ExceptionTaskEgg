/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontask05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 26 Nov 2022
 */
public class ExceptionTask05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int randomNumber, userNumber, tryCounter;
        tryCounter = 0;
        userNumber = 0;
        boolean flag;
        flag = false;
        randomNumber = (int) (Math.random() * 500) + 1;
        System.out.println("Adivinar Numero");
        System.out.println("***************");
        do {
            try {
                userNumber = 0;
                System.out.print("Numero: ");
                userNumber = read.nextInt();
                if (userNumber > randomNumber) {
                    System.out.println("El numero ingresado es mayor al numero secreto");
                    tryCounter += 1;
                }

                if (userNumber < randomNumber) {
                    System.out.println("El numero ingresado es menor al numero secreto");
                    tryCounter += 1;
                }
            } catch (InputMismatchException e) {
                tryCounter += 1;
                System.out.println("El valor ingresado es incorrecto. Por favor, ingrese un numero entero");
                read.next();

            }
            System.out.println("Intentos: " + tryCounter);
            System.out.println("");
        } while (userNumber != randomNumber);
        System.out.println("¡Felicitaciones has acertado!");
        System.out.println("Numero secreto: " + randomNumber);
        System.out.println("Numero de intentos: " + tryCounter);
        System.out.println("");
    }

}
