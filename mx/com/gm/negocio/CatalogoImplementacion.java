package mx.com.gm.negocio;
import mx.com.gm.datos.AccesoDatosImplementacion;
import mx.com.gm.datos.IAccesoDatos;
import mx.com.gm.pelicula.excepciones.AccesoDatosException;
import mx.com.gm.peliculas.domain.Peliculas;

public class CatalogoImplementacion implements iCatalogoNegocios {

    private final IAccesoDatos datos;


    public CatalogoImplementacion() {
        this.datos = new AccesoDatosImplementacion();
    }

    @Override
    public void iniciarCatalogo() {
            try {
                if (this.datos.existe(nombredelarchivo)) {
                    System.out.println("\n El catalago ya fue creado anteriormente, Se llama: "+"'" + nombredelarchivo + "'"+"\n");
                }else{
                    datos.creartxt(nombredelarchivo);
                }
            } catch (AccesoDatosException e) {
                System.out.println("No se pudo obtener el catalogo" + e.getMessage());
            }
        }

        public void agregarPelicula (String nombrepelicula){
            Peliculas classpelicula = new Peliculas(nombrepelicula);
            boolean anexar = false;

            try {
                anexar = datos.existe(nombredelarchivo);
                datos.escribirtxt(classpelicula,nombredelarchivo,anexar);
            } catch (AccesoDatosException e) {
                System.out.println("No se pudo agregar las pinshi pelicula " +e.getMessage());
            }

        }
    }
