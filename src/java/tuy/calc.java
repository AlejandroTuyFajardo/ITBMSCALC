package tuy;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
public class calc {
     public String doPost( double numero) {
      String ret;
         if (numero < 0)
              {
                 ret = "Numero negativo";
                         }
                else
         {
                  ret = String.valueOf(numero * 0.07);
                  
                 
              }
              
       return ret;
       
    }}

