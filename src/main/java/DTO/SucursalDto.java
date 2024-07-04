package DTO;

public class SucursalDto {
    private String sucursalID;
    private String denominacion;
    private String direccion;

    public SucursalDto(String sucursalID, String denominacion, String direccion) {
        this.sucursalID = sucursalID;
        this.denominacion = denominacion;
        this.direccion = direccion;
    }

    public String getSucursalID() {
        return sucursalID;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public String getDireccion() {
        return direccion;
    }

}
