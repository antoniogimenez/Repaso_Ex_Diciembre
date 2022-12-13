/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_ex_diciembre;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        String palabra;
        
        System.out.println("Dime una palabra: ");
        palabra = s.nextLine();
        if(esPalindromo(palabra)){
            System.out.println("Si es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        
    }
//    public static boolean esPalindromo(String palabra){
//        boolean esIgual = false;
//        for (int i = 0; i < palabra.length(); i++) {
//            if(palabra.charAt(i)==palabra.charAt(palabra.length()-i)){
//                esIgual = true;
//            }else {
//                esIgual = false;
//            }
//        }
//        return esIgual;
//    }
    public static boolean esPalindromo(String palabra){
        String resultado = "", resultado2 = "";
        boolean esIgual = false;
        for (int i = 0; i < palabra.length(); i++) {
            resultado = resultado + palabra.charAt(i);
        }
        for (int i = palabra.length()-1; i >=0; i--) {
            resultado2 = resultado2 + palabra.charAt(i);
        }
        for (int i = 0; i < palabra.length(); i++) {
            if(resultado.charAt(i)==resultado2.charAt(i)){
                esIgual = true;
            } else{
                esIgual = false;
            }
        }
        return esIgual;
    }
    
}
