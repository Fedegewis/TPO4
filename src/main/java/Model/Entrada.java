package Model;

/**
 * 
 */
public class Entrada {

    public Funcion funcion;
    private float precio;
    private int nroAsiento;
    /**
     * Default constructor
     */
    public Entrada(int nroAsiento, Funcion funcion, float precio) {
    	this.funcion = funcion;
    	this.nroAsiento = nroAsiento;
    	this.precio = precio;
    }
    
    public Entrada() {

    }

    public float getPrecio() {
        return precio;
    }



    /**
     * 
     */


    /**
     * 
     */



    public int getFuncionID() {
        // TODO implement here
        return funcion.getFuncionID();
    }

    /**
     * 
     */
    public int getPeliculaID() {
        // TODO implement here
        return funcion.getPeliculaID();
    }

}