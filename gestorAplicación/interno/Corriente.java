package gestorAplicación.interno;

import gestorAplicación.externo.Cuotas;

import java.util.ArrayList;

public class Corriente extends Cuenta{
    //Atributos de Información
    private double cupo = 0;
    private double disponible;
    private Cuotas plazoPago;
    private double intereses;

    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Corriente> cuentasCorrienteTotales = new ArrayList<Corriente>();

    //Getters y Setters de la clase
    public double getCupo() {
        return cupo;
    }
    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public double getDisponible() {
        return disponible;
    }
    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    public Cuotas getPlazoPago() {
        return plazoPago;
    }
    public void setPlazoPago(Cuotas plazoPago) {
        this.plazoPago = plazoPago;
    }

    public double getIntereses() {
        return intereses;
    }
    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public static ArrayList<Corriente> getCuentasCorrienteTotales() {
        return cuentasCorrienteTotales;
    }
    public static void setCuentasCorrienteTotales(ArrayList<Corriente> cuentasCorrienteTotales) {
        Corriente.cuentasCorrienteTotales = cuentasCorrienteTotales;
    }

    public int compareTo(Corriente cuenta){
        return Double.compare(this.getDisponible(), cuenta.getDisponible());
    }
}
