package Controller;

import DTO.FuncionDto;
import DTO.PeliculaDto;
import DTO.SalaDto;
import DTO.SucursalDto;
import Model.Sala;
import Model.Sucursal;

import java.text.ParseException;
import java.util.*;


/**
 * 
 */
public class SucursalController {

    /**
     * Default constructor
     */
	private static SucursalController instancia= null;
	private List<Sucursal> sucursales;
    private FuncionController funcionController=FuncionController.getInstancia();
		
    private  SucursalController() {
    	sucursales = new ArrayList<Sucursal>();
    	sucursales.add(new Sucursal(1, "Barracas", "Av Montes de Oca 1100"));
        SucursalDto sucursalDto=new SucursalDto("15","Caballito","Riavdavia 5071");
        SucursalDto sucursalDto2=new SucursalDto("60","Caballito","Av La Plata 96");
        SalaDto salaDto=new SalaDto("1","aaaaa","60");
        SalaDto salaDto2=new SalaDto("2","bbbb","50");
        FuncionDto funcionDto= new FuncionDto("22:00","10","31/08/2024");
        FuncionDto funcionDto2= new FuncionDto("20:00","2","31/08/2024");
       agregarSucursal(sucursalDto);
       agregarSucursal(sucursalDto2);
       agregarSala(salaDto,1);
       agregarSala(salaDto2,1);

    	
    }

    public static SucursalController getInstancia() {
        if (instancia == null) {
            instancia = new SucursalController();
        }
        return instancia;
    }
    public Sucursal deDtoASucursal(SucursalDto dto){
        Sucursal sucursal=new Sucursal(Integer.parseInt(dto.getSucursalID()),dto.getDenominacion(), dto.getDireccion());
        return sucursal;
    }
    public Sucursal getSucursal(SucursalDto dto){
        Sucursal sucursal=null;
        for(Sucursal suc:sucursales){
            if (suc.getSucursalID()==Integer.parseInt(dto.getSucursalID())){
                sucursal=suc;
            }
        }
        return sucursal;
    }
    public boolean agregarSucursal(SucursalDto dto){
        boolean resultado=false;
        Sucursal sucursal=getSucursal(dto);
        if(sucursal==null){
            Sucursal sucur = deDtoASucursal(dto);
            resultado=true;
            sucursales.add(sucur);
        }
        else {
            System.out.println("La sucursal ya existe");
        }
        return resultado;
    }

    /**
     * param idSucursal 
     * param salaID 
     * param denom 
     * param nroasientos
     */

    public boolean agregarSala(SalaDto dto, int sucurID){
        boolean resultado=false;
        Sucursal sucursal=getSucursalByID(sucurID);
        Sala sala=getSala(sucursal,dto);
        if(sucursal!=null && sala==null){
            sala=deDtoASala(dto);
            resultado=true;
            sucursal.getSalas().add(sala);

        }
        else{
            System.out.println("La sala ya existe o la sucursal no existe");
        }

        return resultado;
    }

    public Sala getSala(Sucursal sucursal,SalaDto dto){
        Sala sala=null;
        for (Sala s:sucursal.getSalas()){
            if (s.getSalaID()==Integer.parseInt(dto.getSalaID())){
                sala=s;
            }
        }
        return sala;

    }
    public Sucursal getSucursalByID(int id){
        Sucursal sucursal=null;
        for(Sucursal suc:sucursales){
            if(suc.getSucursalID()==id){
                sucursal=suc;
            }
        }
        return sucursal;
    }
    public Sala deDtoASala(SalaDto dto){
        Sala sala=new Sala(Integer.parseInt(dto.getSalaID()),dto.getDenominacion(),Integer.parseInt(dto.getAsientos()));
        return sala;
    }
    public Sala getSalaByID(int id){
        Sala sala=null;
        for(Sucursal suc:sucursales){
            for (Sala s:suc.getSalas()){
                if (s.getSalaID()==id){
                    sala=s;
                }
            }
        }
        return sala;
    }
    public boolean registrarFuncionPorGenero(FuncionDto funcionDto, PeliculaDto peliculaDto,int salaID) throws ParseException {
        boolean resultado=false;
        Sala sala=getSalaByID(salaID);
        SalaDto salaDto=deSalaADTO(sala);
        if(sala!=null){
            resultado=funcionController.nuevaFuncion(funcionDto,peliculaDto,salaDto);
        }
        else {
            System.out.println("La sala no existe");
        }
        return resultado;
    }

    public List<Sucursal> getSucursales(){
        return sucursales;
    }


    public SalaDto deSalaADTO(Sala sala){
        return new SalaDto(String.valueOf(sala.getSalaID()),sala.getDenominacion(),String.valueOf(sala.getAsientos()));
    }
}