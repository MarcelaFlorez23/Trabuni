/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8;

import java.util.Scanner;

/**
 *
 * @author Marcela Florez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
        int edad;
        int contaMa=0;
        int contaMe=0;
        int sumaEdad=0;
        int edadMa=0;
        int edadMe=100;
        double promEdad=0;
        
   for (int n=1; n<=50;n++){
       System.out.println("Digite su edad");
       edad = sc.nextInt();
       
   if (edad<=18)
       contaMe= contaMe+1;
       else 
           contaMa=contaMa+1;
   
   sumaEdad=sumaEdad+edad;
   
   
   if (edad>edadMa)
       edadMa=edad;
   
   if (edad<=edadMe)
       edadMe=edad;         
   }
   promEdad=sumaEdad/50;
        
        System.out.println("La cantidad de personas menores de edad es:"+contaMe);
        System.out.println("La cantidad de personas mayores de edad es:"+contaMa);
        System.out.println("La persona de más edad es de:"+edadMa);
        System.out.println("La persona más joven es de:"+edadMe);
        System.out.println("El promedio de edades es de:"+promEdad);
        
    }
 
}
