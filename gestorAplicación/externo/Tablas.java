package gestorAplicación.externo;

import gestorAplicación.interno.Ahorros;
import gestorAplicación.interno.Corriente;
import gestorAplicación.interno.Cuenta
import gestorAplicación.interno.Movimientos;

import java.lang.reflect.Field;
import java.util.ArrayList;

public interface Tablas {
    public static ArrayList<String> recibirPropiedadesObjeto(Object clase){
        ArrayList<String> propiedades = new ArrayList<>();
        if(clase.getClass().getName().equals("gestorAplicación.interno.Ahorros") || clase.getClass().getName().equals("gestorAplicación.interno.Corriente") || clase.getClass().getName().equals("gestorAplicación.interno.Deuda")){
            Field[] propiedadAux = clase.getClass().getSuperclass().getDeclaredFields();
            for (Field aux : propiedadAux) {
                propiedades.add(aux.getName());
            }
        }
        Field[] propiedad = clase.getClass().getDeclaredFields();
        for(Field aux : propiedad){
            propiedades.add(aux.getName());
        }
        return propiedades;
    }

    public static void verCuentasAhorros(ArrayList<Ahorros> cuentas){
        ArrayList<String> cadena = Tablas.recibirPropiedadesObjeto(cuentas.get(0));

        Ahorros.limpiezaPropiedades(cadena);
        Cuenta.limpiezaPropiedades(cadena);

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("%4s %8s %15s %25s %15s %20s",
                "#", cadena.get(4), cadena.get(3), cadena.get(0), cadena.get(6), cadena.get(5));
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");

        int i = 1;
        for (Ahorros cuenta: cuentas){
            System.out.printf("%4d %8d %15s %25s %15s %20s",
                    i, cuenta.getNumero(), cuenta.getNombre(), cuenta.getTitular().getNombre(), (Cuenta.redondeoDecimal(cuenta.getSaldo(), 2)) + " " + cuenta.getDivisa(), cuenta.getBanco().getNombre());
            System.out.println();
            i++;
        }
        System.out.println("----------------------------------------------------------------------------------------------");

    }

    public static void verCuentasCorriente(ArrayList<Corriente> cuentas){
        ArrayList<String> cadena = Tablas.recibirPropiedadesObjeto(cuentas.get(0));

        Corriente.limpiezaPropiedades((cadena));
        Cuenta.limpiezaPropiedades(cadena);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%4s %8s %15s %25s %15s %15s %10s %10s %20s",
                "#", cadena.get(4), cadena.get(3), cadena.get(0), cadena.get(6), cadena.get(7), cadena.get(8), cadena.get(9), cadena.get(5));
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

        int i = 1;
        for(Corriente cuenta: cuentas){
            System.out.printf("%4s %8s %15s %25s %15s %15s %10s %10s %20s",
                    i, cuenta.getNumero(), cuenta.getNombre(), cuenta.getTitular().getNombre(), (Cuenta.redondeoDecimal(cuenta.getCupo(), 2) + " " + cuenta.getDivisa()), (Cuenta.redondeoDecimal(cuenta.getDisponible(), 2) + " " + cuenta.getDivisa()), cuenta.getPlazoPago().getCantidadCuotas(), (Cuenta.redondeoDecimal(cuenta.getIntereses(), 2) + " %"), cuenta.getBanco().getNombre());
            System.out.println();
            i++;
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void verHistorialPagos(ArrayList<Movimientos> pagos){

    }
}
