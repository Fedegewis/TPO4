package Model;

/**
 * 
 */
public class Combo {
    private int comboID;
    private String descripcion;
    private float precio;
    private CondicionesDescuento Contiene;
    /**
     * Default constructor
     */
    public Combo(int comboID, String descripcion, float precio, CondicionesDescuento Contiene  ) {
    	this.comboID = comboID;
    	this.Contiene = Contiene;
    	this.descripcion = descripcion;
    	this.precio = precio;
    }


    public float getPrecio() {
        // TODO implement here
        return precio;
    }

    /**
     * 
     */
    public int getComboID() {
		return comboID;
        // TODO implement here
    }

}