package Model;

/**
 * 
 */
public class Sala {
    private int salaID;
    private String denominacion;
    private int asientos;
    /**
     * Default constructor
     */
    public Sala(int salaID, String denominacion, int asientos) {
    	this.asientos = asientos;
    	this.denominacion = denominacion;
    	this.salaID = salaID;
    }


    public int getSucursalID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getSalaID() {
        // TODO implement here
        return this.salaID;
    }

    /**
     * @return
     */
    public int getAsientos() {

        return this.asientos;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}