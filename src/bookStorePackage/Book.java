package bookStorePackage;

public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
}
