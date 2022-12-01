
package Modelos;

public class ModeloUsuario {

    private int id_rol;
    private String nombre_usuario;
    private String pass_usuario;

    public ModeloUsuario(int id_rol, String nombre_usuario, String pass_usuario) {
        this.id_rol = id_rol;
        this.nombre_usuario = nombre_usuario;
        this.pass_usuario = pass_usuario;
    }

    public ModeloUsuario() {
      
    }

    public ModeloUsuario(String nombre_usuario, String pass_usuario) {
        this.nombre_usuario = nombre_usuario;
        this.pass_usuario = pass_usuario;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }


    public String getNombre_usuario() {
        return nombre_usuario;
    }

      public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

       public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }

}
