package ec.com.uce.pojos;

public class SolicitudAdopcion {

    // Atributos
    private String fecha;
    private String adoptante;
    private String mascota;


    // Constructor
    public SolicitudAdopcion() {

        this.fecha = "";
        this.adoptante = "";
        this.mascota = "";
    }

    // Getters y Setters

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(String adoptante) {
        this.adoptante = adoptante;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }
}