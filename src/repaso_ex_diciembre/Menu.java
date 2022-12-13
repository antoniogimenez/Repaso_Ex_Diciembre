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
public class Menu {
    public static int aleatorio(int min, int max){
        
        int num = (int) (Math.random()*(max-min+1)+min);
        return num;
    }
    public static void generarArray(int lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.print("|"+lista[i]);
        }
        System.out.println("|");
    }
    public static int maxNum(int lista[]){
        int max =0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]>max){
                max=lista[i];
            }
        }
        return max;
    }
    public static int minNum(int lista[]){
        int min =10;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]<min){
                min=lista[i];
            }
        }
        return min;
    }
    public static int sumaArray(int lista[]){
        int suma=0;
        for (int i = 0; i < lista.length; i++) {
            suma = lista[i]+suma;
        }
        return suma;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        int min=-10, max=10;
        int opcion = 0;
        int []lista = new int [5];
        do{
            System.out.println("Manejador de Arrays");
            System.out.println("=========================");
            System.out.println("Array --> ");generarArray(lista);
            System.out.println("===========================");
            System.out.println("1. Generar nuevo Array");
            System.out.println("2. Obtener el maximo y el minimo");
            System.out.println("3. Obtener la suma");
            System.out.println("4. Salir");
            
            do{
                System.out.println("Dime una opcion: ");
                opcion = Integer.parseInt(s.nextLine());
            } while(opcion<1 || opcion>4);
            
            switch (opcion){
                case 1:
                    for (int i = 0; i < lista.length; i++) {
                        lista[i]= aleatorio(min,max);
                    }
                    break;
                case 2: 
                    System.out.println("El maximo ---> "+maxNum(lista));
                    System.out.println("El minimo ---> "+minNum(lista));
                    break;
                case 3:
                    System.out.println("La suma ---> "+sumaArray(lista));
                    break;
                case 4: 
                    System.out.println("Saliendo....");
                    break;
            }
            
        }while (opcion!=4);
    }
    
}
