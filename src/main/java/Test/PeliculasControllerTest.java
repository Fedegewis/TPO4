package Test;

import Controller.PeliculasController;
import Controller.SucursalController;
import DTO.FuncionDto;
import DTO.PeliculaDto;
import DTO.SalaDto;
import DTO.SucursalDto;
import Model.Pelicula;
import Model.TipoGenero;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PeliculasControllerTest {

    PeliculasController peliculasController =PeliculasController.getInstance();


    @Test
    void agregarPelicula() {
        List<String> actores=new ArrayList<String>();
        actores.add("Michael Cane");
        actores.add("Matthew McCounaghey");
        PeliculaDto peliculaDto= new PeliculaDto("Suspenso","Interstellar","180","Christopher Nolan",actores,"TresD","20");
        PeliculaDto peliculaDto2= new PeliculaDto("Terror","Inception","180","Christopher Nolan",actores,"TresD","30");

        boolean resultado=peliculasController.agregarPelicula(peliculaDto);
        boolean resultado2=peliculasController.agregarPelicula(peliculaDto2);
        assertEquals(resultado,true);
        assertEquals(resultado2,true);
    }

    @Test
    void consultarPeliculasPorGenero() {
        List<String> actores=new ArrayList<String>();
        actores.add("Michael Cane");
        actores.add("Matthew McCounaghey");
        PeliculaDto peliculaDto= new PeliculaDto("Suspenso","Interstellar 2","180","Christopher Nolan",actores,"TresD","21");
        PeliculaDto peliculaDto2= new PeliculaDto("Terror","Inception 2","180","Christopher Nolan",actores,"TresD","31");

        peliculasController.agregarPelicula(peliculaDto);
        peliculasController.agregarPelicula(peliculaDto2);
        List<PeliculaDto> Terror= peliculasController.consultarPeliculasPorGenero(TipoGenero.Terror);
        List<PeliculaDto> Suspenso= peliculasController.consultarPeliculasPorGenero(TipoGenero.Suspenso);
        assertEquals(2,Terror.size());
        assertEquals(2,Suspenso.size());

    }
}