package practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Pides un número por consola
lo guardas en una lista
dejas de pedir números cuando pulsas 0
Muestra la media de los números introducidos
Puedes meter decimales
 */
public class BucleWhile {

    public static void main(String[] args) {
        //bucleImperativo();
        bucleFuncional();
    }//cierra main

    public static void bucleImperativo(){
        Scanner sc = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        double suma=0;//totalizador
        int contador=0;//contador

        while(true){
            System.out.println("Introduce un número");
            double numero = sc.nextDouble();
            if(numero==0){
                break;//sale del bucle
            }//cierra if
            numeros.add(numero);
            suma+=numero;//actualizar la suma de los números
            contador++;//actualizar el contador
        }//cierra while
        System.out.println("La media de los números introducidos es: "+suma/contador);
    }//cierra bucleImperativo
    public static void bucleFuncional(){
        Scanner sc = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        while(true){
            System.out.println("Introduce un número");
            double numero = sc.nextDouble();
            if(numero==0){
                break;//sale del bucle
            }//cierra if
            numeros.add(numero);
        }//cierra while
        double notaMedia=numeros.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.println("La media de los números introducidos es: "+notaMedia);
    }//cierra bucleFuncional

}//cierra BucleWhile
