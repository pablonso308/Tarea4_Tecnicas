package ejercicio2;

import java.util.ArrayList;
import java.util.List;

class red {
    List<dispositivo> dispositivos;

    public red() {
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void conectarDispositivos(dispositivo dispositivo1, dispositivo dispositivo2) {
        dispositivo1.conexiones.add(dispositivo2);
        dispositivo2.conexiones.add(dispositivo1);
    }
}


