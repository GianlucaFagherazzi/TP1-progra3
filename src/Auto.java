public class Auto {
    private String color;
    private String patente;
    private int anio;
    private String modelo;
    private int km;
    private boolean encendido;

    public Auto() {

    }

    public Auto(String color, String patente, int anio, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.anio = anio;
        this.modelo = modelo;
        this.km = km;
        this.encendido = false;
    }

    public String getAuto() {
        return this.modelo;
    }

    public void encender(){
        if (encendido) {
            System.out.println("El auto esta encendido");
        }
        else{
            this.encendido = true;
        }
    }

    public void apagar(){
        if (encendido) {
            this.encendido = false;
        }
        else{
            System.out.println("El auto esta apagado");
        }
    }

    public String kilometrajeMayor(){
        String datosRetornar;
        if (this.km > 100000) {
            datosRetornar = this.color + " " + this.patente + " " + this.anio + " " + this.modelo + " " + this.km;
        }
        else{
            datosRetornar = "el auto no supero los 100000 km";
        }
        return datosRetornar;
    }
}
