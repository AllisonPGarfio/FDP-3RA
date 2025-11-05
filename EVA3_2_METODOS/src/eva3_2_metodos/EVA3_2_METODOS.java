/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_metodos;

/**
 *
 * @author garfi
 */
public class EVA3_2_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        repetirMensaje("HOLA MUNDO",5);
    }
        public static void repetirMensaje(String mensaje, int repeticiones){//ENCABEZADO DE METODO 
        for(int i=1; i<=repeticiones; i++){
            System.out.println(mensaje);
        }
        
      }
    }
    

