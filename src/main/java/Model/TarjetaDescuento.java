package Model;

/**
 * 
 */
public class TarjetaDescuento {
    private int tarjetaID;
    private TipoTarjeta tipoTarjeta;
    private String numeroTarjeta;
    /**
     * Default constructor
     */
    public TarjetaDescuento(int tarjetaID, TipoTarjeta tipoTarjeta, String numeroTarjeta) {
    	this.numeroTarjeta = numeroTarjeta;
    	this.tarjetaID = tarjetaID;
    	this.tipoTarjeta = tipoTarjeta;
    }


    public TipoTarjeta getTipoTarjeta() {
        // TODO implement here
        return null;
    }


}