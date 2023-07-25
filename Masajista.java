package ejercicioherencia;

public class Masajista extends Seleccion {
    // Atributos específicos de la clase Masajista
    private String titulo;
    private int aniosExperiencia;

    /* Constructor sin parametros */
    public Masajista() {
        // Llamada al constructor de la superclase (Seleccion) sin parámetros
        super();
        this.titulo = "";
        this.aniosExperiencia = 0;
    }

    /* Constructor con parametros */
    public Masajista(int id, String nombre, String apellidos, int edad, String titulo, int aniosExperiencia) {
        // Llamada al constructor de la superclase (Seleccion) con parámetros
        super(id, nombre, apellidos, edad);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    /* Métodos Set y Get para los atributos específicos de Masajista */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
