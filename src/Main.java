/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Pizza p1= new Pizza ("",0,0);
        Pizza p2= new Pizza ("",0,0);
        Pizza[] pizzas =new Pizza[10];
        String ingrediente= "";
        int diametro=0;
        double precio=0;
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("Ingrediente: ");
            ingrediente=entrada.next();
            System.out.println("Diametro: ");
            diametro=entrada.nextInt();
            System.out.println("Precio: ");
            precio=entrada.nextInt();
            Pizza pizza = new Pizza(ingrediente, diametro, precio);
            pizzas[i]= pizza;
            
        }
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println(pizzas[i]);
            
        }
        
        
        /*System.out.println("Ingrese los ingredientes: ");
        p1.setToppings(entrada.next());
        
        System.out.println("Ingrese el diámetro: ");
        p1.setDiameter(entrada.nextDouble());
        
        System.out.println("Ingrese el precio: ");
        p1.setPrice(entrada.nextDouble());
        
        System.out.println("Ingrese los ingredientes: ");
        p2.setToppings(entrada.next());
        
        System.out.println("Ingrese el diámetro: ");
        p2.setDiameter(entrada.nextDouble());
        
        System.out.println("Ingrese el precio: ");
        p2.setPrice(entrada.nextDouble());
        
        System.out.println("Pizza 1:"+ p1.getToppings()+ p1.getDiameter() + p1.getPrice());
        System.out.println("Pizza 2:"+ p2.getToppings()+ p2.getDiameter() + p2.getPrice());
        */
    }
}
