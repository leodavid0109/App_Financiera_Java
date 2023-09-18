package gestorAplicación.interno;

import java.util.ArrayList;

public class Ahorros extends Cuenta{

    //Atributos de Información
    private double saldo = 0;

    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Ahorros> cuentasAhorroTotales = new ArrayList<Ahorros>();

    //Getters y Setters de la clase

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static ArrayList<Ahorros> getCuentasAhorroTotales() {
        return cuentasAhorroTotales;
    }
    public static void setCuentasAhorroTotales(ArrayList<Ahorros> cuentasAhorroTotales) {
        Ahorros.cuentasAhorroTotales = cuentasAhorroTotales;
    }

    public int compareTo(Ahorros cuenta){
        return Double.compare(this.getSaldo(), cuenta.getSaldo());
    }

    public static void limpiezaPropiedades(ArrayList<String> arreglo){
        arreglo.remove("cuentasAhorroTotales");
    }
}
