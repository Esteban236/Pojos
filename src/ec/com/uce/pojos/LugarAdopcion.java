package ec.com.uce.pojos;

public class LugarAdopcion {

    // Atributos

    private String nombre;
    private String direccion;
    private int capacidad;

    // Constructor
    public LugarAdopcion() {
        this.nombre = "";
        this.direccion = "";
        this.capacidad = 0;

    }

    // Métodos Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

















