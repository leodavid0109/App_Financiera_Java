package gestorAplicación.interno;

import gestorAplicación.externo.Banco;

import java.util.ArrayList;

public class Deuda extends Metas {

    //Atributos de Información
    private Ahorros cuenta;
    private Banco banco;

    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Deuda> deudasTotales = new ArrayList<Deuda>();

    //Getters y Setters de la clase
    public Ahorros getCuenta(){
        return cuenta;
    }
    public void setCuenta(Ahorros cuenta) {
        this.cuenta = cuenta;
    }

    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public static ArrayList<Deuda> getDeudasTotales() {
        return deudasTotales;
    }
    public static void setDeudasTotales(ArrayList<Deuda> deudasTotales) {
        Deuda.deudasTotales = deudasTotales;
    }
}
