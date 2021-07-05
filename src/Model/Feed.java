package Model;

import Database.Post_Database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Feed {
    private List<Post> posts= new ArrayList<>();

    public List<Post> getPosts() {
        return Collections.unmodifiableList(posts);
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void add(Post post, int user_id){
        Post_Database post_database = new Post_Database();

        this.posts.add(post);

        post_database.insert(post, user_id);
    }

    public void filterPostById(int id){

    }

    public void orderPostByUserDonation(String donation_type){

    }

    public void orderPostByUserType(String user_type){

    }

    public void removeAllPosts() {

    }

    public void removePost(int post_id) {

    }
}
