package ejemplopruebas.iniciosesion.seguridad;

import ejemplopruebas.iniciosesion.aplicacion.bordes.Autenticador;
import ejemplopruebas.iniciosesion.aplicacion.entidades.Usuario;

public class ImplAutenticador implements Autenticador {

    @Override
    public Usuario autenticar(String usuario, String contraseña) {
        System.out.println(usuario + ".." + contraseña);
        if (usuario.equals("javier") && contraseña.equals("123")) {
            return new Usuario(usuario);
        } else {
            return null;
        }
    }

}
