package Controller;

import DTO.SalaDto;
import DTO.SucursalDto;
import Model.Sala;
import Model.Sucursal;

import java.util.*;


/**
 * 
 */
public class SucursalController {

    /**
     * Default constructor
     */
	
	private List<Sucursal> sucursales;
		
    public SucursalController() {
    	sucursales = new ArrayList<Sucursal>();
    	sucursales.add(new Sucursal(1, "Barracas", "Av Montes de Oca 1100"));

    	
    }


    public Sucursal deDtoASucursal(SucursalDto dto){
        Sucursal sucursal=new Sucursal(Integer.parseInt(dto.getSucursalID()),dto.getDenominacion(), dto.getDireccion());
        return sucursal;
    }
    public Sucursal getSucursal(SucursalDto dto){
        Sucursal sucursal=null;
        for(Sucursal suc:sucursales){
            if (!suc.getDireccion().equals(dto.getDireccion())){
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

}