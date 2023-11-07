package mx.com.gm.inicio;

import mx.com.gm.negocio.CatalogoImplementacion;
import mx.com.gm.negocio.iCatalogoNegocios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {

        int opcion = -1;
        Scanner teclado = new Scanner(System.in);
        iCatalogoNegocios catalogo = new CatalogoImplementacion();

        while (opcion != 0) {
            System.out.println("Bienvenido al netflix de Dani y Javi \n");
            System.out.println(" Elige una opcion valedor \n");
            System.out.println("1.- Iniciar Catalogo peliculas \n");
            System.out.println("2.- Agregar peliculas \n");
            System.out.println("3.- Listar peliculas \n");
            System.out.println("4.- Buscar peliculas \n");
            System.out.println("0.- Salir \n");

            try {
                opcion = Integer.parseInt(teclado.nextLine());             // compara que numero se ingreso y ejecuta la opcion que corresponda
                switch (opcion) {
                    case 1:
                        catalogo.iniciarCatalogo();                    // crea el catalogo si no existe, sino, manda el catalogo existente
                        break;
                    case 2:
                        System.out.println("\n Agrega una pelicula");        // agrega la peli ingresada a Pelis.txt
                        String nombrepeli = teclado.nextLine();
                        catalogo.agregarPelicula(nombrepeli);
                        break;
                    case 0:                                               // Sale del sistema
                        System.out.println(" Usted se a ido alv jajaja \n :D :D :D :D :D :D \n  XD XD XD XD XD XD ");
                        break;
                    default:
                        System.out.println("esta opcion no se reconoce");
                        break;
                }
            }catch (Exception e) {
                System.out.println("Elige una de las opciones mi tio");
            }
        }
    }
}
