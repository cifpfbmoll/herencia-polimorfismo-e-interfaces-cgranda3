/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class Inmueble {
    
    public static Scanner sc=new Scanner(System.in);
    
    private String poblacionInmueble;
    private int metrosCuadrados;
    private int precioInmueble;
    private String identificadorInmueble;
    
    public Inmueble(){
    }

    public Inmueble(String poblacionInmueble, int metrosCuadrados, int precioInmueble, String identificadorInmueble) {
        this.poblacionInmueble = poblacionInmueble;
        this.metrosCuadrados = metrosCuadrados;
        this.precioInmueble = precioInmueble;
        this.identificadorInmueble = identificadorInmueble;
    }

    public String getPoblacionInmueble() {
        return poblacionInmueble;
    }

    public void setPoblacionInmueble(String poblacionInmueble) {
        this.poblacionInmueble = poblacionInmueble;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getPrecioInmueble() {
        return precioInmueble;
    }

    public void setPrecioInmueble(int precioInmueble) {
        //Comprovar si el precio es mayor a 0
        while (precioInmueble <= 0){
            System.out.println("El precio debe ser mayor a 0");
            System.out.println("Inserte un nuevo precio");
            precioInmueble=sc.nextInt();
        }
        this.precioInmueble = precioInmueble;
    }

    public String getIdentificadorInmueble() {
        return identificadorInmueble;
    }

    public void setIdentificadorInmueble(String identificadorInmueble) {
        this.identificadorInmueble = identificadorInmueble;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "poblacionInmueble=" + poblacionInmueble + ", metrosCuadrados=" + metrosCuadrados + ", precioInmueble=" + precioInmueble + ", identificadorInmueble=" + identificadorInmueble + '}';
    }
    
    
    
}
