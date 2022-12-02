package Dao;

import Modelos.ModeloUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoUser extends conexionSQL implements IDaoUser {

    @Override
    public boolean validarUser(ModeloUsuario userUsuario) {
        String sql = "SELECT *  FROM " + env.T_USER + " WHERE " + env.NOMBRE_USER + "='"
                + userUsuario.getNombre_usuario()
                + "' and " + env.PASSWORD_USER + "='" + userUsuario.getPass_usuario() + "'";
        System.err.println(sql);
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                return true; // en tal caso de que los datos sean correctos retornara un datos boolean
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
        return false; // si no hay datos correcto retorna un dato boolean 
    }

    @Override
    public boolean createUser(ModeloUsuario usuario) {
        String sql = "INSERT INTO " + env.T_USER + "("
                + env.NOMBRE_USER + "," + env.LASTNAME_USER +","+env.EMAIL_USER+","+env.PASSWORD_USER+") VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNombre_usuario());
            ps.setString(2, usuario.getApellido_usuario());
            ps.setString(3, usuario.getEmail_usuario());
            ps.setString(4, usuario.getPass_usuario());
            ps.executeUpdate();
            System.out.println("Creado con exito");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al crear " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public ArrayList<ModeloUsuario> nameUser(ModeloUsuario userUsuario) {

        ArrayList<ModeloUsuario> arrayListDat = new ArrayList<>();
        String sql = "SELECT *  FROM " + env.T_USER + " WHERE " + env.NOMBRE_USER + "='"
                + userUsuario.getNombre_usuario()
                + "' and " + env.PASSWORD_USER + "='" + userUsuario.getPass_usuario() + "'";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                ModeloUsuario u = new ModeloUsuario();
                u.setNombre_usuario(resultSet.getString(env.NOMBRE_USER));
                arrayListDat.add(u);
            }
            return arrayListDat;
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
        return arrayListDat; // si no hay datos correcto retorna un dato boolean 
    }
}
