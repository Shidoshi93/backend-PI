package Model;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class User {
    private Integer id_user;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String senha;
    private BufferedImage fotoPerfil;

    public Integer getId_user() {
        return id_user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public BufferedImage getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(BufferedImage fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

  // método para carregar um arquivo qualquer de imagem a fotoPerfil:
    public void subirFotoPerfil() {
        BufferedImage imagemQualquer = null;
        try {
            imagemQualquer = ImageIO.read(new File("caminho_da_imagem.jpg"));
        } catch (IOException e) {
        }

        //        NomeDaClasse instancia = new NomeDaClasse();
        //        instancia.setImage(imagemQualquer);
    }
}
