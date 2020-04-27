package technicalBlog.service;
// service class - address business logic, address CRUD functionality
//we created service class because controller only deals with request and response

import org.springframework.stereotype.Service;
import technicalBlog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Service //registers the class as a service class in the IOC container
public class PostService {

    public PostService(){
        System.out.println("*** Post Service ***");
    }

    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> posts=new ArrayList<>();

        Post post1=new Post();
        post1.setTitle("Post1");
        post1.setBody("Post Body 1");
        post1.setDate(new Date()); //new Date() - returns the present date

        Post post2=new Post();
        post2.setTitle("Post2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3=new Post();
        post3.setTitle("Post3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }
}
