package com.universidad.personas;

/**
 * Clase Estudiante: Subclase concreta que hereda de Persona
 * Hereda todos los atributos y métodos de Persona y Entidad
 * Añade atributos específicos del estudiante
 */
public class Estudiante extends Persona {
    private String matricula;
    private String carrera;
    private double promedio;
    private int semestre;
    
    /**
     * Constructor por defecto
     */
    public Estudiante() {
        super();
    }
    
    /**
     * Constructor con todos los parámetros
     * @param id identificador único
     * @param nombre nombre completo
     * @param cedula número de cédula
     * @param email dirección de correo electrónico
     * @param telefono número de teléfono
     * @param direccion dirección física
     * @param matricula número de matrícula único
     * @param carrera nombre de la carrera
     * @param promedio promedio académico
     * @param semestre semestre actual
     */
    public Estudiante(int id, String nombre, String cedula, String email, 
                      String telefono, String direccion, String matricula, 
                      String carrera, double promedio, int semestre) {
        super(id, nombre, cedula, email, telefono, direccion);
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
        this.semestre = semestre;
    }
    
    // ==================== MÉTODOS GETTER ====================
    
    /**
     * Obtiene la matrícula del estudiante
     * @return matricula del estudiante
     */
    public String getMatricula() {
        return matricula;
    }
    
    /**
     * Obtiene la carrera del estudiante
     * @return carrera del estudiante
     */
    public String getCarrera() {
        return carrera;
    }
    
    /**
     * Obtiene el promedio académico del estudiante
     * @return promedio académico
     */
    public double getPromedio() {
        return promedio;
    }
    
    /**
     * Obtiene el semestre actual del estudiante
     * @return semestre del estudiante
     */
    public int getSemestre() {
        return semestre;
    }
    
    // ==================== MÉTODOS SETTER ====================
    
    /**
     * Establece la matrícula del estudiante
     * @param matricula matrícula a establecer
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    /**
     * Establece la carrera del estudiante
     * @param carrera carrera a establecer
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    /**
     * Establece el promedio académico del estudiante
     * @param promedio promedio a establecer (0.0 - 5.0)
     */
    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 5.0) {
            this.promedio = promedio;
        }
    }
    
    /**
     * Establece el semestre del estudiante
     * @param semestre semestre a establecer
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    // ==================== MÉTODOS HEREDADOS IMPLEMENTADOS ====================
    
    /**
     * Implementa el método abstracto validar de Persona
     * Valida que el estudiante tenga matrícula y carrera asignada
     * @return true si los datos son válidos
     */
    @Override
    public boolean validar() {
        if (this.cedula == null || this.cedula.isEmpty()) {
            System.out.println("Error: La cédula es requerida");
            return false;
        }
        if (this.matricula == null || this.matricula.isEmpty()) {
            System.out.println("Error: La matrícula es requerida");
            return false;
        }
        if (this.carrera == null || this.carrera.isEmpty()) {
            System.out.println("Error: La carrera es requerida");
            return false;
        }
        if (this.promedio < 0.0 || this.promedio > 5.0) {
            System.out.println("Error: El promedio debe estar entre 0.0 y 5.0");
            return false;
        }
        return true;
    }
    
    /**
     * Implementa el método abstracto mostrarDetalles de Persona
     * Muestra toda la información del estudiante incluyendo
     * atributos heredados de Persona y Entidad
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║        INFORMACIÓN DEL ESTUDIANTE              ║");
        System.out.println("╚══════════════��═════════════════════════════════╝");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cédula: " + this.cedula);
        System.out.println("Email: " + this.email);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Fecha de Creación: " + this.fechaCreacion);
        System.out.println("─────────────────────────────────────────────────");
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Promedio: " + String.format("%.2f", this.promedio));
        System.out.println("Semestre: " + this.semestre);
        System.out.println("═════════════════════════════════════════════════\n");
    }
}