/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_sobrecarga_de_metodos;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA3_14_SOBRECARGA_DE_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do{
        imprimirMenu();
        menu = input.nextInt();
            if(menu==1){
                resucalcularCirc();
                 }else if(menu==2){
                    resucalcularRect();
                 }else if(menu==3){
                    resucalcularTrap();
                 }
        }while(menu!=4);
    }
    public static void imprimirMenu(){
        System.out.println("***BIENVENIDO AL SISTEMA***");
        System.out.println("1.-Calcular area del circulo");
        System.out.println("2.-Calcular area del rectangulo");
        System.out.println("3.-Calcular area del trapecio");
        System.out.println("4.-Salir");
    }
    public static void resucalcularCirc(){
        Scanner input = new Scanner(System.in);
        double num, resu;
        System.out.println("AGREGA EL RADIO: ");
        num = input.nextDouble();
        resu=calcularArea(num);
        System.out.println("EL AREA DE TU CIRCULO ES: "+resu);
    } 
    
    public static void resucalcularRect(){
        Scanner input = new Scanner (System.in);
        double num,num2,resu;
        System.out.println("AGREGA  LA BASE: ");
        num = input.nextDouble();
        System.out.println("AGREGA LA ALTURA: ");
        num2= input.nextDouble();
        resu=calcularArea(num,num2);
        System.out.println("EL AREA DE TU RECTANGULO ES: "+resu);
    }
    public static void resucalcularTrap(){
        Scanner input = new Scanner (System.in);
        double num,num2,num3,resu;
        System.out.println("AGREGA  LA BASE MENOR: ");
        num = input.nextDouble();
        System.out.println("AGREGA LA BASE MAYOR: ");
        num2= input.nextDouble();
        System.out.println("AGREGA LA ALTURA: ");
        num3= input.nextDouble();
        resu=calcularArea(num,num2,num3);
        System.out.println("EL AREA DE TU TRAPECIO ES: "+resu);
    }
    public static double calcularArea(double radio){
        double resu = (Math.PI * (radio*radio));
        return resu;
    }
    public static double calcularArea(double base, double altura){
        double resu = (base*altura);
        return resu;
    }
    public static double calcularArea(double basema,double baseme, double altura){
        double resu = (basema+baseme)/(2*altura);
        return resu;
    }
    
}
