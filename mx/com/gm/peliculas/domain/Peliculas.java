package mx.com.gm.peliculas.domain;

public class Peliculas{     //  tabla de peliculas
    private String nombre;

    //public Peliculas(){

    //}
    public Peliculas(String nombre) {           // variable que va a ir almacenado el nombre de cada pelicula
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }       // metodo get para obtener el nombre de la pelicula

    public void setNombre(String nombre) {             // metodo set para establecer el nombre de la pelicula
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {                                                       // imprime el nombre de la pelicula
        return this.nombre;
    }
}
