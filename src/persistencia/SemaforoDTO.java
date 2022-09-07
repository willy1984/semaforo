/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author cvelez
 */
public abstract class SemaforoDTO {
    
    public boolean luz_verde;
    public boolean luz_amarilla;
    public boolean luz_roja;
    
    public int tension_verde;
    public int tension_amarilla;
    public int tension_roja;

    public boolean isLuz_verde() {
        return luz_verde;
    }

    public void setLuz_verde(boolean luz_verde) {
        this.luz_verde = luz_verde;
    }

    public boolean isLuz_amarilla() {
        return luz_amarilla;
    }

    public void setLuz_amarilla(boolean luz_amarilla) {
        this.luz_amarilla = luz_amarilla;
    }

    public boolean isLuz_roja() {
        return luz_roja;
    }

    public void setLuz_roja(boolean luz_roja) {
        this.luz_roja = luz_roja;
    }

    public int getTension_verde() {
        return tension_verde;
    }

    public void setTension_verde(int tension_verde) {
        this.tension_verde = tension_verde;
    }

    public int getTension_amarilla() {
        return tension_amarilla;
    }

    public void setTension_amarilla(int tension_amarilla) {
        this.tension_amarilla = tension_amarilla;
    }

    public int getTension_roja() {
        return tension_roja;
    }

    public void setTension_roja(int tension_roja) {
        this.tension_roja = tension_roja;
    }
    
}
