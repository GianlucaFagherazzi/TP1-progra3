public class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    public Persona() {

    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String mostrarDatos(){
        return this.nombre + " " + this.apellido + " " + this.sexo + " " + this.edad + " " + this.ciudad;
    }

    public String mayorDeEdad(){
        String datosRetornar;
        if (this.edad > 18) {
            datosRetornar = this.nombre + " " + this.apellido + " " + this.sexo + " " + this.edad + " " + this.ciudad;
        }
        else{
            datosRetornar = "No es mayor de edad, no se mostraran los datos";
        }
        return datosRetornar;
    }
}
