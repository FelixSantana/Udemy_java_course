package Herencia;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //aplicando el concepto de sobrecarga de constructores
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        /* Nota importante: no se puede utilizar this() ni
           la llamada a super() en el mismo constructor, se
           utiliza solo uno de ambos */
        //super(nombre);
        /* Llamando al constructor vacio de esta misma clase
           para que inicialice el contador de idEmpleado */
        this();
        /* Inicializando los atributos de la clase padre acceciendo
           directamente desde ellos */
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", sueldo: " + sueldo;
    }
}
