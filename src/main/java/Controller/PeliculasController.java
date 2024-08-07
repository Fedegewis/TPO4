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

    public void cargaInicial(){
        List<String> actores=new ArrayList<String>();
        actores.add("Michael Cane");
        actores.add("Matthew McCounaghey");
        PeliculaDto peliculaDto= new PeliculaDto("Suspenso","Interstellar 2","180","Christopher Nolan",actores,"TresD","21");
        PeliculaDto peliculaDto2= new PeliculaDto("Terror","Inception 2","180","Christopher Nolan",actores,"TresD","31");

        agregarPelicula(peliculaDto);
        agregarPelicula(peliculaDto2);
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
    public List<PeliculaDto> consultarPeliculasPorGenero(TipoGenero genero){
        List<PeliculaDto> aux=new ArrayList<PeliculaDto>();
        for(Pelicula p: peliculas){
            if(p.getGeneroID().equals(genero)){
                aux.add(toDto(p));

            }
        }
        return aux;
    }

    public List<PeliculaDto> consultarPeliculas(){
        List<PeliculaDto> aux=new ArrayList<PeliculaDto>();
        for(Pelicula p: peliculas){
            aux.add(toDto(p));
        }
        return aux;
    }

    public void ABM() {
        // TODO implement here
    }


    public static PeliculaDto toDto(Pelicula p){
        return new PeliculaDto(String.valueOf(p.getGeneroID()),p.getNombrePelicula(),
                String.valueOf(p.getDuracionEnMinutos()),p.getDirector(),
                p.getActores(),String.valueOf(p.getTipo()),String.valueOf(p.getPeliculaID()));
    }


}