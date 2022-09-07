/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author cvelez
 */
public class Vehicular extends SemaforoDTO{
    
    public void paintSemaforoVechiculo(Graphics g) {
        
        g.setColor(Color.BLACK);
        g.drawRect(150, 70, 50, 70);
        
        g.setColor(Color.red);
        g.fillOval(155, 72, 20, 20); 
        

        
    }
    
}
