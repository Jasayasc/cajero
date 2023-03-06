import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Cajero cajero = new Cajero("Cra 10 sur", 1,30000);
        Cuenta cuenta = new Cuenta("Ahorro", false, 1234, 010101, 50000, "Bancolombia");
        Transaccion transaccion = new Transaccion(cuenta, cajero);

        Scanner leer = new Scanner(System.in);
        while(true) {
            System.out.println("\nPrograma para simular un cajero");
            System.out.println("1. Consignar");
            System.out.println("2. Retirar");
            System.out.println("3. Informacion cuenta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion:");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    transaccion.consignar();

                    break;
                case 2:
                    transaccion.debitar();
                    //System.out.println("Retiro exitoso");
                    break;
                case 3:
                    cuenta.informacionCuenta();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Digite una opcion correcta.");
            }
        }
    }
}