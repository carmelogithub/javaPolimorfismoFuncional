package practica;

import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/*
Tienes 5 precios (iva 21%)
Muestra por consola el precio con iva incluido
 */
public class Funcional {

    static double[]precios={120.51,452.25,652.25,852.65,452.65};
    static double iva=0.21;
    public static void main(String[] args){
        //solucion1();
        //solucion2();
        solucion3();
    }//cierra main

    public static void solucion1(){

        System.out.println("Precios con IVA - for");
        for (int i=0;i<precios.length;i++){//bucle for para iterar los items del Array
            System.out.println(precios[i]+precios[i]*iva);
        }//cierra for


    }//cierra método solución1

    public static void solucion2(){
        System.out.println("Precios con IVA - funcional Array stream");
        //convierte el array en un flujo de datos
        Arrays.stream(precios)
                .map(precio->precio+precio*iva)//lambda aplicada para realizar un cálculo matemático
                .forEach(System.out::println); //imprime los resultados con un bucle
    }//cierra método solución1

    public static void solucion3(){
        System.out.println("Precios con IVA - funcional Array stream con variable calculo de iva");
        //convierte el array en un flujo de datos
        //interface funcional
        //función pura. operación matemática de tipo double
        //encapsula el cálculo en una función reutilizable
        DoubleUnaryOperator calcularIva = precio->precio+precio*iva;
        Arrays.stream(precios)
                .map(calcularIva)//funcion pura reutilizable en el map
                .forEach(System.out::println);
    }//cierra método solución1

}//cierra class
