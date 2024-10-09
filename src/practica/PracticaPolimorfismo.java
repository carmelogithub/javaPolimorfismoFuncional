package practica;

import java.util.Scanner;

/*
Tienes matriculados alumnos en DAM y en DAW
Los alumnos de dam, tiene el examen de primer trimestre el 13/12/2024
Los alumnos de daw, tienen el examen de prmer trimestre el 15/12/2024

Se matriculan 5 alumnos .2 de dam y tres de daw
por consola, introduce el alumno que quieres gestionar.
debes demostrar que si es de dam o de daw, la fecha de examen es correcta.

*aplica polimorfismo.
solución
Lo vamos a resolver aplicando POO : herencia, polimorfismo y encapsulamiento
duda en polimofismo :
de sobrecarga / paramétrcio / de tiempo de ejecución
de sobreescritura / dinámico / de tiempo de compilación
Vamos a utilizar el polimorfismo de sobreescritura puesto que tenemos diferentes clases y herencia
 */
public class PracticaPolimorfismo {
    public static void main(String[] args){
        //crear un grupo de alumnos - >lista
        Alumno[] grupoAlumnos = new Alumno[5];
        grupoAlumnos[0] = new AlumnoDAM("Juan");
        grupoAlumnos[1] = new AlumnoDAM("Pedro");
        grupoAlumnos[2] = new AlumnoDAW("Ana");
        grupoAlumnos[3] = new AlumnoDAW("Maria");
        grupoAlumnos[4] = new AlumnoDAW("Luis");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno que quieres gestionar");
        String nombre = sc.nextLine();
        boolean existeAlumno = false;
        for(Alumno alumno: grupoAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                existeAlumno = true;
                System.out.println("El alumno " + alumno.getNombre() + " pertenece a la clase " + alumno.getClass().getSimpleName());
                System.out.println("La fecha del examen es " + alumno.consultarFechaExamen());//qué alumno es? NO. el método se aplica igual para DAM que para DAW
            }//cierra
        }//cierra bucle for
            if(!existeAlumno){
                System.out.println("El alumno no existe");
        }//cierra if
    }//cierra main

}//cierra clase PracticaPolimorfismo

class Alumno{//no public porque debería llamarse el archivo Alumno
    private String nombre; //private para encapsular
    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String consultarFechaExamen(){
        return "la fecha del examen no está fijada";
    }
}//cierra class Alumno

class   AlumnoDAM extends Alumno{
    public AlumnoDAM(String nombre){//constructor envía atributos a la clase padre
        super(nombre);
    }
    @Override
    public String consultarFechaExamen(){//sobreescritura - polimorfismo
        return "13/12/2024";
    }
}//cierra class AlumnoDAM

class AlumnoDAW extends Alumno{
    public AlumnoDAW(String nombre){//constructor envía atributos a la clase padre
        super(nombre);
    }
    @Override
    public String consultarFechaExamen(){//sobreescritura - polimorfismo
        return "15/12/2024";
    }
}//cierra class AlumnoDAW
