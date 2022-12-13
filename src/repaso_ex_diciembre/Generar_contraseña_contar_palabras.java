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
public class Generar_contraseña_contar_palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner s = new Scanner (System.in);
//        String cadena;
//        
//        System.out.println("Dime una frase: ");
//        cadena = s.nextLine();
//        
//        System.out.println("Hay "+totalPalabras(cadena)+" palabras");
        System.out.println("La contraseña es --> "+generarContraseña());
        
    }
    public static int totalPalabras(String cadena){
        int contador=1;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)==' '){
                contador++;
            }
        }
        return contador;
    }
    public static String generarContraseña(){
        Scanner s = new Scanner (System.in);
        String frase;
        String contraseña = "";
        do{
            System.out.println("Dime una frase: ");
            frase = s.nextLine();
        }while (totalPalabras(frase)<4);
        char caracter, caracterMayus, carac;
        caracter = frase.charAt(0);
        caracterMayus = Character.toUpperCase(caracter);
        contraseña = contraseña + caracterMayus;
        for (int i = 1; i < frase.length(); i++) {
            if(frase.charAt(i-1)==' '){
                caracter = frase.charAt(i);
                contraseña = contraseña + caracter;
            }
        }
        carac = '+';
        contraseña = contraseña + carac;
        int digito = (int) (Math.random()*10);
        contraseña = contraseña + digito;
        return contraseña;
    }
}
