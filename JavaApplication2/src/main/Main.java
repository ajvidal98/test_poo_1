/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Main {

    
    public static void main(String[] args) {
        System.out.println("hola mundo desde java");
        
        Cliente c = new Cliente(1, "alvaro");
        
        System.out.println(c.getNombre());
    }
    
}
