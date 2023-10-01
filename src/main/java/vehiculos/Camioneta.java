package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    private static int cantidadCamioneta = 0;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco = volco;

        Camioneta.cantidadCamioneta += 1;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCamioneta(){
        return Camioneta.cantidadCamioneta;
    }
}
