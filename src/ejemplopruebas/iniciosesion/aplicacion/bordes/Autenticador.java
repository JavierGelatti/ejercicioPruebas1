package ejemplopruebas.iniciosesion.aplicacion.bordes;

import ejemplopruebas.iniciosesion.aplicacion.entidades.Usuario;

public interface Autenticador {

    Usuario autenticar(String usuario, String contraseña);

}
