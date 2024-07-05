package DTO;

public class SalaDto {
    private String salaID;
    private String denominacion;
    private String asientos;

    public SalaDto(String salaID, String denominacion, String asientos) {
        this.salaID = salaID;
        this.denominacion = denominacion;
        this.asientos = asientos;
    }

    public String getSalaID() {
        return salaID;
    }

    public void setSalaID(String salaID) {
        this.salaID = salaID;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "SalaDto{" +
                "salaID='" + salaID + '\'' +
                ", denominacion='" + denominacion + '\'' +
                ", asientos='" + asientos + '\'' +
                '}';
    }
}
