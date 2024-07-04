package DTO;

import Model.Entrada;
import Model.Pelicula;
import Model.Sala;

import java.util.Date;
import java.util.List;

public class FuncionDto {
    private PeliculaDto pelicula;
    private String funcionID;
    private String horario;
    private String fecha;
    private SalaDto sala;



    public FuncionDto(String horario, String funcionID, PeliculaDto pelicula, String fecha, SalaDto sala) {
        this.horario = horario;
        this.funcionID = funcionID;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.sala = sala;
    }

    public PeliculaDto getPelicula() {
        return pelicula;
    }

    public void setPelicula(PeliculaDto pelicula) {
        this.pelicula = pelicula;
    }

    public String getFuncionID() {
        return funcionID;
    }

    public void setFuncionID(String funcionID) {
        this.funcionID = funcionID;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public SalaDto getSala() {
        return sala;
    }

    public void setSala(SalaDto sala) {
        this.sala = sala;
    }


    @Override
    public String toString() {
        return "FuncionDto{" +
                "pelicula=" + pelicula +
                ", funcionID='" + funcionID + '\'' +
                ", horario='" + horario + '\'' +
                ", fecha='" + fecha + '\'' +
                ", sala=" + sala +
                '}';
    }
}
