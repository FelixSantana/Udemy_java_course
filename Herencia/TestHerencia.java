package Herencia;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Persona p1  = new Persona("Felix", 'M', 23, "Santo Domingo");
        Empleado em1 = new Empleado("Felix", 22550.99);
        Cliente c1 = new Cliente("Felix", 'M', 23, "Santo Domingo", 22500, new Date(), true);
        System.out.println(p1);
        System.out.println(em1);
        System.out.println(c1);
    }
}
