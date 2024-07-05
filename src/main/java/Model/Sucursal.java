package Model;

import java.util.*;

/**
 * 
 */
public class Sucursal {
    private int sucursalID;

    private String denominacion;

    private String direccion;

    private List<Sala> salas=new ArrayList<Sala>();
    /**
     * Default constructor
     */
    public Sucursal(int sucursalID, String denominacion, String direccion) {
    	this.denominacion = denominacion;
    	this.direccion = direccion;
    	this.sucursalID = sucursalID;

    }


    public int getSucursalID() {
        // TODO implement here
        return sucursalID;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Sala> getSalas() {
        return salas;
    }
}