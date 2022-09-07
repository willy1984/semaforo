/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author Estudiantes
 */
public class Controlador implements ActionListener{
    
    private final VistaSimulacion simulacion;
    private final Modelo modelo;
    
    public Controlador(VistaSimulacion vista) {
        this.simulacion = vista;
        this.modelo = vista.getModelo();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JRadioButton) {
            System.out.println("Entra if");
            JRadioButton radioButton = (JRadioButton) e.getSource();
            if (radioButton == simulacion.getBtnRojo()) {
                System.out.println("Hola rojo");
            } else if (radioButton == simulacion.getBtnAmarillo()) {
                System.out.println("Hola amarillo");
            } else {
                System.out.println("Hola verde");
            }
        }
    } 

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
}
