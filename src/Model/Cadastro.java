package Model;
import java.util.ArrayList;


public class Cadastro {
    private ArrayList<String> dadosUsuario;
    private String senha;
    private String srcFotoPerfil;

    public ArrayList<String> getDadosUsuario() {
        return dadosUsuario;
    }

    public void setDadosUsuario(ArrayList<String> dadosUsuario) {
        this.dadosUsuario = dadosUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSrcFotoPerfil() {
        return srcFotoPerfil;
    }

    public void setSrcFotoPerfil(String srcFotoPerfil) {
        this.srcFotoPerfil = srcFotoPerfil;
    }

    public ArrayList armazenaDados(ArrayList dadosUsuario) {
        // ........

        return dadosUsuario;
    }

    public String alteraFotoPerfil(String novoSrc){
        // ........

        return "Imagem alterada com sucesso";
    }

    public String alteraDados(){
        // ........

        return "Dados alterados com sucesso";
    }

    public String excluirCadastro(){
        // ........

        return "Dados excluidos com sucesso";
    }
}
