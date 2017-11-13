public class MicroBlog
{
    public static void main(String[] args)
    {
        String hi = "Hello!";
        
        HerbalTeaReview[] allTheTeas = {new HerbalTeaReview("First", "Citrus Guava, it has so much flavor. ", 2, "Tina ", "Purnell"), new HerbalTeaReview("Second ", "Jasmine Green is very soothing to my soul! ", 1, "Ronald ", "Taylor"),
            new HerbalTeaReview("Third ", "Lemon Grass is very calming to me. ", 4, "Tina ", "Purnell"),new HerbalTeaReview("Fourth ", "Lemon Balm has helped with anxiety. ", 3, "Ronald ", "Taylor"),new HerbalTeaReview("Fifth ", "Spearmint is uplifting to my spirits.", 5, "Tina ", "Purnell")}; 
        
        User [] allTheUsers = {new User("tpurnell@gmail.com", "www.goodforthesoul.com"),
            new User("rtaylor@yahoo.com", "www.talkingteas.com")};
           
        for(int j = 0; j < allTheTeas.length; j++)
        {
            System.out.println();
            System.out.println(allTheTeas[j].getPostOrder()+ "Post" );
            System.out.println("I like the tea " + allTheTeas[j].getHerbalTeaName());
            System.out.print("I gave it " + allTheTeas[j].getHerbalTeaVotes() / 2.0 + " stars. ");
            System.out.println("My name is " + allTheTeas[j].getFirstName());
            System.out.println(allTheTeas[j].getLastName());
        }    
        for(int i =0; i < allTheUsers.length; i++)
        {
            System.out.println();
            System.out.println("My email is:   " + allTheUsers[i].getEmailAddress());
            System.out.println("The URL I used is:   " + allTheUsers[i].getUrl());
        }
    }
}
class User
{
    //user url
    //user email address
    private String emailAddress = " ";
    private String url = " ";
    public User(String emailAddress, String url)
    {
        this.emailAddress = emailAddress;
        this.url = url;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
    public String getUrl()
    {
        return url;
    }
}
