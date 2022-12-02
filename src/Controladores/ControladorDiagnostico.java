/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.VistaDiagnostico;

/**
 *
 * @author poseidon
 */
public class ControladorDiagnostico {

    static VistaDiagnostico vistadiagnostico = new VistaDiagnostico();

    public static void hidden() {
        //vistamodulos.setVisible(false);
        vistadiagnostico.dispose();
    }

    public static void exit() {
        hidden();
        ControladorLogout.visible();
    }

    
}
