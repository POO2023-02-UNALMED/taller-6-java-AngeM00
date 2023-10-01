package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    private static int cantidadCamion = 0;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante,int ejes){
        super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
        this.ejes = ejes;

        Camion.cantidadCamion += 1;
    }

    public int getEjes(){
        return this.ejes;
    }

    public void setEjes(int ejes){
        this.ejes = ejes;
    }

    public static int getCantidadCamion(){
        return Camion.cantidadCamion;
    }
}
