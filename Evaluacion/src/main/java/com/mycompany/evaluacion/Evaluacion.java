/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.evaluacion;

/**
 *
 * @author miran
 */
import java.util.Scanner;
public class Evaluacion {

    public static void main(String[] args) {
        //paseadores de perros desarrollo de sf para paseadores de eprros
        //apartir del numero de horas de perros y numero de perros calcular el costo que debe pagar
        // 1 perro grande la hora=10.000 1 perro mediano=5.000 1 pequeño=3.000
        // si contrata mas de un perro el 10% del total 
        int numAni;
        Scanner sc =new Scanner(System.in);
        
        System.out.println(" Cuantos perros va a pasear");
        numAni=sc.nextInt();
        
        int []tamAni=new int [numAni];
        System.out.println("Cuantas horas los va a pasear");
        int numHr=sc.nextInt();
        
        for(int i=0; i<numAni; i++){
        System.out.println("De que tamaño es el perro numero "+(i+1)+" \n 1)Grande \n 2).Mediano \n 3)Pequeño");
        tamAni[i]=sc.nextInt();
         
        }
        int costoFi=precio(tamAni,numHr);
        System.out.println(costoFi);
       
    }
    public static int precio(int[] tama,int numhr){
       int costo=0;
        for(int i=0; i<tama.length; i++){
         if (tama[i]==1) {
                costo += (10000 * numhr);
            } else if (tama[i] == 2) {
                costo += (5000 * numhr);
            } else if (tama[i] == 3) {
                costo += (3000 * numhr);
            }
        }
        if(tama.length>1){
                double descu=costo*0.10;
             costo-=descu;
            }
                
     return costo;
    }
}
