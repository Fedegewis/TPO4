package Controller;

import DTO.FuncionDTO;
import DTO.FuncionDto;
import DTO.PeliculaDto;
import DTO.SalaDto;
import Model.*;

import java.util.*;

/**
 * 
 */
public class FuncionController {
	
	private List<Funcion> funciones;

	private static FuncionController instancia;
	
	private FuncionController() {

        funciones = new ArrayList<Funcion>();
    	funciones.add(new Funcion(new Date(), 1, "11:00", new ArrayList<Entrada>(), new Sala(0, null, 0),
                new Pelicula(TipoGenero.Terror,"steven spielberg",120,"Tiburon", TipoProyeccion.DosD,new ArrayList<>(),null)));

    }
    public static FuncionController getInstancia() {
        if (instancia == null) {
            instancia = new FuncionController();
        }
        return instancia;
    }

    /**
     * Default constructor
     */
    public boolean nuevaFuncion(FuncionDto funcion, PeliculaDto pelicula){
        PeliculasController peliculasController = PeliculasController.getInstance();
        Pelicula peliculaOK=peliculasController.getPelicula(pelicula);
        if(funcion != null && pelicula !=null ){
            if (peliculaOK!=null){

            }
        }

    }




    /**
     * 
     */
    public void ABM() {
        // TODO implement here
    }

    /**
     * @param funcionID 
     * @return
     */
    public int obtenerAsientosDisponiblePorFuncion(int funcionID) {
    	int asientos = -1;
		return asientos;
    }

    /**
     * @param fchFuncion 
     * @return
     */
    public List<FuncionDTO> getListaFunciones(Date fchFuncion) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int peliculaMasVista() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int diaDeLaSemanaConMenorVentas() {
        // TODO implement here
        return 0;
    }

    public List<Funcion> buscarPeliculaPorFuncion(int peliculaID) {
        List<Funcion> funcionesDeLaPelicula = new ArrayList<>();
        for (Funcion funcion : funciones) {
            if (funcion.getPeliculaID() == peliculaID){
                funcionesDeLaPelicula.add(funcion);
            }
        }
        return funciones;
    }

    public List<Funcion> buscarPeliculaPorGenerosFuncion(TipoGenero genero) {
        List<Funcion> funcionesDeLaPelicula = new ArrayList<>();
        for (Funcion funcion : funciones) {
            if (funcion.getPelicula().getGeneroID() == genero){
                funcionesDeLaPelicula.add(funcion);
            }
        }
        return funciones;
    }

    public static Funcion toModel(FuncionDto funcionDto,Pelicula pelicula){
        return new Funcion(Date.parse(funcionDto.getFecha()),Integer.parseInt(funcionDto.getFuncionID()),funcionDto.getHorario(),
              funcionDto.getSala(),pelicula);
    }

    public static Sala toModel(SalaDto salaDto){

    }
}