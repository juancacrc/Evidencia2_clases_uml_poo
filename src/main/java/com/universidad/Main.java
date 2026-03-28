// Main.java

package com.universidad;

// Base class Persona  
class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

// Base class Entidad  
class Entidad {
    protected String codigo;

    public Entidad(String codigo) {
        this.codigo = codigo;
    }
}

// Estudiante class inheriting Persona and Entidad  
class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
    }
}

// Profesor class inheriting Persona and Entidad  
class Profesor extends Persona {
    private String departamento;

    public Profesor(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Departamento: " + departamento);
    }
}

// PersonalAdministrativo class inheriting Persona and Entidad  
class PersonalAdministrativo extends Persona {
    private String funcion;

    public PersonalAdministrativo(String nombre, int edad, String funcion) {
        super(nombre, edad);
        this.funcion = funcion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Función: " + funcion);
    }
}

// Main class example demonstrating polymorphism  
public class Main {
    public static void main(String[] args) {
        Persona estudiante = new Estudiante("Juan", 20, "Ingeniería" );
        Persona profesor = new Profesor("Dr. Smith", 45, "Matemáticas" );
        Persona personalAdministrativo = new PersonalAdministrativo("Ana", 35, "Secretaria" );

        // Using polymorphism
        Persona[] personas = {estudiante, profesor, personalAdministrativo};
        for (Persona persona : personas) {
            persona.mostrarDatos();
            System.out.println();
        }
    }
}