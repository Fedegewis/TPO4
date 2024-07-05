package Model;

import DTO.FuncionDto;

import java.util.*;

/**
 * 
 */
public class Venta {
    private int ventaID;
    private Date fchVenta;
    private List<Combo> combos;
    private TarjetaDescuento tarjetaDescuento;
    private Funcion funcion;
    /**
     * Default constructor
     */
    public Venta(int ventaID, Date fchVenta, List<Combo> combos, Funcion funcion) {
    	this.combos = combos;
    	this.funcion = funcion;
    	this.fchVenta = fchVenta;
    }


	/**
     * 
     */


    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public int getVentaID() {
        return ventaID;
    }

    public void setVentaID(int ventaID) {
        this.ventaID = ventaID;
    }

    public Date getFchVenta() {
        return fchVenta;
    }

    public void setFchVenta(Date fchVenta) {
        this.fchVenta = fchVenta;
    }

    public List<Combo> getCombos() {
        return combos;
    }

    public void setCombos(List<Combo> combos) {
        this.combos = combos;
    }

    public void setTarjetaDescuento(TarjetaDescuento tarjetaDescuento) {
        this.tarjetaDescuento = tarjetaDescuento;
    }

    public TarjetaDescuento getTarjetaDescuento() {
        return tarjetaDescuento;
    }

    public int getFuncionID() {
        // TODO implement here
        return 0;
    }


    public float getTotal() {
        // TODO implement here
        return 0.0f;
    }

    public int getPeliculaID() {
        // TODO implement here
        return 0;
    }


    public TipoTarjeta getTipoTarjeta() {
        // TODO implement here
        return null;
    }


    public List<Combo> getListaComboID() {
		return combos;
		
        // TODO implement here
    }

    public float calcularMontoPorComboDeVenta(){
        float total=  0.0f;
        for (Combo combo:getListaComboID()) {
           total =+  (combo.getPrecio()-(combo.getPrecio()*
                   CondicionesDescuento.getDescuentoPorTarjeta(tarjetaDescuento.getTipoTarjeta())));
        }
        return total;
    }


    public float calcularMontoDeLaVentaPorFuncionCombos(){
        return funcion.calcularMontoPorEntradaDeLaPelicula()+calcularMontoPorComboDeVenta();
    }


}