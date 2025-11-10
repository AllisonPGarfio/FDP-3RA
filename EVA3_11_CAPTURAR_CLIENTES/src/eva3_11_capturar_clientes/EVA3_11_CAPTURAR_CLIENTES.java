/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_capturar_clientes;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA3_11_CAPTURAR_CLIENTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] clientes = new String[5];
        double[] credito = new double[5];
        capturarClientes(clientes, credito);
        System.out.print("CLIENTES: ");
        imprimir(clientes);
        System.out.print("CREDITO: ");
        imprimir(credito);
        System.out.print("TODO: ");
        imprimir(clientes, credito);
    }
    public static void capturarClientes(String[]clientes, double credito[]){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<clientes.length; i++){
            System.out.println("NOMBRE DEL CLIENTE: ");
            clientes[i] = input.nextLine();
            System.out.println("CREDITO: ");
            credito[i] = input.nextDouble();
            input.nextLine();//CORREGIR ERROR SIRVE
        }
    }
    
     public static void imprimir(String[]arreglo){
        for(int i=0; i<arreglo.length;i++){
            System.out.println("["+arreglo[i]+"]");
        }
       // System.out.println("");
    }
     public static void imprimir(double[] credito){
                for(int i=0; i<credito.length;i++){
            System.out.println("["+credito[i]+"]");
        }
     }
     public static void imprimir(String[]arreglo, double[] credito){
                for(int i=0; i<credito.length;i++){
            System.out.print("["+arreglo[i]+"]");
            System.out.print("["+credito[i]+"]");
        }
        System.out.println("");
     }
}
