package storeDirectoryPackage;

import bookStorePackage.BookStore;
import marketPackage.Market;


public class StoreDirectory {

    public static int getNumberOfBooks() {
        return BookStore.getNumBooks();
    }

    public static int getNumberOfBookStoreEmployees() {
        return BookStore.getNumEmployees();
    }

    public static void addNewEmployee(String firstName, String lastName, double ID) {
        BookStore.addNewEmployee(firstName, lastName, ID);
    }

    public static boolean bookIsInStock(String title) {
        return BookStore.bookIsInStock(title);
    }

    public static void addNewBook(String title, String authorFirstName, String authorLastName) {
        BookStore.addNewBook(title, authorFirstName, authorLastName);
    }

    public static boolean marketCarriesFoodItem(String foodItem) {
        for (int i = 0; i < Market.numFoodItems(); i++) {
            if (Market.getFoodItems().get(i).matches(foodItem))
                return true;

        } return false;

    }
}
