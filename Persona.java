public class Persona {
    int codigo;
    String nombre;
    String direccion;
    String carrera;
    int nivel;
    String tipoContrato;

    public Persona(int codigo, String nombre, String direccion, String carrera, int nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.carrera = carrera;
        this.nivel = nivel;
    }

    public Persona(int codigo, String nombre, String direccion, String carrera, String tipoContrato) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.carrera = carrera;
        this.tipoContrato = tipoContrato;
    }

    void imprimirEstudiante() {
        System.out.println("=== INFORMACION DEL ESTUDIANTE===");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);
        System.out.println("=================================");
    }

    void imprimirProfesor() {
        System.out.println("=== INFORMACION DEL ESTUDIANTE===");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Carrera: " + carrera);
        System.out.println("Tipo de Contrato: " + tipoContrato);
        System.out.println("=================================");
    }
}
