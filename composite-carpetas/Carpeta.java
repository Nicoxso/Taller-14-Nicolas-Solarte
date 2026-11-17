import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Elemento {

    private String nombre;
    private List<Elemento> hijos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Elemento e) {
        hijos.add(e);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamanoKB() {
        int total = 0;

        for (Elemento e : hijos) {
            total += e.getTamanoKB();
        }

        return total;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "[" + nombre + "] "
                + getTamanoKB() + " KB");

        for (Elemento e : hijos) {
            e.mostrar(sangria + "   ");
        }
    }
}