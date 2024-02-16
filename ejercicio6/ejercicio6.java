package ejercicio6;
import java.util.ArrayList;
import java.util.List;

import static ejercicio6.Transaccion.obtenerTransacciones;

public class ejercicio6 {
    public static void main(String[] args) {
        // Obtener las transacciones (puedes implementar la lógica de obtención según tus necesidades)
        List<Transaccion> transacciones = obtenerTransacciones();

        // Crear un detector de fraudes
        detector detector = new detector();

        // Detectar fraudes en las transacciones
        detector.detectarFraudes(transacciones);
    }

}


