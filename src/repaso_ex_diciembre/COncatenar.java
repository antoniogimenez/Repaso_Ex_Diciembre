/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_ex_diciembre;

/**
 *
 * @author anton
 */
public class COncatenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "hola soy antonio";
        cadena.toLowerCase();
        
        System.out.println("La nueva frase es --> "+mayusConvertir(cadena));
    }
    public static String mayusConvertir(String cadena){
        char caracter;
        String frase = "";
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)=='o'){
                frase = frase + '0';
            } else if(cadena.charAt(i)=='i'){
                frase = frase + '1';
            } else{
                caracter = cadena.charAt(i);
                frase = frase + Character.toUpperCase(caracter);
            }
        }
        return frase;
    }
    
}
