package storeDirectoryPackage;

import bookStorePackage.BookStore;
import marketPackage.Market;


public class StoreDirectory {

    public static int getNumberOfBooks() {
        return BookStore.getNumBooks();
    }

    public int getNumberOfBookStoreEmployees() {
        return BookStore.getNumEmployees();
    }

    public static void addNewEmployee(String firstName, String lastName, double ID) {
        BookStore.addNewEmployee(firstName, lastName, ID);
    }

    public static void bookIsInStock(String title) {
        BookStore.bookIsInStock(title);
    }

    public static void addNewBook(String title, String authorFirstName, String authorLastName) {
        BookStore.addNewBook(title, authorFirstName, authorLastName);
    }

    public static void marketCarriesFoodItem(String foodItem) {
        for (int i = 0; i < Market.numFoodItems(); i++) {
            if (Market.getFoodItems().get(i).matches(foodItem))
                return ;
            else
                return ;
        }
    }
}