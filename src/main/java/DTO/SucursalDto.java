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

    public void setSucursalID(String sucursalID) {
        this.sucursalID = sucursalID;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "SucursalDto{" +
                "sucursalID='" + sucursalID + '\'' +
                ", denominacion='" + denominacion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

}
