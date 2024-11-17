package ec.com.uce.pojos;

public class CentroAdopcion {

    // Atributos
    private String direccion;
    private String horario;
    private int capacidadMaxima;

    // Constructor
    public CentroAdopcion() {
        this.direccion = "";
        this.horario = "";
        this.capacidadMaxima = 0;
    }

    // Getters y Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }


}











