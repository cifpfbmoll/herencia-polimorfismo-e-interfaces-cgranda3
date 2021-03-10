/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.util.ArrayList;
/**
 *
 * @author César 
 */
public class Inmobiliaria {
    
    private String nombreInmobiliaria;
    private ArrayList <Inmueble> listaInmuebles=new ArrayList <Inmueble>();
    private String cifInmobiliaria;
    
    public Inmobiliaria(){
    }

    public Inmobiliaria(String nombreInmobiliaria, String cifInmobiliaria) {
        this.nombreInmobiliaria = nombreInmobiliaria;
        this.cifInmobiliaria = cifInmobiliaria;
    }

    public String getNombreInmobiliaria() {
        return nombreInmobiliaria;
    }

    public void setNombreInmobiliaria(String nombreInmobiliaria) {
        this.nombreInmobiliaria = nombreInmobiliaria;
    }

    public ArrayList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    public void setListaInmuebles(ArrayList<Inmueble> listaInmuebles) {
        this.listaInmuebles = listaInmuebles;
    }

    public String getCifInmobiliaria() {
        return cifInmobiliaria;
    }

    public void setCifInmobiliaria(String cifInmobiliaria) {
        this.cifInmobiliaria = cifInmobiliaria;
    }

    @Override
    public String toString() {
        return "Inmobiliaria{" + "nombreInmobiliaria=" + nombreInmobiliaria + ", listaInmuebles=" + listaInmuebles + ", cifInmobiliaria=" + cifInmobiliaria + '}';
    }
    
    
}
