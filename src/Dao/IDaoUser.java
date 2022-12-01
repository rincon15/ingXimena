package Dao;

import Modelos.ModeloUsuario;
import java.util.ArrayList;

public interface IDaoUser {

    boolean createUser(ModeloUsuario userUsuario);

    boolean validarUser(ModeloUsuario userUsuario);
    
    ArrayList<ModeloUsuario> nameUser(ModeloUsuario userUsuario);
}
