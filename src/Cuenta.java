public class Cuenta {
    private String tipo;
    private boolean activacion;
    private  int clave;
    private int numeroCuenta;
    private double saldo;
    private String nombreBanco;

    public void consignar(double monto){
        this.saldo = this.saldo+monto;
    }

    public double retirar(double monto){
        this.saldo = this.saldo - monto;

        return this.saldo;
    }

    public boolean validarRetiro(double monto){
        if(monto>this.saldo){
            return false;
        }
        return true;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isActivacion() {
        return activacion;
    }

    public int getClave() {
        return clave;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActivacion(boolean activacion) {
        this.activacion = activacion;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
}
