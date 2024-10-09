package teoria;

public class PolimorfismoSobrecarga {

    /*
    POLIMORFISMO
    Característica de POO
    Un función, método o clase se comportará diferente en función del contexto
    en Java, el poliformismo se divide en dos tipos:
    - Polimorfismo de sobrecarga -> en tiempo de compilación
    - Polimorfismo de sobreescritura -> en tiempo de ejecución

    POLIMORFISMO DE SOBRECARGA
    - Se produce cuando dos o más métodos tienen el mismo nombre pero diferentes parámetros
     */
    public static void main(String [] args){
        Calculadora cal = new Calculadora(); //permite crear un objeto de una class creada más tarde
        System.out.println(cal.sumar(2, 3));//método para parámetros int
        System.out.println(cal.sumar(2, 3, 4)); //método para parámetros int pero tres
        System.out.println(cal.sumar(2.5, 3.5)); //método para parámetros double
    }//cierra main


}//cierra clase

class Calculadora{
    public int sumar(int a, int b){
        return a + b;
    }
    public int sumar(int a, int b, int c){
        return a + b + c;
    }
    public double sumar(double a, double b){ //sobrecarga de métodos porque tiene diferente tipo de datos en los parámetros
        return a + b;
    }

}//cierra clase Calculadora
