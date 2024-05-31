/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_competencia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *

 */
public class Competencia {

   private ArrayList<Atleta> listaAtletas = new ArrayList<>();

    public void registrarAtleta() {
        String nombre = JOptionPane.showInputDialog("Nombre del Atleta");
        String nacionalidad = JOptionPane.showInputDialog("Nacionalidad del Atleta");
        double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo del Atleta"));

        Atleta nuevoAtleta = new Atleta(nombre, nacionalidad, tiempo);
        listaAtletas.add(nuevoAtleta);
    }

    public void mostrarDatosCampeon() {
        if (listaAtletas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay atletas registrados.");
            return;
        }

        Atleta campeon = listaAtletas.get(0);
        for (Atleta a : listaAtletas) {
            if (a.getTiempo() < campeon.getTiempo()) {
                campeon = a;
            }
        }

        JOptionPane.showMessageDialog(null, "Datos del Campeón:\n" +
                "Nombre: " + campeon.getNombre() + "\n" +
                "Nacionalidad: " + campeon.getNacionalidad() + "\n" +
                "Tiempo: " + campeon.getTiempo());
    }

    public void mostrarAtletasPorPais() {
        String pais = JOptionPane.showInputDialog("Ingrese la Nacionalidad");
        StringBuilder atletasPorPais = new StringBuilder();

        for (Atleta a : listaAtletas) {
            if (a.getNacionalidad().equalsIgnoreCase(pais)) {
                atletasPorPais.append(a.getNombre()).append("\n");
            }
        }

        if (atletasPorPais.length() == 0) {
            JOptionPane.showMessageDialog(null, "No hay atletas de la nacionalidad: " + pais);
        } else {
            JOptionPane.showMessageDialog(null, "Atletas de la nacionalidad " + pais + ":\n" +
                    atletasPorPais.toString());
        }
    }

    public void mostrarTiempoPromedio() {
        if (listaAtletas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay atletas registrados.");
            return;
        }

        double sumaTiempos = 0;
        for (Atleta a : listaAtletas) {
            sumaTiempos += a.getTiempo();
        }
        double promedio = sumaTiempos / listaAtletas.size();

        JOptionPane.showMessageDialog(null, "El tiempo promedio de los atletas es: " + promedio);
    }
}
