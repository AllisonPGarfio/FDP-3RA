/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_metodos;

/**
 *
 * @author garfi
 */
public class EVA3_6_ARREGLOS_METODOS {
    static String[] menu={"PRODUCTOS", "VENTAS", "CLIENTES", "VENTAS"};
    static String[] productos={"TACOS", "TORTAS", "TAMALES", "MONTADOS"};
    
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirArreglo(menu);
        imprimirArreglo(productos);
    }
    public static void imprimirArreglo(String[]arreglo){
         for(int i=0; i<arreglo.length; i++){
             System.out.println((i+1)+"."+arreglo[i]);
         }
         System.out.println("");
     }
}
