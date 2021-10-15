package driverPackage;

import storeDirectoryPackage.StoreDirectory;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userID = 0;
        String terminate = "N";


        System.out.println("Input 3 Digit user ID");

        int validateInput = input.nextInt();                                    //creates temp variable for input
        if (String.valueOf(validateInput).length() == 3)                         //validates ID is 3 digits
            userID = validateInput;


        System.out.println("WELCOME USER " + userID);

        System.out.println("CHOOSE FROM THE FOLLOWING OPTIONS:");
        System.out.println("A ---- Create New Employee\nB ---- Display Number Of Books\n" +
                "C ---- ****\nD ---- Display Number Of Employees\n" +
                "E ---- Add Book to Inventory\nF ---- Find Book in Stock\n" +
                "G ---- Check for Food Item in Stock\nH ---- ****\n\n" +
                "To Exit session enter \"N\" ");

        String option = input.next();

        switch (option) {
            case "A": {
                System.out.println("Create new Employee");
                System.out.println("Give First Name, last name and ID");
                StoreDirectory.addNewEmployee(input.next(), input.next(), input.nextDouble());
                break;
            }

            case "B":
                System.out.println("The BookStore currently has: " + StoreDirectory.getNumberOfBooks() + " book(s)");
                break;
//                        case "C":
//                        case "D":
//                        case "E":
//                        case "F":
//                        case "G":
//                        case "H":
    }
        //------->RETURN A-H .... ASK User for another letter or N(exit program)
        //N ------------ exit program
        //Y ------------- sout(print options again)
    }


//
//    }
//    public static int numberOfBooks(){
//    public static int displayNumberOfEmployees(){}
//    public static void addEmployee(){}
//    public static void addBook(){}
//    public static boolean checkIfBookIsInStock(){}
//    public static boolean checkWhetherFoodItemInMarket(){}



}
