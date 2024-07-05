package Controller;

import Model.CondicionesDescuento;
import Model.TarjetaDescuento;
import Model.TipoTarjeta;

import java.util.*;


/**
 * 
 */
public class DescuentoController {
	
	
	private static DescuentoController instancia;
	
	private List<CondicionesDescuento> Descuento;
	
    private DescuentoController() {
    	Descuento = new ArrayList<CondicionesDescuento>();
    	CondicionesDescuento CondicionesDescuento = new CondicionesDescuento(new Date(), new Date(), 5, 50, TipoTarjeta.PAMI, new ArrayList<TarjetaDescuento>());
    	Descuento.add(CondicionesDescuento);
    	
    }
	public static DescuentoController getInstancia() {
		if (instancia == null) {
			instancia = new DescuentoController();
		}
		return instancia;
	}

    /**
     * 
     */
    public void ABM() {
	}


}