/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontask02;

/**
 *
 * @author Exequiel Hordt
 * @version 24 Nov 2022
 */
public class ExceptionTask02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int[] arrayException = new int[5];
        //Procedures
        try {
            for (int i = 0; i < 10; i++) {
                arrayException[i] = i + 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El valor que desea ingresar se encuentra fuera del alcance del array");
            System.out.println("");
        }
    }

}
