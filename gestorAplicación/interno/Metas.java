package gestorAplicación.interno;

import java.util.ArrayList;
import java.util.Date;

public class Metas {

    //Atributos de Información
    private String nombre;
    protected double cantidad;
    private Date fecha;
    protected int id;
    protected Usuario dueño;


    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Metas> metasTotales = new ArrayList<Metas>();

    //Getters y Setters de la clase
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Usuario getDueño(){
        return dueño;
    }
    public void setDueño(Usuario dueño){
        this.dueño = dueño;
    }

    public static ArrayList<Metas> getMetasTotales(){
        return Metas.metasTotales;
    }
    public static void setMetasTotales(ArrayList<Metas> metasTotales){
        Metas.metasTotales = metasTotales;
    }
}
