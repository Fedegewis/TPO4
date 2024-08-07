package Controller;


import DTO.FuncionDto;
import DTO.PeliculaDto;
import DTO.SalaDto;
import Model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 */
public class FuncionController {
	
	private List<Funcion> funciones;

	private static FuncionController instancia;
    private PeliculasController peliculasController=PeliculasController.getInstance();
	
	private FuncionController() {

        funciones = new ArrayList<Funcion>();
    	funciones.add(new Funcion(new Date(), 1, "11:00", new Sala(0, null, 0),
                new Pelicula(TipoGenero.Terror,"steven spielberg",120,"Tiburon", TipoProyeccion.DosD,new ArrayList<>(),null,2)));

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
    public boolean nuevaFuncion(FuncionDto funcionDto, PeliculaDto peliculaDto,SalaDto salaDto) throws ParseException {
        boolean resultado = false;
        Funcion funcion=buscarFuncionPorID(funcionDto);
        Pelicula pelicula=peliculasController.getPelicula(peliculaDto.getPeliculaID());
        Sala sala=deDtoASala(salaDto);
        if(funcion==null){
            if(pelicula!=null){
                funcion=deDtoAFuncion(funcionDto,pelicula,sala);
                funciones.add(funcion);
                resultado=true;
            }
            else{
                System.out.println("El Pelicula no existe");
            }
        }
        else{
            System.out.println("El Funcion Ya existe");
        }
        return resultado;
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
    public Funcion buscarFuncionPorID(FuncionDto dto) {
        Funcion funcion = null;
        for (Funcion func : funciones) {
            if (func.getFuncionID()==Integer.parseInt(dto.getFuncionID())){
                funcion = func;
            }
        }
        return funcion;
    }
    public Funcion deDtoAFuncion(FuncionDto dto,Pelicula pelicula,Sala sala) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Funcion funcion = new Funcion(dateFormat.parse(dto.getFecha()),Integer.parseInt(dto.getFuncionID()),dto.getHorario(),sala,pelicula);
        return funcion;
    }

    public Sala deDtoASala(SalaDto salaDto){
        return new Sala(Integer.parseInt(salaDto.getSalaID()),salaDto.getDenominacion(),Integer.parseInt(salaDto.getAsientos()));
    }
}