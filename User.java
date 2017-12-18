import java.util.*;

class User
    {
        //user email address
        //user url
        //user name
        //firstName, lastName
        private String firstName;
        private String lastName;
        private String currentUser;
        private String emailAddress = " ";
        private String url = " ";

        public User(String firstName, String lastName, String currentUser, String emailAddress, String url)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.currentUser = currentUser;
            this.emailAddress = emailAddress;
            this.url = url;
        }

        public User() {
            this.firstName = firstName;
            this.lastName = lastName;
            this.currentUser = currentUser;
            this.emailAddress = emailAddress;
            this.url = url;
        }

        public void setFirstName()
        {
            this.firstName = firstName;
        }
        public void setLastName()
        {
            this.lastName = lastName;
        }
        public void setCurrentUser() { this.currentUser = currentUser; }
        public void setEmailAddress() { this.emailAddress = emailAddress; }
        public void setUrl() { this.url = url; }

        public String getFirstName()
        {
            return firstName;
        }
        public String getLastName()
        {
            return lastName;
        }
        public String getCurrentUser() { return currentUser; }
        public String getEmailAddress()
        {
            return emailAddress;
        }
        public String getUrl()
        {
            return url;
        }

        public void input() {
            Scanner keyboard = new Scanner(System.in);
            System.out.println(" Type your first name");
            this.firstName = keyboard.nextLine();
            System.out.println(" Type your last name");
            this.lastName = keyboard.nextLine();
            System.out.println("Create a user name");
            this.currentUser = keyboard.nextLine();
            System.out.println("Type your email address");
            this.emailAddress = keyboard.nextLine();
            System.out.println("Type the url link");
            this.url = keyboard.nextLine();
        }
        public String toString() { return this.firstName + ", " + this.lastName + ", " +this.currentUser + ", " + this.emailAddress; }
    }
