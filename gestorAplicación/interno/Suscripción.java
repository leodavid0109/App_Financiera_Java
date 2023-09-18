package gestorAplicación.interno;

public enum Suscripción {
    DIAMANTE(13, 0.80F, 4, 2f),
    ORO(10, 0.60F, 3, 1.5f),
    PLATA(7, 0.40F, 2, 1f),
    BRONCE(4, 0.20F, 2, 0.5f);

    //Atributos
    private final int límiteCuentas;
    private final float probabilidadInversión;
    private final int maxDeudas;
    private final float porcentajePréstamo;

    //Constructor
    Suscripción(int límiteCuentas, float probabilidadInversión, int maxDeudas, float porcentajePréstamo){
        this.límiteCuentas = límiteCuentas;
        this.probabilidadInversión = probabilidadInversión;
        this.maxDeudas = maxDeudas;
        this.porcentajePréstamo = porcentajePréstamo;
    }

    //Métodos
    public int getLímiteCuentas(){
        return límiteCuentas;
    }

    public float getProbabilidadInversión() {
        return probabilidadInversión;
    }

    public int getMaxDeudas() {
        return maxDeudas;
    }

    public float getPorcentajePréstamo() {
        return porcentajePréstamo;
    }
}
