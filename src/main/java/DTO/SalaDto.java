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

    public String getDenominacion() {
        return denominacion;
    }

    public String getAsientos() {
        return asientos;
    }
}
