package mx.com.gm.pelicula.excepciones;

public class AccesoDatosException extends Exception {                            // // metodo que manda mensaje si existe error en acceder a los datos o pelis , clase hija de Exception
    public AccesoDatosException(String mensaje) {
        super(mensaje);                                         //ACCEDE A LOS OBJETOS DEL PADRE

    }
}
