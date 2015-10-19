package ejemplopruebas.iniciosesion.presentacion;

public interface VentanaIniciarSesion {

    public void setPresentador(PresentadorIniciarSesion aThis);

    public void limpiar();

    public void notificarInformacion(String titulo, String mensaje);

    public void notificarError(String titulo, String mensaje);

    public void cerrar();

    public String getNombreUsuario();

    public String getContraseña();

    public void reiniciarFoco();

}
