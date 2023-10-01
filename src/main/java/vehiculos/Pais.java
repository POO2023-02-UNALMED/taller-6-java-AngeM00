package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    private static HashMap<Pais,Integer> comprasPaises = new HashMap<Pais,Integer>();

    public Pais(String nombre){
        this.nombre = nombre;

        comprasPaises.put(this,1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void aumentarVentaPais(Pais pais){
        if(comprasPaises.containsKey(pais)){
            int valorActual = comprasPaises.get(pais);
            comprasPaises.put(pais, valorActual + 1);
        }
    }

    public static Pais paisMasVendedor(){
        Map.Entry<Pais, Integer> primer = comprasPaises.entrySet().iterator().next();
        Pais paisM = primer.getKey();
        int valorM = primer.getValue();
        for (Map.Entry<Pais, Integer> entry : comprasPaises.entrySet()) {
            if(entry.getValue() > valorM){
                valorM = entry.getValue();
                paisM = entry.getKey();
            }
        }
        return paisM;
    }
}
