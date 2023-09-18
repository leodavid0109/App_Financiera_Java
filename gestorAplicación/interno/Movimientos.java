package gestorAplicación.interno;

import java.util.ArrayList;
import java.util.Date;

import gestorAplicación.externo.Banco;
import gestorAplicación.externo.Divisas;

public class Movimientos {

    //Atributos de Información
    private int id;
    private double cantidad;
    private Categoria categoria;
    private Date fecha;
    private Cuenta destino;
    private Cuenta origen;
    private Divisas divisa;
    private Banco banco;
    private double cuotaManejo;
    private Movimiento tipoMovimiento;

    //Atributos de Almacenamiento en Arreglos
    private static ArrayList<Movimientos> movimientosTotales = new ArrayList<Movimientos>();

    //Getters y Setters de la clase
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public Cuenta getDestino(){
        return destino;
    }
    public void setDestino(Cuenta destino){
        this.destino = destino;
    }

    public Cuenta getOrigen(){
        return origen;
    }
    public void setOrigen(Cuenta origen){
        this.origen = origen;
    }

    public Divisas getDivisa(){
        return divisa;
    }
    public void setDivisa(Divisas divisa){
        this.divisa = divisa;
    }

    public Banco getBanco(){
        return banco;
    }
    public void setBanco(Banco banco){
        this.banco = banco;
    }

    public double getCuotaManejo(){
        return cuotaManejo;
    }
    public void setCuotaManejo(double cuotaManejo){
        this.cuotaManejo = cuotaManejo;
    }

    public Movimiento getTipoMovimiento() {
        return tipoMovimiento;
    }
    public void setTipoMovimiento(Movimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public static ArrayList<Movimientos> getMovimientosTotales(){
        return Movimientos.movimientosTotales;
    }
    public static void setMovimientosTotales(ArrayList<Movimientos> movimientosTotales){
        Movimientos.movimientosTotales = movimientosTotales;
    }

}
