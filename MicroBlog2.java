import java.util.*;

        public class MicroBlog2 {
            public static void main(String[] args) {
                HerbalTeaReview[] allTheTeas = null;
                User[] allUsers = null;
                User u = null;
                HerbalTeaReview h = null;
                String currentUsers = null;


                while(true) {
                    System.out.println("\n****  Welcome to Herbal Tea Review Blog!  **** ");
                    System.out.println("\nChoose a number from the Main Menu ");
                    System.out.println(" 1. Create a new user. ");
                    System.out.println(" 2. Become an existing user. ");
                    System.out.println(" 3. Create a post as the current user. ");
                    System.out.println(" 4. Print all posts. ");
                    System.out.println(" 5. Print all users. ");
                    System.out.println(" 6. I am all done. \n");

                    Scanner act = new Scanner(System.in);
                    String action = act.nextLine();
                    int ac = Integer.parseInt(action);
                    System.out.print(ac);

                    if (ac == 1) {
                        u = new User();
                        u.input();
                        //System.out.print(u.toString());

                        allUsers = new User[]{new User(u.getFirstName(), u.getLastName(), u.getCurrentUser(), u.getEmailAddress(), u.getUrl())};
                    }
                    if (ac == 2) {
                        System.out.print("Please enter your existing User name: ");
                        Scanner k = new Scanner(System.in);
                        String cUser = k.nextLine().trim().toLowerCase();
                        currentUsers = "";

                        for(int i = 0; i < allUsers.length; i++){
                            currentUsers = allUsers[i].getCurrentUser().toString().trim().toLowerCase();
                            if(cUser.equals(currentUsers)) {

                                System.out.println(allUsers[i].getCurrentUser().toString());
                                break;
                            }
                        }
                    }
                    if (ac == 3) {
                        if (currentUsers != null ) {
                            h = new HerbalTeaReview();
                            h.input(currentUsers);
                            System.out.print(h.toString());
                            allTheTeas = new HerbalTeaReview[] {new HerbalTeaReview(h.getNextPostOrder(), h.getUser(), h.getReviewContent(), h.getLinks(), h.getVotes())};
                        }
                        else {System.out.println("Please select your existing user name first.");}
                    }
                    if (ac == 4) {
                        for (int j = 0; j < allTheTeas.length; j++) {
                            System.out.println("Post #" + allTheTeas[j].getNextPostOrder()+ ", User: " + allTheTeas[j].getUser());
                            System.out.println(" I gave it: " + allTheTeas[j].getVotes() / 2.0 + " stars. ");
                            System.out.println(" My review is: " + allTheTeas[j].getReviewContent());
                            System.out.println(" My source link is: \n" + allTheTeas[j].getLinks());
                        }
                    }
                    if (ac == 5) {
                        for (int i = 0; i < allUsers.length; i++) {
                            System.out.println(" My email is: " + allUsers[i].getEmailAddress());
                            System.out.print(" The URL I used is " + allUsers[i].getUrl());

                        }
                    }
                    if (ac == 6) {
                        break; //exit the menu loop to exit the program
                    }
                }
            }
        }
