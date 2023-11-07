package mx.com.gm.pelicula.excepciones;

public class LecturaDatosException extends AccesoDatosException{             // muesta mensaje en caso de error ,clase hija de Exception
    public LecturaDatosException(String mensaje) {
        super(mensaje);
    }
}
