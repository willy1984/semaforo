/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import javax.swing.ImageIcon;
import persistencia.Vehicular;

/**
 *
 * @author cvelez
 */
public class Modelo {

    private VistaSimulacion ventanaSimulacion;

    private Vehicular semaforoVechicular;

    public VistaSimulacion getVistaSimulacion() {

        if (ventanaSimulacion == null) {
            ventanaSimulacion = new VistaSimulacion(this);
        }
        return ventanaSimulacion;
    }

    public void iniciar() {
        getVistaSimulacion().setSize(800, 600);
        getVistaSimulacion().setVisible(true);
        getVistaSimulacion().setLocationRelativeTo(null);
    }

    /*
    * Accion de encender o apagar la luz roja
     */
    void accionRojo(boolean accion, int grupo) {

        if (grupo == 1) {
            if (accion) {
                getVistaSimulacion().getLbl_img1().setIcon(new ImageIcon(getClass().getResource("/Imagenes/red_true.png")));
            } else {
                getVistaSimulacion().getLbl_img1().setIcon(new ImageIcon(getClass().getResource("/Imagenes/red_false.png")));
            }
        } else {
            if (accion) {
                getVistaSimulacion().getLbl_grup2_image_red().setIcon(new ImageIcon(getClass().getResource("/Imagenes/red_true.png")));
                getVistaSimulacion().getLbl_grup2_image_red_2().setIcon(new ImageIcon(getClass().getResource("/Imagenes/red_true.png")));
            } else {
                getVistaSimulacion().getLbl_grup2_image_red().setIcon(new ImageIcon(getClass().getResource("/Imagenes/red_false.png")));
                getVistaSimulacion().getLbl_grup2_image_red_2().setIcon(new ImageIcon(getClass().getResource("/Imagenes/red_false.png")));
            }
        }

    }

    /*
    * Accion de encender o apagar la luz amarilla
     */
    void accionAmarilla(boolean accion, int grupo) {

        if (grupo == 1) {
            if (accion) {
                getVistaSimulacion().getLbl_img2().setIcon(new ImageIcon(getClass().getResource("/Imagenes/yellow_true.png")));
            } else {
                getVistaSimulacion().getLbl_img2().setIcon(new ImageIcon(getClass().getResource("/Imagenes/yellow_false.png")));
            }
        } else {
            if (accion) {
                getVistaSimulacion().getLbl_grup2_image_yellow().setIcon(new ImageIcon(getClass().getResource("/Imagenes/yellow_true.png")));
            } else {
                getVistaSimulacion().getLbl_grup2_image_yellow().setIcon(new ImageIcon(getClass().getResource("/Imagenes/yellow_false.png")));
               
            }
        }

    }

    /*
    * Accion de encender o apagar la luz verde
     */
    void accionVerde(boolean accion, int grupo) {

        if (grupo == 1) {
            if (accion) {
                getVistaSimulacion().getLbl_img3().setIcon(new ImageIcon(getClass().getResource("/Imagenes/green_true.png")));
            } else {
                getVistaSimulacion().getLbl_img3().setIcon(new ImageIcon(getClass().getResource("/Imagenes/green_false.png")));
            }
        }else {
            if (accion) {
                getVistaSimulacion().getLbl_grup2_image_green().setIcon(new ImageIcon(getClass().getResource("/Imagenes/green_true.png")));
                getVistaSimulacion().getLbl_grup2_image_green_2().setIcon(new ImageIcon(getClass().getResource("/Imagenes/green_true.png")));
            } else {
                getVistaSimulacion().getLbl_grup2_image_green().setIcon(new ImageIcon(getClass().getResource("/Imagenes/green_false.png")));
                getVistaSimulacion().getLbl_grup2_image_green_2().setIcon(new ImageIcon(getClass().getResource("/Imagenes/green_false.png")));
            }
        }

    }

}
