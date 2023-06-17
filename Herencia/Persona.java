package Herencia;

public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    /*constructor vacio para poder crear objetos de tipo persona sin necesidad 
    de inicializar los atributos de la clase*/
    public Persona(){}

    /*Constructor solo para inicializar el nombre*/
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", genero: " + genero + ", edad: " + edad + ", direccion: " + direccion;
    }
    
}
