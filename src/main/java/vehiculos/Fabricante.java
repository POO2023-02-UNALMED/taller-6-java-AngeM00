package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static HashMap<Fabricante,Integer> comprasFabricantes = new HashMap<Fabricante,Integer>();

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;

        comprasFabricantes.put(this, 1);
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static void aumentarVentaFabricante(Fabricante fabricante){
        if(comprasFabricantes.containsKey(fabricante)){
            int valorActual = comprasFabricantes.get(fabricante);
            comprasFabricantes.put(fabricante, valorActual + 1);
        }
    }

    public static Fabricante fabricaMayorVentas(){
        Map.Entry<Fabricante, Integer> primer = comprasFabricantes.entrySet().iterator().next();
        Fabricante fab = primer.getKey();
        int valorM = primer.getValue();
        for (Map.Entry<Fabricante, Integer> entry : comprasFabricantes.entrySet()) {
            if(entry.getValue() > valorM){
                valorM = entry.getValue();
                fab = entry.getKey();
            }
        }
        return fab;
    }
}
