/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semaforo;

import presentacion.Modelo;

/**
 *
 * @author cvelez
 */
public class Semaforo {
    
    private final Modelo miSemaforo;

    public Semaforo() {
        miSemaforo = new Modelo();
        miSemaforo.iniciar();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Semaforo();
    }
    
}
