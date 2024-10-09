package teoria;

public class PolimorfismoSobreescritura {
//este polimorfismo es de sobreescritura, se aplica en tiempo de ejecución cuando se pide el método por cada objeto, por cada contexto
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.comer();

        Perro perro = new Perro();
        perro.comer();

        Gato gato = new Gato();
        gato.comer();

        //Polimorfismo -> cuando llamas al método, todos los métodos son comer pero la implementación es diferente
    }


}//cierra clase PolimorfismoSobreescritura

class Animal{
    public void comer(){
        System.out.println("Animal comiendo");
    }
}//cieera clase Animal

class Perro extends Animal{
    @Override
    public void comer(){//sobreescritura -> modifica el método de la clase base Animal
        System.out.println("Perro comiendo");
    }
}//cierra clase Perro

class Gato extends Animal{
    @Override
    public void comer(){//sobreescritura -> modifica el método de la clase base Animal
        System.out.println("Gato comiendo");
    }
}//cierra clase Gato