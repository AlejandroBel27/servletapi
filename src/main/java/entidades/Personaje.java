/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Alejandro Beltran
 */
public class Personaje {
    
    private String nombre; 
    private String color; 
    private String caricatura;
    private String genero;
    private int edad;

    public Personaje(String nombre, String color, String caricatura, String genero, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.caricatura = caricatura;
        this.genero = genero;
        this.edad = edad;
    }

    public Personaje(){}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCaricatura() {
        return caricatura;
    }

    public void setCaricatura(String caricatura) {
        this.caricatura = caricatura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
        @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", color=" + color + ", caricatura=" + caricatura + ", genero=" + genero + ", edad=" + edad + '}';
    }
}
