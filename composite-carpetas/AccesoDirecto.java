public class AccesoDirecto implements Elemento {

    private Elemento destino;

    public AccesoDirecto(Elemento destino) {
        this.destino = destino;
    }

    @Override
    public String getNombre() {
        return "Acceso directo a " + destino.getNombre();
    }

    @Override
    public int getTamanoKB() {
        return 1;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + getNombre() + " 1 KB");
    }
}