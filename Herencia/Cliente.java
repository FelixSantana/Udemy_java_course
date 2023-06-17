package Herencia;
import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(String nombre, char genero, int edad, String direccion, int idCliente, Date fechaRegistro, boolean vip){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /* Hacemos una llamada al toString de la clase padre y le concatenamos la fecha de registro
      y si es vip */
    @Override
    public String toString() {
        return super.toString() + ", Fecha de registro: " + fechaRegistro + "VIP: " + vip;
    }

}
