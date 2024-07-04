package Controller;
import Model.TipoGenero;
import Model.Pelicula;
import Model.TipoProyeccion;

import java.util.*;


/**
 * 
 */
    	
public class PeliculasController {
	
	private List<Pelicula> peliculas;
    private static PeliculasController instance=PeliculasController.getInstance();
	
    private PeliculasController() {
    	
    	peliculas= new ArrayList<Pelicula>();
    	peliculas.add(new Pelicula(TipoGenero.Suspenso, "Pelicula1", 180 , "Director X", TipoProyeccion.DosD, Arrays.asList("Actriz Principal", "Actor Secundario"),null));

    }
    public static PeliculasController getInstance() {
        if (instance == null) {
            instance = new PeliculasController();
        }
        return instance;
    }

    /**
     * 
     */
    public void ABM() {
        // TODO implement here
    }

}