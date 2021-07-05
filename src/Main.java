import Database.Post_Database;
import Model.Feed;
import Model.Post;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Problema conexão");
        }

        Feed feed = new Feed();

        Post post = addPost();
        feed.add(post, 2);
        //System.out.println(feed.add(post, 2));

        //System.out.println(feed.getPosts());

        List<Post> posts = getPosts();

        System.out.println("LSTA COM TODOS OS POSTS:");
        posts.forEach(System.out::println);

        System.out.println("RETORNO DE BUSCA POR ID: ");
        getPost(1);
    }

    public static Post addPost(){
        Post post = new Post(/*"doador", "cesta basica", "estou doando duas cestas básicas", 5*/);

        post.setDonation_type("cesta basica");
        post.setUser_type("doador");
        post.setDescricao("estou doando duas cestas básicas");
        post.setQtd(7);

        return post;
    }

    public static List<Post> getPosts(){
        Post_Database db = new Post_Database();

        return db.getPosts();
    }

    public static void getPost(int post_id) {
        Post_Database db = new Post_Database();

        Post res = db.getPost(post_id);

        if(res.getUser_type() == null) {
            System.out.println("Post não existe");
        } else {
            System.out.println("Retorno da busca por id: " + res);
        }
    }

    /*
    * CONTINUAR...
    * IMPLEMENTAR MÉTODO DE DELETE E DE UPDATE
    *
    * */
}
