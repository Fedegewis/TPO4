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

    public PeliculaDto(String genero, String nombrePelicula, String duracionEnMinutos, String director, List<String> actores, String proyeccion) {
        this.genero = genero;
        this.nombrePelicula = nombrePelicula;
        this.duracionEnMinutos = duracionEnMinutos;
        this.director = director;
        this.actores = actores;
        this.proyeccion = proyeccion;
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
}