public class Celular {
    private String modelo;
    private String marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;
    private boolean llamada;

    public Celular(){
    }

    public Celular(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public Celular(String modelo, String marca, int memoria, boolean radio, int nroCelular) {
        this.modelo = modelo;
        this.marca = marca;
        this.memoria = memoria;
        this.radio = radio;
        this.nroCelular = nroCelular;
        this.llamada = false;
    }

    public void realizarLlamada(){
        if (!this.llamada) {
            System.out.println("Llamando...");
            this.llamada = true;
        }
        else{
            System.out.println("No se puede realizar la llamada");
        }
    }

    public void cortarLlamada(){
        if (this.llamada) {
            System.out.println("Llamada cortada");
            llamada = false;
        }
        else{
            System.out.println("No esta en llamada");
        }
    }
}
