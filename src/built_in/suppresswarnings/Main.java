package built_in.suppresswarnings;

import java.io.Console;
import java.util.List;

public class Main {

    @SuppressWarnings({"static-access", "fallthrough"})
    public static void main(String[] args) {
        Console console = System.console();

        // Get number of posts
        int numPosts = Integer.parseInt(console.readLine("How many posts?"));

        Blog blog = new Blog();

        // Fetch latest posts
        List<Post> posts = blog.getLatestPosts(numPosts);

        switch (numPosts) {
            case 0:
                // Display message
                System.out.println("No posts");
            case 1:
                // Display post
                System.out.println(posts.get(0));
                break;
            default:
                // Display posts with separators
                for (Post post : posts) {
                    System.out.println(post);
                    System.out.println("==================");
                }
                break;
        }
    }
}
