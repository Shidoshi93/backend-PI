package Model;

public class Post {
    private int id;
    private String user_type;
    private String donation_type;
    private String description;
    private int qtd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getDonation_type() {
        return donation_type;
    }

    public void setDonation_type(String donation_type) {
        this.donation_type = donation_type;
    }

    public String getDescricao() {
        return description;
    }

    public void setDescricao(String descricao) {
        this.description = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Post: {" +
                "id=" + this.id +
                ", user_type='" + this.user_type + '\'' +
                ", donation_type='" + this.donation_type + '\'' +
                ", description='" + this.description + '\'' +
                ", qtd=" + this.qtd +
                '}';
    }
}
