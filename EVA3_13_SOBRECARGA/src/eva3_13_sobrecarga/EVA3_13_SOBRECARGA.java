/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_sobrecarga;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA3_13_SOBRECARGA {

    
    public static void main(String[] args) {
       String resu;
       resu = capturar("INTRODUCE EL NOMBRE DEL CLIENTE: ");
       System.out.println(resu);
       double valor;
       valor = capturar("SALARIO DEL EMPLEADO: ", 0.0);
       System.out.println(valor);
       int edad;
       edad = capturar("EDAD DEL USUARIO: ", 1);
       System.out.println(edad);
    }
    public static String capturar(String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
    }
    public static double capturar(String mensaje, double msj){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextDouble();
    }
    public static int capturar(String mensaje, int msj){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextInt();
    }
}
