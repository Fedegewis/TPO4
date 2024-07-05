package Model;

import java.util.*;

/**
 * 
 */
public class Funcion {
    private Pelicula pelicula;
    private int funcionID;
    private String horario;
    private Date fecha;
    private List<Entrada> entradas= new ArrayList<Entrada>();
    private Sala sala;
    /**
     * Default constructor
     */
    public Funcion(Date fecha, int funcionID, String horario, Sala sala, Pelicula pelicula) {

    	this.fecha = fecha;
    	this.funcionID = funcionID;
    	this.horario = horario;    	
    	this.sala = sala;
    	this.pelicula = pelicula;

    	
    }

    public Pelicula getPelicula() {

        return pelicula;
    }

    public List<Entrada> getEntradas() {

        return entradas;
    }

    public int getSalaID() {
        // TODO implement here
        return sala.getSalaID();
    }


    public int getSucursalID() {
        // TODO implement here
        return sala.getSucursalID();
    }


    public int getPeliculaID() {
        // TODO implement here
        if(Objects.nonNull(getPelicula().getPeliculaID())){

        }
        return 0;
    }
    public int getCantidadAsientosDisponibles() {
    	
		return 0;
        // TODO implement here
    }

    public int getFuncionID() {

        return this.funcionID;
    }

    public Date getFecha() {
		return fecha;
        // TODO implement here
    }

    public float calcularMontoPorEntradaDeLaPelicula(){
        float total = 0.0f;
        for (Entrada entrada:getEntradas()) {
            total = total+ (entrada.getPrecio() -
                    (entrada.getPrecio()*pelicula.getCondicionesDescuento().getDescuento()));
        }
        return total;
    }

}