package gestorAplicación.externo;

import java.util.ArrayList;

public class Banco {

    //Atributos de Información
    private String nombre;
    private double comision;
    private Divisas divisa;
    private int id;
    private Estado estadoAsociado;

    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Banco> bancosTotales = new ArrayList<Banco>();

    //Getters y Setters de la clase
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getComision(){
        return comision;
    }
    public void setComision(double comision){
        this.comision = comision;
    }

    public Divisas getDivisa(){
        return divisa;
    }
    public void setDivisa(Divisas divisa){
        this.divisa= divisa;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Estado getEstadoAsociado(){
        return estadoAsociado;
    }
    public void setEstadoAsociado(Estado estadoAsociado){
        this.estadoAsociado = estadoAsociado;
    }

    public static ArrayList<Banco> getBancosTotales(){
        return Banco.bancosTotales;
    }
    public static void setBancosTotales(ArrayList<Banco> bancosTotales){
        Banco.bancosTotales = bancosTotales;
    }
}
