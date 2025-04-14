package br.com.techfast.util;

import br.com.techfast.model.Usuario;

public class SessionManager {

    private static Usuario usuarioLogado;

    public static void setUsuarioLogado (Usuario usuario){
        usuarioLogado = usuario;
    }

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static boolean isGerente(){
        return usuarioLogado != null && "Gerente".equalsIgnoreCase(usuarioLogado.getCargo());
    }

    public static void limparSessao() {
        usuarioLogado = null;
    }
}
