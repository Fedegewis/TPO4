package DTO;

import Model.Combo;
import Model.Funcion;
import Model.TarjetaDescuento;

import java.util.Date;
import java.util.List;

public class VentaDto {

    private String ventaID;
    private String fchVenta;
    private List<String> combos;
    private String tarjetaDescuento;
    private FuncionDto funcion;

    public VentaDto(String ventaID, String fchVenta, List<String> combos, String tarjetaDescuento, FuncionDto funcion) {
        this.ventaID = ventaID;
        this.fchVenta = fchVenta;
        this.combos = combos;
        this.tarjetaDescuento = tarjetaDescuento;
        this.funcion = funcion;
    }

    public String getVentaID() {
        return ventaID;
    }

    public void setVentaID(String ventaID) {
        this.ventaID = ventaID;
    }

    public String getFchVenta() {
        return fchVenta;
    }

    public void setFchVenta(String fchVenta) {
        this.fchVenta = fchVenta;
    }

    public List<String> getCombos() {
        return combos;
    }

    public void setCombos(List<String> combos) {
        this.combos = combos;
    }

    public String getTarjetaDescuento() {
        return tarjetaDescuento;
    }

    public void setTarjetaDescuento(String tarjetaDescuento) {
        this.tarjetaDescuento = tarjetaDescuento;
    }

    public FuncionDto getFuncion() {
        return funcion;
    }

    public void setFuncion(FuncionDto funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "VentaDto{" +
                "ventaID='" + ventaID + '\'' +
                ", fchVenta='" + fchVenta + '\'' +
                ", combos=" + combos +
                ", tarjetaDescuento='" + tarjetaDescuento + '\'' +
                ", funcion=" + funcion +
                '}';
    }
}
