package gestorAplicación.interno;

import gestorAplicación.externo.Banco;

import java.util.ArrayList;

public class Usuario {

    //Atributos de Información del usuario
    private String nombre;
    private int id;
    private String correo;
    private String contraseña;
    private Suscripción suscripción;
    private String dirección;
    private int teléfono;
    private int límiteCuentas;

    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Usuario> usuariosTotales = new ArrayList<Usuario>();
    private ArrayList<Banco> bancosAsociados = new ArrayList<Banco>();
    private ArrayList<Cuenta> cuentasAsociadas = new ArrayList<Cuenta>();
    private ArrayList<Movimientos> movimientosAsociados = new ArrayList<Movimientos>();
    private ArrayList<Corriente> cuentasCorrienteAsociadas = new ArrayList<Corriente>();
    private ArrayList<Ahorros> cuentasAhorrosAsociadas = new ArrayList<Ahorros>();
    private ArrayList<Metas> metasAsociadas = new ArrayList<Metas>();

    //Constructores
    public Usuario(String nombre, String correo, String contraseña, String dirección, int teléfono) {
        Usuario.getUsuariosTotales().add(this);
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.id = Usuario.getUsuariosTotales().size();
        this.setSuscripción(Suscripción.BRONCE);
        this.límiteCuentas = this.getSuscripción().getLímiteCuentas();
    }

    //Getters y Setters de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Suscripción getSuscripción() {
        return suscripción;
    }

    public void setSuscripción(Suscripción suscripción) {
        this.suscripción = suscripción;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public static ArrayList<Usuario> getUsuariosTotales() {
        return usuariosTotales;
    }

    public static void setUsuariosTotales(ArrayList<Usuario> usuariosTotales) {
        Usuario.usuariosTotales = usuariosTotales;
    }

    public ArrayList<Banco> getBancosAsociados() {
        return this.bancosAsociados;
    }

    public void setBancosAsociados(ArrayList<Banco> bancosAsociados) {
        this.bancosAsociados = bancosAsociados;
    }

    public ArrayList<Cuenta> getCuentasAsociadas() {
        return this.cuentasAsociadas;
    }

    public void setCuentasAsociadas(ArrayList<Cuenta> cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }

    public ArrayList<Movimientos> getMovimientosAsociados() {
        return this.movimientosAsociados;
    }

    public void setMovimientosAsociados(ArrayList<Movimientos> movimientosAsociados) {
        this.movimientosAsociados = movimientosAsociados;
    }

    public ArrayList<Corriente> getCuentasCorrienteAsociadas() {
        return this.cuentasCorrienteAsociadas;
    }

    public void setCuentasCorrienteAsociadas(ArrayList<Corriente> cuentasCorrienteAsociadas) {
        this.cuentasCorrienteAsociadas = cuentasCorrienteAsociadas;
    }

    public ArrayList<Ahorros> getCuentasAhorrosAsociadas() {
        return this.cuentasAhorrosAsociadas;
    }

    public void setCuentasAhorrosAsociadas(ArrayList<Ahorros> cuentasAhorrosAsociadas) {
        this.cuentasAhorrosAsociadas = cuentasAhorrosAsociadas;
    }

    public ArrayList<Metas> getMetasAsociadas() {
        return this.metasAsociadas;
    }

    public void setMetasAsociadas(ArrayList<Metas> metasAsociadas) {
        this.metasAsociadas = metasAsociadas;
    }

    public int getLímiteCuentas() {
        return límiteCuentas;
    }

    public void setLímiteCuentas(int límiteCuentas) {
        this.límiteCuentas = límiteCuentas;
    }

    //Desarrollo de Métodos Correspondientes a la Lógica de la Clase Usuario
    public static Object verificarCredencial(String usuarioEntrante, String contraseña) {
        for (Usuario usuario : usuariosTotales) {
            if (usuario.getNombre().equals(usuarioEntrante) || usuario.getCorreo().equals(usuarioEntrante)) {
                if (usuario.getContraseña().equals(contraseña)) {
                    return usuario;
                } else {
                    return true; //Se devolverá true para acotar que la constraseña es incorrecta
                }
            }
        }
        return false; //Se devolverá false para acotar que no existe un usuario con dicha credencial
    }
}