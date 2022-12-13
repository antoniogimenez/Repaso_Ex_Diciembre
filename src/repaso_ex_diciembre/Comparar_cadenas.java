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
public class Comparar_cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cad1 = "Hola soy Antonio";
        String cad2 = "Hola soy Antonio";

        if (Iguales(cad1, cad2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO son iguales");
        }

    }

    public static boolean Iguales(String cad1, String cad2) {
        boolean esigual = false;
        if(cad1.length() == cad2.length()){
            for (int i = 0; i < cad1.length(); i++) {
                if (cad1.charAt(i) == cad2.charAt(i)) {
                    esigual = true;
                }
            }
        }
        return esigual;
    }

}
