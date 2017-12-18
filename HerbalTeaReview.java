import java.util.*;

public class HerbalTeaReview {
    //user who posted (get user name)
    //postOrder
    //herbalTeaReview or content
    //url
    private static int nextPostOrder = 0;
    private String User;
    private String ReviewContent;
    private String links;
    private int votes;

    public HerbalTeaReview(int nextPostOrder, String User, String ReviewContent, String links, int votes) {
        this.nextPostOrder = nextPostOrder;
        this.User = User;
        this.ReviewContent = ReviewContent;
        this.links = links;
        this.votes = votes;
    }

    public HerbalTeaReview() {
        this.nextPostOrder = nextPostOrder;
        this.User = User;
        this.ReviewContent = ReviewContent;
        this.links = links;
        this.votes = votes;
    }

    public void input(String cU) {
        Scanner keyboard = new Scanner(System.in);
        this.User = cU;
        System.out.println("Type your Review Content");
        this.ReviewContent = keyboard.nextLine();
        System.out.println("Please enter any relevant links");
        this.links = keyboard.nextLine();
        System.out.println("Please review the tea on a scale of 1-5. Please only enter whole numbers.");
        this.votes = Integer.parseInt(keyboard.nextLine());
    }

    public void setNextPostOrder(int p) { this.nextPostOrder = p; }
    public void setUser(String htu) { this.User = htu; }
    public void setReviewContent(String rc) { this.ReviewContent = rc; }
    public void setLinks(String li) { this.links = li; }
    public void setVotes(int v) { this.votes = votes; }

    public int getNextPostOrder() { return nextPostOrder; }
    public String getUser() { return User; }
    public String getReviewContent() { return ReviewContent; }
    public String getLinks() { return links; }
    public int getVotes() { return votes; }


    public String toString() {
        return this.nextPostOrder + ", " + this.User + ", " + this.ReviewContent + ", " + this.links + ", " + this.votes;
    }
}

