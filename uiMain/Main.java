package uiMain;

//Importaciones de las Clases del Programa
import baseDatos.Serializador;
import gestorAplicación.externo.Tablas;
import gestorAplicación.interno.Usuario;

//Importaciones de Utilidades
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public final class Main {

    //Atributos de Clase para el Funcionamiento de la Interfaz
    static Usuario user = null;
    static int seguir = 1;
    static int opciónUsuario = 0;
    static int opciónMetas;
    /*sesiónIniciada es un atributo que corresponde al estado de inicio de sesión, tenemos dos casos:
    * 1. Su valor será 1 si se tiene inicio de sesión como cliente (Usuario)
    * 2. Su valor será 2 si se tiene inicio de sesión administrativo*/
    static int sesiónIniciada = 0;
    static int interfaz = 1;
    static int sección = 0;
    static int opción = 0;
    static String constraseñaAdmin = "";
    static boolean conf = true;
    static Scanner sc = new Scanner(System.in);

    //Método de Ejecución en un inicio
    public static void main(String[] args) throws ParseException, CloneNotSupportedException {

    }

    //Getters y Setters Útiles en el Main
    public static void setConstraseñaAdmin(String constraseñaAdmin){
        Main.constraseñaAdmin = constraseñaAdmin;
    }
    public static boolean isConf() {
        return conf;
    }
    public static void setConf(boolean conf) {
        Main.conf = conf;
    }


    //Inicio del Desarrollo de la Lógica del Programa
    //Método de Inicio del Programa
    static void inicioApp() throws  ParseException, CloneNotSupportedException{
        while (interfaz == 1){
            //Interfaz de Bienvenida
            System.out.println("""
                    Bienvenido a su App Financiera.
                    1. Iniciar Sesión
                    2. Registrarse
                    3. Acceso Administrativo //Cambiar al incluir extensión administrativa
                    4. Cerrar Programa""");

            opciónUsuario = Integer.parseInt(sc.nextLine());

            System.out.println();
            //Ingresar Excepción de Número Equivocado
            switch (opciónUsuario){
                case 1:
                    Main.iniciarSesión();
                case 2:
                    Main.registro();
                case 3:
                    Main.accesoAdministrativo();
                case 4:
                    Main.guardadoObjetos();
                    System.out.println("Finalizando programa. Vuelva pronto.");
                    interfaz = 0;
            }
        }

        //Inicio de Sesión como Cliente
        while (sesiónIniciada == 1){
            System.out.println();
            System.out.println("Bienvenido, " + user.getNombre() + " a tu gestor de dinero, " +
                    """
                    ¿a qué sección deseas ingresar?
                    1. Mis Productos
                    2. Pagos
                    3. Trasferencias
                    4. Documentos y Certificados
                    5. Funciones Adicionales
                    6. Menú""");

            sección = Integer.parseInt(sc.nextLine());

            //REALIZAR LA EXCEPCIÓN DEL NÚMERO EQUIVOCADO
            switch (sección){
                case 1:
                    System.out.println();
                    System.out.println("""
                            Bienvenido a Mis Productos, ¿en qué te podemos ayudar?
                            1. Ver productos
                            2. Últimos pagos
                            3. Últimas transferencias
                            4. Ver metas
                            5. Crear una nueva meta
                            6. Nuevo producto
                            7. Compra de cartera
                            8. Asesoramiento de inversiones
                            9. Salir al menú principal""");

                    opción = Integer.parseInt(sc.nextLine());
                    System.out.println();

                    //REALIZAR LA EXCEPCIÓN DEL NÚMERO EQUIVOCADO
                    switch (opción){
                        case 1:
                            Main.verProductos();
                        case 2:
                            Main.historialPagos();
                        case 3:
                            Main.historialTransferencias();
                        case 4:
                            Main.verMetas();
                        case 5:
                            Main.crearMeta();
                        case 6:
                            Main.crearProducto();
                        case 7:
                            Main.compraCartera();
                        case 8:
                            Main.asesoramientoInversiones();
                        case 9:
                            sección = 0;
                    }
                case 2:
                    System.out.println();
                    System.out.println("""
                            Bienvenido a Pagos, ¿en qué te podemos ayudar?
                            1. Hacer Pago
                            2. Últimos pagos
                            3. Historial Completo de Pagos
                            4. Salir al menú principal""");

                    opción = Integer.parseInt(sc.nextLine());
                    System.out.println();

                    //REALIZAR LA EXCEPCIÓN DEL NÚMERO EQUIVOCADO
                    switch (opción){
                        case 1:
                            Main.hacerPago();
                        case 2:
                            Main.historialPagos();
                        case 3:
                            Main.historialPagos(true);
                        case 4:
                            sección = 0;
                    }
                case 3:
                    System.out.println();
                    System.out.println("""
                            Bienvenido a Transferencias, ¿en qué te podemos ayudar?
                            1. Realizar transferencia entre cuentas
                            2. Avance
                            3. Cambio de divisa
                            4. Salir al menú principal""");

                    opción = Integer.parseInt(sc.nextLine());
                    System.out.println();

                    //REALIZAR LA EXCEPCIÓN DEL NÚMERO EQUIVOCADO
                    switch (opción){
                        case 1:
                            Main.transferencia();
                        case 2:
                            Main.avanceTCrédito();
                        case 3:
                            Main.cambioDivisa();
                        case 4:
                            sección = 0;
                    }
                case 4:
                    System.out.println();
                    System.out.println("""
                            Bienvenido a Documentos y Certificados, ¿en qué te podemos ayudar?
                            1. Ver extractos
                            2. Certificados bancarios
                            3. Salir al menú principal""");

                    opción = Integer.parseInt(sc.nextLine());
                    System.out.println();

                    //REALIZAR LA EXCEPCIÓN DEL NÚMERO EQUIVOCADO
                    switch (opción){
                        case 1:
                            Main.extractos();
                        case 2:
                            Main.certificadosBancarios();
                        case 3:
                            sección = 0;
                    }
                case 5:
                    System.out.println();
                    System.out.println("""
                            Bienvenido a Funciones Adicionales, ¿en qué te podemos ayudar?
                            1. Realizar transferencia entre cuentas
                            2. Avance
                            3. Cambio de divisa
                            4. Salir al menú principal""");

                    opción = Integer.parseInt(sc.nextLine());
                    System.out.println();

                    //REALIZAR LA EXCEPCIÓN DEL NÚMERO EQUIVOCADO
                    switch (opción){
                        case 1:
                            Main.transferencia();
                        case 2:
                            Main.avanceTCrédito();
                        case 3:
                            Main.cambioDivisa();
                        case 4:
                            sección = 0;
                    }
                case 6:
                    System.out.println();
                    System.out.println("""
                            Bienvenido al Menú, ¿en qué te podemos ayudar?
                            1. Actualizar datos
                            2. Congelar tarjetas
                            3. Cambiar claves
                            4. Cambiar divisa de cuentas
                            5. Modificar mi suscripción
                            6. Salir al menú principal""");

                    opción = Integer.parseInt(sc.nextLine());
                    System.out.println();

                    //REALIZAR LA EXCEPCIÓN DEL NÚMERO EQUIVOCADO
                    switch (opción){
                        case 1:
                            Main.transferencia();
                        case 2:
                            Main.avanceTCrédito();
                        case 3:
                            Main.cambioDivisa();
                        case 4:
                            Main.cambioDivisaCuenta();
                        case 5:
                            Main.modificarSuscripción();
                        case 6:
                            sección = 0;
                    }
            }

        }
    }

    //Desarrollo de los Métodos Correspondiente a la Lógica del Main
    static void iniciarSesión() throws ParseException, CloneNotSupportedException {
        System.out.print("Ingresar nombre de usuario o correo electrónico: ");
        String usuario = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String constraseña = sc.nextLine();

        Object verificado = Usuario.verificarCredencial(usuario, constraseña);

        if(verificado instanceof Usuario){
            sesiónIniciada = 1;
            interfaz = 0;
            user = (Usuario) verificado;
        }
        else if ((boolean) verificado) {
            System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            Main.inicioApp();
        }
        else{
            System.out.println("No existen credenciales con estos datos. Inténtalo de nuevo.");
            Main.inicioApp();
        }
    }

    static void registro() {
        //Creación de un usuario
        System.out.println("Diligencie los siguientes datos: ");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Correo electrónico: ");
        String correoElectrónico = sc.nextLine();
        //Verificación del correo

        String contraseña = "";
        boolean validaciónContraseña = true;
        while (validaciónContraseña){
            System.out.print("Contraseña: ");
            contraseña = sc.nextLine();

            System.out.print("Confirmar contraseña: ");
            String confirmaciónContraseña = sc.nextLine();

            //Validación de la validez de la contraseña
            if(!(confirmaciónContraseña.equals(contraseña))){
                System.out.println("Las contraseñas no coinciden. Inténtelo de nuevo.");
            }
            else{
                validaciónContraseña = false;
            }
        }

        System.out.print("Dirección de residencia: ");
        String dirección = sc.nextLine();

        System.out.print("Teléfono: ");
        int teléfono = Integer.parseInt(sc.nextLine());

        System.out.println("Usuario creado con éxito.");
        new Usuario(nombre, correoElectrónico, contraseña, dirección, teléfono);

        //Se vuelve al inicio de sesión
    }

    static void accesoAdministrativo(){

    }

    static void guardadoObjetos() throws ParseException{
        //Falta revisar lo del serializador
    }

    static void verProductos(){
        System.out.println();
        System.out.println("""
            ¿Cuáles de tus productos deseas visualizar?
            1. Cuentas de Ahorros
            2. Cuentas Corriente
            3. Todas las cuentas""");

        int opciónVerCuentas = Integer.parseInt(sc.nextLine());

        System.out.println();
        //Ingresar Excepción de Número Equivocado
        switch (opciónVerCuentas){
            case 1:
                if(user.getCuentasAhorrosAsociadas().size() > 0){
                    System.out.println("Cuentas de ahorros asociadas a " + user.getNombre());
                    Collections.sort(user.getCuentasAhorrosAsociadas());
                    Tablas.verCuentasAhorros(user.getCuentasAhorrosAsociadas());
                }
                else{
                    System.out.print("No tienes cuentas de ahorros asociadas. ¿Deseas crear una? (Y/N): ");
                    String confirmaciónCreación = sc.nextLine();
                    if(confirmaciónCreación.equals("Y") || confirmaciónCreación.equals("y")){
                        Main.nuevaCuentaAhorros();
                    } else if (confirmaciónCreación.equals("N") || confirmaciónCreación.equals("n")) {
                        System.out.println("Volviendo al menú anterior");
                        sección = 1;
                    } else{
                        //Realizar validación de entrada válida
                    }
                }
            case 2:
                if(user.getCuentasCorrienteAsociadas().size() > 0){
                    System.out.println("Cuentas corriente asociadas a " + user.getNombre());
                    Collections.sort(user.getCuentasCorrienteAsociadas());
                    Tablas.verCuentasCorriente(user.getCuentasCorrienteAsociadas());
                }
                else{
                    System.out.print("No tienes cuentas corriente asociadas. ¿Deseas crear una? (Y/N): ");
                    String confirmaciónCreación = sc.nextLine();
                    if(confirmaciónCreación.equals("Y") || confirmaciónCreación.equals("y")){
                        Main.nuevaCuentaCorriente();
                    } else if (confirmaciónCreación.equals("N") || confirmaciónCreación.equals("n")) {
                        System.out.println("Volviendo al menú anterior");
                        sección = 1;
                    } else {
                        //Realizar validación de entrada válida
                    }
                }
            case 3:
                if(user.getCuentasAsociadas().size() > 0){
                    System.out.println("Cuentas asociadas a " + user.getNombre());
                    Collections.sort(user.getCuentasAsociadas());
                    Tablas.verCuentas(user.getCuentasAsociadas());
                }
                else{
                    System.out.print("No tienes cuentas asociadas. ¿Deseas crear una? (Y/N): ");
                    String confirmaciónCreación = sc.nextLine();
                    if(confirmaciónCreación.equals("Y") || confirmaciónCreación.equals("y")){
                        Main.nuevoProducto();
                    } else if (confirmaciónCreación.equals("N") || confirmaciónCreación.equals("n")) {
                        System.out.println("Volviendo al menú anterior");
                        sección = 1;
                    } else {
                        //Realizar validación de entrada válida
                    }
                }
        }
    }

    static void historialPagos(){
        
    }
}