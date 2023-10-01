package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cantidadAuto = 0;
    
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos = puestos;

        Automovil.cantidadAuto += 1;
    }

    public int getPuestos(){
        return this.puestos;
    }

    public void setPuestos(int puestos){
        this.puestos = puestos;
    }

    public static int getCantidadAutomovil(){
        return Automovil.cantidadAuto;
    }
}
