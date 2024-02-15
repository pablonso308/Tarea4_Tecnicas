package ejericicio5;

import java.util.ArrayList;
import java.util.List;



public class ejercicio5 {

    public static void main(String[] args) {
        List<dispositivo> dispositivos = obtenerdispositivosIoT();
        monitorearAmbiente(dispositivos);
    }

    private static List<dispositivo> obtenerdispositivosIoT() {
        List<dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new dispositivo("Sensor1"));
        dispositivos.add(new dispositivo("Sensor2"));

        return dispositivos;
    }

    private static void monitorearAmbiente(List<dispositivo> dispositivos) {
        boolean continuarMonitoreo = true;
        while (true) {
            List<datosambientales> datos = recolectarDatos(dispositivos);
            mostrarInterfazUsuario(datos);

        }
    }

    private static List<datosambientales> recolectarDatos(List<dispositivo> dispositivos) {
        List<datosambientales> datos = new ArrayList<>();

        for (dispositivo dispositivo : dispositivos) {
            double temperatura = Math.random() * 30 + 10;
            double humedad = Math.random() * 50 + 20;
            double calidadAire = Math.random() * 100;

            datosambientales datosAmbientales = new datosambientales(dispositivo.getNombre(), temperatura, humedad, calidadAire);
            datos.add(datosAmbientales);
        }

        return datos;
    }

    private static void mostrarInterfazUsuario(List<datosambientales> datos) {
        System.out.println("----- Datos Ambientales -----");
        for (datosambientales dato : datos) {
            System.out.println("Dispositivo: " + dato.getNombre());
            System.out.println("Temperatura: " + dato.getTemperatura() + " °C");
            System.out.println("Humedad: " + dato.getHumedad() + "%");
            System.out.println("Calidad del Aire: " + dato.getCalidadAire());
            System.out.println("-----------------------------");
        }



    }
}


