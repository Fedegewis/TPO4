package Model;

import java.util.*;

/**
 * 
 */
public class Pelicula {
    private TipoGenero generoID;
    private String nombrePelicula;
    private int duracionEnMinutos;
    private String director;
    private List<String> actores;
    private TipoProyeccion tipo;
    private CondicionesDescuento condicionesDescuento;
    /**
     * Default constructor
     */
    public Pelicula(TipoGenero generoID, String director, int duracionEnMinutos, String nombrePelicula, TipoProyeccion tipo, List<String> actores, CondicionesDescuento descuento) {
    
    this.actores = actores;
    this.director = director;
    this.duracionEnMinutos = duracionEnMinutos;
    this.generoID = generoID;
    this.nombrePelicula = nombrePelicula;
    this.tipo = tipo;
    this.condicionesDescuento = descuento;
    
    }

    public TipoGenero getGeneroID() {

        return generoID;
    }

    public void setGeneroID(TipoGenero generoID) {

        this.generoID = generoID;
    }

    /**
     * 
     */


    public CondicionesDescuento getCondicionesDescuento() {

        return condicionesDescuento;
    }


    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public String getDirector(){
        return director;
    }

    /**
     * 
     */
    public int getPeliculaID() {
        // TODO implement here
        return 0;
    }

}