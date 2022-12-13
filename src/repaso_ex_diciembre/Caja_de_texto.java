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
public class Caja_de_texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        String cadena;
        
        System.out.println("Dime una cadena de texto: ");
        cadena = s.nextLine();
        
        cajaTexto(cadena);
    }
    public static void cajaTexto(String cadena){
        String []array = new String [cadena.length()+4];
        for (int i = 0; i < cadena.length()+4; i++) {
            array[i]= "#";
            System.out.print(array[i]);
        }
        System.out.println("");
        for (int i = 0; i < cadena.length()+4; i++) {
            System.out.print("# "+cadena+" #");
            break;
        }
        System.out.println("");
        for (int i = 0; i < cadena.length()+4; i++) {
            array[i]= "#";
            System.out.print(array[i]);
        }
        System.out.println("");
    }
    
}
