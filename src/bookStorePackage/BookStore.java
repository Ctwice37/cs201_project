package bookStorePackage;

import java.util.ArrayList;

public class BookStore {
    private static ArrayList<Employee> employee = new ArrayList<>();
    private static ArrayList<Book> book = new ArrayList<>();


    public static int getNumBooks() {
        return book.size();

    }

    public static int getNumEmployees() {
        return employee.size();
    }

    public static void addNewBook(String title, String authorFirstName, String authorLastName) {
        book.add(new Book(title, authorFirstName, authorLastName));
    }

    public static void addNewEmployee(String firstName, String lastName, double ID) {
        employee.add(new Employee(firstName, lastName, ID));
    }

    //     TODO: add try/catch for book.size == 0
    public static void bookIsInStock(String title) {
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getTitle().matches(title)) {
                return ;

            } else
                return ;

        }
    }
        public ArrayList<Employee> getEmployee () {
            return employee;
        }

        public ArrayList<Book> getBook () {
            return book;
        }
    }
