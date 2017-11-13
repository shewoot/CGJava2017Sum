public class HerbalTeaReview
{
    //user name (first, last)
    //user sees all posts
    private String postOrder;
    private String herbalTeaName;
    private int herbalTeaVotes;
    private String firstName;
    private String lastName;
    public HerbalTeaReview(String postOrder, String herbalTeaName, int herbalTeaVotes, String firstName, String lastName)
    {
        this.postOrder = postOrder;
        this.herbalTeaName = herbalTeaName;
        this.herbalTeaVotes = herbalTeaVotes;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setVotes(String newVotes)
    {

    }
    public String getPostOrder()
    {
        return postOrder;
    }
    public String getHerbalTeaName()
    {
        return herbalTeaName;
    }
    public int getHerbalTeaVotes()
    {
        return herbalTeaVotes;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
}

 




    


