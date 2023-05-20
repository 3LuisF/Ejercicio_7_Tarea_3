
package com.mycompany.poo_ejercicio_7_cap4;

import javax.swing.JOptionPane;


public class Comparacion {
    double Num1,Num2;
    String Mensaje;
    
    public String Comparar(double Num1, double Num2){
            
        if (Num1>Num2){
           Mensaje = Num1+" Es mayor que "+Num2;    
        }
        else if(Num1<Num2){
            Mensaje = Num1+" Es menor que:"+Num2;
        }
        else {
            Mensaje = "Ambos numeros son iguales.";
            
        }
        return Mensaje;
    }
    
}
