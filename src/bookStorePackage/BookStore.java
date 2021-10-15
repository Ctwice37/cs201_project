package bookStorePackage;

import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;

public class BookStore {
    private static ArrayList<Employee> employee;
    private static ArrayList<Book> book;


    public static int getNumBooks(){
        return book.size();

    }
    public static int getNumEmployees(){
        return employee.size();
    }

    public static void addNewBook(String title, String authorFirstName, String authorLastName){
        book.add(new Book(title, authorFirstName, authorLastName));
    }
    public static void addNewEmployee(String firstName, String lastName, double ID){
        employee.add(new Employee(firstName, lastName, ID));
    }
//     TODO: add try/catch for book.size == 0
    public static boolean bookIsInStock(String title){
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getTitle().matches(title))
                return true;
            else
                return false;
            }

        }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public ArrayList<Book> getBook() {
        return book;
    }
}
}
