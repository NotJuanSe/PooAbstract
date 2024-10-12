public class Perro extends Animal {
    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    //Implementar con la logica respectiva los metodos abstractos de animal

    public void sonido() {
        System.out.println("El sonido que emite el perro es Labrar");

    }

    @Override
    public boolean sonido(int tiempo) {
        return tiempo == 1;
    }

    @Override
    public void deponer(boolean tipo){
        System.out.println(tipo ? "La deposicion es popo": "La deposicion es orina");

    }

    @Override
    public void sonido(int tiempo, String texto) {
        if (tiempo > 20){
            System.out.println("El perro emite el sonido"+texto+ "demasiado largo");
        }

    }

    @Override
    public void sonido(String texto) {
        System.out.println("El Sonido que emite el perro es: "+texto);

    }

    public void obedecer(){

    }
}
