/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author FERNANDO
 */
public class MayorMenor {
    
    
    public static void array(){
        
        
        int n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos"));
        
                
       
      
        double promedio=0;
        int [] arreglo=new int [n];
        
        
        
        for (int i = 0; i < n; i++) {
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
            
            promedio=promedio+arreglo[i];
        }
        int menor,mayor;
        menor=mayor=arreglo[0];
        for (int j = 1; j < n; j++) {
            
            if(arreglo[j]>mayor){
                
                mayor=arreglo[j];
            }
            if(arreglo[j]<menor){
                
                menor=arreglo[j];
            }
        }
        promedio=promedio/n;
        
       
        
        
        JOptionPane.showMessageDialog(null, "Numero Mayor : "+ mayor + ""
                + "\nNumero menor : "+ menor + "\nPromedio : "+ promedio );
       
        
    }
}
