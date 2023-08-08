/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_grupal;

/**
 *
 * @author Rusty
 */
public class Usuarios {
    
      
    private String nombre;
    private String id;
    private String status;
    private String nivel_acceso;
    private int n_aportes;

    public Usuarios(String nombre, String id, String status, String nivel_acceso, int n_aportes) {
        this.nombre = nombre;
        this.id = id;
        this.status = status;
        this.nivel_acceso = nivel_acceso;
        this.n_aportes = n_aportes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(String nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

    public int getN_aportes() {
        return n_aportes;
    }

    public void setN_aportes(int n_aportes) {
        this.n_aportes = n_aportes;
    }
    
    
    
    
}

