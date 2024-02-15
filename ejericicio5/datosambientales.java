package ejericicio5;

class datosambientales {
    private String nombreDispositivo;
    private double temperatura;
    private double humedad;
    private double calidadAire;

    public datosambientales(String nombreDispositivo, double temperatura, double humedad, double calidadAire) {
        this.nombreDispositivo = nombreDispositivo;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.calidadAire = calidadAire;
    }

    public String getNombre() {
        return nombreDispositivo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public double getCalidadAire() {
        return calidadAire;
    }
}