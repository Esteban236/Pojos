package ec.com.uce.pojos;

public class Mascota {

    // Atributos

    private String nombre;
    private String especie;
    private int edad;
    private String sexo;

    // Constructor
    public Mascota() {
        this.nombre = "";
        this.especie = "";
        this.edad = 0;
        this.sexo = "";

    }

    // Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}