package ec.edu.ups.poo.clases.principal;

import ec.edu.ups.poo.clases.persona.Familiar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import ec.edu.ups.poo.clases.persona.Persona;
import org.w3c.dom.ls.LSOutput;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Acabar la carrera");
        Persona personita = new Persona();
        personita.setNombre(sc1.next());
        personita.setApellido(sc1.next());
        personita.setCedula(sc1.next());
        personita.setDireccion(sc1.next());


        System.out.println("Cuantas personas quieres ingresar: ");
        int numeroDePersonas = sc1.nextInt();
        Persona[] personas = new Persona[numeroDePersonas];

        System.out.println("Cuantos familiares quieres ingresar: ");
        int numeroDeFamiliares = sc1.nextInt();
        Familiar[] familiares = new Familiar[numeroDeFamiliares];

        for (int i = 0; i < numeroDePersonas; i++) {
            System.out.println("PERSONAS");
            System.out.print("Ingrese el numero de cedula: ");
            String cedula = sc1.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = sc1.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = sc1.next();
            sc1.nextLine();
            System.out.print("Ingrese la direccion: ");
            String direccion = sc1.nextLine();
            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }

        for (int i = 0; i < numeroDeFamiliares; i++) {
            System.out.println("FAMILIARES");
            System.out.print("Ingrese el numero de cedula: ");
            String cedula = sc1.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = sc1.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = sc1.next();
            sc1.nextLine();
            System.out.print("Ingrese la direccion: ");
            String direccion = sc1.nextLine();
            System.out.print("Ingrese el parentesco: ");
            String parentesco = sc1.next();
            System.out.print("Ingrese el tipo de sangre: ");
            String tipoDeSangre = sc1.next();
            System.out.print("Ingrese el año de su nacimiento: ");
            int anio = sc1.nextInt();
            System.out.print("Ingrese el mes de su nacimiento: ");
            int mes = sc1.nextInt();
            System.out.print("Ingrese el dia de su nacimiento: ");
            int dia = sc1.nextInt();
            GregorianCalendar fechaNacimiento = new GregorianCalendar(anio, mes - 1, dia);
            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, fechaNacimiento, parentesco, tipoDeSangre);
        }

        System.out.println("\nLISTA DE PERSONAS:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        System.out.println("\nLISTA DE FAMILIARES:");
        for (Familiar familiar : familiares) {
            System.out.println(familiar);
        }
    }
}
    // getIstance devuelve el metodo de ese momento
    // Final es la manera de definir las constantes