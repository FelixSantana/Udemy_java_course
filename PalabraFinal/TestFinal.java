package PalabraFinal;

import PalabraFinal.domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("Mi variable: " + miVariable);

        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);

        final Persona p1 = new Persona();
        p1.setNombre("Pedro");
        System.out.println("Persona 1: " + p1.getNombre());
        p1.setNombre("Carlos");
        System.out.println("Persona 1: " + p1.getNombre());
    }
}
