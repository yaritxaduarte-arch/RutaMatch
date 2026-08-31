/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rutamatch;

import com.mycompany.rutamatch.controller.ControllerConductor;
import com.mycompany.rutamatch.modelo.Conductor;
import java.util.List;

/**
 *
 * @author yarit
 */
public class TestCrud {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PRUEBAS CRUD RUTAMATCH");
        System.out.println("=================================\n");

        probarConductor();

        System.out.println("\n=================================");
        System.out.println(" TODAS LAS PRUEBAS TERMINARON");
        System.out.println("=================================");
    }

    // ==========================================
    // PRUEBA CRUD CONDUCTOR
    // ==========================================
    
     public static void probarConductor() {

        System.out.println("\n--- PRUEBA CRUD CONDUCTOR ---");

         ControllerConductor controller = new ControllerConductor();
         
         // Conductor conductor = null; 
         Conductor conductor = new Conductor("1001","Carlos", "Perez",
                "123456789",
                "CC",
                "3001234567",
                "carlos@gmail.com",
                "LIC001",
                "C1",
                "2030-12-31"
        );
         
         controller.crearConductor(conductor);
         controller.crearConductor(conductor);
         controller.crearConductor(conductor);
         
        
         System.out.println("\n--- PRUEBA LISTAR CONDUCTOR ---");
         List conductores = controller.listarConductores();
        for (int i = 0; i < conductores.size(); i++) {
            String c;
            c = conductores.get(i).toString();
           System.out.println(c);
        }
        
        controller.eliminarConductor("1001");
         System.out.println("hay "+conductores.size()+" conductores");
     }

}
