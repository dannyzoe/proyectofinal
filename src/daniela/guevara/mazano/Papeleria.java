/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daniela.guevara.mazano;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Papeleria implements Serializable{
    private int id;
    private String nombre;
    private float precio;
    private ArrayList<Papeleria> papelerias;

    public Papeleria() {
    }

    public Papeleria(int id, String nombre, float sueldos, ArrayList<Papeleria> papelerias) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.papelerias = papelerias;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList<Papeleria> getPapelerias() {
        return papelerias;
    }

    public void setPapelerias(ArrayList<Papeleria> usuarios) {
        this.papelerias = papelerias;
    }

    @Override
    public String toString() {
        return "Papeleria{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", papeleria=" + papelerias + '}';
    }
    
}
