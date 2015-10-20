package ejemplopruebas.calculadora;

public class Calculadora {

    public int multiplicar(int a, int b) {
        boolean aPositivo = a >= 0;
        boolean bPositivo = b >= 0;

        boolean pNegativo = aPositivo != bPositivo;

        a = aPositivo ? a : -a;
        b = bPositivo ? b : -b;

        int p = 0;
        while (a-- > 0) {
            p += b;
        }

        return pNegativo ? -p : p;
    }

}
