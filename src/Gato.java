public class Gato extends Animal{

    @Override
    public void sonido() {
        System.out.println("El gato emite el sonido de maullar");
    }

    @Override
    public boolean sonido(int tiempo) {
        return tiempo>3;
    }

    @Override
    public void deponer(boolean tipo) {
        System.out.println(tipo? "Bola de pelo": " Popo";

    }

    @Override
    public void sonido(int tiempo, String texto) {
        System.out.println("El gato se demora"+tiempo+"segundos maullando y el sonido"+texto);
    }

    @Override
    public void sonido(String texto) {
        System.out.println("El gato emite el sonido"+texto);

    }
}
