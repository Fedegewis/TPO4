package DTO;

import java.util.ArrayList;
import java.util.List;

public class PeliculaDto {
    private String genero;
    private String nombrePelicula;
    private String duracionEnMinutos;
    private String director;
    private List<String> actores=new ArrayList<String>();
    private String proyeccion;
    private String peliculaID;

    public PeliculaDto(String genero, String nombrePelicula, String duracionEnMinutos, String director, List<String> actores, String proyeccion,String peliculaID) {
        this.genero = genero;
        this.nombrePelicula = nombrePelicula;
        this.duracionEnMinutos = duracionEnMinutos;
        this.director = director;
        this.actores = actores;
        this.proyeccion = proyeccion;
        this.peliculaID=peliculaID;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public String getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActores() {
        return actores;
    }

    public String getProyeccion() {
        return proyeccion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setDuracionEnMinutos(String duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public void setProyeccion(String proyeccion) {
        this.proyeccion = proyeccion;
    }

    public String getPeliculaID() {
        return peliculaID;
    }
}