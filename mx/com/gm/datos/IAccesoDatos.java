package mx.com.gm.datos;

import mx.com.gm.pelicula.excepciones.AccesoDatosException;
import mx.com.gm.pelicula.excepciones.EscrituraDatosException;
import mx.com.gm.pelicula.excepciones.LecturaDatosException;
import mx.com.gm.peliculas.domain.Peliculas;

import java.util.List;

public interface IAccesoDatos {

                   //DEPENDE DE LA ACCION QUE SE HAGA SE EJECUTARAN LAS EXCEPCIONES

    boolean existe(String nombreArchivo) throws AccesoDatosException;                                               //  comprueba si existe el archivo
    void escribirtxt(Peliculas peliculas, String nombreRecurso, boolean anexar) throws EscrituraDatosException;    //  metodo que manda los datos para llenar Pelis.txt
    void creartxt(String nombreRecurso) throws  AccesoDatosException;                                              // metodo que manda el nombre del txt ára crearlo

//    String buscar(String nombreRecursos, String buscar) throws LecturaDatosException;                          // metodo que para buscar peliculas en el txt

//     void borrar(String nombreRecurso) throws AccesoDatosException;                                           // metodo para borrar peliculas del txt

//    List<Peliculas> listarPeliculas(String nombreRecurso) throws LecturaDatosException;                         // arrlego donde se van a gaurdar las pelis en caso de erros manda la exepcion
}
