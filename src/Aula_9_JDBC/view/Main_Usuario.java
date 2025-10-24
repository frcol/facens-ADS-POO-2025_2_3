package Aula_9_JDBC.view;

import Aula_9_JDBC.dao.UsuarioDAO;
import Aula_9_JDBC.dao.UsuarioDAO_old;
import Aula_9_JDBC.entity.Usuario;
import java.util.ArrayList;

public class Main_Usuario {
    public static void main(String[] args) {
        Usuario usu = new Usuario("SPIDER MAN", "333");
        
        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(usu);
        //dao.editar(usu);
        //dao.excluir(1);
        
        /*ArrayList<Usuario> lstUsuarios = dao.getAllUsuarios();
        
        for (Usuario u : lstUsuarios) {
            System.out.println(u.getLogin());
        }
        
        if (dao.autenticar("joaao", "999")) {
            System.out.println("Logado com sucesso");
        }
        else {
            System.out.println("Usuario ou senha invalida");
        }*/
    }
}
