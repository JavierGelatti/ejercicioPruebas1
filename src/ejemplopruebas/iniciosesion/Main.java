package ejemplopruebas.iniciosesion;

import ejemplopruebas.iniciosesion.aplicacion.bordes.Autenticador;
import ejemplopruebas.iniciosesion.aplicacion.coordinadores.CoordinadorInicioDeSesion;
import ejemplopruebas.iniciosesion.presentacion.JFrameIniciarSesion;
import ejemplopruebas.iniciosesion.presentacion.PresentadorIniciarSesion;
import ejemplopruebas.iniciosesion.seguridad.ImplAutenticador;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> ponerEnMarcha());
    }

    private static void ponerEnMarcha() {
        JFrameIniciarSesion ventana = new JFrameIniciarSesion();
        PresentadorIniciarSesion presentador = new PresentadorIniciarSesion(ventana);

        Autenticador autenticador = new ImplAutenticador();
        CoordinadorInicioDeSesion coordinadorCU = new CoordinadorInicioDeSesion(autenticador, presentador);
        presentador.setCoordinadorCU(coordinadorCU);

        ventana.setVisible(true);
    }

}
