package technicalBlog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan //this scans the application and registers components with @Service in spring IOC container
public class TechnicalBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(TechnicalBlogApplication.class, args);
    }
}
