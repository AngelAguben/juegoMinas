/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import javax.swing.JButton;

/**
 *
 * @author daniel
 */
public class Botones extends JButton{
    
    private JButton boton;
    private String nombre;
    private String ruta;
    private boolean estado;

    public Botones(JButton boton, String nombre, String ruta, boolean estado) {
        this.boton = boton;
        this.nombre = nombre;
        this.ruta = ruta;
        this.estado = estado;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
