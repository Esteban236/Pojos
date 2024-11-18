package ec.com.uce.pojos;

public class SolicitudTemporal {

    // Atributos

    private int duracionDias;
    private String motivo;
    private String fechaFin;


    // Constructor

    public SolicitudTemporal() {
        this.duracionDias = 0;
        this.motivo = "";
        this.fechaFin = "";

    }


    // Getters y Setters

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}