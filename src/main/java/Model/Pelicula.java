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

    private int peliculaID;
    /**
     * Default constructor
     */
    public Pelicula(TipoGenero generoID, String director, int duracionEnMinutos, String nombrePelicula, TipoProyeccion tipo, List<String> actores,CondicionesDescuento descuento,int peliculaID) {
    
    this.actores = actores;
    this.director = director;
    this.duracionEnMinutos = duracionEnMinutos;
    this.generoID = generoID;
    this.nombrePelicula = nombrePelicula;
    this.tipo = tipo;
    this.condicionesDescuento = descuento;
    this.peliculaID=peliculaID;
    
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
        return peliculaID;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public TipoProyeccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoProyeccion tipo) {
        this.tipo = tipo;
    }

    public void setPeliculaID(int peliculaID) {
        this.peliculaID = peliculaID;
    }
}