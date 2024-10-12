public class Main {
    public static void main(String [] args){
        Perro oPerro = new Perro();
        oPerro.setNombre("Trotsky");
        oPerro.setColorPelo("Negro");
        System.out.println(oPerro.getNombre());
        oPerro.sonido();
        oPerro.sonido(12);
        oPerro.sonido("Guau");
        oPerro.sonido(23, "Grr...");
        oPerro.obedecer();

        Gato gato = new Gato();
        gato.setNombre("Misifus");
        gato.sonido(4);
        gato.sonido("Shhh");
        gato.sonido(5, "Grrr");

    }


}