/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rutamatch;
import com.mycompany.rutamatch.view.GUIPrincipal;
/**
 *
 * @author yarit
 */
public class RutaMatch {

    public static void main(String[] args) {
       System.out.println("Hello World!");
    try {
        com.formdev.flatlaf.FlatLightLaf.setup();
        javax.swing.UIManager.put("defaultFont", new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
    } catch (Exception e) {
        System.err.println("No se pudo inicializar FlatLaf");
    }


        GUIPrincipal gui = new GUIPrincipal();
        gui.setVisible(true);
    }
}
