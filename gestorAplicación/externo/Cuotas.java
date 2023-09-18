package gestorAplicación.externo;

import java.util.ArrayList;

public enum Cuotas {
    C1(1),
    C6(6),
    C12(12),
    C18(18),
    C24(24),
    C36(36),
    C48(48);

    //Atributos
    private final int cantidadCuotas;

    //Constructor
    Cuotas(int cantidadCuotas){
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public static ArrayList<Cuotas> getCuotas(){
        ArrayList<Cuotas> listaCuotas = new ArrayList<Cuotas>();
        listaCuotas.add(C1);
        listaCuotas.add(C6);
        listaCuotas.add(C12);
        listaCuotas.add(C18);
        listaCuotas.add(C24);
        listaCuotas.add(C36);
        listaCuotas.add(C48);

        return listaCuotas;
    }

    public String toString(){
        if(cantidadCuotas == 1){
            return cantidadCuotas + " cuota";
        }
        else{
            return cantidadCuotas + " cuotas";
        }
    }
}
