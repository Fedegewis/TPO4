package Controller;

import DTO.FuncionDTO;
import DTO.FuncionDto;
import DTO.VentaDto;
import Model.*;

import java.util.*;


/**
 * 
 */
public class VentasController {

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    /**
     * Default constructor
     */
    private List<Venta> ventas;

    private FuncionController funcionController = FuncionController.getInstancia();
    private static VentasController instance;
	
    private VentasController(){
        ventas = new ArrayList<Venta>();
        Venta venta = new Venta(1,new Date(), null, null);
        ventas.add(venta);
    }
    public VentasController getInstancia(){
        if(instance == null){
            instance = new VentasController();
        }
        return instance;
    }

    /**
     * @param funcionID 
     * @return
     */
    public float recaudacionPorFuncion(int funcionID) {
        // TODO implement here
        return 0.0f;
    }

    /**
     * Caso de secuencia a desarrollar
     * @param peliculaID
     * @return
     */
    public float recaudacionPorPelicula(int peliculaID) {
        List<Funcion> funciones = funcionController.buscarPeliculaPorFuncion(peliculaID);
        if(funciones.isEmpty()){
            return 0;
        }
        float totalrecuadado = 0.0f;
        for (Funcion funcion:funciones) {
            Venta venta = buscarVentaPorFuncion(funcion);
            if(Objects.isNull(venta)){
                totalrecuadado=+venta.calcularMontoDeLaVentaPorFuncionCombos();
            }
        }
    	return totalrecuadado;
    }

    /**
     * @param tipoTarjeta 
     * @return
     */
    public float recaudacionPorTarjetaDescuento(TipoTarjeta tipoTarjeta) {
        // TODO implement here
        return 0.0f;
    }

    /**
     * 
     */
    public void comboMasVendido() {
        // TODO implement here
    }

    private  Venta buscarVentaPorFuncion(Funcion funcion){
        for (Venta venta:getVentas()) {
            if(Objects.equals(funcion,venta.getFuncion())){
                return venta;
            }
        }
        return null;
    }

    /**
     * View a desarrollar
     *
     * @param genero
     * @return
     */
    public List<VentaDto> funcionesVendidasPorGenero(TipoGenero genero) {
        List<VentaDto> ventaDtos = new ArrayList<>();
        List<Funcion> funciones = funcionController.buscarPeliculaPorGenerosFuncion(genero);
        if(funciones.isEmpty()){
            return ventaDtos;
        }
        for (Funcion funcion:funciones) {
            Venta venta = buscarVentaPorFuncion(funcion);
            if(Objects.isNull(venta)){
                ventaDtos.add(modelVentaToDto(venta));
            }
        }
        return ventaDtos;
    }

    public VentaDto modelVentaToDto(Venta venta){
        return new VentaDto(String.valueOf(venta.getVentaID()),String.valueOf(venta.getFchVenta()),new ArrayList<String>(),
                String.valueOf(venta.getTarjetaDescuento()),modelFuncionToDto(venta.getFuncion()));
    }

    public FuncionDto modelFuncionToDto(Funcion funcion){
        return new FuncionDto(funcion);
    }

}