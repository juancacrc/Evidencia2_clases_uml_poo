package com.universidad.base;

import java.time.LocalDateTime;

/**
 * Clase Entidad: Superclase base para todas las entidades del sistema
 * Contiene atributos y métodos comunes a todas las clases
 */
public abstract class Entidad {
    protected int id;
    protected String nombre;
    protected LocalDateTime fechaCreacion;
    
    /**
     * Constructor por defecto
     */
    public Entidad() {
        this.fechaCreacion = LocalDateTime.now();
    }
    
    /**
     * Constructor con parámetros
     * @param id identificador único
     * @param nombre nombre de la entidad
     */
    public Entidad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = LocalDateTime.now();
    }
    
    // ==================== MÉTODOS GETTER ====================
    
    /**
     * Obtiene el identificador de la entidad
     * @return id de la entidad
     */
    public int getId() {
        return id;
    }
    
    /**
     * Obtiene el nombre de la entidad
     * @return nombre de la entidad
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene la fecha de creación
     * @return fecha de creación
     */
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    
    // ==================== MÉTODOS SETTER ====================
    
    /**
     * Establece el identificador de la entidad
     * @param id identificador a establecer
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Establece el nombre de la entidad
     * @param nombre nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // ==================== MÉTODOS ABSTRACTOS ====================
    
    /**
     * Método abstracto que debe ser implementado por las subclases
     * Muestra los detalles de la entidad
     */
    public abstract void mostrarDetalles();
    
    /**
     * Método abstracto que valida los datos de la entidad
     * @return true si los datos son válidos, false en caso contrario
     */
    public abstract boolean validar();
}