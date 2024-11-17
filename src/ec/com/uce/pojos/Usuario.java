package ec.com.uce.pojos;

public class Usuario {

    // Atributos
    private int idUsuario;
    private String nombre;
    private int edad;

    // Constructor predeterminado
    public Usuario() {
        this.idUsuario = 0;
        this.nombre = "";
        this.edad = 0;

    }

    // Métodos Get y Set
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}



