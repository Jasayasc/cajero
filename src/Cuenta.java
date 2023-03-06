import java.util.Scanner;

public class Cuenta {
    private String tipo;
    private boolean activacion;
    private  int clave;
    private int numeroCuenta;
    private double saldo;
    private String nombreBanco;

    Scanner leer = new Scanner(System.in);
    public Cuenta(String tipo, boolean activacion, int clave, int numeroCuenta, double saldo, String nombreBanco) {
        this.tipo = tipo;
        this.activacion = activacion;
        this.clave = clave;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreBanco = nombreBanco;
    }

    public void consignar(double monto){
        this.saldo = this.saldo+monto;
        System.out.println("Su saldo final es de: " + this.saldo);
    }

    public double retirar(double monto){
        this.saldo = this.saldo - monto;
        return this.saldo;
    }

    public boolean puedeRetirar(double monto){
        if(this.saldo < monto){
            return false;
        }
        return true;
    }

    public void informacionCuenta(){
        System.out.println("Banco: "+nombreBanco);
        System.out.println("Nro de cuenta: "+this.numeroCuenta);
        System.out.println("Tipo de cuenta: "+tipo);
        if(activacion){
            System.out.println("Estado: Activo");
            System.out.println("Saldo: " + saldo);
        }else{
            System.out.println("Estado: Desactivada");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public boolean pass(){
        System.out.print("Ingresa tu clave: ");
        int clave = leer.nextInt();
        //System.out.println("\nLa clave ingresada es: " + clave);

        if (clave == this.clave){
            return true;
        }
        return false;
    }

    public boolean isActivacion() {
        return activacion;
    }
}



