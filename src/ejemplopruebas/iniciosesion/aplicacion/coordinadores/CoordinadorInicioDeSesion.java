package ejemplopruebas.iniciosesion.aplicacion.coordinadores;

import ejemplopruebas.iniciosesion.aplicacion.bordes.Autenticador;
import ejemplopruebas.iniciosesion.aplicacion.bordes.InterfazUsuarioIniciarSesion;
import ejemplopruebas.iniciosesion.aplicacion.entidades.Sesion;
import ejemplopruebas.iniciosesion.aplicacion.entidades.Usuario;

public class CoordinadorInicioDeSesion {

    private Autenticador autenticador;
    private InterfazUsuarioIniciarSesion ui;

    public CoordinadorInicioDeSesion(Autenticador autenticador, InterfazUsuarioIniciarSesion ui) {
        this.autenticador = autenticador;
        this.ui = ui;
    }
    
    public void iniciarSesion(String usr, String pwd) {
        Usuario usuario = autenticador.autenticar(usr, pwd);

        if (usuario == null) {
            ui.mostrarErrorAutenticacionIncorrecta();
            return;
        }

        Sesion.iniciar(usuario);
        ui.sesionIniciada();
    }

}
