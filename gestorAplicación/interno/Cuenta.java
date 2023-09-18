package gestorAplicación.interno;

import gestorAplicación.externo.Banco;
import gestorAplicación.externo.Divisas;

import java.util.ArrayList;

public abstract class Cuenta implements Comparable<Cuenta> {

    //Atributos de Información
    private Usuario titular;
    private int clave; //4 Dígitos
    protected Divisas divisa;
    protected String nombre;
    protected int numero; //Número de cuenta, 16 dígitos
    protected Banco banco;
    private boolean congelamiento;

    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Cuenta> cuentasTotales = new ArrayList<Cuenta>();

    //Getters y Setters de la clase


    public Usuario getTitular() {
        return titular;
    }
    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }

    public Divisas getDivisa() {
        return divisa;
    }
    public void setDivisa(Divisas divisa) {
        this.divisa = divisa;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public boolean isCongelamiento() {
        return congelamiento;
    }
    public void setCongelamiento(boolean congelamiento) {
        this.congelamiento = congelamiento;
    }

    public static ArrayList<Cuenta> getCuentasTotales() {
        return cuentasTotales;
    }
    public static void setCuentasTotales(ArrayList<Cuenta> cuentasTotales) {
        Cuenta.cuentasTotales = cuentasTotales;
    }

    public int compareTo(Cuenta cuenta){
        return Double.compare(this.getNumero(), cuenta.getNumero());
    }

    public static void limpiezaPropiedades(ArrayList<String> arreglo){
        arreglo.remove("cuentasTotales");
    }

    public static double redondeoDecimal(double numero, int decimales){
        return Math.round(numero * Math.pow(10.0, decimales)) / Math.pow(10.0, decimales);
    }
}
