/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA3_4_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double far, resu, cel, resu2;
      int valor;
      
      do{
       imprimirMenu();
       valor = input.nextInt();
       switch(valor){
       case 1:
       System.out.println("GRADOS FAHRENHEIT");
       far=input.nextDouble();
       resu=convertitFarCelcius(far);
       System.out.println(far+"°FAHRENHEIT = "+resu+"°C");
       break;
       case 2:
       System.out.println("GRADOS CELCIUS");
       cel=input.nextDouble();
       resu=convertitCelFahrenheit(cel);
       System.out.println(cel+"°CELSIUS = "+resu+"°F");
       break;
       case 3:
       System.out.println("GRADOS CELCIUS");
       cel=input.nextDouble();
       resu=convertitCelKelvin(cel);
       System.out.println(cel+"°CELSIUS = "+resu+"°K");
       break;
    }
    }while(valor!=4);
      }
    
     public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("ELIGE LA OPCION QUE NECESITAS: ");
        System.out.println("1. Convertir Farhenheit a Celsius");
        System.out.println("2. Convertir Celsius a Farhenheit");
        System.out.println("3. Convertir Celsius a Kelvin");
        System.out.println("4. Terminar");
    }
    public static double convertitFarCelcius(double far){
        double resu = (far-32)/1.8;
        return resu;
    }
    public static double convertitCelFahrenheit(double cel){
        double resu = (cel*1.8)+32;
        return resu;
    }
    public static double convertitCelKelvin(double cel){
        double resu = (cel+273);
        return resu;
    }
    
}
