/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueria;

/**
 *
 * @author barre
 */
public class empleado {
    
    protected String nombre;
    protected int corteCaballero;
    protected int corteDama;
    protected int tintura;
    protected int peinado;

    public empleado() {
    }

    public empleado(String nombre) {
        this.nombre = nombre;
        this.corteCaballero = 0;
        this.corteDama = 0;
        this.tintura = 0;
        this.peinado = 0;
    }
    
    public void registro(servicioPeluqueria servicio){
        servicio.realizarServicio(this);
    }
    
    public void mostrarDetalle(){
        System.out.println("Peluquero: " + nombre);
        System.out.println("Cortes Caballero: " + corteCaballero);
        System.out.println("Cortes Damas: " + corteDama);
        System.out.println("Tinturas: " + tintura);
        System.out.println("Peinados: " + peinado);
        int total = corteCaballero * 8000 + corteDama * 10500 + tintura * 40000 + peinado * 15000;
        System.out.println("Total: $" + total);
    }
    
    public void reiniciarDia(){
        corteCaballero = 0;
        corteDama = 0;
        tintura = 0;
        peinado = 0;
    }
}
