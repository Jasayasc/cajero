import java.util.Scanner;

public class Transaccion {
    private String fecha;
    private int numeroTransaccion;

    private Cuenta cuenta;
    private Cajero cajero;
    private double monto;

    Scanner leer = new Scanner(System.in);
    public Transaccion(Cuenta cuenta, Cajero cajero) {
        this.cuenta = cuenta;
        this.cajero = cajero;
        this.fecha = "03/02/2023";
        this.numeroTransaccion = 01;
        this.monto = 0;
    }

    public void debitar(){
        System.out.println("Cuanto desea retirar (tenga en cuenta que su saldo actual es de: "+cuenta.getSaldo()+"):");
        this.monto = leer.nextDouble();
        System.out.println("Ingrese la");
        if(cajero.puedeRetirar(this.monto)){
            System.out.println("No se puede retirar...\nSe cargara el cajero en instantes, por favor espere...");
            try {
                Thread.sleep(3000); // Espera 5 segundos (5000 milisegundos)
                cajero.recargar(500000);
                System.out.println("Cajero recargado");
            } catch (InterruptedException e) {
                // Manejo de excepción si la espera es interrumpida
                System.out.println("Por favor espere a que se cargue el cajero.");

            }
        }else{
            if(cuenta.puedeRetirar(this.monto) && cuenta.pass() && cuenta.isActivacion()){
                System.out.println("Retiro exitoso. El saldo de la cuenta es de: "+this.cuenta.retirar(this.monto));
                cajero.retirar(this.monto);
                System.out.println("Numero de transaccion: "+this.numeroTransaccion);
                this.fecha = "03/03/2023";
                this.numeroTransaccion +=1;
            }else{
                System.out.println("Error. \nNo tiene suficiente saldo para retirar o su cuenta se encuentra desactivada");
                //System.out.println("El monto actual es de: "+cuenta.getSaldo());
            }

        }

    }

    public void consignar(){
        System.out.print("Digite monto a consignar: ");
        this.monto = leer.nextDouble();
        if(cuenta.pass() && cuenta.isActivacion()) {
            this.cuenta.consignar(this.monto);
            System.out.printf("Consignacion exitosa");
            System.out.println("Numero de transaccion: " + this.numeroTransaccion);
            this.fecha = "03/03/2023";
            this.numeroTransaccion += 1;
        }else{
            if(cuenta.isActivacion()){
                System.out.println("Clave incorrecta, por favor intente de nuevo....");
            }else{
                System.out.println("La cuenta esta desactivada");
            }
        }
    }

}
