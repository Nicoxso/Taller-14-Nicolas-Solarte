public class Main {

    public static void main(String[] args) {

        Carpeta documentos = new Carpeta("Documentos");

        documentos.agregar(new Archivo("hoja-de-vida.pdf", 250));

        Carpeta fotos = new Carpeta("Fotos");

        fotos.agregar(new Archivo("grado.jpg", 2400));
        fotos.agregar(new Archivo("paseo.jpg", 1800));

        documentos.agregar(fotos);

        Carpeta universidad = new Carpeta("Universidad");

        Archivo taller = new Archivo("taller-poo.pdf", 320);

        universidad.agregar(taller);

        Carpeta proyecto = new Carpeta("Proyecto");

        proyecto.agregar(new Archivo("Main.java", 6));
        proyecto.agregar(new Archivo("Carrito.java", 9));

        universidad.agregar(proyecto);

        universidad.agregar(new AccesoDirecto(taller));

        documentos.agregar(universidad);

        documentos.mostrar("");

        System.out.println("\nTamaño total: "
                + documentos.getTamanoKB() + " KB");
    }
}