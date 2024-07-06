package Controller;
import DTO.PeliculaDto;
import Model.TipoGenero;
import Model.Pelicula;
import Model.TipoProyeccion;

import java.util.*;


/**
 * 
 */
    	
public class PeliculasController {
	
	private List<Pelicula> peliculas;
    private static PeliculasController instance;
	
    private PeliculasController() {
    	
    	peliculas= new ArrayList<Pelicula>();

    }
    public static PeliculasController getInstance() {
        if (instance == null) {
            instance = new PeliculasController();
        }
        return instance;
    }

    public Pelicula getPelicula(String id){
        Pelicula pelicula=null;
        for(Pelicula p: peliculas){
            if(p.getPeliculaID()==Integer.parseInt(id)){
                pelicula=p;
            }
        }
        return pelicula;
    }
    public boolean agregarPelicula(PeliculaDto dto){
        boolean resultado=false;
        Pelicula pelicula=getPelicula(dto.getPeliculaID());
        if(pelicula==null){
            pelicula=deDtoAPelicula(dto);
            peliculas.add(pelicula);
            resultado=true;
        }
        else {
            System.out.println("La pelicula ya existe");
        }
        return resultado;
    }
    public Pelicula deDtoAPelicula(PeliculaDto dto){
        Pelicula pelicula=new Pelicula(TipoGenero.valueOf(dto.getGenero()),dto.getDirector(),Integer.parseInt(dto.getDuracionEnMinutos()), dto.getNombrePelicula(), TipoProyeccion.valueOf(dto.getProyeccion()),dto.getActores(),null,Integer.parseInt(dto.getPeliculaID()));
        return pelicula;
    }
    public List<Pelicula> consultarPeliculasPorGenero(TipoGenero genero){
        List<Pelicula> aux=new ArrayList<Pelicula>();
        for(Pelicula p: peliculas){
            if(p.getGeneroID().equals(genero)){
                aux.add(p);

            }
        }
        return aux;
    }

    public List<Pelicula> consultarPeliculas(){
        List<Pelicula> aux=new ArrayList<Pelicula>();
        for(Pelicula p: peliculas){
            aux.add(p);
        }
        return aux;
    }

    public void ABM() {
        // TODO implement here
    }

}