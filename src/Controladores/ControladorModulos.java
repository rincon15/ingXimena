package Controladores;

import Vistas.Vistamodulos;

public class ControladorModulos {

    static Vistamodulos vistamodulos = new Vistamodulos();

    public static void inicio(String name) {
        vistamodulos.setVisible(true);
        vistamodulos.getTextName().setText(name);
    }

    public static void hidden() {
        vistamodulos.setVisible(false);
    }
    
}
