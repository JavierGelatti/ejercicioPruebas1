package ejemplopruebas.calculadora;

public class Calculadora {

    public int multiplicar(int a, int b) {
        boolean posA = a >= 0;
        boolean posB = b >= 0;
        boolean negP = posA != posB;

        a = posA ? a : -a;
        b = posB ? b : -b;

        int p1 = 0;
        while (a-- > 0) {
            p1 = sumar(p1, b);
        }

        int p = p1;

        return negP ? -p : p;
    }

    private int sumar(int a, int b) {
        return a + b;
    }

}
