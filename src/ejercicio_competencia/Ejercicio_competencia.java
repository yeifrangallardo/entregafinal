/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_competencia;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ejercicio_competencia {

  public static void main(String[] args) {
        Competencia competencia = new Competencia();

        boolean continuar = true;
        while (continuar) {
            String opcion = JOptionPane.showInputDialog("Competencia\n" +
                    "1. Registrar Atleta\n" +
                    "2. Datos del campeón\n" +
                    "3. Atletas por país\n" +
                    "4. Tiempo promedio de todos los atletas\n" +
                    "5. Salir");

            switch (opcion) {
                case "1":
                    competencia.registrarAtleta();
                    break;
                case "2":
                    competencia.mostrarDatosCampeon();
                    break;
                case "3":
                    competencia.mostrarAtletasPorPais();
                    break;
                case "4":
                    competencia.mostrarTiempoPromedio();
                    break;
                case "5":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }
}

