package driverPackage;


import storeDirectoryPackage.StoreDirectory;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String userID = "";                             //temp variable -- user ID validation



        System.out.println("Input 3 Digit user ID");

        String validateInput = input.next();
        if (!StoreDirectory.validateLogin(validateInput))
            System.out.println("invalid login");
        else {
            userID = validateInput;
            System.out.println("WELCOME USER " + userID);
            bootProgram();
        }
//        bootProgram();
//        System.out.println("\nMake Another Query? (Y/N)");
//        if ()


    }

    public static void bootProgram() {
        String option;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("CHOOSE FROM THE FOLLOWING OPTIONS:");
            System.out.println("A ---- Create New Employee\nB ---- Display Number Of Books\n" +
                    "C ---- ****\nD ---- Display Number Of Employees\n" +
                    "E ---- Add Book to Inventory\nF ---- Find Book in Stock\n" +
                    "G ---- Check for Food Item in Stock\nH ---- ****\n\n");
            option = input.next();


            switch (option) {

                case "A": {

                    System.out.println("####Create new Employee####");
                    System.out.println("Give First Name, last name and ID:");
                    StoreDirectory.addNewEmployee(input.next(), input.next(), input.nextDouble());
                    System.out.println();
                    break;
                }

                case "B": {

                    System.out.println("####Disply Number of Books####");
                    System.out.println("The BookStore currently has: " + StoreDirectory.getNumberOfBooks() + " book(s)");
                    System.out.println();
                    break;
                }
                //case "C": {////////////////////////// }

                case "D": {
                    System.out.println("####Display Number of Employees####");
                    System.out.println("The BookStore currently employs " + StoreDirectory.getNumberOfBookStoreEmployees() + " people");
                    System.out.println();
                    break;
                }


//
                case "E": {
                    System.out.println("###Add Book to Inventory####");
                    System.out.println("Give title of the book, followed by the author's first and last name:");
                    StoreDirectory.addNewBook(input.next(), input.next(), input.next());
                    System.out.println();
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
                    System.out.println();
                    break;
                }
//
                case "G": {
                    System.out.println("####Check for Food item in Stock####");
                    System.out.println("Which Food item are you checking?");
                    String foodOrDrink = input.next();
                    if (StoreDirectory.marketCarriesFoodItem(foodOrDrink))
                        System.out.println("yes, we have " + foodOrDrink + " in-Stock");
                    else
                        System.out.println("Sorry, we do not have " + foodOrDrink + " in-Stock");
                    System.out.println();
                    break;
                }
                case "H": {
                    System.out.println("#### ####");
                    System.out.println();
                    break;
                }


                case "N": {
                    System.out.println("####SESSION TERMINATED####");
                    System.out.println();
                    break;
                }


                default: {
                    System.out.println("Invalid Option");
                    System.out.println();
                }
            }
        } while (!option.matches("N"));


    }

}




