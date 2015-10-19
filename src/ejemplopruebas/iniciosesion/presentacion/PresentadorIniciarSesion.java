package ejemplopruebas.iniciosesion.presentacion;

import ejemplopruebas.iniciosesion.aplicacion.bordes.InterfazUsuarioIniciarSesion;
import ejemplopruebas.iniciosesion.aplicacion.coordinadores.CoordinadorInicioDeSesion;

public class PresentadorIniciarSesion implements InterfazUsuarioIniciarSesion {

    private VentanaIniciarSesion ventana;
    private CoordinadorInicioDeSesion coordinadorCU;

    public PresentadorIniciarSesion(VentanaIniciarSesion ventana) {
        this.ventana = ventana;
        ventana.setPresentador(this);
    }

    public void setCoordinadorCU(CoordinadorInicioDeSesion coordinadorCU) {
        this.coordinadorCU = coordinadorCU;
    }

    @Override
    public void sesionIniciada() {
        ventana.limpiar();
        ventana.reiniciarFoco();
        ventana.notificarInformacion("Sesión iniciada", "La sesión fue iniciada correctamente!");
    }

    @Override
    public void mostrarErrorAutenticacionIncorrecta() {
        ventana.notificarError("Autenticación incorrecta" ,"La autenticación no fue correcta! No se inició la sesión.");
    }

    public void alIniciarSesion() {
        String usr = ventana.getNombreUsuario();
        String pwd = ventana.getContraseña();

        coordinadorCU.iniciarSesion(usr, pwd);
    }

    public void alCancelar() {
        ventana.cerrar();
    }
}
