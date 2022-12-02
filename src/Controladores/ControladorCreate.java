/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Dao.DaoUser;
import Dao.IDaoUser;
import Modelos.ModeloUsuario;
import Vistas.VistaCreate;
import javax.swing.JOptionPane;


public class ControladorCreate {
    
    static VistaCreate vistacreate = new VistaCreate();
   // static ModeloUsuario modeloUsuario = new ModeloUsuario();
        
    public static void inicio() {
        vistacreate.setVisible(true);
    }
    
     public static void hidden() {
        vistacreate.setVisible(false);
    }
    
    public static void btn_crear(){
        
        String nombre = vistacreate.getNombre().getText();
        String apellido = vistacreate.getApellido().getText();
        String email = vistacreate.getEmail().getText();
        String password = vistacreate.getPassword().getText();
        
        if (nombre.equals("") || apellido.equals("")|| email.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(vistacreate, "Rellene los espacios");
        } else if(validacion(nombre, apellido, email, password)){
            JOptionPane.showMessageDialog(vistacreate, "creo");
        }
    }
    
    public static boolean validacion(String a, String b, String c, String d) {
        ModeloUsuario u = new ModeloUsuario(a, b, c, d);
        IDaoUser IDaoUser = new DaoUser();
        return IDaoUser.createUser(u);
    }
}
