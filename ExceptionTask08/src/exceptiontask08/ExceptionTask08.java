/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontask08;

/**
 *
 * @author Exequiel Hordt
 * @version 26 Nov 2022
 */
public class ExceptionTask08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Class One
        System.out.println("Clase Uno");
        System.out.println("*********");
        try {
            System.out.println(ClassOne.method());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
        //Class Two
        System.out.println("Clase Dos");
        System.out.println("*********");
        try {
            System.out.println(ClassTwo.method());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
//        Class Third
        System.out.println("Clase Tres");
        System.out.println("**********");
        try {
            System.out.println(ClassThird.method());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }

}
