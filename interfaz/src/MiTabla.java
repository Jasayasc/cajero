import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MiTabla extends JFrame {

    public MiTabla() {
        super("Mi tabla");

        // Crear los datos de la tabla
        Object[][] datos = {
                {"Juan", "Pérez", 30},
                {"María", "Gómez", 25},
                {"Pedro", "García", 40},
                {"Luis", "Hernández", 35}
        };

        // Crear los nombres de las columnas
        String[] nombresColumnas = {"Nombre", "Apellido", "Edad"};

        // Crear la tabla con los datos y los nombres de las columnas
        JTable tabla = new JTable(datos, nombresColumnas);

        // Agregar la tabla a un JScrollPane para que tenga barras de desplazamiento
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Agregar el JScrollPane a la ventana
        getContentPane().add(scrollPane);

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }


}
