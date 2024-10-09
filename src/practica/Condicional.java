package practica;

import java.util.Scanner;
import java.util.function.DoubleConsumer;

public class Condicional {

    public static void main(String[] args){
        //condicionalImperativa();
        //condicionalFuncional();
        condicionalModular();
    }//cierra main

    public static void condicionalImperativa(){
        System.out.println("Condicional Imperativa");
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce la nota del examen: ");
         double nota=sc.nextDouble();

         //evaluar la nota con un if else if
        if(nota<5){
            System.out.println("No has aprobado");
        }else if(nota>=5 && nota<7){
            System.out.println("Obtienes un Bien");
        }else if(nota>=7 && nota<9){
            System.out.println("Obtienes un Notable");
        }else if(nota>=9 && nota<=10){
            System.out.println("Obtienes un Sobresaliente");
        }else{
            System.out.println("Nota no válida");
        }

    }//cierra condicionalImperativa

    public static void condicionalFuncional(){
        System.out.println("Condicional Funcional");
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la nota del examen: ");
        double nota=sc.nextDouble();

        //clase permite encapsular la lógica de obtener la nota
        //DoubleConsumer es una función pura incluida en el paquete de programación function
        //función pura es una función que no tiene efectos secundarios, es decir, no modifica el estado de la aplicación
        DoubleConsumer gestionarNota=n->{
            if(nota<5){
                System.out.println("No has aprobado");
            }else if(nota>=5 && nota<7){
                System.out.println("Obtienes un Bien");
            }else if(nota>=7 && nota<9){
                System.out.println("Obtienes un Notable");
            }else if(nota>=9 && nota<=10){
                System.out.println("Obtienes un Sobresaliente");
            }else{
                System.out.println("Nota no válida");
            }
        };
        //ventaja - mejora la legibilidad del código
        gestionarNota.accept(nota);//llamo a la función pura
    }//cierra condicionalFuncional

    public static void condicionalModular(){
        System.out.println("Condicional Modular");
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la nota del examen: ");
        double nota=sc.nextDouble();

    //llamas a la función (que no es de programaicón funcional)
        gestionarNota(nota);//llamar al "módulo" que se encarga de gestionar la nota
    }//cierra programacionModular


    private static void gestionarNota(double nota){
        if(nota<5){
            System.out.println("No has aprobado");
        }else if(nota>=5 && nota<7){
            System.out.println("Obtienes un Bien");
        }else if(nota>=7 && nota<9){
            System.out.println("Obtienes un Notable");
        }else if(nota>=9 && nota<=10){
            System.out.println("Obtienes un Sobresaliente");
        }else{
            System.out.println("Nota no válida");
        }
    }//cierra gestionarNota



}//cierra clase
