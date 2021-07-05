package Model;

public class Login {
    private User usuario;

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public String autenticaUsuario(User usuario){
        // ........

        return "Usuario autenticado com sucesso";
    }

    public User exibeDadosLogado(User usuario){
        // ........

        return usuario;
    }

    public String encerraAutenticacao() {
        // ........

        return "Autenticacao encerrada";
    }
}
