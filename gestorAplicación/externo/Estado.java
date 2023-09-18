package gestorAplicación.externo;

import java.util.ArrayList;

public class Estado {

    //Atributos de Información
    private String nombre;
    private int id;
    private double tasaImpuestos;
    private Divisas divisa;
    private double interesBancarioCorriente;
    private double tasasUsura;

    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Estado> estadosTotales = new ArrayList<Estado>();

    //Getters y Setters de la clase
    private String getNombre(){
        return nombre;
    }
    private void setNombre(String nombre){
        this.nombre = nombre;
    }

    private int getId(){
        return id;
    }
    private void setId(int id){
        this.id = id;
    }

    private double getTasaImpuestos(){
        return tasaImpuestos;
    }
    private void setTasaImpuestos(double tasaImpuestos){
        this.tasaImpuestos = tasaImpuestos;
    }

    private Divisas getDivisa(){
        return divisa;
    }
    private void setDivisa(Divisas divisa){
        this.divisa = divisa;
    }

    private double getInteresBancarioCorriente(){
        return interesBancarioCorriente;
    }
    private void setInteresBancarioCorriente(double interesBancarioCorriente){
        this.interesBancarioCorriente = interesBancarioCorriente;
    }

    private double getTasasUsura(){
        return tasasUsura;
    }
    private void setTasasUsura(double tasasUsura){
        this.tasasUsura = tasasUsura;
    }

    private static ArrayList<Estado> getEstadosTotales(){
        return Estado.estadosTotales;
    }
    private static void setEstadosTotales(ArrayList<Estado> estadosTotales){
        Estado.estadosTotales = estadosTotales;
    }

}
