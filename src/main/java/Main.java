import Controller.PeliculasController;
import Controller.SucursalController;
import DTO.FuncionDto;
import DTO.PeliculaDto;
import DTO.SalaDto;
import DTO.SucursalDto;
import Model.Pelicula;
import Model.Sala;
import Model.Sucursal;
import Model.TipoGenero;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        PeliculasController peliculasController =PeliculasController.getInstance();
        SucursalController sucursalController=SucursalController.getInstancia();
        SucursalDto sucursalDto=new SucursalDto("15","Caballito","Riavdavia 5071");
        SucursalDto sucursalDto2=new SucursalDto("60","Caballito","Av La Plata 96");
        SalaDto salaDto=new SalaDto("1","aaaaa","60");
        SalaDto salaDto2=new SalaDto("2","bbbb","50");
        sucursalController.agregarSucursal(sucursalDto);
        sucursalController.agregarSucursal(sucursalDto2);
        sucursalController.agregarSala(salaDto,1);
        sucursalController.agregarSala(salaDto2,1);
        List<String> actores=new ArrayList<String>();
        actores.add("Michael Cane");
        actores.add("Matthew McCounaghey");
        FuncionDto funcionDto= new FuncionDto("22:00","10","31/08/2024");
        PeliculaDto peliculaDto= new PeliculaDto("Suspenso","Interstellar","180","Christopher Nolan",actores,"TresD","20");
        PeliculaDto peliculaDto2= new PeliculaDto("Terror","Inception","180","Christopher Nolan",actores,"TresD","30");

        peliculasController.agregarPelicula(peliculaDto);
        peliculasController.agregarPelicula(peliculaDto2);
       List<Pelicula> suspenso= peliculasController.consultarPeliculasPorGenero(TipoGenero.Terror);
        System.out.println(peliculasController.agregarPelicula(peliculaDto));

        System.out.println(sucursalController.registrarFuncionPorGenero(funcionDto,peliculaDto,2));

        for(Sucursal s: sucursalController.getSucursales()){
            for(Sala sala: s.getSalas()){
                System.out.println(sala.getSalaID());
            }
        }

        for (Pelicula p:suspenso){
            System.out.println(p.getPeliculaID()+" "+p.getNombrePelicula());
        }

    }
}
