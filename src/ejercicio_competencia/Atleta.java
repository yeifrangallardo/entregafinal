/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_competencia;

/**
 *
 * @author INTEL CORE I3
 */
public class Atleta {
  
    private String nombre;
    private String nacionalidad;
    private double tiempo;

    public Atleta(String nombre, String nacionalidad, double tiempo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public double getTiempo() {
        return tiempo;
    }

    
}