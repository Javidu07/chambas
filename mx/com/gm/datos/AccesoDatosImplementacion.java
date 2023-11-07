package mx.com.gm.datos;

import mx.com.gm.pelicula.excepciones.AccesoDatosException;
import mx.com.gm.pelicula.excepciones.EscrituraDatosException;
import mx.com.gm.pelicula.excepciones.LecturaDatosException;
import mx.com.gm.peliculas.domain.Peliculas;
import java.io.*;
import java.util.*;


public class AccesoDatosImplementacion implements IAccesoDatos {  // Clase acceso implementacion de datos
    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosException {    // Este metodo verifica si existe o no el archivo
        File archivo = new File(nombreArchivo);                                 // el throws es la implementacion del metodo
        return archivo.exists();                                                // si existe algo lo muestra
    }

    @Override
    public void escribirtxt(Peliculas peliculas, String nombreRecurso, boolean anexar) throws EscrituraDatosException {      // metodo que va llenando o escribiendo en Pelis.txt
        File escribirtxt = new File(nombreRecurso);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(escribirtxt, anexar));
            salida.println(peliculas.toString());
            salida.close();
            System.out.println("\n Se Agrego:  " + "'" + peliculas + "'" + "   Con exito al Catalogo de peliculas \n");
        } catch (Exception e) {
            System.out.println("No se pudo escribir el archivo" + e.getMessage());
        }
    }

    @Override
    public void creartxt(String nombreRecurso) throws AccesoDatosException {                                 // este metodo crea el archivo Peliculas.txt
        File creararchivo = new File(nombreRecurso);
        try {
            PrintWriter salidaarchivo = new PrintWriter(new FileWriter(creararchivo));
            salidaarchivo.close();
            System.out.println("Se creo el archivo: \n " + nombreRecurso + "\n ");
        } catch (Exception e) {
            e.printStackTrace();                  // sirve para ejecutar el programa en consola
            throw new AccesoDatosException("No se creo el archivo \n " + e.getMessage());
        }
    }
}
















  /*  @Override
    public void borrar(String nombreRecurso) throws AccesoDatosException {                                             // metodo que borra la pelicula que el usuario quiera

    }



    @Override
    public String buscar(String nombreRecursos, String buscar) throws LecturaDatosException {                             // metodo que va a buscar en el archivo las pelis que quiera el usuario
    }



    @Override
    public List<Peliculas> listarPeliculas(String nombreRecurso) throws LecturaDatosException {   // este metodo es la lista "arreglo" donden se van a listar las peliculas
        File archivo = new File(nombreRecurso);                                                   //  se utiliza la libreria file propia de java y va almacenar los datos en la variable archivo
        List<Peliculas> pelicula = new ArrayList<>(); //1. Spiderman 2.-El origen                 //  arrlego donde se van almacenar las peliculas

        try {                                                                                    // este try catch va a estar ejecutando el programa aunque haya error
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));                // el buffer es una funcion que va junto el file sirve para leer lo que contiene el fiie "archivo"
            String linea = null;                                                                 // declaramos una variable linea en vacio para evitar posibles errores
            linea = entrada.readLine();                                                          // igualamos line a entrada que pertenece al bufefer osea leemos el archivo

            while (linea != null) {                                                              // mientras en linea no haya nada va a ir llenando peliculas
                Peliculas peliculas = new Peliculas(linea);
            }

        } catch (
                FileNotFoundException e) {                                                       // si no existe alguna pelicula muestra el mensaje de error
            e.printStackTrace();                                                                  // es para imprimir el error
            throw new LecturaDatosException("No se pudo listar las peliculas " + e.getMessage());  // mensaje de error
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());                                            // si hay un error durante la ejecucion imprime que fue lo que fallo
        }

    }

*/


