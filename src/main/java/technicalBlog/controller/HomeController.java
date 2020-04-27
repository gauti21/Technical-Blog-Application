package technicalBlog.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.model.Post;
import technicalBlog.service.PostService;

import java.util.ArrayList;
import java.util.Date;

//HomeController is now responsible only for processing the user request and returning the required view name and model.
// It uses the PostService class to get the required data to respond to the client request.


@Controller
public class HomeController {

    public HomeController(){
        System.out.println("*** Home controller ***");
    }

    @Autowired //gives object instance from spring container
    private PostService postService;

    @RequestMapping("/")
    // Model - Spring provides model object to be passed on between the spring MVC components.
    public String getAllPosts(Model model){
        //to view all the posts, when we click home button.
        //Post class is not registered in IOC container.

        ArrayList<Post> posts = postService.getAllPosts();

        //instead of writing so many lines, we can use autowire to get help from PostService.

        /*ArrayList<Post> posts=new ArrayList<>();//we used arraylist to access all the posts.

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
        posts.add(post3);*/

        model.addAttribute("posts",posts);
        return "index";
    }
}
