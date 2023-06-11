public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementando el contador de persona por cada objeto nuevo
        Persona.contadorPersonas++;
        //Asignando el idPersona
        this.idPersona = Persona.contadorPersonas;
    }
    /*No agrege los setters de idPersona ni de contadorPersona porque no creo
    que sea necesario editarlos desde el main*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    //Hice el toString a mi estilo
    @Override
    public String toString() {
        return "[Id Persona: " + idPersona + ", Nombre: " + nombre + "]";
    }
}