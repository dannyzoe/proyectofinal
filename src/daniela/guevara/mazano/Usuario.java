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
public class Usuario implements Serializable{
    private int id;
    private String nombre;
    private float sueldos;
    private ArrayList<Usuario> usuarios;

    public Usuario() {
    }

    public Usuario(int id, String nombre, float sueldos, ArrayList<Usuario> usuarios) {
        this.id = id;
        this.nombre = nombre;
        this.sueldos = sueldos;
        this.usuarios = usuarios;
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

    public float getSueldos() {
        return sueldos;
    }

    public void setSueldos(float sueldos) {
        this.sueldos = sueldos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", sueldos=" + sueldos + ", usuarios=" + usuarios + '}';
    }
    
}
