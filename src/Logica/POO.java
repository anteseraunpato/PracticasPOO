package Logica;

import javax.swing.*;
import java.util.Arrays;

public class POO {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno(); //el alumno1 no tiene datos aún
        Alumno alu2 = new Alumno(8, "Jahir", "Medina");

    //asignamos los datos del alumno 2
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("Su nombre es: " + alu2.getNombre());
        System.out.println("Su apellido es: " + alu2.getApellido());

    //asignamos los datos del alumno 1 que estaba vacío
        alu1.setId(8);
        alu1.setNombre("Jamie");
        alu1.setApellido("New");

        System.out.println("---------------"); //muestro los datos del alumno 1

        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("Su nombre es: " + alu1.getNombre());
        System.out.println("Su apellido es: " + alu1.getApellido());

        System.out.println("---------------");
        alu2.setId(35); //este sobreescribe e valor anterior
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("Su nombre es: " + alu2.getNombre());
        System.out.println("Su apellido es: " + alu2.getApellido());



    }
}
