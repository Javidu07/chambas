package mx.com.gm.pelicula.excepciones;

public class EscrituraDatosException extends AccesoDatosException{              // metodo que manda mensaje si existe error en la escritura de alguna peli, clase hija de acceso datos
    public EscrituraDatosException(String mensaje) {
        super(mensaje);
    }
}
