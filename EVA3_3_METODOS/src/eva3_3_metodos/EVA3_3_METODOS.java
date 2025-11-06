/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA3_3_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int valor;
       
       do{
           imprimirMenu();
           valor=input.nextInt();
           //MANEJO DE OPCIONES-->SWITCH
           switch(valor){
               case 1:
                   System.out.println("***SUMAR DOS NUMEROS***");
                   realizarSuma();
                   break;
               case 2:
                   System.out.println("***SUMAR DOS NUMEROS***");
                   realizarPotencia();
                   break;
               case 3:
                   break;
           }
       }while(valor!=4);
       
    }
    //IMPRIMIR UN MENU:
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("ELIGE LA OPCION QUE NECESITAS: ");
        System.out.println("1. Calcular una suma");
        System.out.println("2. Calcular una potencia");
        System.out.println("3. Imprimir un mensaje");
        System.out.println("4. Terminar");
    }
    
    public static void realizarSuma(){
        Scanner input = new Scanner(System.in);
        int val1, val2;
        System.out.println("Valor 1: ");
        val1=input.nextInt();
        System.out.println("Valor 2: ");
        val2=input.nextInt();
        
        int resu = sumar(val1, val2);
        System.out.println("LA SUMA ES: "+resu);
        
    }
    public static int sumar (int num1, int num2){
        return num1+num2;
    }
    //CALCULAR UNA POTENCIA
    public static void realizarPotencia(){
        Scanner input = new Scanner(System.in);
        int val1, val2;
        System.out.println("Base: ");
        val1=input.nextInt();
        System.out.println("Exponente: ");
        val2=input.nextInt();
        int resu = calcularPotenncia(val1,val2);
        System.out.println("LA POTENCIA ES: "+resu);
       
    }
    public static int calcularPotenncia(int base, int expo){
        int pot = 1;
        for(int i=1; i<=expo; i++){
           pot = pot*base;
        }
          return pot;      
    }
}
