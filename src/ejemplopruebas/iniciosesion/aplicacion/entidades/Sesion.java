package ejemplopruebas.iniciosesion.aplicacion.entidades;

public class Sesion {

    private static Usuario usuarioLogueado;

    public static void iniciar(Usuario unUsuario) {
        usuarioLogueado = unUsuario;
    }

    public static void cerrar() {
        usuarioLogueado = null;
    }

    public static boolean estaIniciada() {
        return usuarioLogueado != null;
    }

}
