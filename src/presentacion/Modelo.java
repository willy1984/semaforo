/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.awt.Graphics;
import persistencia.Vehicular;

/**
 *
 * @author cvelez
 */
public class Modelo {
    
    private VistaAnotacion modalAnotacion;
    private VistaEntradas ventanaEntradas;
    private VistaSimulacion ventanaSimulacion;
    private VistaTension ventanaTension;
    
    private Vehicular semaforoVechicular;
    
    public VistaAnotacion getVistaAnotacion() {
    
        if (modalAnotacion == null) {
            modalAnotacion = new VistaAnotacion(this);
        }
        return modalAnotacion;
    }
    
    public VistaEntradas getVistaEntradas() {
        
        if (ventanaEntradas == null) {
                ventanaEntradas = new VistaEntradas(this);
            }
            return ventanaEntradas;
    }
    
    public VistaSimulacion getVistaSimulacion() {
        
        if (ventanaSimulacion == null) {
                ventanaSimulacion = new VistaSimulacion(this);
            }
        return ventanaSimulacion;
    }
    
    public VistaTension getVistaTension() {
        
        if (ventanaTension == null) {
                ventanaTension = new VistaTension(this);
            }
            return ventanaTension;
    }
    
    public void pintarSemaforo(Graphics g) {
        
        semaforoVechicular.paintSemaforoVechiculo(g);
    }
    
    public void iniciar() {
        getVistaSimulacion().setSize(800, 600);
        getVistaSimulacion().setVisible(true);
        getVistaSimulacion().setLocationRelativeTo(null);
    }
}
