/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_métodos;

/**
 *
 * @author garfi
 */
public class EVA3_1_MÉTODOS {
    public static void main(String[] args) {
        // INVOCAR EL METODO
        //LLAMADA A PROCEDIMIENTO O FUNCION
        //1.SI QUIEREMOS RECUPERAR EL VALOR
        int resu=calcularCuadrado(100);
        System.out.println("EL CUADRADO DE 100 ES: " + resu);
        //2.USAR EL VALOR SI GUARDARLO
        System.out.println("EL CUADRADO DE 100 ES:  " + calcularCuadrado(100));
        //3.NO ME INTERESA EN RESULTADO
        calcularCuadrado(100);
    }
    //MODIFICADORES
    //MODIFICADOR DE ACCESO: PUBLIC, PRIVATE, PROTECTED, DEFAULT
    //STATIC -- SE NECESITA PARA USAR NUESTROS MÉTODOS EN EL MAIN
    //PUBLIC STATIC
    //VALOR DE RETORNO (TIPO DE DATO)
    //NOMBRE DEL MÉTODO(USAR VERBO)
    //LISTA DE PARÁMETROS
    //CERO O N CANTIDAD
    public static int calcularCuadrado(int num){ //ENCABEZADO(HEADER)
       //{}-->IMPLEMENTACION DEL MÉTODO(CUERPO DEL MÉTODO)
       int cuadrado = num * num;
       return cuadrado;
       //YA NO SE PONE CODIGO DESPUES DEL RETURN
}
}