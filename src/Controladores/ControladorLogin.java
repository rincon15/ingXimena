package Controladores;

import Dao.DaoUser;
import Dao.IDaoUser;
import Modelos.ModeloUsuario;
import Vistas.Vistalogin;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorLogin {

    static Vistalogin vistalogin = new Vistalogin();

    static ModeloUsuario modeloUsuario = new ModeloUsuario();

    public static void inicio() {
        vistalogin.setVisible(true);
    }
     public static void hidden() {
        vistalogin.setVisible(false);
    }

    public static void btn_entrar() {
        String email = vistalogin.getEmail().getText();
        String pass = vistalogin.getPassword().getText();
        if (email.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(vistalogin, "Rellene los espacios");
        } else if (validacion(email, pass)) {
            hidden();
            String name = nameUser(email, pass);
            ControladorModulos.inicio(name);
        } else {
            JOptionPane.showMessageDialog(vistalogin, "Datos Incorrectos");
        }
    }
    
    public static boolean validacion(String x, String y) {
        ModeloUsuario u = new ModeloUsuario(x, y);
        IDaoUser IDaoUser = new DaoUser();
        return IDaoUser.validarUser(u);
    }
    
    public static String nameUser(String x, String y) {
        IDaoUser IDaoUser = new DaoUser();
        ModeloUsuario u = new ModeloUsuario(x, y);
        ArrayList<ModeloUsuario> nameUser = IDaoUser.nameUser(u);
        return nameUser.get(0).getNombre_usuario();
    }
    
    
}
