package ejemplopruebas.iniciosesion.seguridad;

import ejemplopruebas.iniciosesion.aplicacion.bordes.Autenticador;
import ejemplopruebas.iniciosesion.aplicacion.entidades.Usuario;

public class ImplAutenticador implements Autenticador {

    @Override
    public Usuario autenticar(String usuario, String contraseña) {
        // TODO: En realidad, esto debería comunicarse con la base de datos
        // o el mecanismo de persistencia para realizar la autenticación de
        // usuarios. Por ahora, el usuario y la contraseña válida están
        // harcoded.
        if (usuario.equals("javier") && contraseña.equals("123")) {
            return new Usuario(usuario);
        } else {
            return null;
        }
    }

}
