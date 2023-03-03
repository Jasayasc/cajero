public class Transaccion {
    private String fecha;
    private int numeroTransaccion;

    private Cuenta cuenta;
    private double monto;

    public Transaccion(Cuenta cuenta) {
        this.cuenta = cuenta;
        this.fecha = "03/02/2023";
        this.numeroTransaccion = 01;
        this.monto = monto;
    }

    public void debitar(){
        if(this.cuenta.validarRetiro(this.monto)){
            System.out.println("No se puede retirar...");
        }else{
            this.cuenta.retirar(this.monto);
        }

        this.fecha = "03/03/2023";
    }

    public void consignar(){
        this.cuenta.consignar(this.monto);
        this.fecha="03/03/2023";
    }
}
