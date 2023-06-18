package SobrecargaMetodos;

/* La sobrecarga de metodos es definir dos o mas veces el metodo a utilizar 
   pero poniendoles el mismo nombre y la diferencia lo va hacer la cantidad
   de argumentos */
public class Operaciones {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }
}
