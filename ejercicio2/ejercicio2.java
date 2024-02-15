package ejercicio2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejercicio2 {
    public static void main(String[] args) {
        // Obtener configuración del usuario
        Map<String, List<String>> configuracion = new HashMap<>();
        configuracion.put("dispositivos", List.of("Router1", "Switch1", "PC1", "PC2"));
        configuracion.put("conexiones", List.of("0,1", "1,2", "1,3"));

        // Simular la red con la configuración proporcionada
        simulador.simular(configuracion);
    }
}