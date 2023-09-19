/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueria;

/**
 *
 * @author barre
 */
public class corteDama implements servicioPeluqueria{
    
    @Override
    public void realizarServicio(empleado empleado){
        empleado.corteDama++;
    }
}
