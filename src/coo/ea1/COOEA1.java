package coo.ea1;

import java.util.ArrayList;
import java.util.Scanner;

public class COOEA1 {

    public static void main(String[] args) {

        System.out.println("Bienvenido/a al listador de Razas. Ud. debera ingresar razas de perros hasta que decida lo contrario.");
        int i = 1;
        String razza;
        ArrayList <String> listaDeRazas = new ArrayList();

        do {
            razza = ingresarUnaRaza(i);
            listaDeRazas.add(razza);
            i++;
        } while (consultarSiContinua() == true);

        mostrarArrayList(listaDeRazas);
    }

    public static String ingresarUnaRaza(int i) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Por favor, ingrese la raza del perro numero " + i + " > ");
        String raza = teclado.next();
        return raza;
    }

    public static Boolean consultarSiContinua() {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Si desea agregar otra raza, por favor indique si. De lo contrario indique no > ");
        String respuesta = teclado.next();

        while (!respuesta.equals("si") && !respuesta.equals("no")) {
            System.out.print("Ingreso una respuesta equivocada, por favor, vuelva a indicar si o no > ");
            respuesta = teclado.next();
        }
        return respuesta.equals("si");
    }

    public static void mostrarArrayList(ArrayList listaDeRazas) {
        System.out.println("La lista de razas ingresadas es: ");
        listaDeRazas.forEach((aux) -> {
            System.out.println("- " + aux);
        });

    }

}
