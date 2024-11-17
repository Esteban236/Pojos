package ec.com.uce.pojos;

public class Adoptante {

    // Atributos
    private String direccion;
    private String telefono;
    private String email;
    private String ocupacion;


    // Constructor
    public Adoptante() {

        this.direccion = "";
        this.telefono = "";
        this.email = "";
        this.ocupacion = "";
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

}
