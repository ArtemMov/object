import java.util.Objects;

public class Author{
    private String surname;
    private String name;
    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }
    public String getName() {
        return this.name;
    }
}