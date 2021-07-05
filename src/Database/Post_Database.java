package Database;

import Model.Post;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Post_Database {
    private final List<Post> posts = new ArrayList<>();
    private final Post post = new Post();

    Connection conn = null;
    Statement stmt = null;
    ResultSet res = null;

    public Post_Database() {

        try {
            String url = "jdbc:mysql://localhost:3306/pi";
            String usuario = "root";
            String senha = "Tresdedos1993!";
            conn = DriverManager.getConnection(url, usuario, senha);

            //Statement executeQuery = conn.createStatement();
        } catch (
                SQLException e) {
            //TODO: handle exception
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore
                stmt = null;
            }
        }
    }

    public void insert(Post post, int user_id) {
        try{

            String query = """
                            INSERT INTO post_pi (tipoDoacao, tipoUsuario, descricao, quantidade, id_user) 
                            VALUES(?, ?, ?, ?, ?);
                            """;

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, post.getDonation_type());
            preparedStmt.setString(2, post.getUser_type());
            preparedStmt.setString(3, post.getDescricao());
            preparedStmt.setInt(4, post.getQtd());
            preparedStmt.setInt(5, user_id);

            preparedStmt.execute();

            //PESQUISAR COMO FAZER ASYNC AWAYT NO JAVA

            System.out.println("Post criado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Deu erro aqui " + e);
        }
    }

    public List<Post> getPosts() {
        try {

            String query =  """
                            SELECT *
                            FROM post_pi;
                            """;

            stmt = conn.createStatement();

            if (stmt.execute(query)) {
                res = stmt.getResultSet();
                System.out.println();
            }

            while (res.next()) {
                int id = res.getInt("id_post");
                String donation_type = res.getString("tipoDoacao");
                String user_type = res.getString("tipoUsuario");
                String description = res.getString("descricao");
                int qtd = res.getInt("quantidade");
                int user_id = res.getInt("id_user");

                Post post = new Post();

                post.setDescricao(description);
                post.setId(id);
                post.setQtd(qtd);
                post.setDonation_type(donation_type);
                post.setUser_type(user_type);

                posts.add(post);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return posts;
    }

    public Post getPost(int post_Id) {

        try {
            String query =  "SELECT * FROM post_pi WHERE id_post = " + post_Id;

            stmt = conn.createStatement();

            if (stmt.execute(query)) {
                res = stmt.getResultSet();
                System.out.println();
            }

            while (res.next()) {
                int id = res.getInt("id_post");
                int qtd = res.getInt("quantidade");
                String description = res.getString("descricao");
                String user_type = res.getString("tipoUsuario");
                String donation_type = res.getString("tipoDoacao");

                post.setId(id);
                post.setQtd(qtd);
                post.setDescricao(description);
                post.setUser_type(user_type);
                post.setDonation_type(donation_type);
            }

        } catch (SQLException e) {
            System.out.println("caiu aqui" + e);
        }

        return post;
    }

    public void updatePost() {

    }

    public void deletePost() {

    }

    public void deletePosts() {

    }
}