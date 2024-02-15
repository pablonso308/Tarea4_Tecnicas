package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


class simulador {

    public static void simular(Map<String, List<String>> configuracion) {
        red red = crearRed(configuracion);
        Map<String, Integer> trafico = simularTrafico(red);
        List<String> cuellosDeBotella = identificarCuellosDeBotella(trafico);
        mostrarResultados(cuellosDeBotella);
    }


    public static red crearRed(Map<String, List<String>> configuracion) {
        red red = new red();

        for (String dispositivoNombre : configuracion.get("dispositivos")) {
            dispositivo dispositivo = new dispositivo(dispositivoNombre);
            red.agregarDispositivo(dispositivo);
        }

        for (String conexion : configuracion.get("conexiones")) {
            String[] indices = conexion.split(",");
            dispositivo dispositivo1 = red.dispositivos.get(Integer.parseInt(indices[0]));
            dispositivo dispositivo2 = red.dispositivos.get(Integer.parseInt(indices[1]));
            red.conectarDispositivos(dispositivo1, dispositivo2);
        }

        return red;
    }


    public static Map<String, Integer> simularTrafico(red red) {
        Map<String, Integer> trafico = new HashMap<>();

        for (dispositivo dispositivo : red.dispositivos) {
            trafico.put(dispositivo.nombre, new Random().nextInt(100) + 1);
        }

        return trafico;
    }

    public static List<String> identificarCuellosDeBotella(Map<String, Integer> trafico) {
        List<String> cuellosDeBotella = new ArrayList<>();

        int maxTrafico = trafico.values().stream().mapToInt(Integer::intValue).max().orElse(0);

        for (Map.Entry<String, Integer> entry : trafico.entrySet()) {
            if (entry.getValue() == maxTrafico) {
                cuellosDeBotella.add(entry.getKey());
            }
        }

        return cuellosDeBotella;
    }


    public static void mostrarResultados(List<String> cuellosDeBotella) {
        System.out.println("Cuellos de botella identificados en los siguientes dispositivos:");
        for (String dispositivo : cuellosDeBotella) {
            System.out.println("- " + dispositivo);
        }
    }


}
