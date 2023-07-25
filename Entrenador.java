package ejercicioherencia;

public class Entrenador {
    // Atributos específicos de la clase Entrenador
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private int idFederacion;

    /* Constructor sin parametros */
    public Entrenador() {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.idFederacion = 0;
    }

    /* Constructor con parametros */
    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.idFederacion = idFederacion;
    }

    /* Métodos Set y Get para los atributos de Entrenador */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
}
