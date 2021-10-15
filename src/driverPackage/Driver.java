package driverPackage;

import storeDirectoryPackage.StoreDirectory;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userID = 0;


        System.out.println("Input 3 Digit user ID");

        int validateInput = input.nextInt();                                    //creates temp variable for input
        if(String.valueOf(validateInput).length() == 3)                         //validates ID is 3 digits
            userID = validateInput;



        //if true assigns input to (int userID)

         //sout.print(WELCOME USER ### CHOOSE FROM BELOW OPTIONS A..... \n B...... \n C ..... -- H)
        //char option = input.next();

        //switch (option){
            //Case A:         --maps to getter/setter method
            //Case B:
            //Case C:
            //Case D:
            //Case E:
            //Case F:
            //Case G:
            //Case H:

        //------->RETURN A-H .... ASK User for another letter or N(exit program)
        //N ------------ exit program
        //Y ------------- sout(print options again)
    }

    public static int numberOfBooks(){

    }
    public static int displayNumberOfEmployees(){}
    public static void addEmployee(){}
    public static void addBook(){}
    public static boolean checkIfBookIsInStock(){}
    public static boolean checkWhetherFoodItemInMarket(){}



}
