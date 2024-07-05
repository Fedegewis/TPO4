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

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SucursalControllerTest {

    PeliculasController peliculasController =PeliculasController.getInstance();
    SucursalController sucursalController=SucursalController.getInstancia();
    SucursalDto sucursalDto=new SucursalDto("15","Caballito","Riavdavia 5071");
    SucursalDto sucursalDto2=new SucursalDto("60","Caballito","Av La Plata 96");
    SalaDto salaDto=new SalaDto("1","aaaaa","60");
    SalaDto salaDto2=new SalaDto("2","bbbb","50");
    FuncionDto funcionDto= new FuncionDto("22:00","10","31/08/2024");
    FuncionDto funcionDto2= new FuncionDto("20:00","2","31/08/2024");



    @Test
    void registrarFuncionPorGenero() throws ParseException {
        sucursalController.agregarSucursal(sucursalDto);
        sucursalController.agregarSucursal(sucursalDto2);
        sucursalController.agregarSala(salaDto,1);
        sucursalController.agregarSala(salaDto2,1);
        List<String> actores=new ArrayList<String>();
        actores.add("Michael Cane");
        actores.add("Matthew McCounaghey");
        PeliculaDto peliculaDto= new PeliculaDto("Suspenso","Interstellar","180","Christopher Nolan",actores,"TresD","20");
        PeliculaDto peliculaDto2= new PeliculaDto("Terror","Inception","180","Christopher Nolan",actores,"TresD","30");
        peliculasController.agregarPelicula(peliculaDto);
        peliculasController.agregarPelicula(peliculaDto2);

        boolean Resultado=sucursalController.registrarFuncionPorGenero(funcionDto,peliculaDto,2);
        boolean Resultado2=sucursalController.registrarFuncionPorGenero(funcionDto2,peliculaDto2,2);

        assertEquals(Resultado,true);
        assertEquals(Resultado2,true);
    }
}