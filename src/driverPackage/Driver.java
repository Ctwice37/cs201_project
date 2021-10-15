package driverPackage;


import storeDirectoryPackage.StoreDirectory;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int userID = 0;                             //temp variable -- user ID validation
        String terminate = "N";


        System.out.println("Input 3 Digit user ID");

        int validateInput = input.nextInt();                                    //creates temp variable for input
        if (String.valueOf(validateInput).length() == 3)                         //validates ID is 3 digits
            userID = validateInput;


        System.out.println("WELCOME USER " + userID);

        //TODO: Duplicate below code, put into a while-loop,, check condition user-input (Y/N)
        System.out.println("CHOOSE FROM THE FOLLOWING OPTIONS:");
        System.out.println("A ---- Create New Employee\nB ---- Display Number Of Books\n" +
                "C ---- ****\nD ---- Display Number Of Employees\n" +
                "E ---- Add Book to Inventory\nF ---- Find Book in Stock\n" +
                "G ---- Check for Food Item in Stock\nH ---- ****\n\n");

        String option = input.next();

        switch (option) {

            case "A": {

                System.out.println("####Create new Employee####");
                System.out.println("Give First Name, last name and ID:");
                StoreDirectory.addNewEmployee(input.next(), input.next(), input.nextDouble());
                break;
            }

            case "B": {

                System.out.println("####Disply Number of Books####");
                System.out.println("The BookStore currently has: " + StoreDirectory.getNumberOfBooks() + " book(s)");
                break;
            }
            //            case "C": {////////////////////////// }

            case "D": {
                System.out.println("####Display Number of Employees####");
                System.out.println("The BookStore currently employs " + StoreDirectory.getNumberOfBookStoreEmployees() + " people");
                break;
            }


//
            case "E": {
                System.out.println("###Add Book to Inventory####");
                System.out.println("Give title of the book, followed by the author's first and last name:");
                StoreDirectory.addNewBook(input.next(),input.next(),input.next());
                break;
            }
//
            case "F": {
                System.out.println("####Find Book in Stock####");
                System.out.println("Input the title of Book you're Looking for");
                if (StoreDirectory.bookIsInStock(input.next()))
                    System.out.println("yes, we have this title in-stock");

                else
                    System.out.println("sorry, we do not have this title in-stock");
                break;
            }
//
            case "G": {System.out.println("####Check for Food item in Stock####");
                System.out.println("Which Food item are you checking?");
                    String foodOrDrink = input.next();
                    if (StoreDirectory.marketCarriesFoodItem(foodOrDrink))
                        System.out.println("yes, we have " + foodOrDrink + " in-Stock");
                    else
                        System.out.println("Sorry, we do not have " + foodOrDrink + " in-Stock");
                    break;
            }
            case "H": {System.out.println("#### ####");}


            case "N": {System.out.println("#### ####");}


            default: {
                System.out.println("Invalid Option");
            }
        }//sout.println("To Exit session enter \"N\"); ------------- prompt user for "exit program" statement

    }





}






