package com.universidad.personas;

import com.universidad.base.Entidad;

/**
 * Clase Persona: Superclase abstracta que hereda de Entidad
 * Define atributos y métodos comunes a todas las personas del sistema
 */
public abstract class Persona extends Entidad {
    protected String cedula;
    protected String email;
    protected String telefono;
    protected String direccion;
    
    /**
     * Constructor por defecto
     */
    public Persona() {
        super();
    }
    
    /**
     * Constructor con parámetros básicos
     * @param id identificador único
     * @param nombre nombre completo
     * @param cedula número de cédula
     * @param email dirección de correo electrónico
     * @param telefono número de teléfono
     * @param direccion dirección física
     */
    public Persona(int id, String nombre, String cedula, String email, 
                   String telefono, String direccion) {
        super(id, nombre);
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    // ==================== MÉTODOS GETTER ====================
    
    /**
     * Obtiene el número de cédula
     * @return cedula de la persona
     */
    public String getCedula() {
        return cedula;
    }
    
    /**
     * Obtiene el email de la persona
     * @return email de la persona
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Obtiene el teléfono de la persona
     * @return telefono de la persona
     */
    public String getTelefono() {
        return telefono;
    }
    
    /**
     * Obtiene la dirección de la persona
     * @return direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }
    
    // ==================== MÉTODOS SETTER ====================
    
    /**
     * Establece el número de cédula
     * @param cedula número de cédula a establecer
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    /**
     * Establece el email de la persona
     * @param email email a establecer
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Establece el teléfono de la persona
     * @param telefono teléfono a establecer
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Establece la dirección de la persona
     * @param direccion dirección a establecer
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // ==================== MÉTODOS HEREDADOS ====================
    
    /**
     * Valida que la cédula tenga un formato válido
     * Método abstracto que debe ser implementado por las subclases
     * @return true si los datos son válidos, false en caso contrario
     */
    @Override
    public abstract boolean validar();
    
    /**
     * Muestra los detalles de la persona
     * Método abstracto que debe ser implementado por las subclases
     */
    @Override
    public abstract void mostrarDetalles();
}