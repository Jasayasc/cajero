public class Cajero {
    private String direccion;
    private int numeroCajero;
    private double monto;

    public Cajero(String dir, int numeroCajero, double monto) {
        this.direccion = dir;
        this.numeroCajero = numeroCajero;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void recargar(double montoAdicional) {
        this.monto = this.monto + montoAdicional;
    }

    public boolean puedeRetirar(double montoRetirar) {
        if (montoRetirar > this.monto) {
            return true;
        }
        return false;
    }

    public void retirar(double montoAdicional) {
        this.monto = this.monto - montoAdicional;
    }
}
